public class Human {
    public static String name;
    public static boolean gender;
    public int age;

    public Human(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Human.name = name;
    }

    public static boolean isGender() {
        return gender;
    }

    public static void setGender(boolean gender) {
        Human.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void say(String words) {
        System.out.println(words);
    }

    public static void eat(Apple food) {
        food.weight--;
    }

    public static void sleep() {
        System.out.println(name + " is sleeping");
    }
}
