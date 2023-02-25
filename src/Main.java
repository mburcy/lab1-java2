import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {


        Student student1 = new Student("Jan", "Kowalski", "john@wp.pl", "haslo@%", 12311);
        Teacher teacher1 = new Teacher("Anna", "Nowak", "anna@wp.pl","h$#Aaslo2", "mgr inż");
        System.out.println("imię " + student1.getFirstName() + " nr albumu "+ student1.getAlbumNumber());
/*
        List<User> users = new ArrayList<>();
        users.add(student1);
        users.add(teacher1);

        for (User user :users) {

            System.out.println("imię " + user.getFirstName() + " nazwisko "+ user.getLastName());
        }*/

    }
}