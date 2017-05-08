package Hacking;

public class Server {
	
	private String username;
	private String password;
	private String file;
	private boolean access;
	
	public Server(String user, String pass, String fileText){
		username = user;
		password = pass;
		file = fileText;
		access = false;
	}
	
	public void login(String user, String pass){
		if(user.equals(username)&&pass.equals(password)){
			access = true;
			MainControl.write("Access granted");
		}
		else if(user.equals(username)){
			MainControl.write("Incorrect username");
		}
	}
	
}
