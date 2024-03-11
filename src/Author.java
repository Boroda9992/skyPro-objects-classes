import java.util.Objects;

/**
 * Класс, содержащий имена и фамилии авторов, как отдельные поля.
 */
public class Author {

    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Переопределенный метод сначала проверяет хэш-коды объектов на неравенство, затем сравнивает параметры объектов.
     * Возвращает boolean.
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this.hashCode() != o.hashCode()) return false;
    // Так же вставил проверку по хэш-кодам
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    /**
     * Метод возвращает конкатенацию из параметров и пробела, для читаемости.
     * @return String
     */
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
