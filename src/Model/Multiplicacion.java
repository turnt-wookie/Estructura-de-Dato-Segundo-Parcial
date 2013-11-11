/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Stack;

/**
 * Clase que multiplica dos números usando recursividad, toma el multiplicando y lo genera las veces definidas por el multiplicador.
 * @author Mario Vallarta
 */
public class Multiplicacion {

    private int a;
    private int b;
    private int cont;
    private String text;
    private String text2;
    private Stack pila;

    /**
     * Constructor de la clase.
     * @param a Es el multiplicando que se usa en el constructor.
     * @param b Es el multiplicador que se usa en el constructor.
     */
    public Multiplicacion(int a, int b){
        this.a=a;
        this.b=b;
        text = "";
        text2 = "";
        cont = 1;
        pila = new Stack();

    }
    /**
     * Es el algoritmo que sigue para que la operación se repita cuantas veces lo pida el multiplicador y va llenando la pila.
     * @return Regresa error si el multiplicando o el multiplicador son menores a 1.
     */
    public int algoritmo(){
        return algoritmo(this.a,this.b);
    }
    /**
     * Es el algoritmo que sigue para que la operación se repita cuantas veces lo pida el multiplicador y va llenando la pila.
     * @param x Multiplicando que se usa en la función algoritmo.
     * @param y Multiplicador que se usa en la función algoritmo.
     * @return Regresa error si el multiplicando o el multiplicador son menores a 1.
     */
    public int algoritmo(int x, int y){
        int res=0;
        if(y<=0||x<=0){
            System.out.println("Los números ingresados deben ser naturales.");
            return 0;
        }else{
            if(cont<=y){
                pila.push(x);
                llenar();
                cont++;
                res=algoritmo(x,y);
                return res=res+x;
            }
        }
        return res;
    }


    /**
     * Imprime el llenado de la pila.
     * @return Regresa el texto que se enseña al llenarse la pila.
     */
    public String llenar(){
        
        Stack clon;
        clon=(Stack)pila.clone();
        while(clon.empty()!=true){
            text =text+"\n|-----|\n"+"   "+ clon.pop();
            
        }
        text = text+"\n\n";
        
        return text;
    }


    /**
     * Imprime el vaciado de la pila y la va vaciando, al mismo tiempo que suma el multiplicando las veces que el multiplicador defina, también es recursiva.
     * @return Regresa el texto que se enseña al vaciarse la pila.
     */
    public String vaciar(){
        Stack clon;
        int con=0;
        clon=(Stack)pila.clone();
        while(clon.empty()!=true){
        text2 = text2 + "\n|-----|\n"+"   "+ clon.pop();
        }
        text2= text2 + "\n\n";
        int x=(Integer)pila.pop();
        while(pila.empty()!=true){
            pila.push(x +(Integer)pila.pop());
            
            vaciar();
        }
        
        return text2;
    }

    /**
     *
     * @return int a
     */
    public int getA() {
        return a;
    }


    /**
     *
     * @return int b
     */
    public int getB() {
        return b;
    }

    /**
     *
     * @return int cont
     */
    public int getCont() {
        return cont;
    }


    /**
     *
     * @return string text
     */
    public String getText() {
        return text;
    }


    /**
     *
     * @return   string text2
     */
    public String getText2() {
        return text2;
    }


    /**
     *
     * @return stack pila
     */
    public Stack getPila() {
        return pila;
    }


    /**
     *     Funcion que devuelve el codigo
     * @return String Code
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
                " * @author Mario Vallarta\n" +
                " */\n" +
                "public class Multiplicacion {\n" +
                "\n" +
                "    private int a;\n" +
                "    private int b;\n" +
                "    private int cont;\n" +
                "    private String text;\n" +
                "    private String text2;\n" +
                "    private Stack pila;\n" +
                "    \n" +
                "    \n" +
                "    public Multiplicacion(int a, int b){\n" +
                "        this.a=a;\n" +
                "        this.b=b;\n" +
                "        text = \"\";\n" +
                "        text2 = \"\";\n" +
                "        cont = 1;\n" +
                "        pila = new Stack();\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    public int algoritmo(){\n" +
                "        return algoritmo(this.a,this.b);\n" +
                "    }\n" +
                "    \n" +
                "    public int algoritmo(int x, int y){\n" +
                "        int res=0;\n" +
                "        if(y<=0||x<=0){\n" +
                "            System.out.println(\"Los números ingresados deben ser naturales.\");\n" +
                "            return 0;\n" +
                "        }else{\n" +
                "            if(cont<=y){\n" +
                "                pila.push(x);\n" +
                "                llenar();\n" +
                "                cont++;\n" +
                "                res=algoritmo(x,y);\n" +
                "                return res=res+x;\n" +
                "            }\n" +
                "        }\n" +
                "        return res;\n" +
                "    }\n" +
                "    \n" +
                "    public String llenar(){\n" +
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
                "    public String vaciar(){\n" +
                "        Stack clon;\n" +
                "        int con=0;\n" +
                "        clon=(Stack)pila.clone();\n" +
                "        while(clon.empty()!=true){\n" +
                "        text2 = text2 + \"\\n|-----|\\n\"+\"   \"+ clon.pop();\n" +
                "        }\n" +
                "        text2= text2 + \"\\n\\n\";\n" +
                "        int x=(Integer)pila.pop();\n" +
                "        while(pila.empty()!=true){\n" +
                "            pila.push(x +(Integer)pila.pop());\n" +
                "            \n" +
                "            vaciar();\n" +
                "        }\n" +
                "        \n" +
                "        return text2;\n" +
                "    }\n" +
                "\n" +
                "    public int getA() {\n" +
                "        return a;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    public int getB() {\n" +
                "        return b;\n" +
                "    }\n" +
                "\n" +
                "    public int getCont() {\n" +
                "        return cont;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    public String getText() {\n" +
                "        return text;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    public String getText2() {\n" +
                "        return text2;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    public Stack getPila() {\n" +
                "        return pila;\n" +
                "    }\n" +
                "\n" +
                "    public static String getCodigo() {\n" +
                "        return \"\";\n" +
                "    }\n" +
                "    \n" +
                "    \n" +
                "\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "\n" +
                "        //editar esto:\n" +
                "        int pri = 3;\n" +
                "        int seg = 8;\n" +
                "        //editar hasta aqui\n" +
                "        \n" +
                "        Multiplicacion mult = new Multiplicacion(pri, seg);\n" +
                "        System.out.println(mult.algoritmo());\n" +
                "        System.out.println(\"Llenado\\n\"+mult.getText());\n" +
                "        System.out.println(\"Vaciado\\n\"+mult.vaciar());\n" +
                "    }\n" +
                "}\n";
    }
    
    


    public static void main(String[] args) {

        //editar esto:
        int pri = 3;
        int seg = 8;
        //editar hasta aqui

        Multiplicacion mult = new Multiplicacion(pri, seg);
        System.out.println(mult.algoritmo());
        System.out.println("Llenado\n"+mult.getText());
        System.out.println("Vaciado\n"+mult.vaciar());
    }
}
