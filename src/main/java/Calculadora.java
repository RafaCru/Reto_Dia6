import com.beust.jcommander.internal.Nullable;

import java.util.*;


//  El reto de hoy consiste en lo siguiente:
//        - Lenguaje: Java o Python
//        - IDE recomendado: IntelliJ (Java) o PyCharm (Python)
//        - Nivel: Inicial
//        - Enunciado: El objetivo es crear una calculadora de texto. Le podrás dar instrucciones del siguiente estilo:
//        - suma dos y dos
//        - multiplica tres y cuatro
//        - resta seis y tres
//        - divide seis y dos (la división siempre dará un resultado entero)
//        El resultado será también en texto. Los números que recibirá irán del cero al nueve.
//        - Ampliación: Añade una operación extra después de la primera operación. Ejemplo:
//        - suma dos y dos y multiplícalo por seis
//        - multiplica tres y cuatro y súmale dos
//        - Consideraciones: si no se reconoce un número o una operación, se debe lanzar una excepción (una diferente en cada caso). (editado)
//
//


public class Calculadora {

    public static void main(String[] args) {

        System.out.println(
                "calculadora de texto. Le podrás dar instrucciones del siguiente estilo:      \n " +
                        "- suma dos y dos  \n " +
                        "- multiplica tres y cuatro \n" +
                        "- resta seis y tres \n" +
                        "- divide seis y dos \n" +
                        " Los números permitidos son del cero al nueve. \n" +
                        " Usa una operación extra después de la primera operación. \n" +
                        " Ejemplo: \n" +
                        "- suma dos y dos y multiplícalo por seis \n" +
                        "- multiplica tres y cuatro y súmale dos \n" );

        List<String> cadena = new ArrayList<>();

        Scanner sc= new Scanner(System.in);

        String operador=sc.nextLine();

        StringTokenizer tokens=new StringTokenizer(operador);

        while(tokens.hasMoreTokens()){
            cadena.add(tokens.nextToken());

        }
try {
        if (cadena.size()<=4){

            System.out.println("El resultado es: "+resultado(calcula(cadena.get(0),devuelvevalor(cadena.get(1)), devuelvevalor(cadena.get(3)))));
        }else{
            if (cadena.size()<=7){
                int parcial=calcula(cadena.get(0),devuelvevalor(cadena.get(1)), devuelvevalor(cadena.get(3)));
                System.out.println("El resultado es: "+resultado(calcula(cadena.get(5),parcial, devuelvevalor(cadena.get(6)))));

            }else{
                int parcial=calcula(cadena.get(0),devuelvevalor(cadena.get(1)), devuelvevalor(cadena.get(3)));
                System.out.println("El resultado es: "+ resultado(calcula(cadena.get(5),parcial, devuelvevalor(cadena.get(7)))));

            }
        }

} catch (Exception e) {
    System.out.println("Error formato no es adecuado o valores fuera de rango");
}

    }

    private static int devuelvevalor (String num){

        switch (num) {
            case "cero":
                return 0;
            case "uno":
                return 1;
            case "dos":
                return 2;
            case "tres":
                return 3;
            case "cuatro":
                return 4;
            case "cinco":
                return 5;
            case "seis":
                return 6;
            case "siete":
                return 7;
            case "ocho":
                return 8;
            case "nueve":
                return 9;

            default:
                System.out.println("Vuelve a intentarlo recuerda usar el formato indicado");

        }
        return 0;
    }
    private static String resultado (int num){

        switch (num) {
            case 0:
                return "cero";
            case 1:
                return "uno";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 10:
                return "diez";
            case 11:
                return "once";
            case 12:
                return "doce";
            case 13:
                return "trece";
            case 14:
                return "catorce";
            case 15:
                return "quince";
            case 16:
                return "dieciseis";
            case 17:
                return "diecisiete";
            case 18:
                return "dieciocho";
            case 19:
                return "diecinueve";
            default:
                System.out.println("Vuelve a intentarlo recuerda usar el formato indicado");

        }
        return "Fuera de rango";
    }


    private static int calcula (String operador,int a, int b) {

        switch (operador){
            case "suma":
                return a+b;

            case "resta":
                return a-b;

            case "multiplica":
               return a*b;


            case "divide":
                return a/b;

            case "súmale":
                return a+b;

            case "restale":
                return a-b;

            case "multiplícalo":
                return a*b;

            case "dividelo":
                return a/b;

            default:
                System.out.println("Vuelve a intentarlo recuerda usar el formato indicado");

        }

    return 0;
    }

    }









