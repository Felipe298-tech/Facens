package Caixa_Eletronico;

import java.util.Scanner;

public class Login {
    
    public static void main(String[] args){

        // Declarando as variáveis, Scanner
        Scanner ler = new Scanner(System.in);
        String CPFDigitado, CPFcorreto = "123.456.789-00";
        int tentativasenha = 0;
        String senhaDigitada,senhaCorreta = "123456";

        		//Inicio
		System.out.println("=============Banco JAVA============");
		System.out.println("=============BAO VINDO=============");
		System.out.println("=============QUERO GRANA===========");
        

		//colher informacoes do CPF
		System.out.println("Digite seu CPF para comecar: ");
		CPFDigitado = ler.nextLine();
		
		//Verificar CPF
		if(CPFcorreto.equals(CPFDigitado)){

            do{
			//colher Senha de Senha
			System.out.print("digite agora sua senha: ");
			senhaDigitada = ler.nextLine();
    
                 //verificar senha
                 if(senhaCorreta.equals(senhaDigitada)){
                    System.out.println("Bem vindo Caro Cliente");

                    //Class Acesso iniciar
                    Acesso Conta = new Acesso(CPFDigitado);
                    Conta.iniciar();
        
                 }else{System.out.println("Senha invalida - tentaivas restantes : " + (3 - tentativasenha));
                 tentativasenha ++; 

                 if(tentativasenha > 3 ){
                     System.out.println("SISTEMA BLOQUEADO!! ");
                        System.exit(tentativasenha);
                 }
                }
    
                 }while(senhaDigitada != senhaCorreta);
         }
    
}
}