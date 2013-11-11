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


    /**
     *
     * Creara el objeto para manejar los datos, este incluira un resultado y un string para imprimir dentro de la caja
     * de ejecuccion donde mostrara el vaciado y llenado de la pila
     *
     * @param a
     * @param b
     *
     *
     *
     */
    public Returner(int a, String b) {
        this.a = a;
        this.b = b;
    }


    /**
     *
     * Devuelve Resultado
     *
     * @return a
     *
     *
     *
     */
    public int getResult() {
        return a;
    }

    /**
     *
     * Devuelve display   de stack
     *
     * @return b
     *
     *
     *
     */


    public String getStackDisplay() {
        return b;
    }
}
