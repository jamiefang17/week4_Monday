public class Student extends User {//have to define a contructor
    String Major;
    public Student(String FirstName, String LastName){
        super(FirstName, LastName); //past to parent class, need to be in the first line of constructor

    }
}
