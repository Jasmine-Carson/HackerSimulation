package Hacking;
import java.util.*;

public class MainControl {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		write("Hello agent\n");
		pause(1000);
		write("Welcome to Hacking Simulator\n");
		pause(1500);
		write("Your task today is to destroy the infamous AI called Magpie\n");
		pause(1000);
		write("Do you accept this mission?");
		String userIn = input.nextLine();
		if(userIn.equalsIgnoreCase("no")){
			pause(1000);
			write("We'll see you next time, agent");
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
	
	public static void write(String str){
		for(int i = 0; i < str.length(); i++){
			System.out.print(str.charAt(i));
			pause(50);
		}
		System.out.println();
	}

}
