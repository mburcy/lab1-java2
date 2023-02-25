import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        examples();

        LoginView loginView = new LoginView();
        loginView.initialize();

        System.out.println("dalszy etap programu - użytkownik tutaj już jest zalogowany");
    }

    private static void lists(Student student1, Teacher teacher1) {
        List<User> users = new ArrayList<>();
        users.add(teacher1);
        users.add(student1);

        for (User user: users) {
            System.out.println("==============");
            System.out.println("Dane użytkownika");
            System.out.println("Imię: "+user.getFirstName());
            System.out.println("Nazwisko: "+user.getLastName());
            System.out.println("Email: "+user.getEmail());
            System.out.println("Hasło: "+user.getPassword());
        }
    }

    private static void examples() {
        /*
        // klasa User jest abstrakcyjna, dlatego nie można stworzyć jej obiektu
        User user1 = new User(firstName, lastName, email, password);
        System.out.println("Dane użytkownika 1:");
        System.out.println("Imię: "+user1.getFirstName());
        System.out.println("Nazwisko: "+user1.getLastName());
        System.out.println("Email: "+user1.getEmail());
        System.out.println("Hasło: "+user1.getPassword());

        System.out.println("==============");

        // klasa User jest abstrakcyjna, dlatego nie można stworzyć jej obiektu
        User user2 = new User("Iwona", "Nowak",
                "iwona@nowak.pl", "Nowak$%2Q");
        System.out.println("Dane użytkownika 2:");
        System.out.println("Imię: "+user2.getFirstName());
        System.out.println("Nazwisko: "+user2.getLastName());
        System.out.println("Email: "+user2.getEmail());
        System.out.println("Hasło: "+user2.getPassword());
         */

        /*
                String firstName = "Adam";
        String lastName = "Nowak";
        String email = "adam@nowak.pl";
        String password = "Adam@2";
        int albumNumber = 1031249;

        Student student1 = new Student(firstName, lastName,
                email, password, albumNumber);
        System.out.println("Dane studenta 1");
        System.out.println("Imię: "+student1.getFirstName());
        System.out.println("Nazwisko: "+student1.getLastName());
        System.out.println("Email: "+student1.getEmail());
        System.out.println("Hasło: "+student1.getPassword());
        System.out.println("Nr albumu: "+student1.getAlbumNumber());

        System.out.println("===============");

        Teacher teacher1 = new Teacher("Iwona", "Nowak",
                "iwona@nowak.pl", "Nowak$%2Q", "dr");
        System.out.println("Dane nauczyciela 1");
        System.out.println("Imię: "+teacher1.getFirstName());
        System.out.println("Nazwisko: "+teacher1.getLastName());
        System.out.println("Email: "+teacher1.getEmail());
        System.out.println("Hasło: "+teacher1.getPassword());
        System.out.println("Tytuł naukowy: "+teacher1.getAcademicDegree());
         */

        FileUserRepository fileUserRepository = new FileUserRepository();

        Student student1 = new Student("Adam", "Nowak",
                "adam@nowak.pl", "Adam@2", 1031249);
        Teacher teacher1 = new Teacher("Iwona", "Nowak",
                "iwona@nowak.pl", "Nowak$%2Q", "dr");
        Administrator administrator1 = new Administrator("Łukasz", "Kowalski",
                "lukasz@gmail.com", "Luk#3$%2Q");

        fileUserRepository.insert(student1);
        fileUserRepository.insert(teacher1);
        fileUserRepository.insert(administrator1);

        List<User> users = fileUserRepository.findAll();
        for (User user: users) {
            System.out.println("==============");
            System.out.println("Dane użytkownika");
            System.out.println("Imię: "+user.getFirstName());
            System.out.println("Nazwisko: "+user.getLastName());
            System.out.println("Email: "+user.getEmail());
            System.out.println("Hasło: "+user.getPassword());
        }

        System.out.println("x");
    }

}
