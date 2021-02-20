public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        //Ejercicio 1
        int numero1 = 5;
        int numero2 = 2;

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
