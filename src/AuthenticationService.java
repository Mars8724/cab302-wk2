import java.util.ArrayList;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;
    public AuthenticationService(ArrayList<User> users) {
        this.users = users;
    }
    public User signUp(String username, String password) {
        for (User user : users) {
            if (Objects.equals(user.getUsername(), username)) return null;
        }
        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }
    public User logIn(String username, String password) {
        for (User user : users) {
            if (Objects.equals(user.getUsername(), username) && Objects.equals(user.getPassword(), password)) return user;
        }
        return null;
    }
}