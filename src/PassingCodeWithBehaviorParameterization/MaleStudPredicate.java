package PassingCodeWithBehaviorParameterization;

public class MaleStudPredicate implements StudentPredicate{
    @Override
    public boolean test(Student student) {
        return student.getStudGender().equals(Gender.MALE);
    }
}
