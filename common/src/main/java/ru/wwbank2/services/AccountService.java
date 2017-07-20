package ru.wwbank2.services;

import ru.wwbank2.domain.Account;

import java.util.Collection;

/**
 * Service for maintain accounts.
 *
 * Created by a.smirnov19 on 20/07/2017.
 */
public interface AccountService {

    /**
     * Transfer @param amount @param from @param to account.
     *
     * @param from
     * @param to
     * @param amount
     */
    void transfer(Account from, Account to, long amount);

    Account getAccountById(String accountId);

    Collection<Account> getAccountsByUserId(String userId);
}
