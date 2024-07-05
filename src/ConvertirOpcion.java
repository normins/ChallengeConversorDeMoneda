import java.util.Scanner;

public class ConvertirOpcion {
    double valor;
    Scanner input = new Scanner(System.in);

    public void convertir(){
        System.out.println("acá hay que convertir");
    }

    public void datos(){
        System.out.println("Ingresa el valor a convertir:");
        valor = input.nextDouble();
    }
}
