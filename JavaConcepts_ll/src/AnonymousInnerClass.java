class Weather {
    public void report() {
        System.out.println("It's raining today");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Weather weather = new Weather() {
            public void report() {
                System.out.println("It's sunny today!");
            }
        };
        weather.report();
    }
}
