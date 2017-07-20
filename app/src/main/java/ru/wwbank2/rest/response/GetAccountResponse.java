package ru.wwbank2.rest.response;

import ru.wwbank2.domain.Account;
import ru.wwbank2.rest.model.AccountModel;

/**
 * Created by a.smirnov19 on 20/07/2017.
 */
public class GetAccountResponse extends BaseResponse {
    private AccountModel account;

    public static GetAccountResponse from(Account account) {
        GetAccountResponse accountResult = new GetAccountResponse();
        accountResult.setAccount(AccountModel.build(account));
        return accountResult;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }
}
