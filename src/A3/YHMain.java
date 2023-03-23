package A3;

public class YHMain {
    public static void main(String[] args) {
        Engine eng1 = new Engine(1600);
        System.out.println(eng1);
        Engine eng2 = new Engine(2000);
        System.out.println(eng2);
        Aircond airc1 = new Aircond("auto");
        System.out.println(airc1);
        Aircond airc2 = new Aircond("manual");
        System.out.println(airc2);
        Sound snd1 = new Sound();
        System.out.println(snd1);
    }
}
