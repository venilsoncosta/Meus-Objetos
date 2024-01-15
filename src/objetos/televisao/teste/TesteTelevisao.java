package objetos.televisao.teste;

import objetos.televisao.dominio.Televisao;

public class TesteTelevisao {
    public static void main(String[] args) {
        Televisao minhaTv = new Televisao("Samsung", "32 polegadas", 1110.0);
        minhaTv.ligarTv();
        System.out.println(minhaTv);

        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();

        minhaTv.diminuirVolume();
        System.out.println(minhaTv);
    }
}
