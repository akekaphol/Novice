import java.io.*;
//Career Swordman

public class SwordMan extends StatusCareer{
    private int megaSword; // Item sword
    private int killOneSwordSkill ; // Skill Swordman

    public SwordMan(){
        killOneSwordSkill = 20 ;
        megaSword = 8 ;
    }
    public void setKillOneSwordSkill(){
       killOneSwordSkill += killOneSwordSkill ;
    }
    public int getKillOneSwordSkill(){
        return killOneSwordSkill ;
    }

    public void setMegaSword(){
        megaSword = megaSword + statusDamage ;
    }
    public int getMegaSword(){
        return megaSword ;
    }
}