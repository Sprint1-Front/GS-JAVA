package Entities;

public abstract class Habilidade {
    private String nome;
    private int nivelDominio;
    private String moduloID;


    public Habilidade(String nome, int nivelDominio, String moduloID) {
        this.nome = nome;
        this.nivelDominio = nivelDominio;
        this.moduloID = moduloID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelDominio() {
        return nivelDominio;
    }

    public void setNivelDominio(int nivelDominio) {
        this.nivelDominio = nivelDominio;
    }

    public String getModuloID() {
        return moduloID;
    }

    public void setModuloID(String moduloID) {
        this.moduloID = moduloID;
    }

    public String getDetalhes() {
        return nome + " (Nível: " + nivelDominio + ")";
    }

    public abstract String getTipoDetalhado();
}