/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Stack;

/**
 * Programa que dice el maximo comun divisor (MCD) de dos numeros dados e
 * imprime la pila de la utilizacion de la memoria segun sean las llamadas
 * recursivas y como esta pila se va vaciando.
 * @author Nacho
 */
public class Euclides {
    
    //se declaran los enteros que se compararan.
    private int a;
    private int b;
    //se declara un contador para saber cuantas iteraciones se realizaron
    private int cont;
    //Se declaran dos variables de tipo String que contendran cuando se llena la pila y cuando se vacie, respectivamente
    private String text;
    private String text2;

    //Se declaran tres Stacks que contendran los valores cambiantes de a,b y mcd para asi poder imprimir el vaciado de las pilas

    public Stack pilax;
    public Stack pilay;
    public Stack pilamcd;

    /**
     *Constructor que recibe los dos numeros que se compararan y que inicializa las variables 
     * @param a
     * @param b
     */
    public Euclides(int a, int b){
        this.a=a;
        this.b=b;
        text = "";
        text2 = "";
        cont = 1;
        pilax = new Stack();
        pilay = new Stack();
        pilamcd = new Stack();
    }
    
    /**
     *El algoritmo recursivo que se encarga de de hacer el calculo del mcd y recibe los numeros que comparara
     * y regresa el resultado del calculo. La funcion se llama a si misma para el calculo del MCD.
     * La logica detras del algoritmo es que se le va restando el numero menor al mayor y se va repitiendo
     * el proceso hasta que ambos numeros sean iguales. Ese numero es el MCD.
     * @return int
     */

    public int algoritmo()    {
        return algoritmo(this.a,this.b);
    }

    /**
     *El algoritmo recursivo que se encarga de de hacer el calculo del mcd y recibe los numeros que comparara
     * y regresa el resultado del calculo. La funcion se llama a si misma para el calculo del MCD.
     * La logica detras del algoritmo es que se le va restando el numero menor al mayor y se va repitiendo
     * el proceso hasta que ambos numeros sean iguales. Ese numero es el MCD.
     * @param x
     * @param y
     * @return   int
     */

    public int algoritmo(int x, int y){
        int mcd=0;
        
        //las pilas se van llenando con los valores que van saliendo, para poder ser utilizados depsues.
        pilax.push(x);
        pilay.push(y);
        pilamcd.push(null);
       
        //Si cualquiera de los dos numeros no son naturales se manda un mensaje al usuario.
        if(x<=0||y<=0){
            System.out.println("Los numeros ingresados no son naturales");
            return 0;
        }
        else{
            //Si ambos numeros son iguales entonces ya se llego al MCD.
            if(x==y){
                mcd = x;
                pilamcd.pop(); //se elimina el null que habiamos puesto en el tope de la pila del MCD
                pilamcd.push(mcd); //y se llena el lugar quitado con el valor del mcd.
                
                /* Se imprimen las pilas confome se vayan rellenando, llamando a la funcion imprimirLlenado
                y al mismo tiempo se dice en que iteracion se encuentra en ese momento de la pila.
                */
                imprimirLlenado();
                //System.out.println("Numero de iteracion: "+cont+"\n"+imprimirLlenado(x,y,mcd)+"\n");
                return mcd;
            }
            else{
                /* Se imprimen las pilas confome se vayan rellenando, llamando a la funcion imprimirLlenado
                y al mismo tiempo se dice en que iteracion se encuentra en ese momento de la pila.
                */
                //System.out.println("Numero de iteracion: "+cont+"\n"+imprimirLlenado(x,y,mcd)+"\n");
                imprimirLlenado();
                //se hacen las comparaciones para saber a cual de los numeros restarle cual
                if(y<x){
                    x=x-y;                   
                }
                else{
                    y=y-x;
                }
                //ya hecha la operacion, se vuelve a ejecutar la funcion con los valores nuevos hasta que se termine.
                mcd = algoritmo(x, y);
                return mcd;
            }
        }
    }
    
    /**
     *Metodo que imprime el uso de la memoria en pilas segun se vaya llenando al momento de 
     * la recursividad del metodo de algoritmo. El 0 representa que no se ha hecho el calculo del MCD.

     * @return
     */
    public String imprimirLlenado(){
        Stack j,k,l;
        //se hace un clon de las pilas que creamos para poder ir llenando el texto segun estas.
        j=(Stack)pilax.clone();
        k=(Stack)pilay.clone();
        l=(Stack)pilamcd.clone();
            
        //mientras se va llenando el String se van vaciando los clones de las pilas y se deja llenar
        //dicho string cuando estas esten vacias.
            while(l.empty()!=true&&k.empty()!=true&&j.empty()!=true){
                text = text
                     //+ "Pila en la iteracion numero "+cont+"\n"
                     + "|---X---|---Y---|--mcd--|\n"
                     + "   "+j.pop()+"      "+k.pop()+"       "+l.pop()+"   \n"
                     + "|-------|-------|-------|\n"
                     + "";
            }
            //se agregan saltos para poder diferenciar las pilas al momento de imprimirlas.
            text =text+"\n\n";
            
       // se iguala el texto a si mismo para conservar lo que ya hay en el y agregar los datos nuevos 
      // text =
        //          "|---X---|---Y---|--mcd--|\n"
          //       + "   "+x+"      "+y+"       "+mcd+"   \n"
            //     + "|-------|-------|-------|\n"
              //   + ""
              // + text;
        //se aumenta el contador en una unidad para saber el numero de iteraciones necesitadas.
        cont++;
        return text;
    }
    
    /**
     *Metodo que imprime como se va liberando la memoria en pilas segun se vaya vaciendo al momento
     * de la recursividad del metodo de algoritmo. El null representa el valor del MCD en dicha parte de la memoria.
     * @return
     */
    public String imprimirVaciado(){
        Stack j,k,l;
        //se hace un clon de las pilas que creamos para poder ir llenando el texto segun estas.
        j=(Stack)pilax.clone();
        k=(Stack)pilay.clone();
        l=(Stack)pilamcd.clone();
            
        //mientras se va llenando el String se van vaciando los clones de las pilas y se deja llenar
        //dicho string cuando estas esten vacias.
            while(l.empty()!=true&&k.empty()!=true&&j.empty()!=true){
                text2 = text2
                     //+ "Pila en la iteracion numero "+cont+"\n"
                     + "|---X---|---Y---|--mcd--|\n"
                     + "   "+j.pop()+"      "+k.pop()+"       "+l.pop()+"   \n"
                     + "|-------|-------|-------|\n"
                     + "";
            }
            //se agregan saltos para poder diferenciar las pilas al momento de imprimirlas.
            text2 =text2+"\n\n";
            
            //se hace una validacion para asegurarse de que las pilas originales no estan vacias.
            if(pilax.empty()!=true&&pilay.empty()!=true&&pilamcd.empty()!=true){
                //se quita el ultimo elemento de las pilas
                pilax.pop();
                pilay.pop();
                pilamcd.push(pilamcd.pop());
                //se vuelve a llamar a si mismo el metodo para poder ir rellenando el String que se imprimira.
                imprimirVaciado();
            }
        return text2;
    }

    /**
     *Metodo que regresa el String de cuando se llena la pila de la memoria.
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     *Metodo que devuelve la pila que va guardando los valores de la x.
     * @return
     */
    public Stack getPilax() {
        return pilax;
    }

    /**
     *Metodo que devuelve la pila que va guardando los valores de la y.
     * @return
     */
    public Stack getPilay() {
        return pilay;
    }

    /**
     *Metodo que regresa el String de cuando se vacia la pila de la memoria.
     * @return
     */
    public String getText2() {
        return text2;
    }

    /**
     *Metodo que devuelve la pila que va guardando los valores del MCD.
     * @return
     */
    public Stack getPilamcd() {
        return pilamcd;
    }

    public static String getCodigo() {
        return "/*\n" +
                " * To change this license header, choose License Headers in Project Properties.\n" +
                " * To change this template file, choose Tools | Templates\n" +
                " * and open the template in the editor.\n" +
                " */\n" +
                "\n" +
                "package Model;\n" +
                "\n" +
                "import java.util.Stack;\n" +
                "\n" +
                "/**\n" +
                " * Programa que dice el maximo comun divisor (MCD) de dos numeros dados e\n" +
                " * imprime la pila de la utilizacion de la memoria segun sean las llamadas\n" +
                " * recursivas y como esta pila se va vaciando.\n" +
                " * @author Nacho\n" +
                " */\n" +
                "public class Euclides {\n" +
                "    \n" +
                "    //se declaran los enteros que se compararan.\n" +
                "    private int a;\n" +
                "    private int b;\n" +
                "    //se declara un contador para saber cuantas iteraciones se realizaron\n" +
                "    private int cont;\n" +
                "    //Se declaran dos variables de tipo String que contendran cuando se llena la pila y cuando se vacie, respectivamente\n" +
                "    private String text;\n" +
                "    private String text2;\n" +
                "\n" +
                "    //Se declaran tres Stacks que contendran los valores cambiantes de a,b y mcd para asi poder imprimir el vaciado de las pilas\n" +
                "\n" +
                "    public Stack pilax;\n" +
                "    public Stack pilay;\n" +
                "    public Stack pilamcd;\n" +
                "\n" +
                "    /**\n" +
                "     *Constructor que recibe los dos numeros que se compararan y que inicializa las variables \n" +
                "     * @param a\n" +
                "     * @param b\n" +
                "     */\n" +
                "    public Euclides(int a, int b){\n" +
                "        this.a=a;\n" +
                "        this.b=b;\n" +
                "        text = \"\";\n" +
                "        text2 = \"\";\n" +
                "        cont = 1;\n" +
                "        pilax = new Stack();\n" +
                "        pilay = new Stack();\n" +
                "        pilamcd = new Stack();\n" +
                "    }\n" +
                "    \n" +
                "    /**\n" +
                "     *El algoritmo recursivo que se encarga de de hacer el calculo del mcd y recibe los numeros que comparara\n" +
                "     * y regresa el resultado del calculo. La funcion se llama a si misma para el calculo del MCD.\n" +
                "     * La logica detras del algoritmo es que se le va restando el numero menor al mayor y se va repitiendo\n" +
                "     * el proceso hasta que ambos numeros sean iguales. Ese numero es el MCD.\n" +
                "     * @return int\n" +
                "     */\n" +
                "\n" +
                "    public int algoritmo()    {\n" +
                "        return algoritmo(this.a,this.b);\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     *El algoritmo recursivo que se encarga de de hacer el calculo del mcd y recibe los numeros que comparara\n" +
                "     * y regresa el resultado del calculo. La funcion se llama a si misma para el calculo del MCD.\n" +
                "     * La logica detras del algoritmo es que se le va restando el numero menor al mayor y se va repitiendo\n" +
                "     * el proceso hasta que ambos numeros sean iguales. Ese numero es el MCD.\n" +
                "     * @param x\n" +
                "     * @param y\n" +
                "     * @return   int\n" +
                "     */\n" +
                "\n" +
                "    public int algoritmo(int x, int y){\n" +
                "        int mcd=0;\n" +
                "        \n" +
                "        //las pilas se van llenando con los valores que van saliendo, para poder ser utilizados depsues.\n" +
                "        pilax.push(x);\n" +
                "        pilay.push(y);\n" +
                "        pilamcd.push(null);\n" +
                "       \n" +
                "        //Si cualquiera de los dos numeros no son naturales se manda un mensaje al usuario.\n" +
                "        if(x<=0||y<=0){\n" +
                "            System.out.println(\"Los numeros ingresados no son naturales\");\n" +
                "            return 0;\n" +
                "        }\n" +
                "        else{\n" +
                "            //Si ambos numeros son iguales entonces ya se llego al MCD.\n" +
                "            if(x==y){\n" +
                "                mcd = x;\n" +
                "                pilamcd.pop(); //se elimina el null que habiamos puesto en el tope de la pila del MCD\n" +
                "                pilamcd.push(mcd); //y se llena el lugar quitado con el valor del mcd.\n" +
                "                \n" +
                "                /* Se imprimen las pilas confome se vayan rellenando, llamando a la funcion imprimirLlenado\n" +
                "                y al mismo tiempo se dice en que iteracion se encuentra en ese momento de la pila.\n" +
                "                */\n" +
                "                imprimirLlenado();\n" +
                "                //System.out.println(\"Numero de iteracion: \"+cont+\"\\n\"+imprimirLlenado(x,y,mcd)+\"\\n\");\n" +
                "                return mcd;\n" +
                "            }\n" +
                "            else{\n" +
                "                /* Se imprimen las pilas confome se vayan rellenando, llamando a la funcion imprimirLlenado\n" +
                "                y al mismo tiempo se dice en que iteracion se encuentra en ese momento de la pila.\n" +
                "                */\n" +
                "                //System.out.println(\"Numero de iteracion: \"+cont+\"\\n\"+imprimirLlenado(x,y,mcd)+\"\\n\");\n" +
                "                imprimirLlenado();\n" +
                "                //se hacen las comparaciones para saber a cual de los numeros restarle cual\n" +
                "                if(y<x){\n" +
                "                    x=x-y;                   \n" +
                "                }\n" +
                "                else{\n" +
                "                    y=y-x;\n" +
                "                }\n" +
                "                //ya hecha la operacion, se vuelve a ejecutar la funcion con los valores nuevos hasta que se termine.\n" +
                "                mcd = algoritmo(x, y);\n" +
                "                return mcd;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    \n" +
                "    /**\n" +
                "     *Metodo que imprime el uso de la memoria en pilas segun se vaya llenando al momento de \n" +
                "     * la recursividad del metodo de algoritmo. El 0 representa que no se ha hecho el calculo del MCD.\n" +
                "\n" +
                "     * @return\n" +
                "     */\n" +
                "    public String imprimirLlenado(){\n" +
                "        Stack j,k,l;\n" +
                "        //se hace un clon de las pilas que creamos para poder ir llenando el texto segun estas.\n" +
                "        j=(Stack)pilax.clone();\n" +
                "        k=(Stack)pilay.clone();\n" +
                "        l=(Stack)pilamcd.clone();\n" +
                "            \n" +
                "        //mientras se va llenando el String se van vaciando los clones de las pilas y se deja llenar\n" +
                "        //dicho string cuando estas esten vacias.\n" +
                "            while(l.empty()!=true&&k.empty()!=true&&j.empty()!=true){\n" +
                "                text = text\n" +
                "                     //+ \"Pila en la iteracion numero \"+cont+\"\\n\"\n" +
                "                     + \"|---X---|---Y---|--mcd--|\\n\"\n" +
                "                     + \"   \"+j.pop()+\"      \"+k.pop()+\"       \"+l.pop()+\"   \\n\"\n" +
                "                     + \"|-------|-------|-------|\\n\"\n" +
                "                     + \"\";\n" +
                "            }\n" +
                "            //se agregan saltos para poder diferenciar las pilas al momento de imprimirlas.\n" +
                "            text =text+\"\\n\\n\";\n" +
                "            \n" +
                "       // se iguala el texto a si mismo para conservar lo que ya hay en el y agregar los datos nuevos \n" +
                "      // text =\n" +
                "        //          \"|---X---|---Y---|--mcd--|\\n\"\n" +
                "          //       + \"   \"+x+\"      \"+y+\"       \"+mcd+\"   \\n\"\n" +
                "            //     + \"|-------|-------|-------|\\n\"\n" +
                "              //   + \"\"\n" +
                "              // + text;\n" +
                "        //se aumenta el contador en una unidad para saber el numero de iteraciones necesitadas.\n" +
                "        cont++;\n" +
                "        return text;\n" +
                "    }\n" +
                "    \n" +
                "    /**\n" +
                "     *Metodo que imprime como se va liberando la memoria en pilas segun se vaya vaciendo al momento\n" +
                "     * de la recursividad del metodo de algoritmo. El null representa el valor del MCD en dicha parte de la memoria.\n" +
                "     * @return\n" +
                "     */\n" +
                "    public String imprimirVaciado(){\n" +
                "        Stack j,k,l;\n" +
                "        //se hace un clon de las pilas que creamos para poder ir llenando el texto segun estas.\n" +
                "        j=(Stack)pilax.clone();\n" +
                "        k=(Stack)pilay.clone();\n" +
                "        l=(Stack)pilamcd.clone();\n" +
                "            \n" +
                "        //mientras se va llenando el String se van vaciando los clones de las pilas y se deja llenar\n" +
                "        //dicho string cuando estas esten vacias.\n" +
                "            while(l.empty()!=true&&k.empty()!=true&&j.empty()!=true){\n" +
                "                text2 = text2\n" +
                "                     //+ \"Pila en la iteracion numero \"+cont+\"\\n\"\n" +
                "                     + \"|---X---|---Y---|--mcd--|\\n\"\n" +
                "                     + \"   \"+j.pop()+\"      \"+k.pop()+\"       \"+l.pop()+\"   \\n\"\n" +
                "                     + \"|-------|-------|-------|\\n\"\n" +
                "                     + \"\";\n" +
                "            }\n" +
                "            //se agregan saltos para poder diferenciar las pilas al momento de imprimirlas.\n" +
                "            text2 =text2+\"\\n\\n\";\n" +
                "            \n" +
                "            //se hace una validacion para asegurarse de que las pilas originales no estan vacias.\n" +
                "            if(pilax.empty()!=true&&pilay.empty()!=true&&pilamcd.empty()!=true){\n" +
                "                //se quita el ultimo elemento de las pilas\n" +
                "                pilax.pop();\n" +
                "                pilay.pop();\n" +
                "                pilamcd.push(pilamcd.pop());\n" +
                "                //se vuelve a llamar a si mismo el metodo para poder ir rellenando el String que se imprimira.\n" +
                "                imprimirVaciado();\n" +
                "            }\n" +
                "        return text2;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     *Metodo que regresa el String de cuando se llena la pila de la memoria.\n" +
                "     * @return\n" +
                "     */\n" +
                "    public String getText() {\n" +
                "        return text;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     *Metodo que devuelve la pila que va guardando los valores de la x.\n" +
                "     * @return\n" +
                "     */\n" +
                "    public Stack getPilax() {\n" +
                "        return pilax;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     *Metodo que devuelve la pila que va guardando los valores de la y.\n" +
                "     * @return\n" +
                "     */\n" +
                "    public Stack getPilay() {\n" +
                "        return pilay;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     *Metodo que regresa el String de cuando se vacia la pila de la memoria.\n" +
                "     * @return\n" +
                "     */\n" +
                "    public String getText2() {\n" +
                "        return text2;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     *Metodo que devuelve la pila que va guardando los valores del MCD.\n" +
                "     * @return\n" +
                "     */\n" +
                "    public Stack getPilamcd() {\n" +
                "        return pilamcd;\n" +
                "    }\n" +
                "\n" +
                "    public static String getCodigo() {\n" +
                "        return null;\n" +
                "    }\n" +
                "\n" +
                "    \n" +
                "    \n" +
                "    /**\n" +
                "     *\n" +
                "     * @param args\n" +
                "     */\n" +
                "    public static void main(String[] args) {\n" +
                "        //editar esto:\n" +
                "        int x = 116;\n" +
                "        int y = 108;\n" +
                "        //editar hasta aqui\n" +
                "        Euclides lol = new Euclides(x, y);\n" +
                "        lol.algoritmo();\n" +
                "        System.out.println(\"\\nLlenado\\n\");\n" +
                "        System.out.println(lol.getText());\n" +
                "        //System.out.println(\"El maximo comun divisor de \"+x+\" y \"+y+\" es: \"+lol.algoritmo(x, y));\n" +
                "        System.out.println(\"\\nVaciado\\n\");\n" +
                "        System.out.println(lol.imprimirVaciado());\n" +
                "        \n" +
                "        //System.out.println(lol.getCodigo());\n" +
                "    }\n" +
                "    \n" +
                "}\n";
    }

    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //editar esto:
        int x = 116;
        int y = 108;
        //editar hasta aqui
        Euclides lol = new Euclides(x, y);
        lol.algoritmo();
        System.out.println("\nLlenado\n");
        System.out.println(lol.getText());
        //System.out.println("El maximo comun divisor de "+x+" y "+y+" es: "+lol.algoritmo(x, y));
        System.out.println("\nVaciado\n");
        System.out.println(lol.imprimirVaciado());
        
        //System.out.println(lol.getCodigo());
    }
    
}
