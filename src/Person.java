import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;

    private String middleName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Person() {
        super();
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public void printFullName() {
        System.out.println(buildFirstName());
    }

    private String buildFirstName() {
        String fullName = firstName + " " + lastName;

        for(int i =0; i<5;i++) {
            System.out.println(i);
        }


        return fullName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!this.firstName.equalsIgnoreCase(person.firstName)) return false;
        return this.lastName.equalsIgnoreCase(person.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}
