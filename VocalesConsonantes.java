import java.util.Scanner;
 
public class VocalesConsonantes {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Cantvocales = 0, Cantconsonantes = 0, totalconsonantes;
     System.out.println("Ingrese una palabra");
    String palabra = sc.nextLine();
 
    for ( int i = 0; i < palabra.length(); i++ )
    {       Cantconsonantes++;
    }
 
for ( int i = 0; i < palabra.length(); i++ ) {
 
    char letra = Character.toLowerCase(palabra.charAt(i));
 
    if( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
           Cantvocales++;
    }
}
sc.close();
   totalconsonantes = Cantconsonantes - Cantvocales;
   System.out.println("La palabra ingresada es: "+palabra);
   System.out.println("Total de vocales: " + Cantvocales);
   System.out.println("Total de consonantes: " + totalconsonantes);
    }
}