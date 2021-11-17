public class Notas 
{
    private final static byte ALUMNOS=30;
    private final static byte NOTAS=1+10;
    
    public static void main(String[] args) 
    {
        byte n1ev[],n2ev[],n3ev[],media[],nota[];
        n1ev=new byte[ALUMNOS];
        n2ev=new byte[ALUMNOS];
        n3ev=new byte[ALUMNOS];
        media=new byte[ALUMNOS];
        nota=new byte[NOTAS];
        
        // Simulación de notas
        for (byte i=0;i<ALUMNOS;i++)
        {
            n1ev[i]=(byte)(Math.random()*NOTAS);
            n2ev[i]=(byte)(Math.random()*NOTAS);
            n3ev[i]=(byte)(Math.random()*NOTAS);
            //media[i]=(byte)((n1ev[i]+n2ev[i]+n3ev[i])/3);
        }
        
        CalcularMedia(n1ev,n2ev,n3ev,media);
        
        System.out.println("Notas de los alumnos");
        System.out.println("====================");
        System.out.println();
        
        // Imprime las notas
        for (byte i=0;i<ALUMNOS;i++)
        {
            System.out.println("Nota del alumno "+(i+1)+": 1EV="+n1ev[i]+" 2EV="+n2ev[i]+" 3EV="+n3ev[i]+" MEDIA="+media[i]);
        }
        
        // Inicialización de las notas
        for (byte i=0;i<NOTAS;i++)
        {
            nota[i]=0;
        }
        
        // Cuenta cada nota
        for (byte i=0;i<ALUMNOS;i++)
        {
            nota[media[i]]++;
        }
        
        System.out.println();
        
        // Imprime cada nota
        MostrarEstadistica(nota);
        /*
        for (byte i=0;i<nota.length;i++)
        {
            System.out.printf("Nota %d: %d %.2f%%%n",i,nota[i],100*(double)nota[i]/(double)ALUMNOS);
        }
        */
    }
    
    private static void CalcularMedia(byte ev1[],byte ev2[],byte ev3[],byte media[])
    {
        for (byte i=0;i<ALUMNOS;i++)
        {
            media[i]=(byte)((ev1[i]+ev2[i]+ev3[i])/3);
            if (((ev1[i]<4) || (ev2[i]<4) || (ev3[i]<4)) && (media[i]>=5))
                media[i]=4;
        }        
    }
    
    private static void MostrarEstadistica(byte nota[])
    {
        for (byte i=0;i<NOTAS;i++)
        {
            System.out.printf("Nota %d: %d %.2f%%%n",i,nota[i],100*(double)nota[i]/(double)ALUMNOS);
        }        
    }

 

}