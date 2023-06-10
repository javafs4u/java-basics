public class TeluguCitizen extends Citizen {
    public TeluguCitizen(String name) {
        super(name);
    }

    public int getNameLength() {
        int nameLength = super.getNameLength();
        this.printClass();
        super.printClass();
        return nameLength + 5; //" garu"
    }

    public void printClass() {
        System.out.println("This is from TeluguCitizen");
    }
}
