package objetos.bicicleta.teste;

import objetos.bicicleta.dominio.Bicicleta;

public class BicicletaTeste {
    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta("Caloi", "Híbrida", "Preta");
        System.out.println(bicicleta1);
        bicicleta1.pedalar(10.2);
        System.out.println(bicicleta1.pegarVelocidadeAtual());
        bicicleta1.frear();
        System.out.println(bicicleta1.pegarVelocidadeAtual());
        bicicleta1.frear();
        System.out.println(bicicleta1.pegarVelocidadeAtual());
        bicicleta1.frear();

    }
}
