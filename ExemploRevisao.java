package Revisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        System.out.println("Informe a 1º nota do Aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a 2º nota do Aluno");
        int nota2 = sc.nextInt();
        double media = (nota1 + nota2)/2;
        System.out.println("A média do Aluno é " +media);
        System.out.println("Informe o total de aulas da disciplina");
        int aulasDadas = sc.nextInt();
        System.out.println("Informe o total de faltas do Aluno");
        int totalFaltas = sc.nextInt();
        double frequencia = ((aulasDadas-totalFaltas)*100)/aulasDadas;
        System.out.println("A frequencia do Aluno é " +frequencia+"%");
        if (media>=50 && frequencia>=75) {
        System.out.println("Aluno aprovado");  
        }else if(media<50 && frequencia<=75) {
        System.out.println("Aluno de Recuperação");
        }else{
         System.out.println("Aluno Reprovado");   
        }
    }
 
}
