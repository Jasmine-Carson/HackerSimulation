package Hacking;

public class Server {
	
	private String username;
	private String password;
	private String ipAddress;
	private int port;
	
	private String file;
	
	private boolean access;
	private boolean found;
	
	private HackProcessor proc;
	
	boolean hacked;
	boolean bypass;
	
	public Server(String user, String pass, String fileText, String ip, HackProcessor process){
		username = user;
		password = pass;
		file = fileText;
		access = false;
		found = false;
		ipAddress = ip;
		proc = process;
		port = (int) (Math.random() * 30);
		hacked = false;
		bypass = false;
	}
	
	public void login(String user){
		if(found){
			if(user.equals(username)){
				MainControl.write("Password:");
				return;
			}
			MainControl.write("Incorrect username");
		}
	}
	public void pass(String pass){
		if(pass.equals(password)){
			access = true;
			MainControl.write("Access granted");
			return;
		}
		MainControl.write("Incorrect password");
		return;
	}
	public void backdoor(){
		MainControl.write("Backdoor found");
		MainControl.pause(600);
		MainControl.write("Scanning for files...");
		MainControl.pause(1200);
		MainControl.write("File found titled \"MagpieFile\" under user admin");
	}
	public void find(String ip){
		if(ipAddress.equals(ip)){
			found = true;
			MainControl.write("Server found");
		}
		else{
			MainControl.write("Server not found, reenter command and IP");
		}
	}
	public void bypass(String pass){
		if (pass.equals("nerd")){
			found = true;
			access = true;
			System.out.println(port+" "+getIp());
			bypass = true;
		}
	}
	public boolean getBypass(){
		return bypass;
	}
	public void getFile(){
		MainControl.write(file);
		MainControl.pause(1000);
		hacked = true;
	}
	public int getPort(){
		return port;
	}
	public String getIp(){
		return ipAddress;
	}
	public boolean getFound(){
		return found;
	}
	public String getPass(){
		return password;
	}
	
}
