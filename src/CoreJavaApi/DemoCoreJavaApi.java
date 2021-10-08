package CoreJavaApi;

public class DemoCoreJavaApi {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hola Mundo");
        StringBuilder sb2= new StringBuilder("Hola Mundo");

        System.out.println("equals en StringBuilder");
        System.out.println(sb.equals(sb2));

        System.out.println("equals con toString() en StringBuilder");
        System.out.println(sb.toString().equals(sb2.toString()));
    }
}
