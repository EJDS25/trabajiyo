import java.util.Scanner;
public class App {
    //Edgard jose estrada salazar\2024-1373u
    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        boolean condiciosalida = true;
        do {
            try {
                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }
        } while (condiciosalida);
        //recibimos el array del metodo
        int array[] = llenado();
        System.out.println("Mostrar");
        Mostrar(array);

        int [] arrinvert = Invertir(array);
        System.out.println("this array is inverted");
        Mostrar(arrinvert);
    }
    public static int[] llenado() {
        int[] arreglo = new int[tamv];
        for (int i = 0; i < arreglo.length; i++) {
          try {
            System.out.println("ingrese el valo [" + i + "]");
            arreglo[i] = leer.nextInt();
            
          } catch (Exception e) {
                System.out.println(e);
                i--;
                leer.nextLine();


          }
  
        }
        return arreglo;
    }
    public static void Mostrar(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }

        //Hay que hacer que mire bonito

    }

    //Aqui va el metodo de inverso
    //los voy a apalzar a todos

    public static int[] Invertir(int[] T) {
        int[] invertion = new int[T.length];
        for (int i = 0, j = T.length - 1; i < T.length; i++, j--) {
            invertion[i] = T[j];
        }

        return invertion;




    }
    
}