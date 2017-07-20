package ru.wwbank2.rest.model;

import ru.wwbank2.domain.Account;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by a.smirnov19 on 20/07/2017.
 */
public class AccountModel {

    private String number;
    private Long amount;

    public static AccountModel build(final Account account) {
        AccountModel accountModel = new AccountModel();
        accountModel.setAmount(account.getAmount());
        accountModel.setNumber(account.getNumber());
        return accountModel;
    }

    public static Collection<AccountModel> build(final Collection<Account> accounts) {
        Collection<AccountModel> accountModels = new ArrayList<>();
        if (accounts != null) {
            accounts.forEach(account -> accountModels.add(AccountModel.build(account)));
        }
        return accountModels;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
