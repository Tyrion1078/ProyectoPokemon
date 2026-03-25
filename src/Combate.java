import java.util.Scanner;
public class Combate {
  //C_Vacio
  Pokemon miPokemon1;
  Pokemon miPokemon2;
  Pokemon miPokemon3;
  Pokemon pokemonRival1;
  Pokemon pokemonRival2;
  Pokemon pokemonRival3;
  Pokemon miPokemonEnCombate;
  Pokemon pokemonRivalEnCombate;
  //C_Parametrizado
  public Combate (Pokemon miPokemon1, Pokemon miPokemon2, Pokemon miPokemon3,  Pokemon pokemonRival1, Pokemon pokemonRival2, Pokemon pokemonRival3){
    this.miPokemon1=miPokemon1;
    this.miPokemon2=miPokemon2;
    this.miPokemon3=miPokemon3;
    this.pokemonRival1=pokemonRival1;
    this.pokemonRival2=pokemonRival2;
    this.pokemonRival3=pokemonRival3;
  }
    int miAccion;
    boolean ganador=false;
    Scanner sc=new Scanner(System.in);
   public void gameLoop(){
      int miAccion=0;
      Pokemon cambiarPor=null;
      Pokemon miPokemonEnCombate=miPokemon1;
      Pokemon pokemonRivalEnCombate=pokemonRival1;
     while(ganador==false){
      //Estado actual del pokemon rival
        System.out.println("==================");
        System.out.println(pokemonRivalEnCombate.getName());
        System.out.println("HP "+pokemonRivalEnCombate.getHpActual()+"/"+pokemonRivalEnCombate.getHpMax());
        System.out.println("==================");
      //Estado actual nuestro pokemon
        System.out.println("==================");
        System.out.println(miPokemonEnCombate.getName());
        System.out.println("HP "+miPokemonEnCombate.getHpActual()+"/"+miPokemonEnCombate.getHpMax());
        System.out.println("==================");
      //Acciones disponibles
        System.out.println("\nQue quieres hacer??");
        System.out.println("(1) LUCHAR (2) CAMBIAR");
        miAccion=sc.nextInt();
        switch (miAccion) {
          //LUCHAR
          case 1:
            for(int i = 0; i < 4; i++) {
              System.out.println("("+(i+1)+")" + miPokemonEnCombate.misAtaques[i].getName());}
              System.out.println("[(5)VOLVER]");
              miAccion=sc.nextInt();
              if (miAccion>0 && miAccion<5) {
                int factorSuerte=(int)(Math.random()*16+85);
                int danoTotal=(factorSuerte*miPokemonEnCombate.misAtaques[miAccion-1].potencia)/100;
                pokemonRivalEnCombate.recibirDano(danoTotal);
              }
            break;
          //CAMBIAR
          case 2:
              do {
               cambiarPor=null;
              System.out.println("(1) "+miPokemon1.getName()+"\n(2) "+miPokemon2.getName()+"\n(3) "+miPokemon3.getName());
              System.out.println("[(4)VOLVER]");
              miAccion=sc.nextInt();
              switch (miAccion) {
                case 1:
                  cambiarPor=miPokemon1;
                 if (cambiarPor==miPokemonEnCombate) {
                   System.out.println("\u001B[31m" + "El pokemon seleccionado ya está combatiendo" + "\u001B[0m");
                  }
               break;
                case 2:
                  cambiarPor=miPokemon2;
                 if (cambiarPor==miPokemonEnCombate) {
                   System.out.println("\u001B[31m" + "El pokemon seleccionado ya está combatiendo" + "\u001B[0m");
                 }
               break;
                case 3:
                  cambiarPor=miPokemon3;
                  if (cambiarPor==miPokemonEnCombate) {
                   System.out.println("\u001B[31m" + "El pokemon seleccionado ya está combatiendo" + "\u001B[0m");
                 }
               break;
               case 4:
                 break;
               default:
                System.err.println("\u001B[31m"+"Opcion no valida"+"\u001B[0m");
                 break;
            }               
              } while (miAccion>4 || miAccion<1 || miPokemonEnCombate==cambiarPor);
              if (cambiarPor != null) {
                miPokemonEnCombate = cambiarPor;}
            break;
          //Error por accion no valida
          default:
            System.err.println("\u001B[31m"+"Opcion no valida"+"\u001B[0m");
            break;         
    }
     if (miPokemonEnCombate.getHpActual()<=0) {
              System.out.println(miPokemonEnCombate.getName()+" a sido debilitado\neligue otro pokemon");
              do {
              System.out.println("(1) "+miPokemon1.getName()+"\n(2) "+miPokemon2.getName()+"\n(3) "+miPokemon3.getName());
              miAccion=0;
              miAccion=sc.nextInt();
              cambiarPor=null;
              switch (miAccion) {
                case 1:
                  cambiarPor=miPokemon1;
                 if (cambiarPor==miPokemonEnCombate||cambiarPor.getHpActual()<=0) {
                  System.out.println("\u001B[31m" + "El pokemon seleccionado esta debilitado" + "\u001B[0m");
                  }                
               break;
                case 2:
                  cambiarPor=miPokemon2;
                 if (cambiarPor==miPokemonEnCombate||cambiarPor.getHpActual()<=0) {
                  System.out.println("\u001B[31m" + "El pokemon seleccionado esta debilitado" + "\u001B[0m");
                 }
               break;
                case 3:
                  cambiarPor=miPokemon3;
                  if (cambiarPor==miPokemonEnCombate||cambiarPor.getHpActual()<=0) {
                   System.out.println("\u001B[31m" + "El pokemon seleccionado esta debilitado" + "\u001B[0m");
                 }
               break;
               default:
                System.err.println("\u001B[31m"+"Opcion no valida"+"\u001B[0m");
                break;
                }            
              } while (miAccion>3 || miAccion<1 || cambiarPor==miPokemonEnCombate || cambiarPor.getHpActual()<=0);
                miPokemonEnCombate=cambiarPor;   
                System.out.println("¡Adelante " + miPokemonEnCombate.getName() + "!");
    }//Final if (comprobar hpAcutal)
   }//Final while1
  }//Final gameloop
}
