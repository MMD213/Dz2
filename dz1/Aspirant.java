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
}
