package model;

public class Acount {
	private String userName;
	private String password;
	private int gender;
	private String carrer;
	private String birthday;
	private int brow;

	
	
	
	public Acount(String userName,String password, int gender, int brow,String carrer, String birthday) {
		this.setUserName(userName);
		this.setPassword(password);
		this.setGender(gender);
		this.setbrow(brow);
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




	public int getGender() {
		return gender;
	}




	public void setGender(int gender) {
		this.gender = gender;
	}




	public int getbrow() {
		return brow;
	}




	public void setbrow(int brow) {
		this.brow = brow;
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
	


