import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUserRepository implements UserRepository {

    @Override
    public void insert(User user) {

        List<User> users= findAll();
        users.add(user);
        System.out.println("wstawianie użytkownika");

        FileOutputStream fileOutputStream = null;
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
            users = (List)o;
            objectInputStream.close();
        } catch (FileNotFoundException e){
            users = new ArrayList<>();
        }

        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        return users;
    }
}