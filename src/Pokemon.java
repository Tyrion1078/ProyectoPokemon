//constructorV
public class Pokemon {
    String name;
    String type;
    int hpMax;
    int hpActual;
    //constructorP
    public Pokemon(String name, String type, int hpMax) {
        this.name=name;
        this.type=type;
        this.hpMax=hpMax;
        this.hpActual=hpMax;  
    }
    //metodo para que el pokemon pueda recibir daño
    public void recibirDano(int cantidadDano){
        hpActual = hpActual - cantidadDano;
        if ( this.hpActual <0){
            hpActual=0;
        }
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
    public int getHpMax() {
        return hpMax;
    }
    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }
    public int getHpActual() {
        return hpActual;
    }
    public void setHpActual(int hpActual) {
        this.hpActual = hpActual;
    }
}

