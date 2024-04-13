import impl.Magazine;
import impl.MagazineFan;
import impl.MagazineReader;

public class Main {
    public static void main(String[] args) {

        // push mechanism
        Magazine magazine= new Magazine();

        MagazineReader reader1 = new MagazineReader();
        MagazineReader reader2 = new MagazineReader();
        MagazineReader reader3 = new MagazineReader();
        MagazineReader reader4 = new MagazineReader();

        MagazineFan fan1 = new MagazineFan();
        MagazineFan fan2 = new MagazineFan();
        MagazineFan fan3 = new MagazineFan();


        magazine.subscribe(reader1);
        magazine.subscribe(reader2);
        magazine.subscribe(reader3);
        magazine.subscribe(reader4);
        magazine.subscribe(fan1);
        magazine.subscribe(fan2);
        magazine.subscribe(fan3);

        magazine.setTitle("Hi Reader");

        System.out.println("--- reader3 , fan2 unsubscribe----");

        magazine.unsubscribe(reader3);
        magazine.unsubscribe(fan2);
        magazine.setTitle("Welcom Reader");

    }
}