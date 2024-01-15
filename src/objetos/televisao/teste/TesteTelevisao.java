package objetos.televisao.teste;

import objetos.televisao.dominio.Televisao;

public class TesteTelevisao {
    public static void main(String[] args) {
        Televisao minhaTv = new Televisao("Samsung", "32 polegadas", 2110.0);
        minhaTv.ligarTv();
        System.out.println(minhaTv.getTamanho());
        System.out.println(minhaTv);
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.aumentarVolume();
        minhaTv.diminuirVolume();
        minhaTv.diminuirVolume();
        minhaTv.diminuirVolume();
        minhaTv.diminuirVolume();
        minhaTv.diminuirVolume();
        minhaTv.diminuirVolume();
        System.out.println(minhaTv);
    }
}
