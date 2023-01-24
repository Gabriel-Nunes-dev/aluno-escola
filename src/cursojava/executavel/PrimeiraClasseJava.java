package cursojava.executavel;

import cursojava.classes.Aluno;

import javax.swing.*;

public class PrimeiraClasseJava {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento:");
        String rg = JOptionPane.showInputDialog("Registro Geral:");
        String cpf = JOptionPane.showInputDialog("CPF:");
        String mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
        String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
        String matricula = JOptionPane.showInputDialog("Sua matrícula:");
        String escola = JOptionPane.showInputDialog("Colégio atual:");
        String serie = JOptionPane.showInputDialog("Está matriculado em que série?");

        String nota1 = JOptionPane.showInputDialog("Nota1");
        String nota2 = JOptionPane.showInputDialog("Nota2");
        String nota3 = JOptionPane.showInputDialog("Nota3");
        String nota4 = JOptionPane.showInputDialog("Nota4");



        Aluno aluno1 = new Aluno();

        aluno1.setNome(nome);
        aluno1.setIdade(Integer.parseInt(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCpf(cpf);
        aluno1.setNomeMae(mae);
        aluno1.setNomePai(pai);
        aluno1.setDataMatricula(matricula);
        aluno1.setNomeEscola(escola);
        aluno1.setSerieMatriculado(serie);
        aluno1.setNota1(Double.parseDouble(nota1));
        aluno1.setNota2(Double.parseDouble(nota2));
        aluno1.setNota3(Double.parseDouble(nota3));
        aluno1.setNota4(Double.parseDouble(nota4));

        System.out.println(aluno1.toString());
        System.out.println("Média do aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + aluno1.getAlunoAprovado2());




    }
}
