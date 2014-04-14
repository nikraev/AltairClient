package ru.dtln.altair;

//класс настроек пользователя, и групп к которым он принадлежит
public class UserProfiles {

	public String login;
	public String password;
	public String remedylogin;
	public String[] userGroups;
	
	UserProfiles()
	{
		this.login ="nkraev";
		this.password = "nkraev";
	}
	
	UserProfiles(String login, String password)
	{
		this.login = login;
		this.password = password;
	}
	
}
