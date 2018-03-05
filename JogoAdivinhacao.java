package listaEx;

import java.util.Random;

public class JogoAdivinhacao {
	
	private int numeroSorteado;
	private int numeroEscolhido;
	
	public void sortear()
	{
		Random random = new Random();
		numeroSorteado = random.nextInt(100);
	}
	
	public void adivinhar(int numeroEscolhido)
	{
		this.numeroEscolhido = numeroEscolhido;
		if(numeroEscolhido == numeroSorteado)
			System.out.println("Voc� Ganhou!");
		else
			System.out.println("Escolha outro n�mero.");		
	}

	public int getNumeroSorteado() {
		System.out.println("N�mero Sorteado �: " + numeroSorteado);
		return numeroSorteado;
	}

	public int getNumeroEscolhido() {
		return numeroEscolhido;
	}

}
