public class Concierto extends Evento{
    private int aforo;
    private String cantante;

    public Concierto(int aforo, String cantante, String ubicación, int año) {
        super(ubicación, año);
        this.aforo = aforo;
        this.cantante = cantante;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public boolean lleno(){
        boolean lleno=false;
        if(this.getAforo()>=100){
            lleno=true;
        }
        return lleno;
    }
}
