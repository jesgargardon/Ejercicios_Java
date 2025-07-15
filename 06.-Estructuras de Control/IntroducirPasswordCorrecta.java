import java.util.Scanner;
public class IntroducirPasswordCorrecta {
    public static void main(String args[]) {
        int key=233;
        final int maxNumIntentos = 3;
        int intentos=0;
        boolean introduccionCorrecta = false;
        int contraseña;

        Scanner sc1= new Scanner(System.in);

        do {
            System.out.println("Por favor, introduce tu contraseña (0-999)");
            contraseña = sc1.nextInt();
            if (contraseña==key){
                System.out.println("acceso autorizado");
                introduccionCorrecta=true;
            }else {
                System.out.println("contraseña incorrecta");
                intentos++;
            }

        }while (!introduccionCorrecta && intentos<maxNumIntentos);
        if (intentos>=maxNumIntentos){
            System.out.println("Ha excedido el número de intentos permitidos");
        }
        sc1.close();
    }

}
