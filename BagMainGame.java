import java.io.*;
import java.util.*; 

public class BagMainGame{
    private NewNovice novice ;
    private NewItem newItem ;
    Scanner scan = new Scanner(System.in);
    public ArrayList<String> sizeBag = new ArrayList<String>();    
    public BagMainGame(){
        sizeBag.add("no");
        sizeBag.add("no");
        sizeBag.add("no");
        sizeBag.add("no");
        sizeBag.add("no");
        sizeBag.add("no");
        sizeBag.add("no");
        sizeBag.add("no");
        sizeBag.add("no");
        sizeBag.add("no");
        sizeBag.add("no");


    }
    public void checkItems(){      
        NewNovice novice = new NewNovice();
        int selectKey ;

        for(int i = 0; i< 10; i ++){
            if(sizeBag.get(i).equals("no")){
                System.out.println("Slot "+(i+1)+": No items");
            }
            else {
                System.out.println("Slot "+(i+1)+" : "+sizeBag.get(i));
                System.out.println("Number 1 : You need use");
                System.out.println("Number 2 : You not use");
                System.out.print(" Will you use it ??? >>>  ");
                selectKey = scan.nextInt();

                switch(selectKey){
                    case 1:
                        if(sizeBag.get(i).equals("mechineGun") ){
                            System.out.println("You using MechineGun ");
                            novice.setWeapon("MechineGun");
                        }
                        // slot 1 - 2
                        else if(sizeBag.get(i).equals("BloodBottle") ){
                            System.out.println("You using BloodBottle +Hp 5 Point ");
                            novice.setHp(5);
                            System.out.println("My Hp : "+novice.getHp()+" Point ");
                            sizeBag.set(i, "no");
                        }
                        else if(sizeBag.get(i).equals("longSword") ){
                            System.out.println("You using longSword ");
                            novice.setWeapon("longSword");
                        }
                        else if(sizeBag.get(i).equals("longSpear") ){
                            System.out.println("You using longSpear ");
                            novice.setWeapon("longSpear");
                        }
                        else if(sizeBag.get(i).equals("armor") ){
                            System.out.println("You using Armor ");
                            novice.setArmor("armor");
                        }
                        else if(sizeBag.get(i).equals("boots") ){
                            System.out.println("You using Boots ");
                            novice.setBoots("boots");
                        }
                        else if(sizeBag.get(i).equals("gloove") ){
                            System.out.println("You using Gloove ");
                            novice.setGloove("gloove");
                        }
                        break;
                    case 2:   
                        break;
                    default :
                        break;
                }

            }

        }

    } 

    public void randomItemUsing(){
        Random rnd = new Random();
        int selectKey = rnd.nextInt(100);
        if(selectKey < 100){
  
            sizeBag.set(1,"BloodBottle");
            System.out.println("New items : "+sizeBag.get(1));

            sizeBag.set(2,"BlootBottle");
            System.out.println("New items : "+sizeBag.get(2));

            if(selectKey <= 40){
                sizeBag.set(3,"longSword");
                System.out.println("New items : "+sizeBag.get(3));
                if(selectKey <= 35){
                    sizeBag.set(4,"longSpear");
                    System.out.println("New items : "+sizeBag.get(4));
                    sizeBag.set(5,"armor");
                    System.out.println("New items : "+sizeBag.get(5)); 
                    if(selectKey <= 30){
                        sizeBag.set(6, "boots");
                        System.out.println("New items : "+sizeBag.get(6)); 
                        sizeBag.set(7, "gloove");
                        System.out.println("New items : "+sizeBag.get(7)); 
                        if(selectKey <= 10){
                            sizeBag.set(0,"mechineGun");
                            System.out.println("New items : "+sizeBag.get(0));
                        }
                    }
                }
            }
        } 
      
        
    }





  /*  public static void main(String[] args) {
        BagMainGame bg = new BagMainGame();
        bg.checkItems();
        bg.randomItemUsing();
        bg.checkItems();
        
    }  */    



}