public class ListaAtaques {
    //estos seran las cajas donde guardaremos 6 ataques
    //que solo podra aprender cada pokemon
    Ataque [][] learnsets;
    public ListaAtaques(){
        this.learnsets=new Ataque[6][6];
    //creamos una lista de movimientos genericos que luego asignaremos
    Ataque GarraDragon = new Ataque("Garra Dragon", "Dragon", 80, 15); //garchop y komo-o
    Ataque RocasAfilada = new Ataque("Roca Afilada", "Roca", 100, 5); //lycanroc
    Ataque AcuaJet =new Ataque("Acua Jet", "Agua", 40, 20);//golisopod
    Ataque Rayo = new Ataque("Rayo", "Electrico", 90, 15);//raichu alola
    Ataque ABocajarro = new Ataque("A Bocajarro", "Lucha", 120, 5);//komo-o
    Ataque EsferaAural = new Ataque("Esfera Aural", "Lucha", 80, 20);//lucario
    Ataque Placaje = new Ataque("Plaje", "Normal", 40, 35);//todos
    Ataque Rapidez = new Ataque("Rapidez", "Normal", 60, 20);//todos
    Ataque Arremetida = new Ataque("Arremetida", "Normal", 50, 25);//todos
    Ataque Mordisco = new Ataque("Mordisco", "Siniestro", 60, 25); //todos
    Ataque GolpeCabeza = new Ataque("Golpe Cabeza", "Normal", 70, 15);//todos
    Ataque CorteFuria = new Ataque("Corte Furia", "Bicho", 40, 20); // Golisopod, Lucario, Garchomp
    Ataque OndaVacio = new Ataque("Onda Vacio", "Lucha", 40, 30); // Prioridad para Lucario/Kommo-o
    Ataque Psiquico = new Ataque("Psiquico", "Psiquico", 90, 10);//raichu alola

    //asignamos los ataques a cada set de movimientos validos de cada pokemon
    //garchop
    this.learnsets[0][0]=GarraDragon;
    this.learnsets[0][1]=CorteFuria;
    this.learnsets[0][2]=Placaje;
    this.learnsets[0][3]=Mordisco;
    this.learnsets[0][4]=Arremetida;
    this.learnsets[0][5]=GolpeCabeza;
    //licanroc
    this.learnsets[1][0]=RocasAfilada;
    this.learnsets[1][1]=Placaje;
    this.learnsets[1][2]=Arremetida;
    this.learnsets[1][3]=Mordisco;
    this.learnsets[1][4]=GolpeCabeza;
    this.learnsets[1][5]=ABocajarro;
    //golisopod
    this.learnsets[2][0]=AcuaJet;
    this.learnsets[2][1]=CorteFuria;
    this.learnsets[2][2]=Placaje;
    this.learnsets[2][3]=Rapidez;
    this.learnsets[2][4]=Arremetida;
    this.learnsets[2][5]=GolpeCabeza;
    //raichu de alola
    this.learnsets[3][0]=Rayo;
    this.learnsets[3][1]=Psiquico;
    this.learnsets[3][2]=Rapidez;
    this.learnsets[3][3]=Placaje;
    this.learnsets[3][4]=Mordisco;
    this.learnsets[3][5]=Arremetida;
    //komo-o
    this.learnsets[4][0]=ABocajarro;
    this.learnsets[4][1]=OndaVacio;
    this.learnsets[4][2]=Placaje;
    this.learnsets[4][3]=Mordisco;
    this.learnsets[4][4]=Arremetida;
    this.learnsets[4][5]=Rapidez;   
    //lucario
    this.learnsets[5][0]=EsferaAural;
    this.learnsets[5][1]=OndaVacio;
    this.learnsets[5][2]=Placaje;
    this.learnsets[5][3]=Mordisco;
    this.learnsets[5][4]=ABocajarro;
    this.learnsets[5][5]=Rapidez;
    }
  //getters y setters
public Ataque[][] getLearnsets(){
    return learnsets;
}
}
