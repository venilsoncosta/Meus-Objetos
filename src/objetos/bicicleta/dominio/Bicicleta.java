package objetos.bicicleta.dominio;


public class Bicicleta {
    private String marca;
    private String modelo;
    private String cor;
    private double velocidade = 0.0;

    public Bicicleta() {
    }

    public Bicicleta(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void pedalar(double aceleracao){
        if(getVelocidade() >= 0){
            velocidade += aceleracao;
        }
    }

    public double pegarVelocidadeAtual(){
        return getVelocidade();
    }

    @Override
    public String toString() {
        return "MARCA: " + marca.toUpperCase() +
                ", MODELO: " + modelo.toUpperCase() +
                ", COR: " + cor.toUpperCase();
    }

    //getters e setters
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
