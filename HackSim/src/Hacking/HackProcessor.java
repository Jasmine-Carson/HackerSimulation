package Hacking;

import java.util.Scanner;

public class HackProcessor {
	
	Scanner input;
	
	public HackProcessor(Scanner in){
		input = in;
	}
	
	public void process(String command, Server serv){
		if (command.substring(0,10).equals("sudo nmap ")){
			serv.find(command.substring(10));
		}
		else if(command.substring(0, 13).equals("sudo -sS -sV ")){
			int port = (int) (Math.random() * 30);
			if (serv.getFound()){
				MainControl.write("Telnet is running at port "+port);
			}
		}
	}
	
}
