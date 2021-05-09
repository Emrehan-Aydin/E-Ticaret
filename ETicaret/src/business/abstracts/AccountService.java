package business.abstracts;

import java.util.List;

import entities.concretes.Account;

public interface AccountService {
	
	void add(Account account);
	void delete(Account account);
	void update(Account account);
	List<Account> getAll();
	Account get(int id);
}
