import java.io.*;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        //Ejercicio 3
        double radio = 0;
        double Pi = 3.14;
        double areaCirculo;
        String radioTexto = "";

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        
        try{
            radioTexto = buffer.readLine();
            radio = Double.parseDouble(radioTexto);
        }catch(IOException e){}

        areaCirculo = (radio * radio) *Pi;
        System.out.println("El area del circulo es: " + areaCirculo);

    }
}
