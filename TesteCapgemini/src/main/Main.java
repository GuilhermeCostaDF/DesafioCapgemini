package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int numeroCentral, primeiroNumero, segundoNumero;
		int tamanhoLista;
		double mediana;
		
		System.out.print("Quantidade de números na lista: ");
		tamanhoLista = scan.nextInt();
		
		for(int i = 0; i < tamanhoLista; i++) {
			System.out.print((i+1)+"º número: ");
			int num = scan.nextInt();
			lista.add(num);
		}
		
		//Criando uma condicional para caso a lista seja PAR
		if(tamanhoLista % 2 == 0) {
			
			//Usarei a interface Collections para ordenar os números
			Collections.sort(lista);
			primeiroNumero = (lista.size() / 2) - 1;
			segundoNumero = (lista.size()/2);
			mediana = (double)(lista.get(primeiroNumero) + (double)lista.get(segundoNumero)) / 2;
			
			System.out.print("Mediana: " + mediana);
			
		}else {
			Collections.sort(lista);
			
			numeroCentral = (lista.size() / 2);
			
			System.out.print("Mediana: " + lista.get(numeroCentral));
			
		}
	}

}
