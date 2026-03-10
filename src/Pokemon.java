//constructorV
public class Pokemon {
    String name;
    String type1;
    String type2;
    int hpMax;
    int hpActual;
    Ataque[] misAtaques;
    //constructorP
    public Pokemon(String name, String type1,String type2, int hpMax) {
        this.name=name;
        this.type1=type1;
        this.type2=type2;
        this.hpMax=hpMax;
        this.hpActual=hpMax;  
        this.misAtaques=new Ataque[4];
    }
    //metodo para que el pokemon pueda recibir daño
    public void recibirDano(int cantidadDano){
        hpActual = hpActual - cantidadDano;
        if ( this.hpActual <0){
            hpActual=0;
        }
        
    }   
    //metodo para que los pokemon puedan aprenden ataques
    public void aprenderAtaque(Ataque nuevoAtaque, int posicionAtaque ){
            this.misAtaques[posicionAtaque]=nuevoAtaque;
        }
    //getters y setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType1() {
        return type1;
    }
    public void setType1(String type) {
        this.type1 = type;
    }
    public String getType2() {
        return type2;
    }
    public void setType2(String type2) {
        this.type2 = type2;
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

