package principal;

import java.io.IOException;
import java.util.Scanner;

//import org.json.JSONObject;
import models.Historial;
import service.ConsumoApi;


public class Principal {
    private final Historial historial = new Historial();

  private final ConsumoApi consumoApi = new ConsumoApi(historial);

    public void mostrarMenu() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione la conversión que desea realizar:");
            System.out.println("1. Peso colombiano a USD");
            System.out.println("2. Peso colombiano a EUR");
            System.out.println("3. Peso colombiano a JPY");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    buscarMoneda("COP", "USD");
                    break;
                case 2:
                    buscarMoneda("COP", "EUR");
                    break;
                case 3:
                    buscarMoneda("COP", "JPY");
                    break;
                case 4:
                    mostrarHistorial();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }

    public void buscarMoneda(String base_code, String target_code) throws IOException, InterruptedException {
        System.out.println("++ Convertir " + base_code + " a " + target_code + " ++");
        consumoApi.conversion(base_code, target_code);

    }

    public void mostrarHistorial() {
        historial.mostrarHistorial();
    }



    }





