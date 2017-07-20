package ru.wwbank2.rest.model;

/**
 * Created by a.smirnov19 on 20/07/2017.
 */
public class TransferRequest {

    private String fromNumber;
    private String toNumber;
    private Long amount;

    public String getFromNumber() {
        return fromNumber;
    }

    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }

    public String getToNumber() {
        return toNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
