import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by x3727349s on 06/10/16.
 */
public class EjecutarComandaIntroducida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix la comanda:");
        String salida = null;
        String comando = sc.nextLine();
        try {

            Process proceso = Runtime.getRuntime().exec(comando);

            InputStreamReader entrada = new InputStreamReader(proceso.getInputStream());
            BufferedReader stdInput = new BufferedReader(entrada);


            while ((salida = stdInput.readLine()) != null) {
                System.out.println(salida);
            }


        } catch (IOException e) {
            System.out.println("Error de sintaxis");
        }
    }
}
