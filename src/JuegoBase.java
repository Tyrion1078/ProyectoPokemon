public class JuegoBase {
    public static void main(String[] args){
     //crear pokemons
    Pokemon pokemon1 =new Pokemon("garchomp", "tierra", "dragon", 239);
    Pokemon pokemon2 =new Pokemon("Lycanroc", "roca","", 198);
    Pokemon pokemon3 =new Pokemon("Golisopod", "bicho","agua", 181);
    Pokemon pokemon4 =new Pokemon("Raichu_alola", "electrico","psiquico", 155);
    Pokemon pokemon5 =new Pokemon("Kommo-o", "dragon","lucha", 181);
    Pokemon pokemon6 =new Pokemon("Lucario", "lucha","hacero", 172);
     //interfaz del juego
    System.out.println("=====================\nBienvenido\n=====================");
    System.out.println("Estos son los pokemons disponibles");
    System.out.println("(1)"+ pokemon1.getName() +" tipo " + pokemon1.getType1() + " " + pokemon1.getType2());
    System.out.println("(2)"+ pokemon2.getName() +" tipo " + pokemon2.getType1() + " " + pokemon2.getType2());
    System.out.println("(3)"+ pokemon3.getName() +" tipo " + pokemon3.getType1() + " " + pokemon3.getType2());
    System.out.println("(4)"+ pokemon4.getName() +" tipo " + pokemon4.getType1() + " " + pokemon4.getType2());
    System.out.println("(5)"+ pokemon5.getName() +" tipo " + pokemon5.getType1() + " " + pokemon5.getType2());
    System.out.println("(6)"+ pokemon6.getName() +" tipo " + pokemon6.getType1() + " " + pokemon6.getType2());
}  
}
