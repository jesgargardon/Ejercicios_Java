
import java.util.Scanner;
public class IntroducirNuevaContraseña {

    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);

        String nuevaContraseña;
        boolean contraseñaSegura = false;
        do{
            System.out.println("Por favor, introduce una nueva contraseña");
            System.out.println("La contraseña debe tener mas de 7 caracteres");
            nuevaContraseña= sc1.nextLine();
            if (nuevaContraseña.length()>7){
                contraseñaSegura = true;
            }
        }while(!contraseñaSegura);
        
        String segundaContraseña;
        boolean igual= false;
        int intentos = 0;
        do{
            System.out.println("Por favor, introduzca de nuevo la nueva contraseña");
            segundaContraseña= sc1.nextLine();intentos++;
            if (segundaContraseña.equals(nuevaContraseña)){
                igual = true;
                System.out.println("Su contraseña se ha cambiado con éxito");
            }else {
                System.out.println ("La segunda contraseña introducida es diferente a la primera");
            }
        }while(!igual && intentos<3);
        if (intentos==3){
            System.out.println("Lo sentimos, ha superado el número de intentos para cambiar la contraseña. Inténtelo de nuevo después de 5 minutos");
        }
    }
}
