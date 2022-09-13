public class Main {
    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Атлант", "Мясо", "Будка");
        animals[1] = new Cat("Тучка", "Рыба", "Вольер");
        animals[2] = new Horse("Белогрив", "Сено", "Конюшня");

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}

