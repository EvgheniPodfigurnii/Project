import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<User> userGroup = new ArrayList<>();
        userGroup.add(new User("John", "Smith", 20, "john.smith@@mail.com", "NEW", "08-07-2020"));
        userGroup.add(new User("John1", "Smith1", 21, "john.smith1@mail.com", "ACTIVE", "03-09-2020"));
        userGroup.add(new User("John2", "Smith2", 22, "john.smith2@mail.com", "BLOCKED", "05-09-2020"));
        userGroup.add(new User("John3", "Smith3", 23, "john.smith3@mail.com", "BLOCKED", "03-09-2020"));
        userGroup.add(new User("John4", "Smith4", 24, "john.smith4@mail.com", "ACTIVE", "04-09-2020"));
        userGroup.add(new User("John5", "Smith5", 25, "john.smith5@mail.com", "ACTIVE", "05-10-2020"));
        userGroup.add(new User("John6", "Smith6", 26, "john.smith6@mail.com", "INACTIVE", "01-10-2020"));
        userGroup.add(new User("John7", "Smith7", 27, "john.smith7@mail.com", "INACTIVE", "05-10-2020"));
        userGroup.add(new User("John8", "Smith8", 28, "john.smith8@mail.com", "INACTIVE", "13-07-2020"));
        userGroup.add(new User("John9", "Smith9", 29, "john.smith9@mail.com", "INACTIVE", "28-05-2020"));
        userGroup.add(new User("John10", "Smith10", 30, "john.smith10@mail.com", "NEW", "04-10-2020"));
        userGroup.add(new User("John11", "Smith11", 31, "john.smith11@mail.com", "NEW", "05-10-2020"));
        userGroup.add(new User("John12", "Smith12", 32, "john.smith12@mail.com", "NEW", "05-10-2020"));
        userGroup.add(new User("John13", "Smith13", 33, "john.smith13@mail.com", "NEW", "06-10-2020"));
        userGroup.add(new User("John14", "Smith14", 34, "john.smith14@mail.com", "NEW", "06-10-2020"));
        userGroup.add(new User("John15", "Smith15", 35, "john.smith15@mail.com", "NEW", "04-10-2020"));
        userGroup.add(new User("John16", "Smith16", 36, "john.smith16@mail.com", "NEW", "03-08-2020"));

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDay = LocalDateTime.now().format(dateFormat);
        String yesterdayDay = LocalDateTime.now().minusDays(1).format(dateFormat);

        for (User user : userGroup) {
            if (!user.getTimeStamp().equals(currentDay) && !user.getTimeStamp().equals(yesterdayDay))
                if (user.getStatus().toUpperCase().equals("NEW"))
                    user.setStatus("ACTIVE");
            System.out.println(user);
        }
    }
}