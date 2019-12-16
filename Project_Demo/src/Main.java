import Strategy.Arm;

public class Main {
    public static void main(String[] args) {

        Gym gym = Gym.getInstance("GymPoint", "Abay 123");
        Members client = Client.builder("2355", "Madi", 19, "male").setPhone("8744569").build();
        Members trainer = Trainer.builder("111", "Zhas", 25, "male").setAddress("Ainabulak 15").build();

        gym.addObs(trainer);

        gym.addClient((Client) client);

        ((Client) client).setStrategy(new Arm());
        ((Client) client).executeStrategy();

    }
}
