package Hacking;
import java.util.*;
import java.io.*;

public class MainControl {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HackProcessor proc = new HackProcessor(input);
		//write("Hello agent\n");
		//pause(800);
		//write("Welcome to Hacking Simulator\n");
		//pause(1000);
		//write("Your task today is to destroy the infamous AI called Magpie\n");
		//pause(800);
		write("Do you accept this mission? Please answer yes or no");
		String userIn = input.nextLine();
		if(userIn.equalsIgnoreCase("no")){
			pause(800);
			write("We'll see you next time, agent");
		}
		else{
			String currIp = newIP();
			String nextIp = newIP();
			Server serv1 = new Server("admin", "password", nextIp, currIp, input, proc);
			write("Our sources have reported that a computer is running Magpie\nat the IP address "+currIp);
			userIn = input.nextLine();
			proc.process(userIn, serv1);
			userIn = input.nextLine();
			proc.process(userIn, serv1);		
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
	
	public static String newIP(){
		String ip = (int) (Math.random() * 256) +"."+(int) (Math.random() * 256) +"."+(int) (Math.random() * 256) +"."+(int) (Math.random() * 256);
		return ip;
	}


}
