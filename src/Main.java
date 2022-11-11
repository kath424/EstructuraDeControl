public class Main {
    public static void main(String[] args) {

        //if
        int numeroIf = -2;
        if(numeroIf > 0  ){
            System.out.println("El numero es positivo");
        }else if (numeroIf == 0){
            System.out.println("El numero es cero");
        }else{
            System.out.println("El numero es negativo");
        }

        //while
        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("Esta es la ejecucion " + numeroWhile);
        }

        //do While
        int numeroDoWhile = 0;

        do{
            System.out.println("Esta es una ejecucion");
        } while(numeroDoWhile != 0);

        //for
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Ejecucion del for " + numeroFor);
        }

        //Switch
        String estacion = "primavera";
        switch (estacion){
            case "primavera":
                System.out.println("La estacion es Primavera");
                break;
            case "otonio":
                System.out.println("La estacion es Otonio");
                break;
            case "invierno":
                System.out.println("La estacion es invierno ");
                break;
            case "verano":
                System.out.println("La estacion es verano ");
                break;
            default: System.out.println("No es una estacion ");
        }
    }
}