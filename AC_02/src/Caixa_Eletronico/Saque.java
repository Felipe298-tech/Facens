package Caixa_Eletronico;

import java.util.Scanner;

public class Saque {
	

	public void AC02_PrimeiroSemestre(){

		Scanner ler = new Scanner (System.in);

    System.out.println("Digite o valor que você deseja sacar");
	int valor = ler.nextInt();
	
	int nota100 = 100,  nota20 = 20,nota50 = 50,nota10 = 10,nota5 = 5,nota2 = 2;
    
	if(nota100 >= nota100) {
		nota100 = valor / 100; 
		valor = valor % 100;   
		if (nota100 != 0)
			System.out.println(nota100 + " notas de R$ 100,00");
	} 
	
	if(nota50 >= nota50) {
		nota50 = valor / 50;
		valor = valor % 50;
		if (nota50 != 0)
			System.out.println(nota50 + " notas de R$ 50,00");
	}
	
	if(nota20 >= nota20) {
		nota20 = valor / 20;
		valor = valor % 20;
		if (nota20 != 0)
			System.out.println(nota20 + " notas de R$ 20,00");
	}
	
	if(nota10 >= nota10) {
		nota10 = valor / 10;
		valor = valor % 10;
		if (nota10 != 0)
			System.out.println(nota10 + " notas de R$ 10,00");
	}
	
	if(nota5 >= nota5) {
		nota5 = valor / 5;
		valor = valor % 5;
		if (nota5 != 0)
			System.out.println(nota5 + " notas de R$ 5,00"); 
	}
	
	if(nota2 >= nota2) {
		nota2 = valor / 2;
		valor = valor % 2;
		if (nota2 != 0)
			System.out.println(nota2 + " notas de R$ 2,00");
	}

System.out.println("saque efetuado com suscesso!");

} 

}

   