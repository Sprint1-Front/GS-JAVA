package Entities;

public class HabilidadeTecnica extends Habilidade{
    private String areaEspecializacao;
    private String ferramentaChave;

    public HabilidadeTecnica(String nome, int nivelDominio, String moduloID, String area, String ferramenta) {
        super(nome, nivelDominio, moduloID);
        this.areaEspecializacao = area;
        this.ferramentaChave = ferramenta;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }

    public String getFerramentaChave() {
        return ferramentaChave;
    }

    public void setFerramentaChave(String ferramentaChave) {
        this.ferramentaChave = ferramentaChave;
    }

    @Override
    public String getTipoDetalhado() {
        return "Técnica - Foco em " + areaEspecializacao;
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + " - " + getTipoDetalhado() + " (Ferramenta: " + ferramentaChave + ")";
    }
}

