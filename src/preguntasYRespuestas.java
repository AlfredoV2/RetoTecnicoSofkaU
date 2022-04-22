
import java.util.Random;
import java.util.Scanner;
import java.io.*;


public class preguntasYRespuestas {
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in); 
      pregunta[][] preguntas = new pregunta[5][5];
      Random preguntaAleatoria = new Random();
      
      
      preguntas[0][0] = new pregunta("¿Cuántos lados tiene un heptágono?\n (a) 8 \n (b) 7 \n (c) 9 \n (d) 10", "b", "baja");
      preguntas[0][1] = new pregunta("¿Cuál es el futbolista con más balones de oro?\n (a) Cristiano Ronaldo \n (b) Leonel Messi \n (c) Ronaldinho \n (d) Thierry Henry", "b", "baja");
      preguntas[0][2] = new pregunta("¿Cuál es el país con más habitantes del mundo? \n (a) Japon \n (b) China \n (c) India \n (d) Estados unidos", "b", "baja");
      preguntas[0][3] = new pregunta("¿Cuál es el país con menos habitantes del mundo?\n (a) La Ciudad del Vaticano \n (b) Francia \n (c) Albania \n (d) Argelia", "a", "baja");
      preguntas[0][4] = new pregunta("¿Cuál es el animal más rápido?\n (a) Halcono peregrino \n (b) Guepardo \n (c) El Colibrí \n (d) El chita", "a", "baja");
      
      
      preguntas[1][0] = new pregunta("¿Cuál es el edificio más alto del mundo?\n (a) Burj Khalifa  \n (b) One World Trade Center \n (c) CITIC Tower \n (d) Central Park Tower", "a", "baja.media");
      preguntas[1][1] = new pregunta("¿Quién escribió “El Quijote”?\n (a) Miguel de cervantes Saavedra \n (b) Oscar wilde \n (c) Gabriel Garcia Marquez \n (d) Stephen King  \n", "a", "baja-media");
      preguntas[1][2] = new pregunta("¿Cuándo llegó Cristóbal Colón a América? \n (a) 16 de julio de 1942 \n (b) 12 de octube de 1942 \n (c) 12 de octube de 1945 \n (d) 16 de julio de 1945", "b", "baja-media");
      preguntas[1][3] = new pregunta("¿Qué día es la fiesta nacional de los Estados Unidos?\n (a) 4 de junio \n (b) 10 de enero \n (c) 4 de julio \n (d) 20 de junio", "c", "baja-media");
      preguntas[1][4] = new pregunta("¿Quién ganó el mundial de fútbol de 2010?\n (a) Inglaterra \n (b) Colombia \n (c) Francia \n (d) España", "d", "baja-media");
      
      
      preguntas[2][0] = new pregunta("¿Dónde está Transilvania?\n (a) Bélgica  \n (b) Belice  \n (c) Rumanía \n (d) Austria" , "c", "media");
      preguntas[2][1] = new pregunta("¿En que año se termino la Primera Guerra Mundial?\n (a) 1918 \n (b) 1939 \n (c) 1945 \n (d) 1914", "a","media");
      preguntas[2][2] = new pregunta("¿En que año setermino la Segunda Guerra Mundial?\n (a) 1946 \n (b) 1945 \n (c) 1950 \n (d) 1914 ", "b", "media");
      preguntas[2][3] = new pregunta("¿Cuántos huesos tiene el cuerpo humano?\n (a) 206 \n (b) 200 \n (c) 216 \n (d) 242", "a", "media");
      preguntas[2][4] = new pregunta("¿Qué gas liberan las plantas al hacer la fotosíntesis?\n (a) Hdrogeno \n (b) Oxigeno \n (c) Etano \n (d) Helio ", "b", "Media");
      
      
      
      preguntas[3][0] = new pregunta("¿Cuál es el río más largo del mundo? \n (a) Nilo  \n (b) El Amazonas \n (c) Ganges \n (d) Mekong","b","alto");
      preguntas[3][1] = new pregunta("¿Cuál es el atleta con más medallas olímpicas?\n (a) Mark Spitz \n (b) Sawao Kato \n (c) Usain Bolt \n (d) Michael Phelps \n", "d", "alto");
      preguntas[3][2] = new pregunta("¿Cuál es el planeta más grande del Sistema Solar?\n (a) Jupiter \n (b) Marte \n (c) Neptuno \n (d) Saturno", "a", "alto");
      preguntas[3][3] = new pregunta("¿Cuál fue la primera película de Disney?\n (a) Pinocho \n (b) Blanca nieves y los 7 enanitos \n (c) Dumbo \n (d) Bambi", "b", "alto");
      preguntas[3][4] = new pregunta("¿Cuándo llegó el hombre a la Luna?\n (a) 1969 \n (b) 1945 \n (c) 1700 \n (d) 1769", "a", "alto");
      
      
      
      preguntas[4][0] = new pregunta("¿Cuál es el primer elemento de la tabla periódica?\n (a) Carbono \n (b) Etanol \n (c) Neón \n (d) Hidrógeno", "d", "muy alto");
      preguntas[4][1] = new pregunta("¿Los tiburones son _______?\n (a) Peces \n (b) Mamiferos \n (c) Reptiles \n (d) anfibios", "a", "muy alto");
      preguntas[4][2] = new pregunta("¿Cuál es el océano más grande del mundo?\n (a) Oceano pacífico \n (b) Oceano Atlántico \n (c) Oceano Índico (d) Glacial Ártico", "a", "muy alto");
      preguntas[4][3] = new pregunta("¿Cuál es el animal que más muertes provoca cada año? \n (a) Cucaracha \n (b) Mosca \n (c) Mosquito \n (d) Raton","c", "muy alto");
      preguntas[4][4] = new pregunta("¿Qué expresidente sudafricano estuvo encarcelado durante 27 años?\n (a) Nelson Mandela \n (b) Alvaro Uribe \n (c) George Washington \n (d) Jhon Adams", "a", "muy alto");
      
      /*  Algoritmo del juego */
      int indice = preguntaAleatoria.nextInt(5);
      int puntos[] = {5, 10, 20, 25, 40};

      System.out.println("Ingrese el nombre del jugador: ");
      String nombreJ1 = sc.nextLine(); 

      
      jugador J1 = new jugador (nombreJ1, 0); 


      for(int i = 0; i < 5; i++){
         System.out.println("\n Instrucciones: \n 1) Las preguntas son de selección multiple, responda unicamente con las letras a, b, c, ó d. \n 2) Si la respuesta es correcta ganará puntos y pasará a la siguiente ronda, si la respuesta es incorrecta perderá el juego y todos los puntos. \n 3) Si se retira terminara el juego y conservará los puntos que lleve hasta el momento. Para retirarse escriba la letra R.\n \n");

         System.out.println( "J1:" + " " + J1.getNombre() + "                " + "Score:" +  " " + J1.getScore() + "\n");

         System.out.println("\n RONDA" + " " + (i+1) + "\n ");

         System.out.println(preguntas[i][indice].getenunciado()); 
         System.out.println("Respuesta: ");
         String respuestaJ1 = sc.nextLine(); 

         if(preguntas[i][indice].test(respuestaJ1)){
            System.out.println("\n \n ¡ CORRECTO ! \n Felicidades ganaste " + puntos[i] + " puntos. ");
            J1.setScore(J1.getScore() + puntos[i]);
            continue;
         }else if(respuestaJ1.equalsIgnoreCase("R")){
            System.out.println(J1.retirada());
            break;
         }else{
            System.out.println(" INCORRECTO \n Lo siento perdiste el juego.");
            J1.setScore(0);
            break;
         }

      }

      if(J1.getScore() == 100){
         System.out.println(" \n \n Felicidades has ganado el juego \n Total de puntos \n" + " " + J1.getScore() );
      }

      FileWriter historicoJugadores = new FileWriter("historico.txt", true); 
      historicoJugadores.write(J1.getNombre() + "  " + J1.getScore() + "\n");
      historicoJugadores.close();

      
      sc.close();      
    }
}


