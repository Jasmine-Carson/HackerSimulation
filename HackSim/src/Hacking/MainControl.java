package Hacking;
import java.util.*;

public class MainControl {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello agent\n");
		pause(1000);
		System.out.println("Welcome to Hacking Simulator\n");
		pause(1500);
		System.out.println("Your task today is to destroy the infamous AI called Magpie\n");
		pause(1000);
		System.out.println("Do you accept this mission?");
		String userIn = input.nextLine();
		if(userIn.equalsIgnoreCase("no")){
			pause(1000);
			System.out.println("We'll see you next time, agent");
		}
		else{
			
		}
	}
	
	public static void pause(int time){
		long currenttime = System.currentTimeMillis();
		long checktime = 0;
		while ((checktime = System.currentTimeMillis()) < (currenttime + time)){
		}
	}

}
