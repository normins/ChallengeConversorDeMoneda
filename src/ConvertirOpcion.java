import java.io.IOException;
import java.util.Scanner;

public class ConvertirOpcion {
    int valor;
    Scanner input = new Scanner(System.in);

    public int getValor() {
        return this.valor;
    }

    public void convertir(String origen, String destino, int valor) throws IOException, InterruptedException {
        ConsultarAPI consulta = new ConsultarAPI();

        //System.out.println("acá hay que convertir"+ origen + destino + valor);

        Moneda moneda = consulta.convertirConAPI(origen, destino, valor);
        moneda.datos(valor);
    }

    public void ingresarDato(){
        System.out.println("Ingresa el valor a convertir:");
        valor = input.nextInt();
    }
}
