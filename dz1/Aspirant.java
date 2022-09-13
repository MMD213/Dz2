public class Aspirant extends Student
{
    String work;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String work) {
        super(firstName, lastName, group, avgMark);
        this.work = work;
    }

    @Override
    public double getScholarship() {
        return avgMark == 5 ?20000 : 18000;
    }

    public void setWork(String work) {
        this.work = work;
    }

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
