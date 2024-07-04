package org.encap;

public class HDFC {
	private String username;
	private int password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
	if(username.equals("Siraj"))
	{
		this.username="Balance is 300000";
		
	}
	else if(username.equals("Ruksana"))
	{
		this.username="Balance is 600000";
	}
	else
	{
		System.out.println("Incorrect password");
	}
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		if(password==1234) {
			this.password=1;
	}
		else if(password==2367)
		{
			this.password=1;
		}
		else
		{
			System.out.println("incorrect password");
		}
	
		
		
	}
	

}
