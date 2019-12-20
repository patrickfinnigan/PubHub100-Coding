package Collections;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	public long id;
	public String accountType;
	
	public Account(long id, String accountType) {
		super();
		this.id = id;
		this.accountType = accountType;
	}

	public static List<Account> createAccounts(int numAccounts){
		List<Account> accounts = new ArrayList<>();
		
		while (numAccounts > 0){
			Account account = new Account(numAccounts, "account");
			accounts.add(account);
			numAccounts--;
		}
		
		return accounts;
	}
	
	@Override
	public String toString() {
		return "Account [id: " + this.id + "]";
	}
	
}

// most of this code was made with the answer key code, I just used it to practice
// reading the code and how writing object lists would work
	

