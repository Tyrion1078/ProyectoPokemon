public class Ataque {
    //constructorV
    String name;
    String type;
    int potencia;
    int ppMax;
    int ppActual;
    //constructorP
    public Ataque (String name, String type, int potencia, int ppMax){
        this.name=name;
        this.type=type;
        this.potencia=potencia;
        this.ppMax=ppMax;
        this.ppActual=ppMax;  
    }
    //getters y setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getPpMax() {
        return ppMax;
    }
    public void setPpMax(int ppMax) {
        this.ppMax = ppMax;
    }
    public int getPpActual() {
        return ppActual;
    }
    public void setPpActual(int ppActual) {
        this.ppActual = ppActual;
    }

}
