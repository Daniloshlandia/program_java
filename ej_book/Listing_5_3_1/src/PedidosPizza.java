import static java.lang.System.out;

public class PedidosPizza {
    public static void main(String[] args) {
        PizzaContent Pizza;

        Pizza  = new PizzaContent();

        Pizza.typep = "Margarita ";
        Pizza.typeq = "funghi ";
        Pizza.typer = "cuatro quesos ";
        Pizza.state1 =  ",Pedida ";
        Pizza.state2 = "Servida ";
        Pizza.size  = "mediana ";
        Pizza.size1 = "familiar ";

        out.println("Pizza "+ Pizza.typep + Pizza.size + Pizza.state1);
        out.println("Pizza "+ Pizza.typeq + Pizza.size1 + Pizza.state2);
        out.println(Pizza.typer + Pizza.size);

        out.println("Pedidas: " + Pizza.getTotalPedidas())

    }
}
