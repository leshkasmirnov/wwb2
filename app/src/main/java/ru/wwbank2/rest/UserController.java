package ru.wwbank2.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wwbank2.domain.Account;
import ru.wwbank2.services.AccountService;

import java.util.Collection;

/**
 * Created by a.smirnov19 on 21/07/2017.
 */
@RestController
@RequestMapping("/v1/users")
@SuppressWarnings("unused")
public class UserController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{userId}/accounts")
    @ResponseBody
    ResponseEntity<Collection<Account>> getUserAccounts(@PathVariable("userId") String userId) {
        Collection<Account> accounts = accountService.getAccountsByUserId(userId);
        return ResponseEntity.ok(accounts);
    }

}
