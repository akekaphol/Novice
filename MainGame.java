import java.io.*;
import java.util.*;


public class MainGame{
    
    private BagNovice  bagGame ; 
    private NewNovice novice ;
    
    public MainGame(){

    }

    public static void main( String[] args ){
        NewNovice novice = new NewNovice();

        Scanner scan = new Scanner(System.in);
        int i;
        int selete ;
       
        System.out.println("========= Welcome To My Game ==========");
        novice.setName();
        novice.showStatus();
        System.out.println("\n ================ Login to Game ==============");
        
        int rnd ;
        for( i = 0; i >= -1;i++ ){
        novice.damageHp();
        if(novice.getHp() <= 0){
            System.out.println("\n \n -------- Ahhhh !!!  You Dead!!! --------- \n \n ");
            break;
        }
        System.out.println("My Present Health point : "+novice.getHp()+" Point");
        System.out.println(" Noooo!!!  Attack Nowww \n");
        System.out.println("\t \t Enter number for play !!!!");
        System.out.println("*** When attacking 50 damage will random to drop items *** \n");
        //System.out.println(" \t \t ++++ add using auto items ++++ \n");
        System.out.println("Number 1 = Random value for Attack , if Attack > 10 point exp + 3 Point.");
        System.out.println("Number 2 = Random value for skill Heal hp. ");
        System.out.println("Number 3 = Open bag. ");

        System.out.print("Input number : ");
        selete = scan.nextInt();
        System.out.println("\n \n");
        novice.playGame(selete);
    //    novice.seleteNum();
        }     
    }
}