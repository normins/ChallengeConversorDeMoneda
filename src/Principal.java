import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // Permite el ingreso de conversiones hasta que eligen Salir.
        try {
            Menu.mostrarMenu();
        } catch(Exception e){
            System.out.println("Inconvenientes en la conversión");
        }
        System.out.println("Finalizando la aplicación.");
    }
}