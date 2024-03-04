import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for first car:");
        System.out.print("Model: ");
        String model1 = sc.nextLine();
        System.out.print("Color: ");
        String color1 = sc.nextLine();
        System.out.print("Speed (mph): ");
        double speed1 = Double.parseDouble(sc.nextLine());
        Car car1 = new Car(model1, color1, speed1);

        System.out.println("\nEnter details for second car:");
        System.out.println("Model: ");
        String model2 = sc.nextLine();
        System.out.println("Color: ");
        String color2 = sc.nextLine();
        System.out.print("Speed (mph): ");
        double speed2 = Double.parseDouble(sc.nextLine());
        Car car2 = new Car(model2, color2, speed2);

        int comparison = car1.compareTo(car2);
        if (comparison > 0) {
            System.out.println("\nThe details of the car with greater speed are:");
            System.out.println(car1);
        } else if (comparison < 0) {
            System.out.println("\nThe details of the car with greater speed are:");
            System.out.println(car2);
        } else {
            System.out.println("\nThe cars have the same speed.");
        }
    }
}
        class Car implements Comparable<Car> {
            private String model;
            private String color;
            private double speed;
            public Car(String model, String color, double speed) {
                this.model = model;
                this.color = color;
                this.speed = speed;
            }
            public double getSpeed() {
                return speed;
            }
            public int compareTo(Car other) {
                return Double.compare(this.speed, other.speed);
            }
            public String toString() {
                return "Car [Model: " + model + ", Color: " + color + ", Speed: " + speed + " mph]";
            }
        }