public class Card {

    private int value;
    private String name;

    int getValue() {
        return value;
    }

    void setValue(int newValue) {
        value = newValue;
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }

    void describe() {
        System.out.println(name);
    }
    
}
