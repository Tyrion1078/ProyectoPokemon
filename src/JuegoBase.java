import java.util.Scanner;
public class JuegoBase {
    public static void main(String[] args){  
        ListaPokemons pokedex = new ListaPokemons();
     //interfaz del juego
    System.out.println("=====================\nBienvenido\n=====================");
    System.out.println("Estos son los pokemons disponibles");
    System.out.println("(1)"+ pokedex.getCatalogo()[0].getName() +" tipo " + pokedex.getCatalogo()[0].getType1() + " " + pokedex.getCatalogo()[0].getType2());
    System.out.println("(2)"+ pokedex.getCatalogo()[1].getName() +" tipo " + pokedex.getCatalogo()[1].getType1() + " " + pokedex.getCatalogo()[1].getType2());
    System.out.println("(3)"+ pokedex.getCatalogo()[2].getName() +" tipo " + pokedex.getCatalogo()[2].getType1() + " " + pokedex.getCatalogo()[2].getType2());
    System.out.println("(4)"+ pokedex.getCatalogo()[3].getName() +" tipo " + pokedex.getCatalogo()[3].getType1() + " " + pokedex.getCatalogo()[3].getType2());
    System.out.println("(5)"+ pokedex.getCatalogo()[4].getName() +" tipo " + pokedex.getCatalogo()[4].getType1() + " " + pokedex.getCatalogo()[4].getType2());
    System.out.println("(6)"+ pokedex.getCatalogo()[5].getName() +" tipo " + pokedex.getCatalogo()[5].getType1() + " " + pokedex.getCatalogo()[5].getType2());
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
            nomPokemon1=pokedex.getCatalogo()[0].getName();
            break;
        case 2:
            nomPokemon1=pokedex.getCatalogo()[1].getName();
            break;
        case 3:
            nomPokemon1=pokedex.getCatalogo()[2].getName();
            break;
        case 4:
            nomPokemon1=pokedex.getCatalogo()[3].getName();
            break;
        case 5:
            nomPokemon1=pokedex.getCatalogo()[4].getName();
            break;
        case 6:
            nomPokemon1=pokedex.getCatalogo()[5].getName();
            break;

        default:
            break;
    }
    switch (nuPokemon2) {
        case 1:
            nomPokemon2=pokedex.getCatalogo()[0].getName();
            break;
        case 2:
            nomPokemon2=pokedex.getCatalogo()[1].getName();
            break;
        case 3:
            nomPokemon2=pokedex.getCatalogo()[2].getName();
            break;
        case 4:
            nomPokemon2=pokedex.getCatalogo()[3].getName();
            break;
        case 5:
            nomPokemon2=pokedex.getCatalogo()[4].getName();
            break;
        case 6:
            nomPokemon2=pokedex.getCatalogo()[5].getName();
            break;
    
        default:
            break;
    }
    switch (nuPokemon3) {
        case 1:
            nomPokemon3=pokedex.getCatalogo()[0].getName();
            break;
        case 2:
            nomPokemon3=pokedex.getCatalogo()[1].getName();
            break;
        case 3:
            nomPokemon3=pokedex.getCatalogo()[2].getName();
            break;
        case 4:
            nomPokemon3=pokedex.getCatalogo()[3].getName();
            break;
        case 5:
            nomPokemon3=pokedex.getCatalogo()[4].getName();
            break;
        case 6:
            nomPokemon3=pokedex.getCatalogo()[5].getName();
            break;
    
        default:
            break;
    }
    System.out.println("¡Perfecto! Tu equipo está compuesto por: " + nomPokemon1 + ", " + nomPokemon2 + " y " + nomPokemon3 + ".");
    System.out.println("Preparando combate...");
}  
}
