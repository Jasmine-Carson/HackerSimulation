package Hacking;
import java.util.*;
import java.io.*;

public class MainControl {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HackProcessor proc = new HackProcessor();
		String currIp = newIP();
		String nextIp = newIP();
		Server serv = new Server("admin", "password", "The next IP is "+nextIp+"\nUser is admin\nPassword is the minimum moves to complete the Towers of Hanoi with three rings", currIp, proc);
		write("Hello agent\n");
		pause(800);
		write("Welcome to Hacking Simulator\n");
		pause(1000);
		write("Your task today is to destroy the infamous AI called Magpie\n");
		pause(800);
		write("Do you accept this mission? Please answer yes or no");
		String userIn = input.nextLine();
		if(!userIn.equals("yes")&&!userIn.equals("no")){
			proc.process(userIn, serv);
		}
		if(userIn.equalsIgnoreCase("no")){
			pause(800);
			write("We'll see you next time, agent");
		}
		else{
			if(!serv.getBypass()){
				write("Our sources have reported that a computer is running Magpie\nat the IP address "+currIp);
				System.out.println();
				pause(800);
				write("The computer only grants access to administrators, username admin,\nand the password is believed to just be \"password\"");
				pause(600);
				write("Every computer on the network has a file called MagpieFile\nthat can help you get deeper into the network\n");
				pause(750);
			}		
			write("For a list of useful commands, enter the word 'commands' without quotes");
			while(serv.hacked == false){
				userIn = input.nextLine();
				proc.process(userIn, serv);
			}
			currIp = nextIp;
			serv = new Server("admin", "7", "That's the last server in the demo!", currIp, proc);
			write("\n\nCongratulations!\nYou've hacked the first server and gotten a clue to the next one\nRepeat the process on the next server");
			while(serv.hacked == false){
				userIn = input.nextLine();
				proc.process(userIn, serv);
			}
			write("Good job agent, you've finished the 2-server demo\n\n");
			pause(800);
			write("We'll see you next time, agent");
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
			pause(40);
		}
		System.out.println();
	}
	
	public static void quickWrite(String str){
		for(int i = 0; i < str.length(); i++){
			System.out.print(str.charAt(i));
			pause(20);
		}
		System.out.println();
		System.out.println();
		pause(400);
	}
	
	public static String newIP(){
		String ip = (int) (Math.random() * 256) +"."+(int) (Math.random() * 256) +"."+(int) (Math.random() * 256) +"."+(int) (Math.random() * 256);
		return ip;
	}


}
