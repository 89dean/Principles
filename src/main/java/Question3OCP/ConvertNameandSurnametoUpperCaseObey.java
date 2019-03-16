package Question3OCP;

public class ConvertNameandSurnametoUpperCaseObey extends NameandSurnameObey {
    @Override
    public String processNAmes(String details) {
        details = details.toUpperCase();
        return details;
    }
}
