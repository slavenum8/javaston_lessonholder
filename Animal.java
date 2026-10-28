public abstract class Animal {
    protected String name;
    private static int count;

    public Animal(String name) {
        setName(name);
        count++;
    }

    public static void getCount() {
        System.out.println("Всего животных: " + count);
    }

    protected void setName(String name) {
        this.name = name;
    }
    
    protected abstract void run(int length);
    protected abstract void swim(int length);
}
