public class World {
    private static final boolean MAN = true;
    private static final boolean WOMAN = false;

    public static void main(String[] args) {
        System.out.println("1. Adam được sinh ra");
        Human adam = new Human("Adam", true);
        adam.setAge(9);
        System.out.println("anh " + adam.getName() + " hưởng thọ: " + adam.getAge() + " tuổi");

        System.out.println("2. Eva được sinh ra");
        Human eva = new Human("Eva", false);
        eva.setAge(19);
        System.out.println("cô " + eva.getName() + " hưởng thọ: " + eva.getAge()+ " tuổi");

        God god = new God();
        System.out.print("3. Đức chúa trời nói: ");
        god.say("Không được ăn táo, ăn sẽ không sao");

        Snake snake = new Snake();
        System.out.print("4.Rắn một mắt nói: ");
        snake.say("Ăn đi có sao đấy");

        System.out.println("5. Eva ăn 1 miếng táo, Adam chơi 2 miếng cứ thế lặp cho đến khi hết táo");
        Apple food = new Apple();
        while (!food.isEmpty(0)) {
            eva.eat(food);
            adam.eat(food);
            adam.eat(food);
        }

        System.out.println("6. 2 chị em bắt đầu đi ngủ...");
        eva.sleep();
        adam.sleep();

        System.out.println("7. Chúa lại phán");
        god.say("ngủ ít thôi dậy mà học bài đi không thì sau này chúng mày cạp đất mà ăn à");
    }
}
