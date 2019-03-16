package Question3OCP;

public class Surname {

    Name name;

    public void setName(Name n){
        name = n;
    }

    public String convertSurnameToUpperCase(String surname){
        surname = surname.toUpperCase();
        return surname;
    }
}
