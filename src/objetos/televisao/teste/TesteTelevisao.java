package objetos.televisao.teste;

import objetos.televisao.dominio.Televisao;

public class TesteTelevisao {
    public static void main(String[] args) {
        Televisao minhaTv = new Televisao("Samsung", "32 polegadas", 2356.0);
        minhaTv.ligarTv();
        System.out.println(minhaTv.getTamanho());
        System.out.println(minhaTv);
    }
}
