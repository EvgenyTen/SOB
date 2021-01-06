package AuthorizationClasses;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Client {
    long clientCardNumber;
    int pin,balance;

    public Client(long clientCardNumber, int pin, int balance) {
        this.clientCardNumber = clientCardNumber;
        this.pin = pin;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientCardNumber=" + clientCardNumber +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }
}
