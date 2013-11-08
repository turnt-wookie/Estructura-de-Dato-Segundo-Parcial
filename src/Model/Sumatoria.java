/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Stack;

/**
 *
 * @author 56185
 */
public class Sumatoria {
    private int num; //Valor con base a el cual se realizara la sumatoria
    private int i=0; //Varibale que sirve de contador
    private Stack<Integer> pila = new Stack<Integer>(); //Pila que se rellena con los valores de la sumatoria

    /*
     * Constructor de la clase
     */

    public Sumatoria(int num) {
        this.num=num;

    }

    /**
     * Este metodo realiza el calculo de la sumatoria, mas no es llamado para imprimir, solo se encarga de mandar cada valor de n al metodo "rellenar"
     * @param n Es la variable que recibe el valor del numero al que se le calculara una sumatoria
     * @return
     */

    public int sumatoria (){
        return sumatoria(this.num);
    }
    public int sumatoria(int n) {
        if (n == 1){
            rellenar(n);
            return 1;
        }else{
            rellenar(n);
            System.out.println("<<<<Llenado>>>>");
            return n + sumatoria(n - 1);
        }
    }

    /**
     * Este metodo solo se encarga de realizar el calculo de la sumatoria e imprimirlo
     * @param n Es la variable que recibe el valor del numero al que se le calculara una sumatoria
     * @return
     */

    public int sumatoria1(int n) {
        if (n == 1){
            return 1;
        }else{
            return n + sumatoria1(n - 1);
        }
    }

    /**
     * Este metodo se encarga de mostrar como se llena una pila con los distintos valores que tendra la variable "n"
     * @param n Es la varible que contiene cada uno de los valores que se usan en la sumatoria
     */
    public void rellenar(int n){
        pila.push(n);
        for (Integer iteracion : pila) {
            System.out.println("|-----|");
            System.out.println("   " + iteracion);
        }
    }

    /**
     *Este metodo solo se encarga de mostar el vaciado de una pila
     */
    public void vaciar(){
        for (Integer iteracion : pila) {
            System.out.println("|-----|");
            System.out.println("   " + iteracion);
        }
        pila.pop();
    }

    /**
     * Metodo que devuelve el texto contenido en la variable codigo
     * @return
     */
    public static String getCodigo() {
        return "/*\n" +
                " * To change this template, choose Tools | Templates\n" +
                " * and open the template in the editor.\n" +
                " */\n" +
                "package Model;\n" +
                "\n" +
                "import java.util.Stack;\n" +
                "\n" +
                "/**\n" +
                " *\n" +
                " * @author 56185\n" +
                " */\n" +
                "public class Sumatoria {\n" +
                "    private int num; //Valor con base a el cual se realizara la sumatoria\n" +
                "    private int i=0; //Varibale que sirve de contador\n" +
                "    private Stack<Integer> pila = new Stack<Integer>(); //Pila que se rellena con los valores de la sumatoria\n" +
                "\n" +
                "    /*\n" +
                "     * Constructor de la clase\n" +
                "     */\n" +
                "\n" +
                "    public Sumatoria(int num) {\n" +
                "        this.num=num;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Este metodo realiza el calculo de la sumatoria, mas no es llamado para imprimir, solo se encarga de mandar cada valor de n al metodo \"rellenar\"\n" +
                "     * @param n Es la variable que recibe el valor del numero al que se le calculara una sumatoria\n" +
                "     * @return\n" +
                "     */\n" +
                "\n" +
                "    public int sumatoria (){\n" +
                "        return sumatoria(this.num);\n" +
                "    }\n" +
                "    public int sumatoria(int n) {\n" +
                "        if (n == 1){\n" +
                "            rellenar(n);\n" +
                "            return 1;\n" +
                "        }else{\n" +
                "            rellenar(n);\n" +
                "            System.out.println(\"<<<<Llenado>>>>\");\n" +
                "            return n + sumatoria(n - 1);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Este metodo solo se encarga de realizar el calculo de la sumatoria e imprimirlo\n" +
                "     * @param n Es la variable que recibe el valor del numero al que se le calculara una sumatoria\n" +
                "     * @return\n" +
                "     */\n" +
                "\n" +
                "    public int sumatoria1(int n) {\n" +
                "        if (n == 1){\n" +
                "            return 1;\n" +
                "        }else{\n" +
                "            return n + sumatoria1(n - 1);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Este metodo se encarga de mostrar como se llena una pila con los distintos valores que tendra la variable \"n\"\n" +
                "     * @param n Es la varible que contiene cada uno de los valores que se usan en la sumatoria\n" +
                "     */\n" +
                "    public void rellenar(int n){\n" +
                "        pila.push(n);\n" +
                "        for (Integer iteracion : pila) {\n" +
                "            System.out.println(\"|-----|\");\n" +
                "            System.out.println(\"   \" + iteracion);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     *Este metodo solo se encarga de mostar el vaciado de una pila\n" +
                "     */\n" +
                "    public void vaciar(){\n" +
                "        for (Integer iteracion : pila) {\n" +
                "            System.out.println(\"|-----|\");\n" +
                "            System.out.println(\"   \" + iteracion);\n" +
                "        }\n" +
                "        pila.pop();\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    /**\n" +
                "     * @param args the command line arguments\n" +
                "     */\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        int num=6;\n" +
                "        Sumatoria sum = new Sumatoria(num);\n" +
                "        sum.sumatoria();\n" +
                "\n" +
                "        System.out.println(\"Suma desde 1 hasta \" + num + \" = \" + sum.sumatoria1(num));\n" +
                "    }\n" +
                "\n" +
                "}\n";
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int num=6;
        Sumatoria sum = new Sumatoria(num);
        sum.sumatoria();

        System.out.println("Suma desde 1 hasta " + num + " = " + sum.sumatoria1(num));
    }

}
