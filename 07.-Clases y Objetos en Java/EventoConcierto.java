public class EventoConcierto {
    public static void main(String[] args) {
        boolean aforoCompleto;

        Concierto rolling = new Concierto(90,"Rolling Stones","Madrid",2022);
        rolling.pasaEsteAño(2025);
        aforoCompleto = rolling.lleno();
        if (aforoCompleto){
            System.out.println("Aforo completo");
        }else{
            System.out.println("Quedan entradas para el concierto");
        }
    }
}