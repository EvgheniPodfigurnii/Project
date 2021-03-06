
public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String status;
    private String timeStamp;

    public User(String firstName, String lastName, int age, String email, String status, String timeStamp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", age= " + age +
                ", email= '" + email + '\'' +
                ", status= '" + status + '\'' +
                ", timeStamp= '" + timeStamp + '\'' +
                '}';
    }
}