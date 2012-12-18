
public class LastFirst extends Namer {
    public LastFirst(String s) {
        int i = s.lastIndexOf(",");

        if (i > 0) {
            last = s.substring(0, i).trim();
            first = s.substring(i + 1).trim();
        } else {
            last = s;
            first = "";
        }
    }
}
