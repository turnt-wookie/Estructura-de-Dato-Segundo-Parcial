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
     * @return
     */
    public int sumatoria() {

        return sumatoria(this.num);
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
            rellenar();
            return 1;
        }else{
            //rellenar(n);
            rellenar();
            return n + sumatoria(n - 1);
        }
    }
    

    
    /**
     * Este metodo se encarga de mostrar como se llena una pila con los distintos valores que tendra la variable "n"
     * @return  
     */
    public String rellenar(){
        
        Stack clon;
        clon=(Stack)pila.clone();
        while(clon.empty()!=true){
            text =text+"\n|-----|\n"+"   "+ clon.pop();
            
        }
        text = text+"\n\n";
        
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
        int x=(Integer)pila.pop();
        while(pila.empty()!=true){
            pila.push(x +(Integer)pila.pop());
            vaciar();
        }
        return text2;
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
                "    private String text;\n" +
                "    private String text2;\n" +
                "    private int num; //Valor con base a el cual se realizara la sumatoria\n" +
                "    private int i=0; //Varibale que sirve de contador\n" +
                "    private Stack pila; //Pila que se rellena con los valores de la sumatoria\n" +
                "\n" +
                "    /*\n" +
                "     * Constructor de la clase\n" +
                "     */\n" +
                "    \n" +
                "    public Sumatoria(int num) {\n" +
                "        this.num=num;\n" +
                "        text = \"\";\n" +
                "        text2 = \"\";\n" +
                "        pila = new Stack();\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Este metodo realiza el calculo de la sumatoria, mas no es llamado para imprimir, solo se encarga de mandar cada valor de n al metodo \"rellenar\"\n" +
                "     * @return\n" +
                "     */\n" +
                "    public int sumatoria() {\n" +
                "\n" +
                "        return sumatoria(this.num);\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Este metodo realiza el calculo de la sumatoria, mas no es llamado para imprimir, solo se encarga de mandar cada valor de n al metodo \"rellenar\"\n" +
                "     * @param n Es la variable que recibe el valor del numero al que se le calculara una sumatoria\n" +
                "     * @return\n" +
                "     */\n" +
                "    public int sumatoria(int n) {\n" +
                "        pila.push(n);\n" +
                "        if (n == 1){\n" +
                "            //rellenar(n);\n" +
                "            rellenar();\n" +
                "            return 1;\n" +
                "        }else{\n" +
                "            //rellenar(n);\n" +
                "            rellenar();\n" +
                "            return n + sumatoria(n - 1);\n" +
                "        }\n" +
                "    }\n" +
                "    \n" +
                "\n" +
                "    \n" +
                "    /**\n" +
                "     * Este metodo se encarga de mostrar como se llena una pila con los distintos valores que tendra la variable \"n\"\n" +
                "     * @return  \n" +
                "     */\n" +
                "    public String rellenar(){\n" +
                "        \n" +
                "        Stack clon;\n" +
                "        clon=(Stack)pila.clone();\n" +
                "        while(clon.empty()!=true){\n" +
                "            text =text+\"\\n|-----|\\n\"+\"   \"+ clon.pop();\n" +
                "            \n" +
                "        }\n" +
                "        text = text+\"\\n\\n\";\n" +
                "        \n" +
                "        return text;\n" +
                "    }\n" +
                "    \n" +
                "    /**\n" +
                "     *Este metodo solo se encarga de mostar el vaciado de una pila\n" +
                "     * @return \n" +
                "     */\n" +
                "    public String vaciar(){\n" +
                "        Stack j;\n" +
                "        j=(Stack)pila.clone();\n" +
                "        \n" +
                "        while(j.empty()!=true){\n" +
                "            text2=text2+\"\\n|-----|\\n\"+\"   \" + j.pop();\n" +
                "        }\n" +
                "        \n" +
                "        text2 =text2+\"\\n\\n\";\n" +
                "        int x=(Integer)pila.pop();\n" +
                "        while(pila.empty()!=true){\n" +
                "            pila.push(x +(Integer)pila.pop());\n" +
                "            vaciar();\n" +
                "        }\n" +
                "        return text2;\n" +
                "    }\n" +
                "    \n" +
                "    /**\n" +
                "     * Metodo que devuelve el texto contenido en la variable codigo\n" +
                "     * @return\n" +
                "     */\n" +
                "    public static String getCodigo() {\n" +
                "        return null;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Metodo que devuelve el texto que representa el llenado de la pila\n" +
                "     * @return\n" +
                "     */\n" +
                "    public String getText() {\n" +
                "        return text;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Metodo que devuelve el texto que representa el vaciado de la pila\n" +
                "     * @return\n" +
                "     */\n" +
                "    public String getText2() {\n" +
                "        return text2;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Metodo que devuelve la pila que se esta utilizando\n" +
                "     * @return\n" +
                "     */\n" +
                "    public Stack getPila() {\n" +
                "        return pila;\n" +
                "    }\n" +
                "   \n" +
                "    \n" +
                "     /**\n" +
                "     * @param args the command line arguments\n" +
                "     */\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        int num=5; //Solo editar esto\n" +
                "        Sumatoria sum = new Sumatoria(num);\n" +
                "        \n" +
                "        System.out.println(\"Resultado: \"+sum.sumatoria());\n" +
                "        System.out.println(\"<<<<Llenado>>>>\");\n" +
                "        System.out.println(sum.getText());\n" +
                "        System.out.println(\"<<<<Vaciado>>>>\");\n" +
                "        System.out.println(sum.vaciar());\n" +
                "    }\n" +
                "    \n" +
                "}\n";
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
        int num=5; //Solo editar esto
        Sumatoria sum = new Sumatoria(num);
        
        System.out.println("Resultado: "+sum.sumatoria());
        System.out.println("<<<<Llenado>>>>");
        System.out.println(sum.getText());
        System.out.println("<<<<Vaciado>>>>");
        System.out.println(sum.vaciar());
    }
    
}
