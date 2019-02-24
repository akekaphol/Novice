import java.io.*;
//Career Gunman

public class GunMan extends StatusCareer{
    private int blackHoleGun ;
    private int ultimateBulletSkill ;

    public GunMan(){
        blackHoleGun = 7 ;
        ultimateBulletSkill = 18 ;
    }
    public void setBlackHoleGun(){
        blackHoleGun = blackHoleGun + statusDamage ;
    }
    public int getBlackHoleGun(){
        return blackHoleGun ;
    }

    public int getUltimateBulletSkill(){
        return ultimateBulletSkill ;
    }

    public int getStatusHp(){
        return  statusHp ;
    }
}