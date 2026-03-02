public class ListaPokemons {
    //la caja donde guardaremos a todos los pokemons
    Pokemon[] catalogo;
    public ListaPokemons(){
        this.catalogo=new Pokemon[6];
     //crear pokemons
        Pokemon pokemon1 =new Pokemon("garchomp", "tierra", "dragon", 239);
        Pokemon pokemon2 =new Pokemon("Lycanroc", "roca","", 198);
        Pokemon pokemon3 =new Pokemon("Golisopod", "bicho","agua", 181);
        Pokemon pokemon4 =new Pokemon("Raichu_alola", "electrico","psiquico", 155);
        Pokemon pokemon5 =new Pokemon("Kommo-o", "dragon","lucha", 181);
        Pokemon pokemon6 =new Pokemon("Lucario", "lucha","acero", 172);
    //guardamos cada pokemon en un hueco del array
            this.catalogo[0]=pokemon1;
            this.catalogo[1]=pokemon2;
            this.catalogo[2]=pokemon3;
            this.catalogo[3]=pokemon4;
            this.catalogo[4]=pokemon5;
            this.catalogo[5]=pokemon6;
    }
    //getters y setters
    public Pokemon[] getCatalogo() {
        return catalogo;
}
}
