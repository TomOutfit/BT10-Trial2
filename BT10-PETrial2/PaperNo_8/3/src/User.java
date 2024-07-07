import java.util.List;
import java.util.Collections;
public class User {
    private String name;
    private int status;

    public User() {
    }

    public User(String name, int status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
