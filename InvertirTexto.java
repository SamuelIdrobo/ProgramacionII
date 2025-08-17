import java.util.Scanner; 

public class InvertirTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        int opcion;

        do {
            System.out.println("Ingrese la cadena de texto que quiere invertir ");
            String texto = sc.nextLine();

            char[] letras = texto.toCharArray();
            String invertida = "";

            for (int i = letras.length - 1; i >= 0; i--) {
                invertida += letras[i];
            }

            System.out.println("La cadena invertida es: " + invertida);

            do {
                System.out.println("¿Desea continuar?  1 = Sí / 2 = No");
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                if (opcion != 1 && opcion != 2) {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }

            } while (opcion != 1 && opcion != 2);

        } while (opcion == 1);

        System.out.println("¡Adios!");
        sc.close();
    }
}
