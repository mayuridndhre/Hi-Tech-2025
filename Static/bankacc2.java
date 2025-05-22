/* Write a Java program to manage bank accounts. The program should:
✔ Keep track of the total number of accounts created using a static variable.
✔ Use a static method to display the total number of accounts. */

class bank_account2{
		String account_name;
		static int total_no_accounts;

		void display(){
			
			System.out.println("User name is :" +account_name);
			total_no_accounts++;
		}

		static int show(int a){
			return(a);
		}
			
			

		public static void main(String args[]){
			bank_account2 obj1=new bank_account2();
			bank_account2 obj2=new bank_account2();
			bank_account2 obj3=new bank_account2();
			
			obj1.account_name="Rohan";
			obj2.account_name="Tejas";
			obj3.account_name="Harsha";

			obj1.display();
			System.out.println("Total Number of account is  :" +bank_account2.show(total_no_accounts));
			obj2.display();
			System.out.println("Total Number of account is  :" +bank_account2.show(total_no_accounts));
			obj3.display();
			System.out.println("Total Number of account is  :" +bank_account2.show(total_no_accounts));
	}
}
			
