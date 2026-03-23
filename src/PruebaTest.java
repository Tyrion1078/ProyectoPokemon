import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaTest {

    // TU PRIMERA PRUEBA (La que ya tenías)
    @Test
    public void comprobarAprenderAtaque() {
        ListaPokemons pokedex = new ListaPokemons();
        ListaAtaques armeria = new ListaAtaques();
        
        Pokemon miPokemonPrueba = pokedex.getCatalogo()[0]; 
        Ataque ataquePrueba = armeria.learnsets[0][0];

        miPokemonPrueba.aprenderAtaque(ataquePrueba, 0);

        assertEquals(ataquePrueba.getName(), miPokemonPrueba.misAtaques[0].getName());
    }

    // --- NUEVAS PRUEBAS PARA EL DAÑO ---

    @Test
    public void comprobarDanoNormal() {
        // 1. PREPARAMOS: Creamos un Garchomp directamente con 239 de vida
        Pokemon miPokemon = new Pokemon("Garchomp", "tierra", "dragon", 239);
        
        // 2. EJECUTAMOS: Le metemos un ataque que quite 39 de vida
        miPokemon.recibirDano(39);
        
        // 3. COMPROBAMOS: 239 - 39 debería ser exactamente 200
        assertEquals(200, miPokemon.getHpActual());
    }

    @Test
    public void comprobarDanoLetalNoBajaDeCero() {
        // 1. PREPARAMOS: Creamos un Pichu (falso) con solo 50 de vida
        Pokemon miPokemon = new Pokemon("Pichu", "electrico", "", 50);
        
        // 2. EJECUTAMOS: ¡Le metemos un misilazo de 500 de daño!
        miPokemon.recibirDano(500);
        
        // 3. COMPROBAMOS: Como tú programaste un 'if (hpActual < 0)', la vida debe quedarse en 0, no en -450.
        assertEquals(0, miPokemon.getHpActual());
    }
}