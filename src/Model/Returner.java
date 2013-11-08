package Model;

/**
 * Created with IntelliJ IDEA.
 * User: Juan Pablo
 * Date: 7/11/13
 * Time: 09:36 PM
 */
public class Returner {
    int a;
    String b;

    public Returner(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getResult() {
        return a;
    }

    public String getStackDisplay() {
        return b;
    }
}
