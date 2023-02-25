import java.io.Serializable;

public abstract class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserRole role;

    public User(String firstName, String lastName,
                String email, String password, UserRole role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getRole() {
        return role;
    }

}

