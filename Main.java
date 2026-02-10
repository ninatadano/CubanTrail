import java.util.*;
public class Main
{
private static int numDay = 0;
private static int milesTravelled = 0;
private static Player one;
private static Player two;
private static Player three;
public static boolean rest = false;
public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Cuba! Your journey starts at Punta de Maisi. \nAlong the way you will come to stops where you will be able to resupply your wagon.\nYou have 740 miles to travel. Pro tip: Don't die, it'll be hard to finish the journey if you do!\n\nYour party is made up of three members. Enter the name of your party leader:");
		one = new Player(scan.nextLine());
		System.out.println("Please enter the name of your next party member:");
	    two = new Player(scan.nextLine());
		System.out.println("Please enter the name of your next party member:");
		three = new Player(scan.nextLine());
		if(Player.getNumPlayers()==0){
		    System.out.println("Everyone has died. Try again!");
		}
		for(int i = 1; i<=1; i++){
		    if(one.getName().equals("charlie")||one.getName().equals("Charlie")){
            Player.setNumPlayers(0);
            System.out.println("\nIt seems you tried to bring Charlie!\nEveryone has died!");
            break;
	    }
	    if(two.getName().equals("charlie")||two.getName().equals("Charlie")){
            Player.setNumPlayers(0);
            System.out.println("\nIt seems you tried to bring Charlie!\nEveryone had died!");
            break;
	    }
	    if(three.getName().equals("charlie")||three.getName().equals("Charlie")){
            Player.setNumPlayers(0);
            System.out.println("\nIt seems you tried to bring Charlie!\nEveryone has died!");
            break;
	    }
		
	int s;
    	if(Player.getNumPlayers()>0){
    	System.out.println("\n***************************************************************************************************");
		System.out.println("\nWelcome to the store! You have $500.00 to spend on your trip.");
		
		while(one.getMoney()>=0){
		System.out.println("Please enter what item you want to buy. \n1. Oxen\n2. Clothing\n3. Bullets\n4. Wheels\n5. Food\n6. Leave");
		s=scan.nextInt();
		if(s==1){
		    System.out.println("Enter the number of oxen you want to buy ($40/yoke): ");
		   int o=scan.nextInt();
		   if(40*o>Player.getMoney()){
		         System.out.println("You don't have enough money! Should have budgeted better!");
		     }
		     else{
		    one.buyOxen(one,o);
		    System.out.println("\nYou have $" +one.getMoney()  + " remaining");
		    if(one.getMoney()<=0){
		        System.out.println("You are out of money");
		    }
		     }
		}
		else if (s==2){
		   System.out.println("Enter the number of clothing sets you want to buy ($5/set): ");
		     int c=scan.nextInt();
		     if(5*c>Player.getMoney()){
		         System.out.println("You don't have enough money! Should have budgeted better!");
		     }
		     else{
		    one.buyClothing(one,c);
			    System.out.println("\nYou have $" + one.getMoney() + " remaining");
		    if(one.getMoney()<=0){
		        System.out.println("You are out of money");
		    }
		    }
		}
		else if (s==3){
		    System.out.println("Enter the number of boxes of bullets you want to buy (10 bullets/ box ; $2/box): ");
		    int b= scan.nextInt();
		    if(2*b>Player.getMoney()){
		         System.out.println("You don't have enough money! Should have budgeted better!");
		     }
		     else{
		    one.buyBullets(one,b);
		    System.out.println("\nYou have $" + one.getMoney()+ " remaining");
		    if(one.getMoney()<=0){
		        System.out.println("You are out of money");
		    }
		     }
		}
		else if (s==4){
		    System.out.println("Enter the number of spare wheels you want to buy ($10/set): ");
		    int w= scan.nextInt();
		    if(10*w>Player.getMoney()){
		         System.out.println("You don't have enough money! Should have budgeted better!");
		     }
		     else{
		    one.buyWheels(one,w);
		    System.out.println("\nYou have $" +one.getMoney() + " remaining");
		    if(one.getMoney()<=0){
		        System.out.println("You are out of money");
		    }
		     }
		}
		else if (s==5){
		    System.out.println("Enter the pounds of food you want to buy ($0.25/pound): ");
		    int f= scan.nextInt();
		    if(0.25*f>Player.getMoney()){
		         System.out.println("You don't have enough money! Should have budgeted better!");
		     }
		     else{
		    one.buyFood(one,f);
		    System.out.println("\nYou have $" +one.getMoney() + " remaining");
		    if(one.getMoney()<=0){
		        System.out.println("You are out of money");
		    }
		     }
		}
		else if(s==6){
		    if(Player.getNumOxen()==0){
		        System.out.println("You don't have any oxen, buy some so you can travel the trail!");
		    }
		    else{
		        break;
		}
		}
		}
    	}
    	else{
    	    return;
    	}
		}

	while (Player.getNumPlayers()>=1){
	    if(one.getName().equals("charlie")||one.getName().equals("Charlie")){
            Player.setNumPlayers(0);
            System.out.println("It seems you tried to bring Charlie\nEveryone has died!");
            break;
	    }
	    if(two.getName().equals("charlie")||two.getName().equals("Charlie")){
            Player.setNumPlayers(0);
            System.out.println("It seems you tried to bring Charlie\nEveryone had died!");
            break;
	    }
	    if(three.getName().equals("charlie")||three.getName().equals("Charlie")){
            Player.setNumPlayers(0);
            System.out.println("It seems you tried to bring Charlie\nEveryone has died!");
            break;
	    }
    if(rest==false){
day(one,two,three);
    }
//System.out.println(one.getStats(one));

if(Player.getMilesTravelled()==200||Player.getMilesTravelled()==210){
System.out.println("\nWelcome to Camaguey! Home of Ross!");
stopMenu();
}
if(Player.getMilesTravelled()==400 || Player.getMilesTravelled()==410){
System.out.println("\nWelcome to La Esperanza! Home of Rickter!");
stopMenu();
}
if(Player.getMilesTravelled()==600||Player.getMilesTravelled()==610){
System.out.println("\nWelcome to Jovellanos! Home of Rindo!");
stopMenu();
}

else{
    //System.out.println("test");
menu();
}
if (Player.getMilesTravelled()>= 740){
System.out.println("Congratulations! You made it to Los Cajuelos and completed your trip. We hope you enjoyed your tropical journey.");
System.out.print("You earned " + points()+ " points");
break;
	}
if(Player.getNumPlayers()==0){
 
System.out.println("Everyone has died. Try again!");
break;
}
	
}

}
//*********************************************************************************************
public static int points(){
int points=0;
points+=(Player.getNumPlayers()*10);
points+=Player.getTotHealth();
points+=(Player.getNumOxen()*2);
points+=(Player.getClothing()*2);
points+=(Player.getBullets()*2);
if(Player.getNumPlayers()==3){
points*=2;
}
return points;
}

public static void menu(){
Scanner scan = new Scanner(System.in);
System.out.println("\n-----------------------------\n1. Continue on trail\n2. Change Pace\n3. Rest\n4. Hunt\n5. Check Supplies\n6. Open Map\n7. Trade\n8. Quit\nWhat is your choice?");
int choice= scan.nextInt();
if (choice==1){ //continue
}
else if(choice==2){ //change pace
System.out.println("1. Slow Pace\n2. Fast Pace");
int choosePace = scan.nextInt();
if(choosePace==1){
Player.setPace("slow");
}
if(choosePace==2){
Player.setPace("fast");
}
}
if(choice==3){ //rest
restDay();
menu();
}
if(choice==4){
    huntDay();
    menu();
}
else if(choice==5){
System.out.println(Player.checkSupplies());
}
else if(choice==6){
    Player.map();
    menu();
}
else if(choice==7){
    tradeDay();
}
else if (choice==8){
    System.out.println("Coward");
    Player.setNumPlayers(0);
}
}
public static void stopMenu(){
Scanner scan = new Scanner(System.in);
System.out.println("\n-----------------------------\n1. Continue on trail\n2. Change Pace\n3. Rest\n4. Buy Supplies\n5. Quit");
int choice= scan.nextInt();
if (choice==1){ //continue
}
else if (choice==2){ //change pace
System.out.println("1. Slow Pace/n 2. Fast Pace");
int choosePace = scan.nextInt();
if(choosePace==1){
Player.setPace("slow");
}
if(choosePace==2){
Player.setPace("fast");
}
}
else if (choice==3){ //rest
rest =true;
restDay();
}
else if (choice == 4){ //store
System.out.println("\nWelcome to the store! You have " + Player.getMoney() + " left to spend on here.");

	int a;
		while(one.getMoney()>=0){
		System.out.println("Please enter what item you want to buy. \n1. Oxen\n2. Clothing\n3. Bullets\n4. Wheels\n5. Food\n6. Leave");
		a=scan.nextInt();
		if(a==1){
		    System.out.println("Enter the number of oxen you want to buy ($50/yoke): ");
		   int o=scan.nextInt();
		   if(50*o>Player.getMoney()){
		         System.out.println("You don't have enough money! Should have budgeted better!");
		     }
		     else{
		    Player.buyOxen(one,o);
		    System.out.println("You have $" +Player.getMoney()  + " remaining");
		    if(Player.getMoney()<=0){
		        System.out.println("You are out of money");
		    }
		     }
		}
		else if (a==2){
		   System.out.println("Enter the number of clothing sets you want to buy ($10/set): ");
		     int c=scan.nextInt();
		     if(10*c>Player.getMoney()){
		         System.out.println("You don't have enough money! Should have budgeted better!");
		     }
		     else{
		    Player.buyClothing(one,c);
			    System.out.println("You have $" + Player.getMoney() + " remaining");
		    if(Player.getMoney()<=0){
		        System.out.println("You are out of money");
		    }
		     }
		}
		else if (a==3){
		    System.out.println("Enter the number of boxes of bullets you want to buy (10 bullets/ box ; $5/box): ");
		    int b= scan.nextInt();
		    if(5*b>Player.getMoney()){
		         System.out.println("You don't have enough money! Should have budgeted better!");
		     }
		     else{
		    Player.buyBullets(one,b);
		    System.out.println("You have $" + Player.getMoney()+ " remaining");
		    if(Player.getMoney()<=0){
		        System.out.println("You are out of money");
		    }
		     }
		}
		else if (a==4){
		    System.out.println("Enter the number of spare wheels you want to buy ($15/set): ");
		    int w= scan.nextInt();
		    if(15*w>Player.getMoney()){
		         System.out.println("You don't have enough money! Should have budgeted better!");
		     }
		     else{
		    Player.buyWheels(one, w);
		    System.out.println("You have $" +Player.getMoney() + " remaining");
		    if(Player.getMoney()<=0){
		        System.out.println("You are out of money");
		    }
		     }
		}
		else if (a==5){
		    System.out.println("Enter the pounds of food you want to buy ($0.50/pound): ");
		    int f= scan.nextInt();
		    if(0.50*f>Player.getMoney()){
		         System.out.println("You don't have enough money! Should have budgeted better!");
		     }
		     else{
		    Player.buyFood(one,f);
		    System.out.println("You have $" +Player.getMoney() + " remaining");
		    if(Player.getMoney()<=0){
		        System.out.println("You are out of money");
		    }
		     }
		}
		else if(a==6){
		        break;
		    }
		}

}
else if(choice==5){
    System.out.println("Coward");
    Player.setNumPlayers(0);
}
}
public static void day(Player one, Player two, Player three){
    if(Player.getNumOxen()>0){
System.out.println(one.getStats(one));
Player.oneDay();
milesTravelled += Player.getPace();
one.getDisease();
two.getDisease();
three.getDisease();
if(Player.getFood()<=0){
    System.out.println("You're out of food! Get some!");
    one.getDisease();
    two.getDisease();
    three.getDisease();
    one.getDisease();
    two.getDisease();
    three.getDisease();
    one.getDisease();
    two.getDisease();
    three.getDisease();
    if(Player.getFood()<=-100){
    one.getDisease();
    two.getDisease();
    three.getDisease();
    }
     if(Player.getFood()<=-200){
    one.getDisease();
    two.getDisease();
    three.getDisease();
    }
    }

if (Player.getPace()==10){
Player.setFood(Player.getFood()-15*Player.getNumPlayers());
if(Player.getFood()<0){
    Player.setFood(0);
}
}
else{
Player.setFood(Player.getFood()-25*Player.getNumPlayers());
if(Player.getFood()<0){
    Player.setFood(0);
}
}
Player.getStolen();
Player.travel();
}
else{
    restDay();
    System.out.println("Wouldn't want to be you! You're trying to travel without oxen!");
}
}
public static void restDay(){
Player.oneDay();
Player.addHealth(1*Player.getNumPlayers());
Player.setFood(Player.getFood()-15*Player.getNumPlayers());
if(Player.getFood()<0){
    Player.setFood(0);
}
Player.getStolen();
Player.getStolen();
rest = false;
Player.restTravel();
System.out.println(one.getStats(one));

}
public static void huntDay(){
    Player.hunt();
    rest = false;
}
public static void tradeDay(){
    Player.trade();
    rest=false;
}
public static void deathMenu(){//from charlie
    Scanner scan = new Scanner(System.in);
System.out.println("\n-----------------------------\n1. Move on\n2. Eat the dead\nWhat is your choice?");
int choice= scan.nextInt();
if (choice==1){ //continue
menu();
}
else if(choice==2){ //change pace
int pounds=(int) (Math.random()*200) +100;
System.out.println("Your party chose to eat them! Plus " + pounds + " pounds of food!");
Player.addFood(150);
//menu();
}
}
public static void checkCharlie(){
        if(one.getName().equals("Charlie")||one.getName().equals("charlie"));
        System.out.println("You seem to have brought the wrong type of person on your trip! Maybe try a different one!");
        if(two.getName().equals("Charlie")||two.getName().equals("charlie"));
        System.out.println("You seem to have brought the wrong type of person on your trip! Maybe try a different one!");
        if(three.getName().equals("Charlie")||three.getName().equals("charlie"));
        System.out.println("You seem to have brought the wrong type of person on your trip! Maybe try a different one!");
        Player.setNumPlayers(0);
    }


}
