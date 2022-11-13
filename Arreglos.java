import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arreglos{
    public static void main(String[] args) {
        
        String completar[] = new String[5];
        Scanner ingreso = new Scanner(System.in);
        for(int i= 0;i<completar.length;i++)
        {
            System.out.println("Ingrese un valor");
            String num = ingreso.nextLine(); 
            completar[i]= num;
        }
        for(int i=0;i<completar.length; i++){
            System.out.println("["+i+"] = "+completar[i]);
        }
    }
}