package Entities;

import java.util.List;

public class Trilha {

    private String nome;
    private int duracaoHoras;
    private int modulosConcluidos;
    private List<Habilidade> modulos;

    public Trilha(String nome, int duracaoHoras, List<Habilidade> modulos) {
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
        this.modulos = modulos;
        this.modulosConcluidos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public int getModulosConcluidos() {
        return modulosConcluidos;
    }

    public void setModulosConcluidos(int modulosConcluidos) {
        this.modulosConcluidos = modulosConcluidos;
    }

    public List<Habilidade> getModulos() {
        return modulos;
    }

    public void setModulos(List<Habilidade> modulos) {
        this.modulos = modulos;
    }

    public void registrarConclusaoModulo(Habilidade habilidadeConcluida) {
        if (this.modulos.contains(habilidadeConcluida)) {
            this.modulosConcluidos++;
            System.out.println("Módulo '" + habilidadeConcluida.getNome() + "' concluído!");
        } else {
            System.out.println("Erro: Módulo não faz parte desta trilha.");
        }
    }

    public String calcularProgressoPercentual() {
        if (modulos.isEmpty()) {
            return "0%";
        }
        double percentual = ((double) modulosConcluidos / modulos.size()) * 100;
        return String.format("%.2f%%", percentual);
    }
}
