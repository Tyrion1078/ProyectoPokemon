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
   public void gameLoop() {
      int misPuntos = 0;
      int puntosRival = 0;
      int miAccion = 0;
      int accionRival = 0;
      Pokemon cambiarPor = null;
      Pokemon miPokemonEnCombate = miPokemon1;
      Pokemon pokemonRivalEnCombate = pokemonRival1;

      inicioTurno: while (ganador == false) {
         // 1. ESTADO DEL COMBATE
         System.out.println("==================");
         System.out.println(pokemonRivalEnCombate.getName());
         System.out.println("HP " + pokemonRivalEnCombate.getHpActual() + "/" + pokemonRivalEnCombate.getHpMax());
         System.out.println("==================");
         System.out.println("==================");
         System.out.println(miPokemonEnCombate.getName());
         System.out.println("HP " + miPokemonEnCombate.getHpActual() + "/" + miPokemonEnCombate.getHpMax());
         System.out.println("==================");

         // 2. TURNO DEL JUGADOR
         System.out.println("\nQue quieres hacer??");
         System.out.println("(1) LUCHAR (2) CAMBIAR");
         miAccion = sc.nextInt();
         switch (miAccion) {
            case 1:
               for (int i = 0; i < 4; i++) {
                  System.out.println("(" + (i + 1) + ")" + miPokemonEnCombate.misAtaques[i].getName());
               }
               System.out.println("[(5)VOLVER]");
               miAccion = sc.nextInt();
               if (miAccion==5) {
                continue inicioTurno;
               }
               if (miAccion > 0 && miAccion < 5) {
                  int factorSuerte = (int) (Math.random() * 16 + 85);
                  int danoTotal = (factorSuerte * miPokemonEnCombate.misAtaques[miAccion - 1].potencia) / 100;
                  pokemonRivalEnCombate.recibirDano(danoTotal);
                  System.out.println("\u001B[36m" + miPokemonEnCombate.getName() + " a utilizado " + miPokemonEnCombate.misAtaques[miAccion - 1].getName() + "\u001B[0m");
               }
               break;

            case 2:
               do {
                  cambiarPor = null;
                  System.out.println("(1) " + miPokemon1.getName() + "\n(2) " + miPokemon2.getName() + "\n(3) " + miPokemon3.getName());
                  System.out.println("[(4)VOLVER]");
                  miAccion = sc.nextInt();
                  switch (miAccion) {
                     case 1:
                        cambiarPor = miPokemon1;
                        if (cambiarPor == miPokemonEnCombate || cambiarPor.getHpActual() <= 0) {
                           System.out.println("\u001B[31m" + "El pokemon seleccionado no puede combatir" + "\u001B[0m");
                        }
                        break;
                     case 2:
                        cambiarPor = miPokemon2;
                        if (cambiarPor == miPokemonEnCombate || cambiarPor.getHpActual() <= 0) {
                           System.out.println("\u001B[31m" + "El pokemon seleccionado no puede combatir" + "\u001B[0m");
                        }
                        break;
                     case 3:
                        cambiarPor = miPokemon3;
                        if (cambiarPor == miPokemonEnCombate || cambiarPor.getHpActual() <= 0) {
                           System.out.println("\u001B[31m" + "El pokemon seleccionado no puede combatir" + "\u001B[0m");
                        }
                        break;
                     case 4:
                        break;
                     default:
                        System.err.println("\u001B[31m" + "Opcion no valida" + "\u001B[0m");
                        break;
                  }
               } while (miAccion > 4 || miAccion < 1 || miPokemonEnCombate == cambiarPor || (cambiarPor != null && cambiarPor.getHpActual() <= 0));
               
               if (cambiarPor != null) {
                  miPokemonEnCombate = cambiarPor;
               }
               break;
            default:
               System.out.println("\u001B[31m" + "Opcion no valida" + "\u001B[0m");
               break;
         }

         // 3. COMPROBAR SI EL RIVAL HA MUERTO
         if (misPuntos<3) {
          if (pokemonRivalEnCombate.getHpActual() <= 0) {
            misPuntos = misPuntos + 1;
            System.out.println(pokemonRivalEnCombate.getName() + " ha sido debilitado");
            // Solo saca otro pokemon si aún no he ganado
            if (misPuntos < 3) {
               do {
                  cambiarPor = null;
                  accionRival = (int) (Math.random() * 3) + 1;
                  switch (accionRival) {
                     case 1: cambiarPor = pokemonRival1; break;
                     case 2: cambiarPor = pokemonRival2; break;
                     case 3: cambiarPor = pokemonRival3; break;
                  }
               } while (accionRival > 3 || accionRival < 1 || cambiarPor == null || cambiarPor == pokemonRivalEnCombate || cambiarPor.getHpActual() <= 0);
               pokemonRivalEnCombate = cambiarPor;
               System.out.println("¡Adelante " + pokemonRivalEnCombate.getName() + "!");
            }
         }
         }
         // 4. TURNO DEL RIVAL (Solo si ambos siguen vivos)
         if (pokemonRivalEnCombate.getHpActual() > 0 && miPokemonEnCombate.getHpActual() > 0 && misPuntos < 3) {
            accionRival = (int) (Math.random() * 4) + 1;
            if (accionRival > 0 && accionRival < 5) {
               int factorSuerte = (int) (Math.random() * 16 + 85);
               int danoTotal = (factorSuerte * pokemonRivalEnCombate.misAtaques[accionRival - 1].potencia) / 100;
               miPokemonEnCombate.recibirDano(danoTotal);
               System.out.println("\u001B[36m" + pokemonRivalEnCombate.getName() + " ha utilizado " + pokemonRivalEnCombate.misAtaques[accionRival - 1].getName() + "\u001B[0m");
            }
         }
         // 5. COMPROBAR SI EL JUGADOR HA MUERTO
         if (puntosRival<3) {
          if (miPokemonEnCombate.getHpActual() <= 0) {
            puntosRival = puntosRival + 1;
            System.out.println(miPokemonEnCombate.getName() + " ha sido debilitado\nelige otro pokemon");
            // Solo pido otro pokemon si el rival aún no ha ganado
            if (puntosRival < 3) {
               do {
                  System.out.println("(1) " + miPokemon1.getName() + "\n(2) " + miPokemon2.getName() + "\n(3) " + miPokemon3.getName());
                  miAccion = sc.nextInt();
                  cambiarPor = null;
                  switch (miAccion) {
                     case 1: cambiarPor = miPokemon1; break;
                     case 2: cambiarPor = miPokemon2; break;
                     case 3: cambiarPor = miPokemon3; break;
                     default: System.err.println("\u001B[31m" + "Opcion no valida" + "\u001B[0m"); break;
                  }
                  if (cambiarPor != null && (cambiarPor == miPokemonEnCombate || cambiarPor.getHpActual() <= 0)) {
                     System.out.println("\u001B[31m" + "El pokemon seleccionado esta debilitado" + "\u001B[0m");
                  }
               } while (miAccion > 3 || miAccion < 1 || cambiarPor == null || cambiarPor == miPokemonEnCombate || cambiarPor.getHpActual() <= 0);
               miPokemonEnCombate = cambiarPor;
               System.out.println("¡Adelante " + miPokemonEnCombate.getName() + "!");
            }
         }
         }
         // 6. COMPROBAR VICTORIA
         if (puntosRival == 3) {
            System.out.println("\u001B[32m" + "EL GANADOR ES ... !!EL RIVAL!! (ENSERIO?!)" + "\u001B[0m");
            ganador = true;
         } else if (misPuntos == 3) {
            System.out.println("\u001B[32m" + "EL GANADOR ES ... !!EL USUARIO!! (que raro no??...)" + "\u001B[0m");
            ganador = true;
         }

      } // Final while
    }
  }