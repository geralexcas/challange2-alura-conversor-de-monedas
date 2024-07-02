package models;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<String> historial;
    public Historial(){
        this.historial = new ArrayList<>();
    }
    public void  agregarConsulta(String consulta){
        historial.add(consulta);
    }
    public void  mostrarHistorial(){
        if(historial.isEmpty()){
            System.out.println("No hay consltas en el historial");

        }else {
            System.out.println("**HISTORIAL**");
            System.out.println("historial de consultas");
            for (String consulta :  historial){
                System.out.println(consulta);
            }
        }
    }
}
