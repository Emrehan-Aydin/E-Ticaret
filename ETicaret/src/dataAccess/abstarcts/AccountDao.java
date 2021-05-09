package dataAccess.abstarcts;

import java.util.List;

import entities.concretes.Account;

public interface AccountDao {
	void add(Account account);
	void delete(Account account);
	void update(Account account);
	Account get(int id);
	List<Account> getall();

}
