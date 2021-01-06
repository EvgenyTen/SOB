package AuthorizationClasses;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker {
    String workerLogin;
    String workerPassword;

    public Worker(String workerLogin, String workerPassword) {
        this.workerLogin = workerLogin;
        this.workerPassword = workerPassword;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerLogin='" + workerLogin + '\'' +
                ", workerPassword='" + workerPassword + '\'' +
                '}';
    }
}
