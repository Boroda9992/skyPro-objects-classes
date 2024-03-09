/**
 * Класс, содержащий имена и фамилии авторов, как отдельные поля.
 */
public class Author {
    //Parameters
    private String firstName;
    private String lastName;

    //Constructor
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
