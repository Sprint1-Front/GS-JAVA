package Entities;

import java.util.ArrayList;
import java.util.List;

public class Profissao {
    private String nome;
    private double riscoAutomacao;
    private List<Habilidade> habilidadesExigidas;

    public Profissao(String nome, double riscoAutomacao) {
        this.nome = nome;
        this.riscoAutomacao = riscoAutomacao;
        this.habilidadesExigidas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRiscoAutomacao() {
        return riscoAutomacao;
    }

    public void setRiscoAutomacao(double riscoAutomacao) {
        this.riscoAutomacao = riscoAutomacao;
    }

    public List<Habilidade> getHabilidadesExigidas() {
        return habilidadesExigidas;
    }

    public void setHabilidadesExigidas(List<Habilidade> habilidadesExigidas) {
        this.habilidadesExigidas = habilidadesExigidas;
    }

    public void adicionarHabilidadeExigida(Habilidade habilidade) {
        if (habilidade != null) {
            this.habilidadesExigidas.add(habilidade);
            System.out.println("Habilidade '" + habilidade.getNome() + "' adicionada a " + this.nome);
        }
    }

    public String classificarRisco() {
        Risco nivelRisco = Risco.classificar(riscoAutomacao);

        return nivelRisco.getNome() + " (Risco de Automação: " + String.format("%.0f%%", riscoAutomacao * 100) + ")";
    }
}