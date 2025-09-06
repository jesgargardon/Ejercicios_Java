public class LaClasePunto {
        private int x;
        private int y;
        public LaClasePunto(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public double calcularDistancia(Punto otroPunto) {
            int dx = this.x - otroPunto.x;
            int dy = this.y - otroPunto.y;
            return Math.sqrt(dx*dx + dy*dy);
        }
        public void mover(int desplazamientoX, int desplazamientoY) {
            this.x += desplazamientoX;
            this.y += desplazamientoY;
        }
        public int getX() {
            return x;
        }
        public void setX(int x) {
            this.x = x;
        }
        public int getY() {
            return y;
        }
        public void setY(int y) {
            this.y = y;
        }
    }
