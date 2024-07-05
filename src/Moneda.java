import com.google.gson.annotations.SerializedName;

public class Moneda{
        @SerializedName("base_code")
        public String valorOrigen;
        @SerializedName("target_code")
        public String valorDestino;
        @SerializedName("conversion_rate")
        public String conversion;
        @SerializedName("conversion_result")
        public String resultado;

    public void datos(int cantidad){
        //System.out.println("1["+valorOrigen+"] equivale a "+conversion+"["+valorDestino+"]");
        //System.out.println("La conversión de "+cantidad+"["+valorOrigen+"] a ["+valorDestino+"] es de "+resultado+"["+valorDestino+"]");
        System.out.println("El valor "+cantidad+"["+valorOrigen+"] corresponde al valor final de =>>> "+resultado+"["+valorDestino+"]") ;

    }

}
