public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "female";
        wolf.nickname = "Bonnie";
        wolf.weight = 25;
        wolf.age = 5;
        wolf.color = "white";
        System.out.println("Gender: " + wolf.gender + "\nNickname: " + wolf.nickname + "\nWeight: " + wolf.weight + "\nAge: " + wolf.age + "\nColor: " + wolf.color);
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}