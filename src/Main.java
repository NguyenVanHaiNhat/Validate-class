import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean validateClass(String nameClass){
        String pattern = "^[CAP][0-9]{4}[GHIK]$";
        Pattern r = Pattern.compile(pattern);
        Matcher matcher = r.matcher(nameClass);

        return matcher.matches();
    }
    public static void main(String[] args) {
        String name1 = "C0223G";
        String name2 = "A0323K";
        String name3 = "M0318G";
        String name4 = "P0323A";

        System.out.println(name1 + " " + validateClass(name1));
        System.out.println(name2 + " " + validateClass(name2));
        System.out.println(name3 + " " + validateClass(name3));
        System.out.println(name4 + " " + validateClass(name4));
    }
}