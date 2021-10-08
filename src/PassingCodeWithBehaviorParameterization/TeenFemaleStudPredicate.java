package PassingCodeWithBehaviorParameterization;

public class TeenFemaleStudPredicate implements StudentPredicate{
    @Override
    public boolean test(Student student) {
        return student.getStudAge() > 14 && student.getStudGender().equals(Gender.FEMALE);
    }
}
