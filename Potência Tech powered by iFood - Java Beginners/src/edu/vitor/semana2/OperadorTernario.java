package edu.vitor.semana2;

public class OperadorTernario {
    public static void main(String[] args) {
        int valor1 = 3;
        int valor2 = 7;

        final String resultado = valor1 < valor2 ? "Verdadeiro, ação 1" : "Falso, ação 2";
        System.out.println(resultado);
    }
}
