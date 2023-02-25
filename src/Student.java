public class Student extends User {

    private int albumNumber;

    public Student(String firstName, String lastName,
                   String email, String password, int albumNumber) {
        super(firstName, lastName, email, password, UserRole.STUDENT);
        this.albumNumber = albumNumber;
    }

    public int getAlbumNumber() {
        return albumNumber;
    }

}

