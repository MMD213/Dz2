public   abstract class Animal {
private String food;
private  String location;

    public Animal() {
    }

    public Animal( String food , String location) {
        this.food = food;
        this.location = location;
    }

    public void getFood() {
        return ;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void getLocation() {
        return ;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void eat();

    public abstract String makeNoise();

    public void sleep() {
        System.out.println("Животное спит.");
    }


    }
