package Entities;

public class Colaborador {

    private String nome;
    private int rm;
    private Profissao profissaoAtual;
    private Trilha trilhaAtiva;

    public Colaborador(String nome, int rm, Profissao profissaoAtual, Trilha trilhaAtiva) {
        this.nome = nome;
        this.rm = rm;
        this.profissaoAtual = profissaoAtual;
        this.trilhaAtiva = trilhaAtiva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public Profissao getProfissaoAtual() {
        return profissaoAtual;
    }

    public void setProfissaoAtual(Profissao profissaoAtual) {
        this.profissaoAtual = profissaoAtual;
    }

    public Trilha getTrilhaAtiva() {
        return trilhaAtiva;
    }

    public void setTrilhaAtiva(Trilha trilhaAtiva) {
        this.trilhaAtiva = trilhaAtiva;
    }

    public void mudarProfissao(Profissao novaProfissao) {
        System.out.println("\n[MUDANÇA DE PROFISSÃO]");
        System.out.println(this.nome + " mudou de: " + this.profissaoAtual.getNome());
        this.profissaoAtual = novaProfissao;
        System.out.println("Para a nova profissão: " + novaProfissao.getNome());
        System.out.println("Novo Risco de Automação: " + novaProfissao.classificarRisco());
    }

    public void exibirStatusProgresso() {
        if (this.trilhaAtiva != null) {
            String progresso = this.trilhaAtiva.calcularProgressoPercentual();
            System.out.println("Status da Trilha Ativa (" + this.trilhaAtiva.getNome() + "): " + progresso);
        } else {
            System.out.println("Nenhuma trilha ativa para o colaborador.");
        }
    }

    public void iniciarTrilha(Trilha novaTrilha) {
        if (this.trilhaAtiva != null && this.trilhaAtiva.calcularProgressoPercentual().equals("100.00%")) {
            System.out.println("O colaborador " + this.nome + " concluiu a trilha anterior.");
            this.trilhaAtiva = novaTrilha;
            System.out.println("Nova trilha '" + novaTrilha.getNome() + "' iniciada.");
        } else if (this.trilhaAtiva == null) {
            this.trilhaAtiva = novaTrilha;
            System.out.println("Trilha '" + novaTrilha.getNome() + "' iniciada.");
        } else {
            System.out.println("Erro: O colaborador ainda está na trilha '" + this.trilhaAtiva.getNome() + "'.");
        }
    }
}
