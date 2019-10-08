package utilities;

import java.util.Random;

public class UserInfo {
    public String username;
    public String email;

    public UserInfo() {
        this.username = "beauties12" + (new Random()).nextInt(500);
        this.email = username + "@gmail.com";
    }
}
