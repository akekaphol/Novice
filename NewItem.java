import java.io.*;


public class NewItem{
    private int bloodBottle ;
    private int longSword, mechineGun, longSpear ;
    private int armorGame, bootsGame, glooveGame ;
    
    public NewItem(){
        bloodBottle = 5 ; //Hp +5 one turn
        longSword = 5 ; // Damage +5
        longSpear = 7 ; // Damage +7
        mechineGun = 10 ; // Damage +10
        armorGame = 2 ; // Protect damage 2
        bootsGame = 2 ; // Protect damage 2
        glooveGame = 2 ; // Protect damage 2
    }

    public int getBloodBottle(){
        return bloodBottle ;
    }

    public int getLongSword(){
        return longSword ;
    }

    public int getLongSpear(){
        return longSpear ;
    }
    public int getMechineGun(){
        return mechineGun ;
    }
    public int getArmorGame( ){
        return armorGame ;
    }
    public int getBootsGame(){
        return bootsGame ;
    }
    public int getGlooveGame( ){
        return glooveGame ;
    }
}