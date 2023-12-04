public class User {
    String FirstName;
    String LastName;

    public User(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void PrintNames() {
        System.out.print(LastName + ", " + FirstName + "; ");
    }
}