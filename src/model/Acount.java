package model;

public class Acount {
	private String userName;
	private String password;
	private String gender;
	private String file;
	private String carrer;
	private String birthday;

	
	
	
	public Acount(String userName,String password, String gender, String file,String carrer, String birthday) {
		this.setUserName(userName);
		this.setPassword(password);
		this.setGender(gender);
		this.setFile(file);
		this.setCarrer(carrer);
		this.setBirthday(birthday);
		}


	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getFile() {
		return file;
	}




	public void setFile(String file) {
		this.file = file;
	}




	public String getCarrer() {
		return carrer;
	}




	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}




	public String getBirthday() {
		return birthday;
	}




	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	}
	


