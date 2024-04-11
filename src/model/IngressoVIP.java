package model;

public class IngressoVIP extends Ingresso {
    private String funcao;

    public IngressoVIP() {
        super.getIdentificador();
        super.getValor();
        funcao = null;
    }

    public float getValorFinal(float taxaConveniencia) {
        return super.getvalorFinal(taxaConveniencia) * 1.18f;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;	
    }
}
