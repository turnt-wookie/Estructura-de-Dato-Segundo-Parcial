/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Stack;

/**
 *
 * @author Mario Vallarta
 */
public class Multiplicacion {

    public int a;
    public int b;
    public int cont;
    public String text;
    public String text2;
    public Stack pila;
    
    
    public Multiplicacion(int a, int b){
        this.a=a;
        this.b=b;
        text = "";
        text2 = "";
        cont = 1;
        pila = new Stack();
    }

    public int algoritmo(){
        return algoritmo(this.a, this.b);
    }
    
    public int algoritmo(int x, int y){
        int res;
        if(y<=0||x<=0){
            System.out.println("Los números ingresados deben ser naturales.");
            return 0;
        }
/*        else{
            if(y==1){
                pila.push(x);
                res=x;
                System.out.println(llenar(x));
                return res;
            }
            else if(x==1){
                pila.push(y);
                res=y;
                System.out.println(llenar(y));
                return res;
            }
*/            else{
                if(cont<=y){
                    pila.push(x);
                    System.out.println("Iteración: " +cont+ llenar(x));
                 res=algoritmo(x,y);
                 return res;
                }
            }
            return 0;
        }
    /*}*/
    
    public String llenar(int z){
        text ="\n|-----|\n"+"   "+ z + text;
        cont++;
        return text;
    }
    
    public String vaciar(){
        Stack clon;
        int con=0;
        con++;
        clon=(Stack)pila.clone();
        while(clon.empty()!=true){
        text2 = text2 + "Iteración: "+con+"\n|-----|\n"+"   "+ clon.pop();
        }
        text2= text2 + "\n\n";
        int x=(Integer)pila.pop();
        while(pila.empty()!=true){
            pila.push(x +(Integer)pila.pop());
            
            vaciar();
        }
        
        return text2;
    }

    public int getA() {
        return a;
    }


    public int getB() {
        return b;
    }

    public int getCont() {
        return cont;
    }


    public String getText() {
        return text;
    }


    public String getText2() {
        return text2;
    }


    public Stack getPila() {
        return pila;
    }

    public static  String getCodigo(){
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
                "    public int a;\n" +
                "    public int b;\n" +
                "    public int cont;\n" +
                "    public String text;\n" +
                "    public String text2;\n" +
                "    public Stack pila;\n" +
                "    \n" +
                "    \n" +
                "    public Multiplicacion(int a, int b){\n" +
                "        this.a=a;\n" +
                "        this.b=b;\n" +
                "        text = \"\";\n" +
                "        text2 = \"\";\n" +
                "        cont = 1;\n" +
                "        pila = new Stack();\n" +
                "    }\n" +
                "\n" +
                "    public int algoritmo(){\n" +
                "        return algoritmo(this.a, this.b);\n" +
                "    }\n" +
                "    \n" +
                "    public int algoritmo(int x, int y){\n" +
                "        int res;\n" +
                "        if(y<=0||x<=0){\n" +
                "            System.out.println(\"Los números ingresados deben ser naturales.\");\n" +
                "            return 0;\n" +
                "        }\n" +
                "/*        else{\n" +
                "            if(y==1){\n" +
                "                pila.push(x);\n" +
                "                res=x;\n" +
                "                System.out.println(llenar(x));\n" +
                "                return res;\n" +
                "            }\n" +
                "            else if(x==1){\n" +
                "                pila.push(y);\n" +
                "                res=y;\n" +
                "                System.out.println(llenar(y));\n" +
                "                return res;\n" +
                "            }\n" +
                "*/            else{\n" +
                "                if(cont<=y){\n" +
                "                    pila.push(x);\n" +
                "                    System.out.println(\"Iteración: \" +cont+ llenar(x));\n" +
                "                 res=algoritmo(x,y);\n" +
                "                 return res;\n" +
                "                }\n" +
                "            }\n" +
                "            return 0;\n" +
                "        }\n" +
                "    /*}*/\n" +
                "    \n" +
                "    public String llenar(int z){\n" +
                "        text =\"\\n|-----|\\n\"+\"   \"+ z + text;\n" +
                "        cont++;\n" +
                "        return text;\n" +
                "    }\n" +
                "    \n" +
                "    public String vaciar(){\n" +
                "        Stack clon;\n" +
                "        int con=0;\n" +
                "        con++;\n" +
                "        clon=(Stack)pila.clone();\n" +
                "        while(clon.empty()!=true){\n" +
                "        text2 = text2 + \"Iteración: \"+con+\"\\n|-----|\\n\"+\"   \"+ clon.pop();\n" +
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
                "    \n" +
                "    public static  String getCodigo(){\n" +
                "        return null;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        int pri = 3;\n" +
                "        int seg = 8;\n" +
                "        Multiplicacion mult = new Multiplicacion(pri, seg);\n" +
                "        System.out.println(mult.algoritmo());\n" +
                "        System.out.println(mult.vaciar());\n" +
                "    }\n" +
                "}\n";
    }


    public static void main(String[] args) {
        int pri = 3;
        int seg = 8;
        Multiplicacion mult = new Multiplicacion(pri, seg);
        System.out.println(mult.algoritmo());
        //System.out.println(mult.vaciar());
    }
}
