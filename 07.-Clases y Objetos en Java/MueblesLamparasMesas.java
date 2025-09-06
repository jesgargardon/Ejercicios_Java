public class MueblesLamparasMesas {
    public static void main(String[] args) {
        Mesas mesa1 = new Mesas(4,100,100);
        Lamparas lampara1 = new Lamparas(9,20,25);
        int costeTotal = mesa1.getPrecio()+mesa1.extraCoste()+lampara1.getPrecio()+lampara1.extracoste();
        System.out.println("el coste total es: "+costeTotal);
    }
    
}