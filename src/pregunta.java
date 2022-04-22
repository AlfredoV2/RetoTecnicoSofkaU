public class pregunta {
    private String enunciado;
    private String respuesta;
    private String nivel;

    public pregunta(){

    }

    public pregunta(String enunciado, String respuesta, String nivel){
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.nivel = nivel;
    
    }


    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getenunciado(){
        return enunciado;
    }


    public boolean test(String respuestaJ1) {

        if(respuestaJ1.equalsIgnoreCase(respuesta)){
            return  true;
        }else {
            return false;
        }
    } 

    


    
}
