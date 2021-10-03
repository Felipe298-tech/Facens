
package jogo_rpg;
import java.util.Random;
import java.util.Scanner;

public class Battle {
    
    static int ataqueplayer(){
   Scanner leitor = new Scanner(System.in);     
     
        System.out.println("Escolha seu ataque:");
        System.out.println("(1) - Soco");
        System.out.println("(2) - Especial");
        return leitor.nextInt();
    }
      static int ataqueinimigo(){
    Random gerador = new Random();
    return gerador.nextInt(3)+1; // numero aleatorio entre 1 e 3.
    }
    
    static void imprimeHP ( int HPPlayer, int HPInimigo, int CTGEspcial ){
    System.out.println("===========================");
    System.out.println(" HP Player: " +HPPlayer );
    System.out.println(" HP Inimigo: " +HPInimigo);
    System.out.println(" Especial Point: " + CTGEspcial);
    System.out.println("============================");   
    }
    public static int Battle(){
    
        int HPPlayer = 100;
        int HPInimigo;
        int CTGEspecial = 5;
        int ataqueChoice;
        int i = 1;
        
        while(HPPlayer > 0){
         HPInimigo = 10 + i;   
         
    System.out.println("===========================");
    System.out.println("ENEMY DIGIVOLVE " + i);
    System.out.println("============================/n");  

        while(HPPlayer > 0 && HPInimigo > 0){    
        imprimeHP(HPPlayer, HPInimigo, CTGEspecial);    
        ataqueChoice = ataqueplayer();
        
        switch (ataqueChoice){
            case 1:
                System.out.println("Punch!!!");
                HPInimigo -= 2;
                break;
            case 2:
                System.out.println("Special attack");
                HPInimigo -= 10;
                CTGEspecial--; // retira 1 do especial
                break;
            default:
               System.out.println("Comando invalido.");
               break;   
        }
        
        if(HPInimigo > 0){
            ataqueChoice = ataqueinimigo();
            switch (ataqueChoice){
            case 1:
                System.out.println("Enemy Punch!!!");
                HPPlayer -= 2 + (int)(i/10);
                break;
            case 2:
                System.out.println(" Enemy Kick!!");
                HPPlayer -= 3 + (int)(i/10);
                break;
            case 3:
                System.out.println(" Enemy Special attack");
                HPPlayer -= 5 + (int)(i/20);
                break;
        }
        }
        else {
            System.out.println("Enemy derrotado!!" );
        }
        
    }
        if(HPInimigo > 0){
        HPPlayer +=5;
        if(HPPlayer > 150){
        HPPlayer = 150;
        }
        if(i% 10 ==0){
          CTGEspecial++;
          if(CTGEspecial > 5){
          CTGEspecial = 5;
          }
        }
        }
        i++;
    }  
        return i;
    }
    
}
