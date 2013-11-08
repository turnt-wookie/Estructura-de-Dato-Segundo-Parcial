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
    public static void openEuclides(){

        VentanaEjecutar eu = new VentanaEjecutar(0);
        eu.setVisible(true);

    }

    public static Returner createEuclides(String codeEdited){
        String[] tokens = codeEdited.split("int x = ");
        String[] tokens2 = tokens[1].split(";");
        tokens = tokens2[1].split("int y = ");

        int var1 = Integer.valueOf(tokens2[0]);
        int var2 = Integer.valueOf(tokens[1]);
        Euclides euObject = new Euclides(var1,var2);
        Returner r = new Returner(euObject.algoritmo(),euObject.getText()+"\n"+euObject.getText2());
        return r;
    }



    public static String getCodeEuclides(){
        return Euclides.getCodigo();
    }

    //Funciones Sumatoria
    public static void openSumatoria(){

        VentanaEjecutar eu = new VentanaEjecutar(1);
        eu.setVisible(true);

    }

    public static Returner createSumatoria(String codeEdit){
        String[] tokens = codeEdit.split("int num=");
        String[] tokens2 = tokens[1].split(";");

        int var1 = Integer.valueOf(tokens2[0]);
        Sumatoria sumObject = new Sumatoria(var1);
        Returner r = new Returner(sumObject.sumatoria(),"");
        return r;
    }

    public static String getCodeSumatoria(){
        return Sumatoria.getCodigo();
    }

    //Funciones Mario
    public static void openMario(){

        VentanaEjecutar eu = new VentanaEjecutar(2);
        eu.setVisible(true);

    }

    public static Returner createMario(){
        //Here Goes JFlex code
        Euclides euObject = new Euclides(1,2);
        Returner r = new Returner(euObject.algoritmo(),euObject.imprimirVaciado());
        return r;
    }

    public static String getCodeMario(){
        return Euclides.getCodigo();
    }

    public static void main(String[] args) {

        inicio ini = new inicio();
        ini.setVisible(true);

    }
}
