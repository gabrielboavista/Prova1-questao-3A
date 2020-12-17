package questao3p1;

import java.util.Scanner;

public class Questao3P1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o lado A: ");
        int lda = teclado.nextByte();
        System.out.println("Digite o lado B: ");
        int ldb = teclado.nextByte();
        System.out.println("Digite o lado C: ");
        int ldc = teclado.nextByte();
        
        int ldx = ldb - ldc;
        int ldy = lda - ldc;
        int ldz = lda - ldb;
        int ldq = ldb + ldc;
        int ldw = lda + ldc;
        int lde = lda + ldb;
        
        if (lda > ldx && lda < ldq){
            if (ldb > ldy && ldb < ldw){
                if (ldc > ldz && ldc < lde){
                    System.out.println("Verdadeiro");
                } else {
                    System.out.println("False");
                }
            } else {
                System.out.println("Falso");
            }
        } else{
            System.out.println("Falso");
        }
    }
    
}
