public enum UserRole {

    STUDENT,
    TEACHER,
    ADMINISTRATOR;

    public String getTranslated() {
        String result;

        switch (this) {
            case STUDENT:
                result = "Student";
                break;
            case TEACHER:
                result = "Nauczyciel";
                break;
            case ADMINISTRATOR:
                result = "Administrator";
                break;
            default:
                throw new IllegalStateException("Nieobsługiwana rola: " + this);
        }

        return result;
    }

}

