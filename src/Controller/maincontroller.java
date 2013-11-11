package Controller;

import View.VentanaEjecutar;
import Model.*;
import View.inicio;

/**
 * Created with IntelliJ IDEA.
 * User: Juan Pablo
 * Date: 7/11/13
 * Time: 09:19 PM
 */
public class maincontroller {

    //Funciones Euclides

    /**
     * Inicia la ventana de Euclides
     *
     */
    public static void openEuclides(){

        VentanaEjecutar eu = new VentanaEjecutar(0);
        eu.setVisible(true);

    }
    /**
     *
     * Esta funcion parse al codigo enviado a traves de codeEdited(String) para la funcion de Euclides
     * Se ejecuta el algoritmo de multiplicacion y se devuelve en un objeto de tipo Returner
     *
     * @param codeEdited
     *
     * @return Returner
     *
     */

    public static Returner createEuclides(String codeEdited){
        String[] tokens = codeEdited.split("int x = ");
        String[] tokens2 = tokens[1].split(";");
        tokens = tokens2[1].split("int y = ");

        int var1 = Integer.valueOf(tokens2[0]);
        int var2 = Integer.valueOf(tokens[1]);
        Euclides euObject = new Euclides(var1,var2);
        int result= euObject.algoritmo();
        String stackRet = "Llenado\n"+euObject.getText() +"\n\n"  + "Vaciado\n"+euObject.imprimirVaciado();
        Returner r = new Returner(result,stackRet);
        return r;
    }


    /**
     * @return String Codigo de Euclides
     *
     */
    public static String getCodeEuclides(){
        return Euclides.getCodigo();
    }

    /**
     * Inicia la ventana de Sumatoria
     *
     */
    public static void openSumatoria(){

        VentanaEjecutar eu = new VentanaEjecutar(1);
        eu.setVisible(true);

    }
    /**
     *
     * Esta funcion parse al codigo enviado a traves de codeEdit(String) para la funcion de sumatoria
     * Se ejecuta el algoritmo de multiplicacion y se devuelve en un objeto de tipo Returner
     *
     * @param codeEdit
     *
     * @return Returner
     *
     */


    public static Returner createSumatoria(String codeEdit){
        String[] tokens = codeEdit.split("int num=");
        String[] tokens2 = tokens[1].split(";");

        int var1 = Integer.valueOf(tokens2[0]);
        System.out.println(var1);
        Sumatoria sumObject = new Sumatoria(var1);
        int result =  sumObject.sumatoria();
        String stackRet = "Llenado\n"+sumObject.getText() +"\n\n"  + "Vaciado\n"+sumObject.vaciar();
        Returner r = new Returner(result ,stackRet);
        return r;
    }


    /**
     * @return String Codigo de Sumatoria
     *
     */
    public static String getCodeSumatoria(){
        return Sumatoria.getCodigo();
    }

    /**
     * Inicia la ventana de Multiplicacion
     *
     */
    public static void openMultiplicacion(){

        VentanaEjecutar eu = new VentanaEjecutar(2);
        eu.setVisible(true);

    }

    /**
     *
     * Esta funcion parse al codigo enviado a traves de codeEdit(String) para la funcion de multiplicacion
     * Se ejecuta el algoritmo de multiplicacion y se devuelve en un objeto de tipo Returner
     *
     * @param codeEdit
     *
     * @return Returner
     *
     */

    public static Returner createMultiplicacion(String codeEdit){
        String[] tokens = codeEdit.split("pri = ");
        String[] tokens2 = tokens[1].split(";");
        tokens = tokens2[1].split("seg = ");

        int var1 = Integer.valueOf(tokens2[0]);
        int var2 = Integer.valueOf(tokens[1]);
        Multiplicacion muObject = new Multiplicacion(var1,var2);
        int result = muObject.algoritmo();
        String stackRet = "Llenado\n"+muObject.getText() +"\n\n"  + "Vaciado\n"+muObject.vaciar();
        Returner r = new Returner(result,stackRet);
        return r;
    }


    /**
     * @return String Codigo de Multiplicacion
     *
     */
    public static String getCodeMultiplicacion(){
        return Multiplicacion.getCodigo();
    }


    /**
     * Generador del programa
     *
     */
    public static void main(String[] args) {

        inicio ini = new inicio();
        ini.setVisible(true);

    }
}
