package jp.co.internous.action;

public class Humanname {
	public String lastname;
	public String firstname;
	public String getname() {
		lastname = "太郎";
		firstname = "山田";
		String myname=firstname+lastname;
		return myname;
	}

}
