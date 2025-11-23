package Entities;

public enum Risco {
    BAIXO("Baixo", 0.00, 0.19),
    MEDIO("Médio", 0.20, 0.49),
    ALTO("Alto", 0.50, 1.00);

    private final String nome;
    private final double limiteInferior;
    private final double limiteSuperior;

    Risco(String nome, double limiteInferior, double limiteSuperior) {
        this.nome = nome;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public String getNome() {
        return nome;
    }

    public static Risco classificar(double percentual) {
        if (percentual < BAIXO.limiteSuperior) {
            return BAIXO;
        } else if (percentual < ALTO.limiteSuperior) {
            return MEDIO;
        } else {
            return ALTO;
        }
    }
}
