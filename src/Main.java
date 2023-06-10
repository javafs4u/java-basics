public class Main {
    public static void main(String[] args) {

        //TeluguCitizen c1 = new TeluguCitizen("MS Dhoni");

        //System.out.println(c1.getNameLength());

        MyCalculator c1 = new MyCalculator();
        MyCalculator2 c2 = new MyCalculator2();
        System.out.println(c1.add(3, 5));
        System.out.println(c2.add(3, 5));

        System.out.println("-------------");

        System.out.println(c1.formula(3, 5));
        System.out.println(c2.formula(3, 5));


        Person p1 = new Person();


        //FinallyEx1 ex = new FinallyEx1();
        //ex.test(null);

        //Person p1 = new Person("Virat", "xxx", "Kohli");
        //Person p2 = new Person("Virat", "yyy", "KOHLI");

        //Person p3 = p1;

        //p1.buildFirstName();
        //p1.printFullName();


        Person.printHello();


        //System.out.println(p1.equals(p2));
        //System.out.println(p1 == p3);
    }
}