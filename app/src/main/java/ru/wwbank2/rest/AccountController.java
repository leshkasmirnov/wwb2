package ru.wwbank2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wwbank2.domain.Account;
import ru.wwbank2.rest.model.AccountModel;
import ru.wwbank2.rest.model.ResponseWithMessage;
import ru.wwbank2.rest.model.TransferRequest;
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
    ResponseEntity<AccountModel> getAccountById(@PathVariable(value = "id") String id) {
        Account account = accountService.getAccountById(id);
        return ResponseEntity.ok(AccountModel.build(account));
    }

    @PostMapping("/transfer")
    ResponseEntity<ResponseWithMessage> transfer(@RequestBody TransferRequest request) {
        Account from = accountService.getAccountById(request.getFromNumber());
        Account to = accountService.getAccountById(request.getToNumber());
        accountService.transfer(from, to, request.getAmount());
        return ResponseEntity.ok(new ResponseWithMessage("OK"));
    }
}
