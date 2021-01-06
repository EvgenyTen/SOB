package AuthorizationClasses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    long clientCardNumber;
    int pin,balance;

    public Client(long clientCardNumber, int pin, int balance) {
        this.clientCardNumber = clientCardNumber;
        this.pin = pin;
        this.balance = balance;
    }
}
