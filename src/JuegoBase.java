import java.util.Scanner;
public class JuegoBase {
    public static void main(String[] args){
     //crear pokemons
    Pokemon pokemon1 =new Pokemon("garchomp", "tierra", "dragon", 239);
    Pokemon pokemon2 =new Pokemon("Lycanroc", "roca","", 198);
    Pokemon pokemon3 =new Pokemon("Golisopod", "bicho","agua", 181);
    Pokemon pokemon4 =new Pokemon("Raichu_alola", "electrico","psiquico", 155);
    Pokemon pokemon5 =new Pokemon("Kommo-o", "dragon","lucha", 181);
    Pokemon pokemon6 =new Pokemon("Lucario", "lucha","acero", 172);
     //interfaz del juego
    System.out.println("=====================\nBienvenido\n=====================");
    System.out.println("Estos son los pokemons disponibles");
    System.out.println("(1)"+ pokemon1.getName() +" tipo " + pokemon1.getType1() + " " + pokemon1.getType2());
    System.out.println("(2)"+ pokemon2.getName() +" tipo " + pokemon2.getType1() + " " + pokemon2.getType2());
    System.out.println("(3)"+ pokemon3.getName() +" tipo " + pokemon3.getType1() + " " + pokemon3.getType2());
    System.out.println("(4)"+ pokemon4.getName() +" tipo " + pokemon4.getType1() + " " + pokemon4.getType2());
    System.out.println("(5)"+ pokemon5.getName() +" tipo " + pokemon5.getType1() + " " + pokemon5.getType2());
    System.out.println("(6)"+ pokemon6.getName() +" tipo " + pokemon6.getType1() + " " + pokemon6.getType2());
    System.out.println("eliga 3 pokemons para pelear");
    //pedimos que introduzca los numero de uno en uno de los 3 pokemons que quiere utilizar
    Scanner eleguirPokemons = new Scanner(System.in);
    System.out.println("introduzca el numero de su 1º pokemon");
    int nuPokemon1 = eleguirPokemons.nextInt();
    System.out.println("introduzca el numero de su 2º pokemon");
    int nuPokemon2 = eleguirPokemons.nextInt();
    System.out.println("introduzca el numero de su 3º pokemon");
    int nuPokemon3 = eleguirPokemons.nextInt();
    //relacionar los numeros con el pokemon elegido
    String nomPokemon1="";
    String nomPokemon2="";
    String nomPokemon3="";
    switch (nuPokemon1) {
        case 1:
            nomPokemon1=pokemon1.getName();
            break;
             case 2:
            nomPokemon1=pokemon2.getName();
            break;
             case 3:
            nomPokemon1=pokemon3.getName();
            break;
             case 4:
            nomPokemon1=pokemon4.getName();
            break;
             case 5:
            nomPokemon1=pokemon5.getName();
            break;
             case 6:
            nomPokemon1=pokemon6.getName();
            break;
   
        default:
            break;
    }
    switch (nuPokemon2) {
        case 1:
            nomPokemon2=pokemon1.getName();
            break;
             case 2:
            nomPokemon2=pokemon2.getName();
            break;
             case 3:
            nomPokemon2=pokemon3.getName();
            break;
             case 4:
            nomPokemon2=pokemon4.getName();
            break;
             case 5:
            nomPokemon2=pokemon5.getName();
            break;
             case 6:
            nomPokemon2=pokemon6.getName();
            break;
    
        default:
            break;
    }
    switch (nuPokemon3) {
        case 1:
            nomPokemon3=pokemon1.getName();
            break;
             case 2:
            nomPokemon3=pokemon2.getName();
            break;
             case 3:
            nomPokemon3=pokemon3.getName();
            break;
             case 4:
            nomPokemon3=pokemon4.getName();
            break;
             case 5:
            nomPokemon3=pokemon5.getName();
            break;
             case 6:
            nomPokemon3=pokemon6.getName();
            break;
    
        default:
            break;
    }
    System.out.println("¡Perfecto! Tu equipo está compuesto por: " + nomPokemon1 + ", " + nomPokemon2 + " y " + nomPokemon3 + ".");
    System.out.println("Preparando combate...");
}  
}
