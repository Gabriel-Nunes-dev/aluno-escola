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

        String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
        String nota1 = JOptionPane.showInputDialog("Nota1");

        String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
        String nota2 = JOptionPane.showInputDialog("Nota2");

        String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
        String nota3 = JOptionPane.showInputDialog("Nota3");

        String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
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

        aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
        aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
        aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
        aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));

        aluno1.getDisciplina().setDisciplina1(disciplina1);
        aluno1.getDisciplina().setDisciplina2(disciplina2);
        aluno1.getDisciplina().setDisciplina3(disciplina3);
        aluno1.getDisciplina().setDisciplina4(disciplina4);


        System.out.println(aluno1);
        System.out.println("Média do aluno = " + aluno1.getMediaNota());
        System.out.println("Resultado = " + aluno1.getAlunoAprovado2());


    }
}
