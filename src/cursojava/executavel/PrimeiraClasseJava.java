package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        aluno1.setIdade(50);
        aluno1.setDataNascimento("30/04/1987");
        aluno1.setRegistroGeral("3.958.849-98");
        aluno1.setNota1(90);
        aluno1.setNota2(80);
        aluno1.setNota3(75);
        aluno1.setNota4(80);



        System.out.println("Nome é =" + aluno1.getNome());
        System.out.println("Idade é =" + aluno1.getIdade());
        System.out.println("Data de nascimento é= " +aluno1.getDataNascimento());
        System.out.println("Número do RG= " + aluno1.getRegistroGeral());
        System.out.println("A média do aluno foi = " + aluno1.getMediaNota());

        Aluno aluno2 = new Aluno();

        Aluno aluno3 = new Aluno();

    }
}
