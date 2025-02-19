import java.util.ArrayList;

public class Fusca extends Carro {
    public static final String marca = "VW";
    public String c1;
    public String c2;

    public Fusca(String c1, String c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public Fusca(){}

    public static void main(String[] args) {

    }

    @Override
    public void acelerar() {
        System.out.println("acelerou mas não muito");
    }

    public void barulho(String tipoBarulho){
        System.out.println(tipoBarulho);
    }

    public void barulho(int intensidade) {
        System.out.println(intensidade);
    }
}
