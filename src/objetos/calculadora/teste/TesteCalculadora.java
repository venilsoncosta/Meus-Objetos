package objetos.calculadora.teste;

import objetos.calculadora.dominio.Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora minhaCalculadora = new Calculadora();
        System.out.println(minhaCalculadora.multipicar(34, 6));
        System.out.println(minhaCalculadora.dividir(4, 3));
        System.out.println(minhaCalculadora.somar(45, 45));
        System.out.println(minhaCalculadora.subtrair(4.32, 23.87));

    }
}

