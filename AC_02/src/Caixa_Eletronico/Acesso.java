package Caixa_Eletronico;

import java.util.Scanner;
public class Acesso {

         String CPF;
         int saques;
         int depositos;
         double saldo;
        Scanner ler = new Scanner(System.in);
        
        public Acesso(String CPF){
            this.CPF=CPF;
            saques=0;
            depositos =0;
        }

        public void iniciar(){
            int opcao;
            do{
                exibeMenu();
                opcao = ler.nextInt();
                escolheOpcao(opcao);
            }while(opcao!=0);
        }
        
        public void exibeMenu(){
            
            System.out.println("\t Escolha a opção desejada");
            System.out.println("1 - Consultar Extrato");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            
        }
        
        public void escolheOpcao(int opcao){
            double valor;
            
            switch( opcao ){
                case 1:    
                        extrato();
                        break;
                case 2: if(saques <3 ){
                            System.out.print("Quanto deseja sacar: ");
                            valor = ler.nextDouble();
                            sacar(valor);
                }else{ System.out.println("Limite de Saques atingido!!");}
                        break;
                        
                case 3:
                        System.out.print("Quanto deseja depositar: ");
                        valor = ler.nextDouble();
                        depositar(valor);
                        break;
                        
                case 0: 
                        System.out.println("Processo encerrado.");
                        break;
                        
                default:
                        System.out.println("Opção inválida");
            }

        }

      
//Iniciar variavel do Extrato
public void extrato(){
    System.out.println("\tEXTRATO");
    System.out.println("CPF: " + this.CPF);
    System.out.printf("Saldo atual: %.2f\n",this.saldo);
    System.out.println("Saques realizados hoje: " + this.saques);
    System.out.println("Depositos realizados hoje: " + this.depositos);
    
}

//Variavel de Saque

public void sacar(double valor){
    if(saldo >= valor){
        saldo -= valor;
        saques++;
        System.out.println("Sacado: " + valor);
        System.out.println("Novo saldo: " + saldo);


    } else {
        System.out.println("Sem monetario sulficiente\n");
    }
}
//Variavel de Deposito
public void depositar(double valor)
{
    saldo += valor;
    depositos++;
    System.out.println("Depositado: " + valor);
    System.out.println("Novo saldo: " + saldo);
}

    }

