package PassingCodeWithBehaviorParameterization;

public class Student {
    private String studentId;
    private String studFirstName;
    private String studLastName;
    private String studCountry;
    private Gender studGender;
    private int studAge;

    public Student(String studentId, String studFirstName, String studLastName,
                   String studCountry, Gender studGender, int studAge) {
        this.studentId = studentId;
        this.studFirstName = studFirstName;
        this.studLastName = studLastName;
        this.studCountry = studCountry;
        this.studGender = studGender;
        this.studAge = studAge;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudFirstName() {
        return studFirstName;
    }

    public void setStudFirstName(String studFirstName) {
        this.studFirstName = studFirstName;
    }

    public String getStudLastName() {
        return studLastName;
    }

    public void setStudLastName(String studLastName) {
        this.studLastName = studLastName;
    }

    public String getStudCountry() {
        return studCountry;
    }

    public void setStudCountry(String studCountry) {
        this.studCountry = studCountry;
    }

    public Gender getStudGender() {
        return studGender;
    }

    public void setStudGender(Gender studGender) {
        this.studGender = studGender;
    }

    public int getStudAge() {
        return studAge;
    }

    public void setStudAge(int studAge) {
        this.studAge = studAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studFirstName='" + studFirstName + '\'' +
                ", studLastName='" + studLastName + '\'' +
                ", studCountry='" + studCountry + '\'' +
                ", studGender=" + studGender +
                ", studAge=" + studAge +
                '}';
    }
}
