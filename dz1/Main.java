public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ииван","Иванов","ПКС-320",4.5);
        Aspirant aspirant1 = new Aspirant("Петр","Петров","ПКС-321",5,"Work1");
        Student aspirant2 = new Aspirant("Петр","Петров","ПКС-323",4.8,"Work2");
        Student [] students = {student,aspirant1,aspirant2};
        for(Student s:students){
            System.out.println(s.getScholarship());
        }
    }
}
