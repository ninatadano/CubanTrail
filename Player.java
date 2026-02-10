import java.util.*;
public class Player{
    private static Scanner scan = new Scanner(System.in);
    private static int numPlayers=0;
    private int playerNum;
    private static double totHealth;
    private String name;
    private double indivHealth;
    private static int milesTravelled;
    private static double money=500.0;
    private static int day=0;
    private static int oxen;
    private static int clothing;
    private static int wheels;
    private static int bullets;
    private static int food;
    private static int pace=10;

    public Player(String n){
        name=n;
        playerNum= numPlayers;
        numPlayers++;
        indivHealth= 10;
        totHealth+=indivHealth;
    }
    public static String checkSupplies(){
        return "\nCurrent Supplies\n\nOxen: "+ oxen+" yokes\nWheels: "+ wheels+ "\nBullets: "+ bullets+ " boxes\nFood: "+ food +" lbs";
    }
    public String getName(){
        return name;
    }
    public static int getNumPlayers(){
        return numPlayers;
    }
    public static void setNumPlayers(int i){
        numPlayers = i;
    }
    public static void addHealth(int t){
        totHealth+=t;
    }
    public static double getTotHealth(){
    return totHealth;
}
public static String getHealthStatus(){
      if(numPlayers != 0 && (totHealth/ numPlayers)>=7/numPlayers){
          return "good\n";
      }
      else if (numPlayers != 0 && (totHealth/ numPlayers)>=4/numPlayers){
          return "fair\n";
      }
      return "bad\n";
    }
    public void getDisease(){
if(indivHealth<=0){
return;
}
       int prob = (int) (Math.random()*11) +1;
        if(prob == 1){
            if(((int)(Math.random()*8)+1)==1){
            indivHealth -=6;
totHealth -=6;
            System.out.println(name+ " has typhoid");
            }
            else if (((int)(Math.random()*8)+1)==2){
                indivHealth-=2;
totHealth -=2;
                System.out.println(name+ " has Hepatitis A");
            }
            else if(((int)(Math.random()*8)+1)==3){
                indivHealth-=3;
	    totHealth -=3;
                System.out.println(name + " has dysentery");
        }
            else if(((int)(Math.random()*8)+1)==4){
                indivHealth-=7;
    totHealth -=7;
                System.out.println(name + " has Liver failure");
            }
            else if(((int)(Math.random()*8)+1)==5){
                indivHealth-=3;
	    totHealth -=3;
                System.out.println(name + " has Parasitic disease medley");
            }
            else if(((int)(Math.random()*8)+1)==6){
                indivHealth-=5;
    totHealth -=5;
                System.out.println(name + " has Rabies");
            }
            else if(((int)(Math.random()*8)+1)==7){
                indivHealth-=4;
		totHealth-=4;
                System.out.println(name + " has Malaria");
            }
            else if(((int)(Math.random()*8)+1)==8){
                indivHealth-=5;
	totHealth-=5;
                System.out.println(name + " has Hepatitis B");
            }
            if(indivHealth<=0){
                System.out.println(name + " has died");
                numPlayers--;
                Main.deathMenu();
                if(numPlayers==0){
                    System.out.println("Everyone is dead! Try again!");
                }
            }
    }
    }
    public static double getMoney(){
        return money;
    }
    public void setMoney(double m){
        money=m;
    }
   
   
   public static void oneDay(){
       day++;
   }
   
    public static int getDay(){
        return day;
    }
       public static int getFood(){
        return food;
    }
    public static void setFood(int f){
        food=f;
    }
    public static void addFood(int f){
        food+=f;
    }
    public static void buyFood(Player one,int f){
        food=f;
one.setMoney(one.getMoney()-(f*0.25));

    }
    public int getOxen(){
        return oxen;
    }
    public static void buyOxen(Player one,int o){
        oxen=o;
        one.setMoney(one.getMoney()-(oxen*40));
    }
    public static int getClothing(){
        return clothing;
    }
    public static void buyClothing(Player one,int c){
        clothing=c;
one.setMoney(one.getMoney()-(clothing*5));

    }
    public int getWheels(){
        return wheels;
    }
    public static void buyWheels(Player o, int w){
        wheels=w;
		    o.setMoney(o.getMoney()-(wheels*10));

    }
    public static int getBullets(){
        return bullets;
    }
    public static void buyBullets(Player one, int b){
        bullets=b;
one.setMoney(one.getMoney()-(bullets*2));

    }
    public static int getNumOxen(){
        return oxen;
    }
public static int getPace(){
return pace;
}
public static void setPace(String p){
if(p.equals("fast")){
pace=20;
}
else if (p.equals("slow")){
pace=10;
}
}
public static String getStats(Player one){
return "\n_________________________________________________________________________________________________________\nCurrent Statistics\n\n"+"Day: "+one.getDay()+"\n"+"Food: "+one.getFood()+"\n"+"Players Left: "+one.getNumPlayers()+"\n"+"Miles Traveled: "+one.getMilesTravelled()+"\n"+"Health Status: "+one.getHealthStatus();
}
public static void travel(){
    milesTravelled+=pace;
}
public static void restTravel(){
    if(milesTravelled!=0){
    milesTravelled-=pace;
    }
}
public static int getMilesTravelled(){
    return milesTravelled;
}
 public static void getStolen(){

       int prob = (int) (Math.random()*8) +1;
        if(prob == 1){
            if(((int)(Math.random()*10)+1)==1){
                if(wheels==0){
                    System.out.println("You're so poor bandits came to steal a wheel and there weren't any to take!\n");
                }
                else{
                wheels -=1;
                System.out.println("Bandits came in the night and robbed you! You lost one wheel!\n");
                }
            }
            else if (((int)(Math.random()*10)+1)==2){
                if(wheels==0){
                    System.out.println("You're so poor bandits came to steal wheels and there weren't any to take!\n");
                }
                else{
                wheels-=2;
                System.out.println("Bandits came in the night and robbed you! You lost two wheels!\n");
                }
            }
            else if(((int)(Math.random()*10)+1)==3){
                if(bullets==0){
                    System.out.println("You're so poor bandits came to steal bullets and there weren't any to take!\n");
                }
                else{
                bullets-=2;
                System.out.println("Bandits came in the night and robbed you! You lost two boxes of bullets!\n");
                }
        }
            else if(((int)(Math.random()*10)+1)==4){
                if(bullets==0){
                    System.out.println("You're so poor bandits came to steal bullets and there weren't any to take!\n");
                }
                else{
                bullets-=4;
                System.out.println("Bandits came in the night and robbed you! You lost four boxes of bullets!\n");
                }
            }
            else if(((int)(Math.random()*10)+1)==5){
                if(clothing==0){
                    System.out.println("You're so poor bandits came to steal clothing and there weren't any to take!\n");
                }
                else{
                clothing-=2;
                System.out.println("Bandits came in the night and robbed you! You lost two set of clothing!\n");
                }
            }
            else if(((int)(Math.random()*10)+1)==6){
                if(clothing==0){
                    System.out.println("You're so poor bandits came to steal food and there weren't any to take!\n");
                }
                else{
                clothing-=4;
                System.out.println("Bandits came in the night and robbed you! You lost four sets of clothing!\n");
                }
            }
            else if(((int)(Math.random()*10)+1)==7){
                if(oxen==0){
                    System.out.println("You're so poor bandits came to steal food and there wasn't any to take!\n");
                }
                else{
                oxen-=1;
                System.out.println("Bandits came in the night and robbed you! You lost one yoke of oxen!\n");
                }
            }
            else if(((int)(Math.random()*10)+1)==8){
                if(oxen==0){
                    System.out.println("You're so poor bandits came to steal oxen and there were't any to take!\n");
                }
                else{
                oxen-=2;
                System.out.println("Bandits came in the night and robbed you! You lost two yokes of oxen!\n");
                }
            }
            else if(((int)(Math.random()*10)+1)==9){
                if(food==0){
                    System.out.println("You're so poor bandits came to steal food and there wasn't any to take!\n");
                }
                else{
                food-=80;
                System.out.println("Bandits came in the night and robbed you! You lost eighty pounds of food!\n");
                }
            }
            else if(((int)(Math.random()*10)+1)==10){
                if(food==0){
                    System.out.println("You're so poor bandits came to steal food and there wasn't any to take!\n");
                }
                else{
                food-=190;
                System.out.println("Bandits came in the night and robbed you! You lost eighty pounds of food!\n");
                }
            }
            }
    }
    public static void hunt(){
        if(bullets>0){
        int prob = (int) (Math.random()*2) +1;
        if(prob==1){
            bullets-=(int) (Math.random()*5) +1;
            System.out.println("Your hunt was unsuccessful! Practice more!");
        }
        else{
            bullets-=(int) (Math.random()*5) +1;
            int pounds=(int) (Math.random()*200) +1;
            food+=pounds;
            System.out.println("Your hunt was successful you gained " + pounds + " pounds of food and killed " + (int) (Math.random()*5) +1 + " creatures!");
        }
        }
        else{
            System.out.println("Can't hunt without bullets! Try buying some at the next stop!");
        }
    }
    public static void map(){
        System.out.println("-----------  --------------");
        System.out.println("-          --              |");
        System.out.println("-    X                     |");
        System.out.println("-     ^You are Here        |");
        System.out.println("-                         |");
        System.out.println("-                          |");
        System.out.println(" -                         |");
        System.out.println("-     ^                    |");
        System.out.println("-   < + >                  |");
        System.out.println("-     v            -       |");
        System.out.println("------------------- --------");
        System.out.println("It seems you dropped your map in mud and all the details are gone!\n");
        
    }
    public static void trade(){
       int prob =(int) (Math.random()*3) +1;
        if(prob==1){
            System.out.println("No one will trade today!");
        } 
        else{
            String name1 = "Ziptor";
            String name2 = "Bingflip";
            String name3 = "Handoo";
            String name4 = "Vicset";
            String name5 = "Rindo";
            int chance = (int) (Math.random()*5) +1;
            if(chance==1){
                int i = (int) (Math.random()*5) +1;
                System.out.println(name1+" will trade with you! They are offering " + i + " oxen for "+ i*2 + " set(s) of clothing!\nWould you like to accept the trade?\n1. Yes\n2. No");
                int o=scan.nextInt();
                if(o==1){
                    if(i*2>clothing){
                        System.out.println("You don't have enough to trade!");
                        Main.menu();
                    }
                    else{
                        oxen+=i;
                        clothing-=i*2;
                    }
                }
                else{
                    Main.menu();
                }
            }
            if(chance==2){
                int i = (int) (Math.random()*5) +1;
                System.out.println(name2+" will trade with you! They are offering " + i + " wheels for "+ i*30 + " pounds of food!\nWould you like to accept the trade?\n1. Yes\n2. No");
                int o=scan.nextInt();
                if(o==1){
                    if(i*30>food){
                        System.out.println("You don't have enough to trade!");
                        Main.menu();
                    }
                    else{
                        wheels+=i;
                        food-=i*30;
                    }
                }
                else{
                    Main.menu();
                }  		
            }
            if(chance==3){
              int i = (int) (Math.random()*5) +1;
                System.out.println(name3+" will trade with you! They are offering " + i*3 + " boxes of bullets for "+ i + " wheel(s)!\nWould you like to accept the trade?\n1. Yes\n2. No");
                int o=scan.nextInt();
                if(o==1){
                    if(i>wheels){
                        System.out.println("You don't have enough to trade!");
                        Main.menu();
                    }
                    else{
                        oxen+=i*3;
                        wheels-=i;
                    }
                }
                else{
                    Main.menu();
                }  
            }
            if(chance==4){
                int i = (int) (Math.random()*5) +1;
                System.out.println(name4+" will trade with you! They are offering " + i*20 + " pounds of food for "+ i + " oxen!\nWould you like to accept the trade?\n1. Yes\n2. No");
                int o=scan.nextInt();
                if(o==1){
                    if(i>oxen){
                        System.out.println("You don't have enough to trade!");
                        Main.menu();
                    }
                    else{
                        food+=i*20;
                        oxen-=i;
                    }
                }
                else{
                    Main.menu();
                }  
            }
            if(chance==5){
                int i = (int) (Math.random()*5) +1;
                System.out.println(name5+" will trade with you! They are offering " + i*3 + " boxes of bullets for "+ i + " oxen!\nWould you like to accept the trade?\n1. Yes\n2. No");
                int o=scan.nextInt();
                if(o==1){
                    if(i>oxen){
                        System.out.println("You don't have enough to trade!");
                        Main.menu();
                    }
                    else{
                        bullets+=i*3;
                        oxen-=i;
                    }
                }
                else{
                    Main.menu();
                }  
            }
        }
    }
}
