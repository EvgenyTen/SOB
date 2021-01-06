package model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Client implements Serializable {
    long clientCardNumber;
    int pin,balance;

    public Client(long clientCardNumber, int pin, int balance) {
        this.clientCardNumber = clientCardNumber;
        this.pin = pin;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return clientCardNumber+" " + pin+" " +balance;
    }
}
