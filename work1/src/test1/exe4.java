package test1;

public class exe4 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setSeated(true);
        car1.setStatus(car1.ON);
        car1.setColor("yellow");
        car1.speedOn(50);

        Car car2 = new Car();
        car2.setSeated(true);
        car2.setStatus(car2.START);
        car2.setColor("blue");
        car2.speedOn(-30);

        Car car3 = new Car();
        car3.speedOn(20);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}
