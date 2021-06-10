import java.util.*;
public class pseudocodigoEjercicio11{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        Random r = new Random();
        int contadorSegundaDecena = 0;
        int contadorNumerosImpares = 0;
        int contadorPromedio = 0;
        int promedioAuxiliar = 0;
        int cantidadIteraciones = 1;
        int numeroMod = 0;
        int numeroMayor = 0;
        int numeroAux = 0;
        System.out.println("Generando Numeros Aleatorios");
        while(cantidadIteraciones <= 10)
        {
            int alNumero = r.nextInt(36);
            System.out.println("El numero generado fue: "+alNumero);
            numeroMod = (alNumero % 2);
            numeroAux = (alNumero/2);
            if((numeroMod == 0) && (alNumero != 0)){
                promedioAuxiliar = (promedioAuxiliar+alNumero);
                contadorPromedio = (contadorPromedio+1);
            }
            if((numeroAux != 0) && (numeroMod != 0)){
                contadorNumerosImpares = (contadorNumerosImpares+1);
            }
            if((alNumero >= 13) && (alNumero <= 24)){
                contadorSegundaDecena = (contadorSegundaDecena+1);
            }
            if(alNumero > numeroMayor){
                numeroMayor = alNumero;
            }
            cantidadIteraciones++;
        }
        int promedioRealPares = (promedioAuxiliar/contadorPromedio);
        System.out.println("La cantidad de numeros impares fue: "+contadorNumerosImpares);
        System.out.println("El promedio de los numeros pares sin contar los ceros fue: "+promedioRealPares);
        System.out.println("La cantidad de numeros que se encuentran entre la 2 decena (13-24) fue: "+contadorSegundaDecena);
        System.out.println("El numero mas grande generado fue: "+numeroMayor);
        sn.close();
    }
}