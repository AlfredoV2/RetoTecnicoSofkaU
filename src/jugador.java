public class jugador {
    private String nombre;
    private int score;

    public jugador(){

    }

    public jugador(String nombre, int score){
        this.nombre = nombre;
        this.score=score;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String retirada(){
        return ( "\n\n¡Te has retirado! \n\n " + "Felicidades " + nombre + " ganaste " + score + " puntos.");
    }


    
}
