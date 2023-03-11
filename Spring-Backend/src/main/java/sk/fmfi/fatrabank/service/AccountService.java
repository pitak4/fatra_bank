package sk.fmfi.fatrabank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.fmfi.fatrabank.domain.Account;
import sk.fmfi.fatrabank.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public void addMoney (Long userId, Long accountNumber, Long amount) {
        Account account = accountRepository.getAccountByUserIdAndAccNumber(userId, accountNumber);
        System.out.println(account.getBalance());
        account.setBalance(account.getBalance() + amount);
        System.out.println(account.getBalance());

        account = accountRepository.save(account);
        System.out.println(account.getBalance());
    }

    public Account richest(){
        return  accountRepository.getRichest();
    }
}
