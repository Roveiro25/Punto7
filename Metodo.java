
import java.util.Scanner;

public class Metodo
{
    public objEstudiante[][] llenar (objEstudiante[][] m, Scanner sc)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objEstudiante o = new objEstudiante();

                System.out.print("Ingrese el nombre del estudiante: ");
                o.setNombre(sc.next());

                char grupo;
                do { 
                    System.out.print("Ingrese la calificación(A,B,C): ");
                    grupo = sc.next().toUpperCase().charAt(0);

                    if (grupo != 'A' && grupo != 'B' && grupo != 'C') {
                    System.out.println("Solo se permite A, B o C; reintene nuevamente");
                }

            } while (grupo != 'A' && grupo != 'B' && grupo != 'C');
            System.out.println(" ");
                
                o.setNota(grupo);
                m[i][j] = o;
            }
        }
        return m;
    }
    public void Mostrar(objEstudiante[][] m)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                if (m[i][j] != null) 
                {
                System.out.println("Nombre del estudiante: " + m[i][j].getNombre());
                System.out.println("Calificación: " + m[i][j].getNota());
                System.out.println("**********************************************");
                }
            }
        }
    }
    public objEstudiante[][] clasificar(objEstudiante[][] m, char letra, int n)
    {
        objEstudiante[][] Grupo = new objEstudiante[n][n];
        int fila = 0, columna = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNota() == letra) 
                {   
                    if(fila < n){
                    Grupo[fila][columna] = m[i][j];
                    columna++;
                    
                        if (columna == n) 
                        {
                            columna = 0;
                            fila++;   
                        }
                    }
                }
            }
        }
        return Grupo;
    }
    public boolean estaVacia(objEstudiante[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] != null) {
                    return false; // encontró al menos uno
                }
            }
        }

        return true; // todos son null
    }
}
