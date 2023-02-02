package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    String nome;
    int idade;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String nomePai;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;

    Disciplina disciplina;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    /* Método que retorna média do aluno */
    public double getMediaNota() {

        double somaNotas = 0.0;

        for (Disciplina disciplina : disciplinas
        ) {
            somaNotas += disciplina.getNota();

        }
        return somaNotas / disciplinas.size();
    }

    public String getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 70) {
            return "Aluno está aprovado";
        } else {
            return "Aluno está reprovado";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Objects.equals(nome, aluno.nome)
                && Objects.equals(dataNascimento, aluno.dataNascimento)
                && Objects.equals(registroGeral, aluno.registroGeral) && Objects.equals(numeroCpf, aluno.numeroCpf)
                && Objects.equals(nomeMae, aluno.nomeMae) && Objects.equals(nomePai, aluno.nomePai)
                && Objects.equals(dataMatricula, aluno.dataMatricula) && Objects.equals(nomeEscola, aluno.nomeEscola)
                && Objects.equals(serieMatriculado, aluno.serieMatriculado)
                && Objects.equals(disciplina, aluno.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataNascimento, registroGeral, numeroCpf, nomeMae, nomePai, dataMatricula,
                nomeEscola, serieMatriculado, disciplina);
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome='" + nome + '\'' + ", idade=" + idade + ", dataNascimento='" + dataNascimento + '\''
                + ", registroGeral='" + registroGeral + '\'' + ", numeroCpf='" + numeroCpf + '\'' + ", nomeMae='"
                + nomeMae + '\'' + ", nomePai='" + nomePai + '\'' + ", dataMatricula='" + dataMatricula + '\''
                + ", nomeEscola='" + nomeEscola + '\'' + ", serieMatriculado='" + serieMatriculado + '\'' + '}';
    }
}
