package edu.vitor.semana1;

/**
 * BoletimEscolar
 * Essa classe foi utilizada como exemplo
 * para demonstrações de de identação de código
 */
public class BoletimEscolar {

    public static void main(String[] args) {

        double notaFinal = 6.8;

        if (notaFinal < 6)
            System.out.println("Aluno reprovado!" + " Nota: " + notaFinal);
        else if (notaFinal == 6)
            System.out.println("Prova minerva!" + " Nota: " + notaFinal);
        else
            System.out.println("Aluno aprovado!" + " Nota: " + notaFinal);
    }

}