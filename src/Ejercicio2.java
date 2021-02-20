import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        //Ejercicio 2
        int numero1;
        int numero2;

        Scanner lector = new Scanner (System.in);

        System.out.println("Ingresa el Numero uno");
        numero1 = lector.nextInt();

        System.out.println("Ingresa el Numero dos");
        numero2 = lector.nextInt();

        if(numero1 > numero2){
            System.out.println("El Numero: "+numero1+" es mayor que: "+numero2);
        }else{
            if(numero1 < numero2){
                System.out.println("El Numero: "+numero1+" es menor que: "+numero2);
            }else{
                if(numero1 == numero2){
                    System.out.println("El Numero: "+numero1+" es igual que: "+numero2);
                }
            }
        }

    }
}