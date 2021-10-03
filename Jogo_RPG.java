package jogo_rpg;
import java.util.Scanner;
import static jogo_rpg.Battle.Battle;



public class Jogo_RPG {

    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
       
     int continuar = 1;
     int Record = 0;
     while (continuar == 1){
         
        Battle.Battle();
         int Point = Battle();
         
         System.out.println("Last Stage" + Point);
         if (Point > Record){
         Record = Point;
         }
         System.out.println("Level Atual = " + Record);
        System.out.println("Game Over. press to continue....(1) yes (2) no ");
        continuar = leitor.nextInt();
    }
      
    }
    
}
