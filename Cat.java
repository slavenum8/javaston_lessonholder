public class Cat extends Animal {
    private static int count;
    private static int catFood = 0;
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        count++;
    }

    public static void getCount() {
        System.out.println("Количество котов: " + count);
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength <= 200)
            System.out.println("Кот " + name + " согласился пробежать " + obstacleLength + " метров.");
        else
            System.out.println("Кот " + name + " отказался бежать " + obstacleLength + " метров. Слишком далеко.");
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength > 0)
            System.out.println("С ума сошёл? Коты не умеют плавать!");
        else
            System.out.println("Кот " + name + " согласился никуда не плыть.");
    }

    public static void addCatFood(int foodAmount) {
        Cat.catFood += foodAmount;
        System.out.println("В миске " + catFood + " еды.");
    }


    public void foodEat(int foodConsumption) {
        if (catFood == 0) {
            System.out.println("Кот " + name + " захотел покушать, но еды в миске нет.");
            isFull = false;
        } else if (catFood < foodConsumption) {
            System.out.println("Кот " + name + " хотел съесть " + foodConsumption + " еды, но в миске всего " + catFood + ". Покушает в другой раз.");
            isFull = false;
        } else {
            catFood = catFood - foodConsumption;
            System.out.println("Кот " + name + " съел " + foodConsumption + " еды. В миске осталось: " + catFood);
            isFull = true;
        }
    }

    public void getIsFull() {
        if (isFull)
            System.out.println("Кот " + name + " сыт!");
        else
            System.out.println("Кот " + name + " голоден!");
    }
}
