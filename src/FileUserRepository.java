import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUserRepository
        implements UserRepository {

    @Override
    public void insert(User user) {
        List<User> users = findAll();
        users.add(user);

        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("users.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(users);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> findAll() {
        List<User> users;

        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("users.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            users = (List) o;
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            users = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return users;
    }

    public User findByEmailAndPassword(String email, String password) {
        User foundUser = null;

        List<User> users = findAll();
        for (User user: users) {
            boolean equalsEmail = user.getEmail().equals(email);
            boolean equalsPassword = user.getPassword().equals(password);
            if (equalsEmail && equalsPassword) {
                foundUser = user;
            }
        }

        return foundUser;
    }

}

