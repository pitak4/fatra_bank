package sk.fmfi.fatrabank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sk.fmfi.fatrabank.domain.User;
import sk.fmfi.fatrabank.service.AccountService;
import sk.fmfi.fatrabank.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/all")
    public Iterable<User> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping(value = "/addCash")
    public User addCash(@RequestParam Long userId,
                        @RequestParam Long accNumber,
                        @RequestParam Long amount) {

        accountService.addMoney(userId, accNumber, amount);

        return userService.getById(userId);
    }
}
