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
    private String text;
    private String text2;
    private int num; //Valor con base a el cual se realizara la sumatoria
    private int i=0; //Varibale que sirve de contador
    private Stack pila; //Pila que se rellena con los valores de la sumatoria

    /*
     * Constructor de la clase
     */

    public Sumatoria(int num) {
        this.num=num;
        text = "";
        text2 = "";
        pila = new Stack();
    }

    /**
     * Este metodo realiza el calculo de la sumatoria, mas no es llamado para imprimir, solo se encarga de mandar cada valor de n al metodo "rellenar"
     * @param n Es la variable que recibe el valor del numero al que se le calculara una sumatoria
     * @return
     */
    public int sumatoria(int n) {
        pila.push(n);
        if (n == 1){
            //rellenar(n);
            System.out.println(rellenar(n));
            return 1;
        }else{
            //rellenar(n);
            System.out.println(rellenar(n));
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
     * @return
     */
    public String rellenar(int n){

        text="\n|-----|\n"+"   " + n + text;

        return text;
    }

    /**
     *Este metodo solo se encarga de mostar el vaciado de una pila
     * @return
     */
    public String vaciar(){
        Stack j;
        j=(Stack)pila.clone();

        while(j.empty()!=true){
            text2=text2+"\n|-----|\n"+"   " + j.pop();
        }

        text2 =text2+"\n\n";

        while(pila.empty()!=true){
            pila.pop();
            vaciar();
        }
        return text2;
    }

    /**
     * Metodo que devuelve el texto contenido en la variable codigo
     * @return
     */
    public static String getCodigo() {
        return null;
    }

    /**
     * Metodo que devuelve el texto que representa el llenado de la pila
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     * Metodo que devuelve el texto que representa el vaciado de la pila
     * @return
     */
    public String getText2() {
        return text2;
    }

    /**
     * Metodo que devuelve la pila que se esta utilizando
     * @return
     */
    public Stack getPila() {
        return pila;
    }


    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int num=5;
        Sumatoria sum = new Sumatoria(num);
        System.out.println("<<<<Llenado>>>>");
        sum.sumatoria(num);
        System.out.println("<<<<Vaciado>>>>");
        System.out.println(sum.vaciar());
        System.out.println("Suma desde 1 hasta " + num + " = " + sum.sumatoria1(num));
    }

}