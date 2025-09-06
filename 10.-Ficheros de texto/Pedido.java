public class Pedido {
    private String comprador;
    private String direccion;
    private String marca;
    private int precio;

    public Pedido(String comprador, String direccion, String marca, int precio) {
        this.comprador = comprador;
        this.direccion = direccion;
        this.marca = marca;
        this.precio = precio;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void dat(){
        System.out.println("Comprador: "+this.comprador+" -- Direccion: "+this.direccion+" -- Marca: "+this.marca+ " --precio: "+this.precio);
    }
}
