package edu.vitor.semana2;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Vítor";
        String sobreNome = "Guedes";

        String nomeCompleto = pegarNomeCompleto(primeiroNome, sobreNome);
        System.out.println(nomeCompleto);
    }

    public static String pegarNomeCompleto(String primeiroNome, String sobreNome) {
        return primeiroNome.concat(" ").concat(sobreNome);
    }

}