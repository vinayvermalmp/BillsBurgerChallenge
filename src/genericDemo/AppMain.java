package genericDemo;

public class AppMain {
    public static void main(String[] args) {
        var nationalUsPark = new Park[]{
                new Park("National Us Park", "44.8234, -110.5980"),
                new Park("Grand Canyon", "54.8234, -135.57680"),
                new Park("Grand Canyon", "24.8234, -95.67689"),
        };
        Layer<Park> parkLayer = new Layer<>(nationalUsPark);
        parkLayer.renderLayer();

        var majorUsRiver = new River[]{
                new River("Yamuna" , "24.8234, -100.5980, 43.8234, -110.5980, 54.8234, -150.5980"),
                new River("Goda Vari" , "20.8234, -112.5980, 73.8234, -123.5980, 110.8234, -178.5980"),
        };

        Layer<River> riverLayer = new Layer<>(majorUsRiver);
        riverLayer.renderLayer();
    }
}
