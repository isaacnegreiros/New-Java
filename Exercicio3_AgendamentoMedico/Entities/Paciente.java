package Sistemas_do_Dia_a_Dia2.Exercicio3_AgendamentoMedico.Entities;

public class Paciente {
    public String Nome;
    public Double CPF;
    public String Especialidade;
    public Integer Cadastro;
     {
    }

    public Paciente(String Nome, Double cpf, String Especialidade, Integer cadastro) {
        this.Nome = Nome;
        this.CPF = cpf;
        this.Especialidade = Especialidade;
        this.Cadastro = cadastro;
    }

    public Paciente() {

    }
}
