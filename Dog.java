public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    public static void getCount() {
        System.out.println("Количество собачек: " + count);
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength <= 500)
            System.out.println("Пёсик " + name + " пробежал: " + obstacleLength + " метров.");
        else
            System.out.println("Пёсик " + name + " пробежал: 500 метров и упал. Не добежав ещё: " + (obstacleLength - 500) + " метров.");
    }

    @Override
    public void swim(int obstacleLength) {
        if (obstacleLength <= 10)
            System.out.println("Пёсик " + name + " проплыл: " + obstacleLength + " метров.");
        else
            System.out.println("Пёсик " + name + " проплыл: 10 метров и утонул. Не проплыв ещё: " + (obstacleLength - 10) + " метров.");
    }

}
