import java.util.Scanner;
public class JuegoBase {
    public static void main(String[] args){  
        ListaPokemons pokedex = new ListaPokemons();
        ListaAtaques armeria = new ListaAtaques();
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
    Pokemon miPokemon1=pokedex.getCatalogo()[nuPokemon1-1];
    Pokemon miPokemon2=pokedex.getCatalogo()[nuPokemon2-1];
    Pokemon miPokemon3=pokedex.getCatalogo()[nuPokemon3-1];
    System.out.println("¡Perfecto! Tu equipo está compuesto por: " + miPokemon1.getName() + ", " + miPokemon2.getName() + " y " + miPokemon3.getName() + ".");
    //elejemos los 3 otros pokemons rivales de forma aleatoria
    int nuRival1 = (int)(Math.random() * 6) + 1;
    int nuRival2 = (int)(Math.random() * 6) + 1;
    int nuRival3 = (int)(Math.random() * 6) + 1;
    Pokemon PokemonRival1=pokedex.getCatalogo()[nuRival1-1];
    Pokemon PokemonRival2=pokedex.getCatalogo()[nuRival2-1];
    Pokemon PokemonRival3=pokedex.getCatalogo()[nuRival3-1];
    //esta parte de codigo servira para que el usuario
    //elija los 4 ataques que tendra cada uno de sus pokemons eleguidos
    // 1ºpokemon eleguido
    Scanner ataquesSelecionados = new Scanner(System.in);
    //-----------------------------------------------------------------------------
    // 1ºpokemon eleguido
    //-----------------------------------------------------------------------------   
    System.out.println("Elija los 4 ataques que tendra "+ miPokemon1.getName());
    System.out.println("estos son los ataques disponible para "+miPokemon1.getName());
    for(int j=0; j<6; j++ ){
        System.out.println("("+(j+1)+")"+armeria.learnsets[nuPokemon1-1][j].getName());
    }
    // 1. CREAMOS UNA "MEMORIA" DE 4 HUECOS PARA RECORDAR LO QUE ELIGE
    int[] memoriaAtaques = new int[4]; 
    for(int i=0; i<4; i++ ){
        System.out.println("Eliga el "+(i+1)+"º ataque.");
        int pedirAtaque = ataquesSelecionados.nextInt();            
        // 2. Comprobamos si el número ya está en nuestra memoria
        boolean repetido = false;
        for(int j=0; j<i; j++){
            if(memoriaAtaques[j] == pedirAtaque){
                repetido = true;
            }
        }       
        // 3. Si es tramposo, lo encerramos aquí hasta que dé un número nuevo
        while (repetido == true) {
            System.out.println("No puedes eleguir un mismo ataque 2 veces elige otro!!");            
            // AHORA SÍ GUARDAMOS EL NUEVO NÚMERO
            pedirAtaque = ataquesSelecionados.nextInt();           
            // Volvemos a comprobar si el nuevo número también estaba repetido
            repetido = false;
            for(int j=0; j<i; j++){
                if(memoriaAtaques[j] == pedirAtaque){
                    repetido = true;
                }
            }
        }       
        // 4. Si ha salido del bucle, el número es válido. Lo guardamos en la memoria y en el Pokémon.
        memoriaAtaques[i] = pedirAtaque;
        miPokemon1.aprenderAtaque(armeria.learnsets[nuPokemon1-1][pedirAtaque-1], i);
    }
    //-----------------------------------------------------------------------------
    // 2ºpokemon eleguido
    //-----------------------------------------------------------------------------
System.out.println("Elija los 4 ataques que tendra "+ miPokemon2.getName());
    System.out.println("estos son los ataques disponible para "+miPokemon2.getName());
    for(int j=0; j<6; j++ ){
        System.out.println("("+(j+1)+")"+armeria.learnsets[nuPokemon1-1][j].getName());
    }   
    // 1. CREAMOS UNA "MEMORIA" DE 4 HUECOS PARA RECORDAR LO QUE ELIGE
    for(int i=0; i<4; i++ ){
        System.out.println("Eliga el "+(i+1)+"º ataque.");
        int pedirAtaque = ataquesSelecionados.nextInt();            
        // 2. Comprobamos si el número ya está en nuestra memoria
        boolean repetido = false;
        for(int j=0; j<i; j++){
            if(memoriaAtaques[j] == pedirAtaque){
                repetido = true;
            }
        }       
        // 3. Si es tramposo, lo encerramos aquí hasta que dé un número nuevo
        while (repetido == true) {
            System.out.println("No puedes eleguir un mismo ataque 2 veces elige otro!!");            
            // AHORA SÍ GUARDAMOS EL NUEVO NÚMERO
            pedirAtaque = ataquesSelecionados.nextInt();           
            // Volvemos a comprobar si el nuevo número también estaba repetido
            repetido = false;
            for(int j=0; j<i; j++){
                if(memoriaAtaques[j] == pedirAtaque){
                    repetido = true;
                }
            }
        }       
        // 4. Si ha salido del bucle, el número es válido. Lo guardamos en la memoria y en el Pokémon.
        memoriaAtaques[i] = pedirAtaque;
        miPokemon2.aprenderAtaque(armeria.learnsets[nuPokemon1-1][pedirAtaque-1], i);
    }
    //-----------------------------------------------------------------------------
    // 3ºpokemon eleguido
    //-----------------------------------------------------------------------------
        
System.out.println("Elija los 4 ataques que tendra "+ miPokemon1.getName());
    System.out.println("estos son los ataques disponible para "+miPokemon1.getName());
    for(int j=0; j<6; j++ ){
        System.out.println("("+(j+1)+")"+armeria.learnsets[nuPokemon1-1][j].getName());
    }   
    // 1. CREAMOS UNA "MEMORIA" DE 4 HUECOS PARA RECORDAR LO QUE ELIGE
    for(int i=0; i<4; i++ ){
        System.out.println("Eliga el "+(i+1)+"º ataque.");
        int pedirAtaque = ataquesSelecionados.nextInt();            
        // 2. Comprobamos si el número ya está en nuestra memoria
        boolean repetido = false;
        for(int j=0; j<i; j++){
            if(memoriaAtaques[j] == pedirAtaque){
                repetido = true;
            }
        }       
        // 3. Si es tramposo, lo encerramos aquí hasta que dé un número nuevo
        while (repetido == true) {
            System.out.println("No puedes eleguir un mismo ataque 2 veces elige otro!!");            
            // AHORA SÍ GUARDAMOS EL NUEVO NÚMERO
            pedirAtaque = ataquesSelecionados.nextInt();           
            // Volvemos a comprobar si el nuevo número también estaba repetido
            repetido = false;
            for(int j=0; j<i; j++){
                if(memoriaAtaques[j] == pedirAtaque){
                    repetido = true;
                }
            }
        }       
        // 4. Si ha salido del bucle, el número es válido. Lo guardamos en la memoria y en el Pokémon.
        memoriaAtaques[i] = pedirAtaque;
        miPokemon3.aprenderAtaque(armeria.learnsets[nuPokemon1-1][pedirAtaque-1], i);
    }

    }
    
}
