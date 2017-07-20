package ru.wwbank2.services.impl;

import org.springframework.stereotype.Service;
import ru.wwbank2.domain.Account;
import ru.wwbank2.services.AccountService;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by a.smirnov19 on 20/07/2017.
 */
@Service
@SuppressWarnings("unused")
public class AccountServiceImpl implements AccountService{
    @Override
    public void transfer(Account from, Account to, long amount) {

    }

    @Override
    public Account getAccountById(String accountId) {
        Account account = new Account();
        account.setAmount(500L);
        account.setId(1L);
        account.setNumber("123456");
        return account;
    }

    @Override
    public Collection<Account> getAccountsByUserId(String userId) {
        Collection<Account> accounts = new ArrayList<>();
        Account account = new Account();
        account.setAmount(500L);
        account.setId(1L);
        account.setNumber("123456");

        Account account2 = new Account();
        account2.setAmount(1500L);
        account2.setId(2L);
        account2.setNumber("654321");

        accounts.add(account);
        accounts.add(account2);
        return accounts;
    }
}
