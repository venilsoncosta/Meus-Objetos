package objetos.televisao.dominio;

public class Televisao {
    private String marca;
    private String tamanho;
    private Double preco;
    private Boolean ligada;
    private Integer volume;
    private static final Integer VOLUME_MAXIMO = 30;

    public Televisao(String marca, String tamanho, Double preco) {
        if(marca != null && tamanho != null && preco > 0){
            this.marca = marca;
            this.tamanho = tamanho;
            this.preco = preco;
            this.ligada = false;
            this.volume = 0;
        }else {
            throw new RuntimeException("Os valores não podem ser nulos");
        }

    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() +
                " | Preço: R$" + getPreco() +
                " | Ligada: " + getLigada() +
                " | Volume: " + getVolume();
    }

    public void ligarTv(){
        ligada = true;
    }

    public void desligarTv(){
        if(ligada){
            ligada = false;
        }
    }

    public void aumentarVolume(){
        volume++;
        if(getVolume() == VOLUME_MAXIMO){
            System.out.println("O volume está no máximo");
            volume = VOLUME_MAXIMO;
        }
    }

    public void diminuirVolume(){
        volume--;
        if(volume <= 0){
            System.out.println("Não é possível diminuir o volume");
            volume = 0;
        }
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

    public int getVolume(){
        return volume;
    }
}
