package br.com.boxco.gerenciador;

import java.util.HashMap;

public class UserHash {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	public void userHash() {
		logininfo.put("admin","admin");
	}
	
	
	protected HashMap<String, String> getLogin(){
		return logininfo;
	}
	
	
}
