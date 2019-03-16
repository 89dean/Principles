package Question3DIP;

public class Student {
    User user;

    public void setStudentNumber(User u){
        user = u;
    }
    public String password(String password){
        return user.password(password);
    }
}
