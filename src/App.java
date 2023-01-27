import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> nombres = new ArrayList<>();
        nombres.add("Karina"); 
        nombres.add("winter"); 
        nombres.add("Jennie"); 
        nombres.add("Lisa"); 
        nombres.add("Rose");
        nombres.add("Jisoo");
        nombres.add("Chaewon");
        nombres.add("Kazuha");
        nombres.add("Karina");
        

        //verificar si el nombre existe en la lista
        System.out.println(nombres.contains("Karina"));

        //encontrar la concidencia (Primera) 
        System.out.println("encontrar la concidencia "+ nombres.indexOf("winter"));

        //encontrar la concidencia (Primera) 
        System.out.println("encontrar la concidencia "+ nombres.lastIndexOf("Karina"));

        

        //buscar por equalIgnoreCase
        String nombreBusqueda = "Jennie";

        for (String item : nombres) {
            if (item.equalsIgnoreCase(nombreBusqueda)) {
                System.out.println(nombreBusqueda+" esta en lista de nombre "+ nombres);
            }
        }

        // output
        // true
        // encontrar la concidencia 1
        // encontrar la concidencia 8
        // Jennie esta en lista de nombre [Karina, winter, Jennie, Lisa, Rose, Jisoo, Chaewon, Kazuha]

        
        
        

    }
}
