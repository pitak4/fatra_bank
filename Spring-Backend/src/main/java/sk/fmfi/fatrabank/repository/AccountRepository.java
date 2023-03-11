package sk.fmfi.fatrabank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sk.fmfi.fatrabank.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account getAccountByUserIdAndAccNumber(Long userId, Long accNumber);

    @Query(value = "SELECT account FROM Account account WHERE balance = (SELECT MAX(balance) FROM Account)")
    Account getRichest();
}
