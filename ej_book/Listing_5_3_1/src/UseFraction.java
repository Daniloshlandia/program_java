import static java.lang.System.out;


public class UseFraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(5, 6);
        Fraction f2 = new Fraction(7, 8);
        Fraction f3 = f1.mult(f2);

        out.println("f1 * f2 = f3");
        out.println(""+f1+" * "+f2+" = "+f3);
        Fraction j = new Fraction(1000, 800);
        out.println("j vale" + j);
        j.simp();
        out.println("Simplificado j vale" + j);
        Fraction k = f1.sum(f2);
        out.println("k = f1 + f2 vale "+k);
        Fraction m=f1.res(f2);
        out.println("m = f1 - f2 vale "+m);
        
    }
    
}
