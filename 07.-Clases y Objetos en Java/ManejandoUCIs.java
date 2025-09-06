import java.util.Scanner;

public class ManejandoUCIs {

    public static void main(String[] args) {
        UCI ucis[] = new UCI[5];
        ucis[0]=new UCI ("Juan","",1,1,true);
        ucis[1]=new UCI ("Juan","Luis",3,1,false);
        ucis[2]=new UCI ("Pedro","",4,2,true);
        ucis[3]=new UCI ("Pedro","Jimena",5,2,false);
        ucis[4]=new UCI ("Pedro","",6,2,true);
        
        estadoUCIs (ucis);
        
        System.out.println("---Nombre del nuevo paciente?????");
        
        Scanner sc1= new Scanner (System.in);
        String pacienteIngresar = sc1.nextLine();
        
        int indice = indiceUciLibre(ucis);
        
        if (indice !=-1){
            ucis[indice].setPaciente(pacienteIngresar);
            ucis[indice].setLibre(false);
            estadoUCIs (ucis);
        }else{
            System.out.println("Lo lamentamos, no hay UCIs libres");
        }
    }
    private static void estadoUCIs(UCI[] u){
        System.out.println("-----Estado actual de las UCIs--------");
        for (int i=0;i<u.length;i++){
            System.out.print("UCI "+(i+1)+" :");
            u[i].dibujarDatos();
        }
    }
    private static int indiceUciLibre(UCI[] u){
        for (int i=0;i<u.length;i++){
            if (u[i].isLibre()){
                return i;
            }
        }
        return -1;
    }
}
