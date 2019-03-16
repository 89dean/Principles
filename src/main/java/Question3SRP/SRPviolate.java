package Question3SRP;

public class SRPviolate implements Objectviolate {

    @Override
    public String name(String name) {
        name = name.toUpperCase();
        return name;
    }

    @Override
    public int calculateAge(int age) {
        age = 2019 - age;
        return age;
    }


}
