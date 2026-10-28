public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
            new Cat("Barsik"),
            new Cat("Musya"),
            new Cat("Risya")
        };

        Cat.addCatFood(50);

        for (int i = 0; i < cats.length; i++) {
            cats[i].foodEat(20);
            cats[i].getIsFull();
        };

        cats[2].foodEat(10);
        cats[2].getIsFull();
        cats[2].foodEat(10);

        Animal.getCount();
        Cat.getCount();
        Dog.getCount();
        Dog dog1 = new Dog("Сильный");
        Dog.getCount();
        Animal.getCount();

        cats[0].swim(0);
        cats[0].swim(1);

        cats[0].run(200);
        cats[0].run(201);

        dog1.swim(10);
        dog1.swim(11);

        dog1.run(499);
        dog1.run(501);
    }
}
