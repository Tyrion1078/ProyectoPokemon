public class ListaAtaques {
    //estos seran las cajas donde guardaremos 6 ataques
    //que solo podra aprender cada pokemon
        Ataque[] AtaquesGarchop;
        Ataque[] AtaquesLycanroc;
        Ataque[] AtaquesGolisopod;
        Ataque[] AtaquesRaichu_alola;
        Ataque[] AtaquesKommo_o;
        Ataque[] AtaquesLucario;
    public ListaAtaques(){
        this.AtaquesGarchop=new Ataque[6];
        this.AtaquesLycanroc=new Ataque[6];
        this.AtaquesGolisopod=new Ataque[6];
        this.AtaquesRaichu_alola=new Ataque[6];
        this.AtaquesKommo_o=new Ataque[6];
        this.AtaquesLucario=new Ataque[6];
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
    this.AtaquesGarchop[0]=GarraDragon;
    this.AtaquesGarchop[1]=CorteFuria;
    this.AtaquesGarchop[2]=Placaje;
    this.AtaquesGarchop[3]=Mordisco;
    this.AtaquesGarchop[4]=Arremetida;
    this.AtaquesGarchop[5]=GolpeCabeza;
    //licanroc
    this.AtaquesLycanroc[0]=RocasAfilada;
    this.AtaquesLycanroc[1]=Placaje;
    this.AtaquesLycanroc[2]=Arremetida;
    this.AtaquesLycanroc[3]=Mordisco;
    this.AtaquesLycanroc[4]=GolpeCabeza;
    this.AtaquesLycanroc[5]=ABocajarro;
    //golisopod
    this.AtaquesGolisopod[0]=AcuaJet;
    this.AtaquesGolisopod[1]=CorteFuria;
    this.AtaquesGolisopod[2]=Placaje;
    this.AtaquesGolisopod[3]=Rapidez;
    this.AtaquesGolisopod[4]=Arremetida;
    this.AtaquesGolisopod[5]=GolpeCabeza;
    //raichu de alola
    this.AtaquesRaichu_alola[0]=Rayo;
    this.AtaquesRaichu_alola[1]=Psiquico;
    this.AtaquesRaichu_alola[2]=Rapidez;
    this.AtaquesRaichu_alola[3]=Placaje;
    this.AtaquesRaichu_alola[4]=Mordisco;
    this.AtaquesRaichu_alola[5]=Arremetida;
    //komo-o
    this.AtaquesKommo_o[0]=ABocajarro;
    this.AtaquesKommo_o[1]=OndaVacio;
    this.AtaquesKommo_o[2]=Placaje;
    this.AtaquesKommo_o[3]=Mordisco;
    this.AtaquesKommo_o[4]=Arremetida;
    this.AtaquesKommo_o[5]=Rapidez;   
    //lucario
    this.AtaquesLucario[0]=EsferaAural;
    this.AtaquesLucario[1]=OndaVacio;
    this.AtaquesLucario[2]=Placaje;
    this.AtaquesLucario[3]=Mordisco;
    this.AtaquesLucario[4]=ABocajarro;
    this.AtaquesLucario[5]=Rapidez;
    }
  //getters y setters
    public Ataque[] getAtaquesGarchop() {
        return AtaquesGarchop;
    }
    public Ataque[] getAtaquesLycanroc() {
        return AtaquesLycanroc;
    }
    public Ataque[] getAtaquesGolisopod() {
        return AtaquesGolisopod;
    }
     public Ataque[] getAtaquesRaichu_alola() {
        return AtaquesRaichu_alola;
    }
      public Ataque[] getAtaquesKommo_o() {
        return AtaquesKommo_o;
    }
       public Ataque[] getAtaquesLucario() {
        return AtaquesLucario;
    }

}
