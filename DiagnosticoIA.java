package Entities;

import java.time.LocalDate;

public class DiagnosticoIA {
    private LocalDate data;
    private Profissao profissao;
    private Trilha trilhaRecomendada;

    public DiagnosticoIA(LocalDate data, Profissao profissao, Trilha trilhaRecomendada) {
        this.data = data;
        this.profissao = profissao;
        this.trilhaRecomendada = trilhaRecomendada;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public Trilha getTrilhaRecomendada() {
        return trilhaRecomendada;
    }

    public void setTrilhaRecomendada(Trilha trilhaRecomendada) {
        this.trilhaRecomendada = trilhaRecomendada;
    }

    public void exibirResumoDiagnostico() {
        System.out.println("--- Diagnóstico IA TalentForge ---");
        System.out.println("Data da Análise: " + this.data);
        System.out.println("Profissão Analisada: " + this.profissao.getNome());
        System.out.println("Risco de Automação: " + this.profissao.classificarRisco());
        System.out.println("Trilha Recomendada: " + this.trilhaRecomendada.getNome());
        System.out.println("Progresso na Trilha: " + this.trilhaRecomendada.calcularProgressoPercentual());
        System.out.println("---------------------------------");
    }

    public boolean verificarUrgenciaRequalificacao() {
        String risco = this.profissao.classificarRisco();
        String progresso = this.trilhaRecomendada.calcularProgressoPercentual();

        if (risco.startsWith("Alto") && progresso.equals("0.00%")) {
            return true;
        } else {
            return false;
        }
    }
}