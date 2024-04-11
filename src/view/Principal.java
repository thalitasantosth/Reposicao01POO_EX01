package view;

import model.Ingresso;
import model.IngressoVIP;

public class Principal {

	public static void main(String[] args) {
		
		float taxaConveniencia = 5.0f;

		
		// Ingresso comum
        Ingresso i1 = new Ingresso();
        i1.setIdentificador("001");
        i1.setValor(50.0f);
        float valorFinalIngressoComum = i1.getvalorFinal(taxaConveniencia);
        System.out.println("Valor final do ingresso comum: R$" + valorFinalIngressoComum);

        // Ingresso VIP
        IngressoVIP i2 = new IngressoVIP();
        i2.setIdentificador("002");
        i2.setValor(100.0f);
        i2.setFuncao("Camarote");
        float valorFinalIngressoVIP = i2.getValorFinal(taxaConveniencia);
        System.out.println("Valor final do ingresso VIP: R$" + valorFinalIngressoVIP);
    }
}