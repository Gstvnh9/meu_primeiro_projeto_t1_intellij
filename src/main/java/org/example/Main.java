package org.example;

public class Main {
     static void main() {

         int nota = 100;

         int frequencia = 60;

         boolean A = nota >= 50;

         boolean B = frequencia >= 75;



         boolean cond1, cond2, cond3;



         cond1 = nota >= 50 && frequencia >= 75;

         cond2 = A || B;

         cond3 = !A;



         System.out.println("O aluno sera aprovado? " + cond1);

         System.out.println("A OU B: " + cond2);

         System.out.println("Inverso de A: " + cond3);

     }
}