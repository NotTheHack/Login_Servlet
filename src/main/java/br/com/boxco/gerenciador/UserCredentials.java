package br.com.boxco.gerenciador;

public class UserCredentials {
	
	private String name;
	private String useremail;
	private String password;
	private Integer id;

	void userCredentials (String name,String useremail, String password,Integer id) {
		this.name = name;
		this.useremail = useremail;
		this.password = password;
		this.id = id;
		
	}
	

	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
