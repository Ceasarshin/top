package lesson_29_30;

/**
 * Класс Author представляет автора книги с именем и фамилией.
 */
public class Author {
    private String firstName;
    private String lastName;

    /**
     * Возвращает имя автора.
     *
     * @return имя автора.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Возвращает фамилию автора.
     *
     * @return фамилия автора.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Устанавливает имя автора.
     *
     * @param firstName имя автора.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Устанавливает фамилию автора.
     *
     * @param lastName фамилия автора.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Возвращает полную информацию об авторе, включающую имя и фамилию.
     *
     * @return строка, содержащая имя и фамилию автора.
     */
    public String autorInfo() {
        return firstName + " " + lastName;
    }
}

