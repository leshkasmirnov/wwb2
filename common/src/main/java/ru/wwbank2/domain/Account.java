package ru.wwbank2.domain;

import javax.persistence.*;

/**
 * Created by a.smirnov19 on 20/07/2017.
 */
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "account_seq")
    private Long id;
    @Column(nullable = false)
    private String number;
    @Column(nullable = false)
    private Long amount;
    @Column(name = "user_id", nullable = false)
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
