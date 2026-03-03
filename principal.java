
import java.util.Scanner;

public class principal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Metodo met = new Metodo();

        int n = 0;
        System.out.print("Ingrese la dimensión de la matriz: ");
        n = sc.nextInt();

        objEstudiante[][] m = new objEstudiante[n][n];
        m = met.llenar(m, sc);

        objEstudiante [][] mA = met.clasificar(m, 'A', n);
        objEstudiante [][] mB = met.clasificar(m, 'B', n);
        objEstudiante [][] mC = met.clasificar(m, 'C', n);
        
        if (!met.estaVacia(mA)) 
            met.Mostrar(mA);
        else
            System.out.println("No hay ningun estudiantebque tenga calificación A");
        
        if (!met.estaVacia(mB))
            met.Mostrar(mB);
        else
            System.out.println("No hay ningun estudiantebque tenga calificación B");
        
        if (!met.estaVacia(mC)) 
            met.Mostrar(mC);
        else
            System.out.println("No hay ningun estudiante que tenga calificación C");
        
    }
}
