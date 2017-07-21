package ru.wwbank2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.wwbank2.domain.Account;
import ru.wwbank2.rest.model.TransferRequest;
import ru.wwbank2.rest.response.GetAccountResponse;
import ru.wwbank2.rest.response.TransferResponse;
import ru.wwbank2.services.AccountService;

/**
 * Created by a.smirnov19 on 20/07/2017.
 */
@RestController
@RequestMapping("/v1/accounts")
@SuppressWarnings("unused")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    @ResponseBody
    GetAccountResponse getAccountById(@PathVariable(value = "id") String id) {
        Account account = accountService.getAccountById(id);
        return GetAccountResponse.from(account);
    }

    @PostMapping("/transfer")
    TransferResponse transfer(@RequestBody TransferRequest request) {
        Account from = accountService.getAccountById(request.getFromNumber());
        Account to = accountService.getAccountById(request.getToNumber());
        accountService.transfer(from, to, request.getAmount());
        return new TransferResponse();
    }
}
