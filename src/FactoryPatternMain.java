
public class FactoryPatternMain {
    private static NameFactory nFactory;

    public static void main(String[] args) {
        nFactory = new NameFactory();
        Namer name1 = computeName("Castro,Ricardo");
        Namer name2 = computeName("Pedro Teixeira");

        System.out.println(name1.getFirst() + " " + name1.getLast());
        System.out.println(name2.getFirst() + " "  +name2.getLast());
    }

    private static Namer computeName(String name) {
        return  nFactory.getNamer(name);
    }
}
