package model;

import java.util.List;
import java.util.ArrayList;
public class ClassRoom {
	
	
private List<Acount> usrs;

	public ClassRoom() {
		usrs = new ArrayList<Acount>();		
	}
	
	public void addUsr(String userName,String password, String gender, String file,String carrer, String birthday) {
		usrs.add(new Acount(userName,password,gender,file,carrer,birthday));
	}
	public List<Acount>getUsrs(){
		return usrs;
	}
	
	


}
