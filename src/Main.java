import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int numero = pedirNumero("Ingresa el número de valores enteros que quieres");
        int numeroMenor = pedirVariosNumeros(numero);
        System.out.println("El número" + " " + numeroMenor + " " + "es" + " " + (numeroMenor < 10 ? "menor de diez" : "menor de diez"));

    }

    public static int pedirNumero(String msj){
        boolean salir = false;
        int numero = 0;
        do{
            try{
                System.out.println(msj);
                numero = scan.nextInt();
                if (numero < 0) throw new IllegalArgumentException("Error");
                salir = true;
            }catch (IllegalArgumentException e){
                System.out.println("El número debe ser positivo");
            }
        }while (!salir);
        return numero;
    }

    public static int pedirVariosNumeros(int numeroVeces){
        int numeroMenor = pedirNumero("Ingresa el 1 número");
        for (int i = 2; i < numeroVeces + 1; i++){
            int numeroTemp = pedirNumero("Ingresa el" + " " + i + " " + "número");
            numeroMenor = comprobarNumeroMenor(numeroTemp, numeroMenor);
        }
        return numeroMenor;
    }

    public static int comprobarNumeroMenor(int numeroTemp, int numeroMenor){
        return Math.min(numeroMenor, numeroTemp);
    }


}