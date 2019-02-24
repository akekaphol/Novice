import java.io.*;
import java.util.*;

public class NewNovice{
    private String chkArmor, chkBoots, chkGloove ;
    private String chkWeapon ;
    private BagMainGame bagGame ;
    Scanner scan = new Scanner(System.in);
    private int hp, exp, level ;
    String name ;
    int selete ;
    private String careerNovice ;
    private NewItem newItem ;
    private GunMan gunMan ;
    private SwordMan swordMan ;
    int totalDamage ;

    public NewNovice(){
        hp = 100 ;
        exp = 0 ;
        level = 1 ;
        selete = 0 ;
        totalDamage = 0 ;
        careerNovice = "NoCareer" ;
        chkArmor = "no" ;
        chkBoots = "no" ;
        chkGloove = "no" ;
        chkWeapon = "no" ;
        
    }

    public void setHp(int value){
        hp = hp + value ;
    }
    public int getHp(){
        return hp ;
    }

    public void setExp(int value){
        exp = exp + value ;
    }
    public int getExp(){
        return exp ;
    }
    public void setExpZero(){
        exp = 0 ;
    }

    public void setLevel(int value){
        level = level + value ;
    }
    public int getLevel(){
        return level ;
    }

    public void setCareerNovice(String value){
        careerNovice = value ;
    }
    public String getCareerNovice(){
        return careerNovice ;
    }

    public void setWeapon(String weapon){
        chkWeapon = weapon ;
    }
    public String getWeapon(){
        return chkWeapon ;
    }

    public void setArmor(String armor){
        chkArmor = armor ;
    }

    public void setBoots(String boots){
        chkBoots = boots ;
    }

    public void setGloove(String gloove){
        chkGloove = gloove ;
    }



    public String setName(){
        System.out.println("-------- What your name ???--------");
        System.out.print("My name is : ");
        name = scan.nextLine();
         return "" ;
    }
    
    public String showStatus(){
        System.out.println("\n +++++++++++ MY STATUS POINT +++++++++++ \n");
        System.out.println("My name is : "+name );
        System.out.println("My career is : "+careerNovice );
        System.out.println("My Level : "+level );
        System.out.println("My Health point : "+hp+"  Point");
        System.out.println("My Experience ( exp ) : "+exp+"  Point");
        
        return "";
    }



    public  void damageHp(){   
        Random rand = new Random();
        int rnd = rand.nextInt(20);
        System.out.println("\n \n You hit Attack : "+rnd+" Point !!!");
         if(hp > 0 ){
            hp = hp - rnd;
        }
    }

   

    public void playGame(int selete){
        NewNovice novice = new NewNovice();
        NewItem newItem = new NewItem();
        GunMan gunMan = new GunMan();
        SwordMan swordMan = new SwordMan();
        BagMainGame bagGame = new BagMainGame();
        Random rand = new Random();
        

        switch(selete){

            case 1:
                int  rnd = rand.nextInt(20);
                int seleteSkill ;
                seleteSkill = 0 ;

                if(getCareerNovice().equals("Swordman") ){
                    System.out.println("Selete to using attack ");
                    System.out.println("Number 1 = Normal attack");
                    System.out.println("Number 2 =  Kill One Sword skill ");
                    System.out.print("Enter number : ");
                    seleteSkill = scan.nextInt();

                    switch(seleteSkill){
                        case 1:
                        rnd = rnd + swordMan.getMegaSword() ;
                        System.out.println("\n \n Damage : "+rnd+" Point ");
                        totalDamage += rnd ;
                        
                        if(rnd >= 10){
                            setExp(3);
                            System.out.println("My Exp : "+getExp()+" Point" );
                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0 ;

                                if(getExp() >= 25){
                                    setLevel(1) ;
                                    System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel());
                                    setExpZero();
                                }
                            }
                        }else if(totalDamage >= 50){
                            System.out.println("\n ++++ You have items drop ++++ \n");
                            bagGame.randomItemUsing();
                            totalDamage = 0;

                            if(getExp() >= 25){
                                setLevel(1) ;
                                System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel());
                                setExpZero() ;
                            }
                        }else if(getExp() >= 25){ // 1
                            setLevel(1) ;
                            System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                            setExpZero() ;

                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0;
                            }
                        } break;

                        case 2:
                        System.out.println("\n \n Kill One Sword !!!  damage : "+swordMan.getKillOneSwordSkill()+" Point ");
                        totalDamage += swordMan.getKillOneSwordSkill() ;
                        setExp(3) ;   // 2
                        System.out.println("My Exp : "+getExp()+" Point" );

                        if(totalDamage >= 50){
                            System.out.println("\n ++++ You have items drop ++++ \n");
                            bagGame.randomItemUsing();
                            totalDamage = 0;

                            if( getExp() >= 25 ){
                                setLevel(1); ;
                                System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                setExpZero() ;
                            }
                        }else if(getExp() >= 25){
                            setLevel(1);;
                            System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                            setExpZero() ;

                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0;
                            }
                        } break ;

                        default :
                            System.out.println("NO NO !!! selete again next turn");
                            break;
                    }

                }else if( getCareerNovice().equals("Gunman") ){
                    System.out.println("Selete to using attack ");
                    System.out.println("Number 1 = Normal attack");
                    System.out.println("Number 2 =  Ultimate Bullet skill ");
                    System.out.print("Enter number : ");
                    seleteSkill = scan.nextInt();

                        switch(seleteSkill){

                            case 1:
                                rnd = rnd + gunMan.getBlackHoleGun() ;
                                System.out.println("\n \n Damage : "+rnd+" Point ");
                                totalDamage += rnd ;

                                if(rnd >= 10){
                                    setExp(3) ;
                                    System.out.println("My Exp : "+getExp()+" Point" );

                                    if(totalDamage >= 50){
                                        System.out.println("\n ++++ You have items drop ++++ \n");
                                        bagGame.randomItemUsing();
                                        totalDamage = 0;

                                        if(getExp() >= 25 ){
                                            setLevel(1) ;
                                            System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                            setExpZero() ;
                                        }
                                    }
                                }else if(totalDamage >= 50){
                                    System.out.println("\n ++++ You have items drop ++++ \n");
                                    bagGame.randomItemUsing();
                                    totalDamage = 0;

                                    if ( getExp() >= 25  ){
                                        setLevel(1); ;
                                        System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                        setExpZero() ;
                                    } 
                                }else if(getExp() >= 25){
                                    setLevel(1) ;
                                    System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                    setExpZero();

                                    if(totalDamage >= 50){
                                        System.out.println("\n ++++ You have items drop ++++ \n");
                                        bagGame.randomItemUsing();
                                        totalDamage = 0;
                                    }
                                }
                                break ;

                            case 2:
                                System.out.println("\n \n Ultimate Bullet !!!  damage : "+gunMan.getUltimateBulletSkill()+" Point ");
                                totalDamage += gunMan.getUltimateBulletSkill() ;
                                setExp(3) ;  
                                System.out.println("My Exp : "+getExp()+" Point" );

                                if(totalDamage >= 50){
                                    System.out.println("\n ++++ You have items drop ++++ \n");
                                    bagGame.randomItemUsing();
                                    totalDamage = 0;

                                        if ( getExp() >= 25  ){
                                            setLevel(1) ;
                                            System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                            setExpZero() ;
                                        }   
                                }else if( getExp() >= 50){
                                    setLevel(1);;
                                    System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                    setExpZero() ;

                                    if(totalDamage >= 50){
                                        System.out.println("\n ++++ You have items drop ++++ \n");
                                        bagGame.randomItemUsing();
                                        totalDamage = 0;
                                    }
                                }
                                break;

                            default :
                                System.out.println("NO NO !!! selete again next turn");
                                break ;
                                 
                        }

                }else if(getCareerNovice().equals("NoCareer") ){
 
                    if(getWeapon().equals("longSword")){
                        rnd += newItem.getLongSword() ;
                        System.out.println("\n \n Damage : "+rnd+" Point ");
                        totalDamage += rnd ;

                        if(rnd >= 10){
                            setExp(3) ;
                            System.out.println("My Exp : "+getExp()+" Point" );

                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0;

                                if(getExp() >= 25 ){
                                    setLevel(1) ;
                                    System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                    setExpZero() ;
                                }
                            }
                        }else if(totalDamage >= 50){
                            System.out.println("\n ++++ You have items drop ++++ \n");
                            bagGame.randomItemUsing();
                            totalDamage = 0;

                            if ( getExp() >= 25  ){
                                setLevel(1); ;
                                System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                setExpZero() ;
                            } 
                        }else if(getExp() >= 25){
                            setLevel(1) ;
                            System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                            setExpZero();

                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0;
                            }
                        }
                        
                    } else if(getWeapon().equals("longSpear")){
                        
                        rnd += newItem.getLongSpear() ;
                        System.out.println("\n \n Damage : "+rnd+" Point ");
                        totalDamage += rnd ;

                        if(rnd >= 10){
                            setExp(3) ;
                            System.out.println("My Exp : "+getExp()+" Point" );

                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0;

                                if(getExp() >= 25 ){
                                    setLevel(1) ;
                                    System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                    setExpZero() ;
                                }
                            }
                        }else if(totalDamage >= 50){
                            System.out.println("\n ++++ You have items drop ++++ \n");
                            bagGame.randomItemUsing();
                            totalDamage = 0;

                            if ( getExp() >= 25  ){
                                setLevel(1); ;
                                System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                setExpZero() ;
                            } 
                        }else if(getExp() >= 25){
                            setLevel(1) ;
                            System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                            setExpZero();

                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0;
                            }
                        }
                        
                    } else if(getWeapon().equals("mechineGun")){
                        
                        rnd += newItem.getMechineGun() ;
                        System.out.println("\n \n Damage : "+rnd+" Point ");
                        totalDamage += rnd ;

                        if(rnd >= 10){
                            setExp(3) ;
                            System.out.println("My Exp : "+getExp()+" Point" );

                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0;

                                if(getExp() >= 25 ){
                                    setLevel(1) ;
                                    System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                    setExpZero() ;
                                }
                            }
                        }else if(totalDamage >= 50){
                            System.out.println("\n ++++ You have items drop ++++ \n");
                            bagGame.randomItemUsing();
                            totalDamage = 0;

                            if ( getExp() >= 25  ){
                                setLevel(1); ;
                                System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                setExpZero() ;
                            } 
                        }else if(getExp() >= 25){
                            setLevel(1) ;
                            System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                            setExpZero();

                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0;
                            }
                        }
                        

                    } else {
                        
                        System.out.println("\n \n Damage : "+rnd+" Point ");
                        totalDamage += rnd ;

                        if(rnd >= 10){
                            setExp(3) ;
                            System.out.println("My Exp : "+getExp()+" Point" );
                            
                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0;

                                if(getExp() >= 25 ){
                                    setLevel(1) ;
                                    System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                    setExpZero() ;
                                }
                            }
                        }else if(totalDamage >= 50){
                            System.out.println("\n ++++ You have items drop ++++ \n");
                            bagGame.randomItemUsing();
                            totalDamage = 0;

                            if ( getExp() >= 25  ){
                                setLevel(1); ;
                                System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                                setExpZero() ;
                            } 
                        }else if(getExp() >= 25){
                            setLevel(1) ;
                            System.out.println("Ha Ha Ha I'm Level up to : Level "+getLevel() );
                            setExpZero();

                            if(totalDamage >= 50){
                                System.out.println("\n ++++ You have items drop ++++ \n");
                                bagGame.randomItemUsing();
                                totalDamage = 0;
                            }
                        }

                }
            }
                break ;
            
            
            case 2:
                rand = new Random();
                rnd = rand.nextInt(20);
                System.out.println("Heal me to hp : "+rnd+" Point");
                novice.setHp(rnd);
                System.out.println("Wowwww  Thank You to Heal : "+getHp()+" Point");
                break;
            
            case 3:
                bagGame.checkItems();
                break;

            default:
                System.out.println("No No selete Again next turn Please");
                break;

        }

        if(getLevel() >= 10 && getCareerNovice().equals("NoCareer")){
            System.out.println("Selete to Career ");
            System.out.println("Number 1 : Swordman >> New item Megasword and New skill Kill On Sword !!!");
            System.out.println("Number 2 : Gunman >> New item Blackholegun and New skill Ultimate Bullet !!!");
            System.out.print("Enter number : ");
            int seleteCareer = scan.nextInt();

            switch(seleteCareer){
                case 1:
                    setCareerNovice("Swordman");
                    System.out.println("Welcome to Swordman");
                    break;
                case 2:
                    setCareerNovice("Gunman");
                    System.out.println("Welcome to Gunman");
                    break;
                default :
                    break;
            }
        }

    }

}