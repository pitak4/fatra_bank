package sk.fmfi.fatrabank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.fmfi.fatrabank.domain.User;
import sk.fmfi.fatrabank.repository.AccountRepository;
import sk.fmfi.fatrabank.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountRepository accountRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(Long id) {
        return userRepository.getById(id);
    }
}
