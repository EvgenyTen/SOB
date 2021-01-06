package model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Worker implements Serializable {
    String workerLogin;
    String workerPassword;

    public Worker(String workerLogin, String workerPassword) {
        this.workerLogin = workerLogin;
        this.workerPassword = workerPassword;
    }

    @Override
    public String toString() {
        return  workerLogin + " " +workerPassword;
    }
}
