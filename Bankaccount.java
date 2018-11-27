package year11;

public class Bankaccount {
	private String name;
	private double balance;
	private String password;
	private int    phonenumber;
	private String date;
	private String address;
	private String id;
	public Bankaccount(String name, double balance,String password) {
		this.name=name;
		this.balance=balance;
		this.password=password;
		
	}
	public String name() {
		return name;
	}
	public void setName(String Duke) {
		this.name=Duke;
	}
	public double getBalance() {
		return balance;
	}
	public void inmoney(double money) {
		this.balance=balance+money;
	}
	public void outmoney(double money) {
		this.balance=balance-money;
	}
	public String password() {
		return password;
	}
	public void changepassword(String oldpassword,String newpassword) {
		this.password=oldpassword;
		this.password=newpassword;
	}
	public  Bankaccount(int phonenumber, String date, String address) {
	}
	public int getPhonenumber(){
			return phonenumber;
		}
	public void setPhonenumber(int phonenumber){
		this.phonenumber=phonenumber;
	}
	public 	String getdate(){
		return date;
	}
	public void changedate(String date) {
		this.date=date;
	}
	public String getaddress(){
		return address;
	}
	public void changeAddress(String address) {
		this.address=address;
	}
	public String getId() {
		return id;
	}
	public void	changeid(String id) {
		this.id=id;
	}
	// Overloading4重载
	 // public String print(int []a)
	//public double print(double[]b) 
	
	
	
	

}
