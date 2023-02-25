

public class Main {



    public static void main(String[] args) {


        Student student = new Student("Jan", "Kowalski", "john@wp.pl", "haslo@%", 12311);
        Teacher teacher = new Teacher("Anna", "Nowak", "anna@wp.pl","h$#Aaslo2", "mgr inż");
        System.out.println("imię " + student.getFirstName() + " nr albumu "+ student.getAlbumNumber());
        System.out.println(teacher);


    }
}