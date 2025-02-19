public abstract class Carro implements Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String cor;

    public Carro() {
    }

    public Carro(String marca, String modelo, int anoFabricacao, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public void acelerar() {
        System.out.println("acelerou");
    }
    public void frear() {
        System.out.println("freiou");
    }
    public void ligar() {
        System.out.println("ligou");
    }
    public void desligar() {
        System.out.println("desligou");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
