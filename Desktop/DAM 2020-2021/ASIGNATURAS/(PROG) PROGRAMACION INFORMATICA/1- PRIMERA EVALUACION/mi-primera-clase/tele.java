public class tele {

    private String due�o;
    private int numeroCanales;
    private boolean teleConectada;

    public tele(String due�oDe, int numeroCanalesDe) {
        due�o = due�oDe;
        numeroCanales = numeroCanalesDe;
        teleConectada = true;

    } 

    public String getDue�o() {
        return due�o;
    }
    
    public int getNumeroCanales() {
        return numeroCanales; 
    }

    public boolean getTeleConectada() {
        return teleConectada;
    }

    public void setDue�o(String due�oDe) {
        due�o = due�oDe;
    
    }

    public void numeroCanalesA�adidos(int numeroCanalesA�adir){
        numeroCanales = numeroCanales + numeroCanalesA�adir;
    }
    
    
    public void encenderTele(boolean teleConectadaDe){
        teleConectada = teleConectadaDe;
    }
    
    public void imprimirDetalles(){
        System. out. println("el due�o de la tele es ");
        System. out. println(due�o);
        System. out. println("la television tiene un total de  ");
        System. out. println(numeroCanales + "canales");
        System. out. println("la tele esta encendida :" + teleConectada);
    }
    
}
