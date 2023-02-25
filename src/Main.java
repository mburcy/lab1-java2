import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {


        Student student1 = new Student("Jan", "Kowalski", "john@wp.pl", "haslo@%", 12311);
        Teacher teacher1 = new Teacher("Anna", "Nowak", "anna@wp.pl","h$#Aaslo2", "mgr inż");

        FileUserRepository fileUserRepository = new FileUserRepository();
        fileUserRepository.insert(teacher1);
        fileUserRepository.insert(student1);



        System.out.println("Podaj mail: ");
        System.out.println("Podaj hasło: ");

        List<User> users = fileUserRepository.findAll();
        for (User user :users) {

            System.out.println("imię " + user.getFirstName() + " nazwisko "+ user.getLastName());
        }




    }
}