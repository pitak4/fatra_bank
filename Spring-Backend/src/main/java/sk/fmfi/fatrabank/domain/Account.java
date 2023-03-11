package sk.fmfi.fatrabank.domain;


import java.io.Serializable;

public class Account implements Serializable {

    private Long id;

    private Long userId;

    private Long accNumber;

    private Long balance;

    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Long accNumber) {
        this.accNumber = accNumber;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
