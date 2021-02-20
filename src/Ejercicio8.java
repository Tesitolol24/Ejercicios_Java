import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        //Ejercicio 8

        int opcion = 0;
        
        System.out.println("Elige un dia de la semana con las siguentes opciones");
        System.out.println("1. Lunes // 2. Martes // 3. Miercoles // 4. Jueves // 5. Viernes // 6. Sabado // 7. Domingo ");
        
        Scanner lector = new Scanner(System.in);
        opcion = lector.nextInt();

        switch(opcion)
        {
            case 1:
            System.out.println("Este es un día laboral");
            break;

            case 2:
            System.out.println("Este es un día laboral");
            break;

            case 3:
            System.out.println("Este es un día laboral");
            break;
            
            case 4:
            System.out.println("Este es un día laboral");
            break;

            case 5:
            System.out.println("Este es un día laboral");
            break;
            
            case 6:
            System.out.println("Este es un día no es laboral");
            break;

            case 7:
            System.out.println("Este es un día no es laboral");
            break;

            default:
            System.out.println("Esta opción es invalida");

        }


        

    }
}
