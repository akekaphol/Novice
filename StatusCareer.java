import java.io.*;
//Superclass is SwordMan and GunMan

public class StatusCareer{
    protected int statusHp ;
    protected int statusDamage ;

    public StatusCareer(){
        statusHp = 30 ;
        statusDamage = 10 ;
    }
    public int getStatusHp(){
        return statusHp ;
    }
    public int getStatusDamage(){
        return statusDamage ;
    }
}