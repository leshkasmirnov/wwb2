package ru.wwbank2.rest.response;

import ru.wwbank2.domain.Account;
import ru.wwbank2.rest.model.AccountModel;

import java.util.Collection;

/**
 * Created by a.smirnov19 on 20/07/2017.
 */
public class GetAccountsByUserIdResponse extends BaseResponse {

    private Collection<AccountModel> accounts;

    public static GetAccountsByUserIdResponse from(Collection<Account> accounts) {
        GetAccountsByUserIdResponse response = new GetAccountsByUserIdResponse();
        response.setAccounts(AccountModel.build(accounts));
        return response;
    }

    public Collection<AccountModel> getAccounts() {
        return accounts;
    }

    public void setAccounts(Collection<AccountModel> accounts) {
        this.accounts = accounts;
    }
}
