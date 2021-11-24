

public class Fraction 
{
    private int a;    // Numerador
    private int b;    // Denominador
    
    // Constructor
    public Fraction(int a, int b)
    {
        this.a=a;    
        this.b=b;
        if (b==0)
        {
            System.out.println("Cuidado! si el denominador es 0, aparece el infinito en la fración.");
        }
    }
    
    public void inv()
    {        
        int aux=this.a;
        this.a=this.b;
        this.b=aux;
        if (b==0)
        {
            System.out.println("Cuidado! si el denominador es 0, aparece el infinito en la fración.");
        }
    }
    
    public Fraction mult(Fraction x)
    {
        // (a1·a2)/(b1·b2)
        
        Fraction n=new Fraction(a*x.a,b*x.b);
        return n;
    }

 

    public Fraction div(Fraction x)
    {
        Fraction n=new Fraction(a*x.b,b*x.a);
        return n;
    }

 

    public void simp()
    {
        int i=2;
        
        while ((i<a) && (i<b))
        {
            if    ((a%i==0) && (b%i==0))
            {
                a=a/i; b=b/i;
            }
            else
                i++;            
        }
    }
    
    public Fraction sum(Fraction x)
    {   
        Fraction n=new Fraction((a*x.b)+(x.a*b),b*x.b);
        n.simp();
        return n;
    }
    
    public Fraction res(Fraction x)
    {   
        Fraction n=new Fraction((x.b*a)-(x.a*b),b*x.b);
        n.simp();
        return n;
    }

 

    public String toString()
    {
        //return (""+this.a+"\n-\n"+this.b);
        return (""+a+"/"+b);
    }
    
    public int divint()
    {
        return a/b;
    }
    
    public int resint()
    {
        return a%b;
    }
    
    public float divf()
    {
        return (float)a/(float)b;
    }
    
    public int getA() 
    {
        return a;
    }
    
    public void setA(int a) 
    {
        this.a = a;
    }
    
    public int getB() 
    {
        return b;
    }
    
    public void setB(int b) 
    {
        if (b==0)
        {
            System.out.println("Cuidado! si el denominador es 0, aparece el infinito en la fración.");
        }
        this.b = b;
    }
}