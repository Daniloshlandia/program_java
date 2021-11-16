public class GatoSimple {

    //atributos 
    String color, raza, sexo;
    int edad;
    double peso;



// metodo 
GatoSimple (String s)
{
    this.sexo = s;

}

//getter 
String getSexo()
{
    return this.sexo;
}

//do maulla cat

void maulla()
{
    System.out.println("..........Miuauuuu");

}

void ronronea()
{
    System.out.println("............mrrrrrrrr");
}

void come(String comida)
{
    if (comida.equals("Pesacado"))
    {
        System.out.println(".......Hmmmmm, Gracias");

    }
    else
    {
        System.out.println("...........Lo siento yo solo como pescado");
    }
}

void peleaCon(GatoSimple contrincante){
    
}

}

 
