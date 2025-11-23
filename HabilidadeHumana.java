package Entities;

public class HabilidadeHumana extends Habilidade {
    private String focoComportamental;
    private int pontuacaoEmpatia;

    public HabilidadeHumana(String nome, int nivelDominio, String moduloID, String foco, int pontuacao) {
        super(nome, nivelDominio, moduloID);
        this.focoComportamental = foco;
        this.pontuacaoEmpatia = pontuacao;
    }

    public String getFocoComportamental() {
        return focoComportamental;
    }

    public void setFocoComportamental(String focoComportamental) {
        this.focoComportamental = focoComportamental;
    }

    public int getPontuacaoEmpatia() {
        return pontuacaoEmpatia;
    }

    public void setPontuacaoEmpatia(int pontuacaoEmpatia) {
        this.pontuacaoEmpatia = pontuacaoEmpatia;
    }

    @Override
    public String getTipoDetalhado() {
        return "Humana - Soft Skill";
    }

    public boolean requerPrioridade() {
        return pontuacaoEmpatia < 3;
    }
}
