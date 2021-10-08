package PassingCodeWithBehaviorParameterization;

public class PEStudPredicate implements StudentPredicate{
    @Override
    public boolean test(Student student) {
        return student.getStudCountry().equals("PE");
    }
}
