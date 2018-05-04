package com.Kickstarter.main;

import java.util.ArrayList;

public class Users {
	private ArrayList <CriarConta> accounts = new ArrayList();
	
	public void setUser(CriarConta account){
		this.accounts.add(account);
	}
	public ArrayList getAccount(){
		return this.accounts;
	}
}
