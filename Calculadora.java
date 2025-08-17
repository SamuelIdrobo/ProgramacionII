import java.util.Scanner; 

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int opcion2;
        
        do {
            System.out.println("Ingrese el primer número: ");
            double num1 = sc.nextDouble();
            
            System.out.println("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();
            
            System.out.println("Seleccione la operación: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            
            System.out.println("\n¿Desea realizar otra operación? (Si = 1 / No = 2): ");
            opcion2 = sc.nextInt();
            
        } while (opcion2 == 1); 
        
        System.out.println("¡Gracias por usar la calculadora!");
        sc.close();
    }
}