package model;

public class Ingresso {
	
	private String identificador;
	private float valor;
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public float getvalorFinal (float taxaConveniencia) {
		return valor + taxaConveniencia;
	}
	
}
