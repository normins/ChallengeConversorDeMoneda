import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        try {
            Menu.mostrarMenu();
        } catch(Exception e){
            System.out.println("Inconveniente en la conversión");
        }
        System.out.println("Finalizando la aplicación.");
    }
}