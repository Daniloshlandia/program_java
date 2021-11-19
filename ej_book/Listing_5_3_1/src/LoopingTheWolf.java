import static java.lang.System.out;

public class LoopingTheWolf {
    public static void main(String[] args) {
        /*
        for loop anatomia 
        for (inicializacion ; expression; update )
                 |                  |         |  
             Es ejecutada    Es evaludada    Es evaluda muchas veces
              una vez     en cada iteracion.  hasta que finalize 
                                              cada iteracion
        */  
                
        for (int count = 1; count <= 10; count++) {
            out.print("The Value of count is ");
            out.print(count);
            out.println(".");
        }

        out.println("Done!");
    }
}
