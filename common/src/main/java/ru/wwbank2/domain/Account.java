package ru.wwbank2.domain;

/**
 * Created by a.smirnov19 on 20/07/2017.
 */
public class Account {

    private Long id;
    private String number;
    private Long amount;
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void debit(Long amount) {
        this.amount -= amount;
    }

    public void credit(Long amount) {
        this.amount += amount;
    }
}
