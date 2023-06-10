public class Citizen {
    protected String name;

    public Citizen(String name) {
        this.name = name;
    }

    public int getNameLength() {
        return name.length();
    }

    public int getNameLength(int offset) {
        return name.length();
    }

    public void printClass() {
        System.out.println("This is from Citizen");
    }
}
