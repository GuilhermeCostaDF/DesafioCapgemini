package main;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int tamanhoVetor, numVerificador;
		int i = 0, qtdPares = 0;
		
		System.out.print("Quantidade de números do vetor: ");
		tamanhoVetor = scan.nextInt();
		System.out.print("Número inteiro para verificação dos pares: ");
		numVerificador = scan.nextInt();
		
		int[] vetor = new int[tamanhoVetor];
		
		//Laço para preencher o array
		do {
			System.out.print((i+1)+"º Número: ");
			vetor[i] = scan.nextInt();
			i++;
		}while(i < tamanhoVetor);
		
		//Laço para verificar se há pares com diferença x
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
