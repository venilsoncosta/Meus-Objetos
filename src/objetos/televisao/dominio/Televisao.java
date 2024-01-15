package objetos.televisao.dominio;

public class Televisao {
    private String marca;
    private String tamanho;
    private Double preco;
    private Boolean ligada;

    public Televisao(String marca, String tamanho, Double preco) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.preco = preco;
        this.ligada = false;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                "Preço: " + preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getLigada() {
        return ligada;
    }
}
