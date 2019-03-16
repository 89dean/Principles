package Question3SRP;

public class SRPObey implements CalculatesAge, ChanagesNAmeToUpperCase {

    @Override
    public int calculateAge(int age) {
        age = 2019 - age;
        return age;
    }

    @Override
    public String name(String name) {
        name = name.toUpperCase();
        return name;
    }
}
