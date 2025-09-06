public class Evento {
    private String ubicación;
    private int año;

    public Evento(String ubicación, int año) {
        this.ubicación = ubicación;
        this.año = año;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void pasaEsteAño(int año){
        if (año==this.getAño()){
            System.out.println("El evento es este año");
        }else {
            System.out.println("El evento no pasa este año");
        }
    }
}
