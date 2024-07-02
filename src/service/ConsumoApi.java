package service;

import com.google.gson.Gson;
import models.DetallesMoneda;
import models.Historial;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsumoApi {
    private Historial historial;
    public  ConsumoApi(Historial historial){
        this.historial = historial;
    }

    public void conversion(String baseCode, String targetCode) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Cantidad a convertir  ");
        var cantidadStr = lectura.nextLine();
        double cantidad;
        try {
            cantidad = Double.parseDouble(cantidadStr);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            return;
        }



        String clave = "ae98523f79468071ae3020d4";

        String direccion = "https://v6.exchangerate-api.com/v6/" + clave + "/pair/" + baseCode + "/" + targetCode;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        Gson gson = new Gson();
        DetallesMoneda detallesMoneda = gson.fromJson(json, DetallesMoneda.class);

        if (detallesMoneda != null) {
            double conversionRate = detallesMoneda.getconversion_rate();
            double resultadoConversion = conversionRate * cantidad;

            String resultado = String.format("Convertir %.2f %s a %s: %.5f", cantidad, baseCode, targetCode, resultadoConversion);
            System.out.println("Resultado de la conversión: " + resultado);
            historial.agregarConsulta(resultado);

        } else {
            System.out.println("No se pudo obtener la tasa de conversión. Verifique la respuesta de la API.");
        }
    }


}


