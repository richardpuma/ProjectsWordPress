package PassingCodeWithBehaviorParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoParameterizationMain {
    public static void main(String[] args) {
        List<Student> studList = Arrays.asList(
                new Student("1", "Roberto", "Quispe", "GE", Gender.MALE, 8),
                new Student("2", "Luiz", "Carasas", "US", Gender.MALE, 16),
                new Student("3", "Maria", "Zambrano", "PE", Gender.FEMALE, 16),
                new Student("4", "Pedro", "Farfán", "GE", Gender.MALE, 15),
                new Student("5", "Janeth", "Guerrero", "PE", Gender.FEMALE, 10),
                new Student("6", "Ronald", "Flores", "US", Gender.MALE, 11),
                new Student("7", "Martha", "Calderón", "PE", Gender.FEMALE, 9),
                new Student("8", "Vilma", "Salsedo", "US", Gender.FEMALE, 13));

        List<Student> maleTeenStudents = filterStud(studList, new StudentPredicate() {
            @Override
            public boolean test(Student student) {
                return student.getStudGender().equals(Gender.MALE) && student.getStudAge()>=14 ;
            }
        });

        List<Student> maleTeenStudents_lambdaExp = filterStud(studList,(Student student) -> student.getStudGender().equals(Gender.MALE) && student.getStudAge()>=14);

        List<Student> femaleTeenStudents_lambdaExp = filterStud(studList,(Student student) -> student.getStudGender().equals(Gender.FEMALE) && student.getStudAge()>=14);

        System.out.println("Resultado");
        System.out.println("maleTeenStudents con clase anonima");
        for (Student student : maleTeenStudents) {
            System.out.println(student.toString());
        }

        System.out.println("Resultado");
        System.out.println("maleTeenStudents con expresion lambda");
        for (Student student : maleTeenStudents_lambdaExp) {
            System.out.println(student.toString());
        }

        System.out.println("Resultado");
        System.out.println("femaleTeenStudents con expresion lambda");
        for (Student student : femaleTeenStudents_lambdaExp) {
            System.out.println(student.toString());
        }

        List<Student> peStudents = filterStud(studList, new PEStudPredicate());
        System.out.println("Resultado - peStudents");
        for (Student student : peStudents) {
            System.out.println(student.toString());
        }

        List<Student> teenFemaleStudents = filterStud(studList,new TeenFemaleStudPredicate());
        System.out.println("Resultado - teenFemaleStudents");
        for (Student student : teenFemaleStudents) {
            System.out.println(student.toString());
        }

    }

    public static List<Student> filterStud(List<Student> studList, StudentPredicate p){
        List<Student> result = new ArrayList<>();
        for (Student stud : studList){
            if (p.test(stud)){
                result.add(stud);
            }
        }
        return result;
    }

    public static List<Student> getFemaleStud(List<Student> studList){
        List<Student> result = new ArrayList<>();
        for (Student stud : studList){
            if (stud.getStudGender().equals(Gender.FEMALE)){
                result.add(stud);
            }
        }
        return result;
    }

    public static List<Student> getStudByCountry(List<Student> studList, String country){
        List<Student> result = new ArrayList<>();
        for (Student stud : studList){
            if (stud.getStudCountry().equals(country)){
                result.add(stud);
            }
        }
        return result;
    }
}
