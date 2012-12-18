
public class NameFactory {
    public NameFactory() {
    }

    public Namer getNamer(String s) {
        int i = s.indexOf(",");

        if (i > 0) {
            return new LastFirst(s);
        } else {
            return new FirstFirst(s);
        }
    }
}
