package main;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tamanhoVetor, numVerificador;
		int i = 0, qtdPares = 0;
		
		System.out.print("Quantidade de n�meros do vetor: ");
		tamanhoVetor = scan.nextInt();
		System.out.print("N�mero inteiro para verifica��o dos pares: ");
		numVerificador = scan.nextInt();
		
		int[] vetor = new int[tamanhoVetor];
		
		//La�o para preencher o array
		do {
			System.out.print((i+1)+"� N�mero: ");
			vetor[i] = scan.nextInt();
			i++;
		}while(i < tamanhoVetor);
		
		//La�o para verificar se h� pares com diferen�a x
		for(int j=0; j < vetor.length ; j++){
			for(int k = 0; k < vetor.length ; k++) {
				if(vetor[j] - vetor[k] == numVerificador) {
					qtdPares += 1;
				}
			}
		}
	
		System.out.println("Quantidade de pares: " + qtdPares);
		scan.close();
	}
	
}
