package PassingCodeWithBehaviorParameterization;

public class TeenStudPredicate implements StudentPredicate{
    @Override
    public boolean test(Student student) {
        return student.getStudAge() > 14;
    }
}
