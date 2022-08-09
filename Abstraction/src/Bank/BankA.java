package Bank;

public class BankA implements Bank {
 public String Name;
 public int Account_Number;
 public String Account_Type;
 public int Balance;
 
 
 public BankA(String Name , int Ac_No , String Ac_Type , int bal) {
	 
this.Name = Name;
this.Account_Number = Ac_No;
this.Account_Type = Ac_Type;
this.Balance = bal;

 }
 
 public void getBalance(){
	 
	 	 System.out.println(this.Balance);
 }
 public void getAccountType(){
	 
	 System.out.println(this.Account_Type);
 } 
 
 public void getCustomerName(){
	 
	 System.out.println(this.Name);
 }
 public void getAccountNumber(){
	 System.out.println(this.Account_Number);
	 
 }
}