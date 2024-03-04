import java.util.UUID;
public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Animal("Cat", "Black", "Pet");
        Animal tiger = new Animal("Tiger", "Orange", "Wild");

        printHashCode(cat);
        printHashCode(tiger);
    }

    public static void printHashCode(Animal animal) {
        System.out.println("HashCode of " + animal + ": " + animal.hashCode());
    }
}
class Animal {
    private String name;
    private String color;
    private String type;
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    public int hashCode() {
        return UUID.randomUUID().hashCode(); //over-ride the hashCode
    }
    public String toString() {
        return "Animal [Name: " + name + ", Color: " + color + ", Type: " + type + "]";
    }
}
