package lab7_catalinayushan;

import java.util.Random;
import java.util.Scanner;

public class Lab7_CatalinaYushan {

    public static void main(String[] args) {
        Scanner quaxly = new Scanner(System.in);
        System.out.println("---Bienvenido al menu!---");
        System.out.println("1. El Calamar Pablo");
        System.out.println("2. Torre de Control");
        System.out.println("3. Salir");
        System.out.print("-------------------------");
        System.out.print("Ingrese la opcion deseado: ");
        int choice = quaxly.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Bienvenido a El Calamar Pablo!");
                    System.out.println("Dentro de este programa ustede puede ver las diferentes selecciones del mundial y intentar predecir el resultado!");
                    System.out.println("Estos son los paises dentro de nuestro sistema !");
                    System.out.println("Lista");
                    System.out.println("1. España");
                    System.out.println("2. Alemania");
                    System.out.println("3. Costa Rica");
                    System.out.println("4. Japón");
                    System.out.println("5. Bélgica");
                    System.out.println("6. Croacia");
                    System.out.println("7. Canadá");
                    System.out.println("8. Marruecos");
                    System.out.println("Por favor utilice tildes!");
                    System.out.println("Ingrese el país que desea ver: ");
                    String pais = quaxly.nextLine();

                    Selecciones España = new Selecciones('E', "España", "Luis Enrique", 26, "Si", "Primero", 0);
                    Selecciones CostaRica = new Selecciones('E', "Costa Rica", "Luis Fernando Suarez", 26, "No", "Cuarto", 0);
                    Selecciones Alemania = new Selecciones('E', "Alemania", "Hansi Flick", 26, "Si", "Tercero", 0);
                    Selecciones Japon = new Selecciones('E', "Japón", "Hajime Moriyasu", 26, "No", "Segundo", 0);
                    Selecciones Belgica = new Selecciones('F', "Bélgica", "Roberto Martínez", 26, "No", "Primero", 0);
                    Selecciones Croacia = new Selecciones('F', "Croacia", "Zlatko Dalic", 26, "No", "Segundo", 0);
                    Selecciones Canada = new Selecciones('F', "Canadá", "John Herdman", 26, "No", "Cuarto", 0);
                    Selecciones Marruecos = new Selecciones('F', "Marruecos", "Walid Regragui", 26, "No", "Tercero", 0);

                    if (pais.equalsIgnoreCase("España")) {
                        System.out.println("Pertenece al grupo" + España.getGroup());
                        System.out.println("Este es el país" + España.getCountry());
                        System.out.println("El director del país es:" + España.getDirector());
                        System.out.println("El números del jugadores es:" + España.getPlayers());
                        System.out.println("Este país ha ganado un mundial?" + España.getWorldCup());
                        System.out.println("La posición del equipo es:" + España.getPosition());
                        System.out.println("Ha anotado un gol?" + España.getGoals());
                        System.out.println("---Se ha creado exitosamente la selección de España!---");
                    }

                    if (pais.equalsIgnoreCase("Costa Rica")) {
                        System.out.println("Pertenece al grupo" + CostaRica.getGroup());
                        System.out.println("Este es el país" + CostaRica.getCountry());
                        System.out.println("El director del país es:" + CostaRica.getDirector());
                        System.out.println("El números del jugadores es:" + CostaRica.getPlayers());
                        System.out.println("Este país ha ganado un mundial?" + CostaRica.getWorldCup());
                        System.out.println("La posición del equipo es:" + CostaRica.getPosition());
                        System.out.println("Ha anotado un gol?" + CostaRica.getGoals());
                        System.out.println("---Se ha creado exitosamente la selección de Costa Rica!---");
                    }

                    if (pais.equalsIgnoreCase("Alemania")) {
                        System.out.println("Pertenece al grupo" + Alemania.getGroup());
                        System.out.println("Este es el país" + Alemania.getCountry());
                        System.out.println("El director del país es:" + Alemania.getDirector());
                        System.out.println("El números del jugadores es:" + Alemania.getPlayers());
                        System.out.println("Este país ha ganado un mundial?" + Alemania.getWorldCup());
                        System.out.println("La posición del equipo es:" + Alemania.getPosition());
                        System.out.println("Ha anotado un gol?" + Alemania.getGoals());
                        System.out.println("---Se ha creado exitosamente la selección de Alemania!---");
                    }

                    if (pais.equalsIgnoreCase("Japón")) {
                        System.out.println("Pertenece al grupo" + Japon.getGroup());
                        System.out.println("Este es el país" + Japon.getCountry());
                        System.out.println("El director del país es:" + Japon.getDirector());
                        System.out.println("El números del jugadores es:" + Japon.getPlayers());
                        System.out.println("Este país ha ganado un mundial?" + Japon.getWorldCup());
                        System.out.println("La posición del equipo es:" + Japon.getPosition());
                        System.out.println("Ha anotado un gol?" + Japon.getGoals());
                        System.out.println("---Se ha creado exitosamente la selección de Japón!---");
                    }

                    if (pais.equalsIgnoreCase("Bélgica")) {
                        System.out.println("Pertenece al grupo" + Belgica.getGroup());
                        System.out.println("Este es el país" + Belgica.getCountry());
                        System.out.println("El director del país es:" + Belgica.getDirector());
                        System.out.println("El números del jugadores es:" + Belgica.getPlayers());
                        System.out.println("Este país ha ganado un mundial?" + Belgica.getWorldCup());
                        System.out.println("La posición del equipo es:" + Belgica.getPosition());
                        System.out.println("Ha anotado un gol?" + Belgica.getGoals());
                        System.out.println("---Se ha creado exitosamente la selección de Bélgica!---");
                    }

                    if (pais.equalsIgnoreCase("Croacia")) {
                        System.out.println("Pertenece al grupo" + Croacia.getGroup());
                        System.out.println("Este es el país" + Croacia.getCountry());
                        System.out.println("El director del país es:" + Croacia.getDirector());
                        System.out.println("El números del jugadores es:" + Croacia.getPlayers());
                        System.out.println("Este país ha ganado un mundial?" + Croacia.getWorldCup());
                        System.out.println("La posición del equipo es:" + Croacia.getPosition());
                        System.out.println("Ha anotado un gol?" + Croacia.getGoals());
                        System.out.println("---Se ha creado exitosamente la selección de Croacia!---");
                    }

                    if (pais.equalsIgnoreCase("Canadá")) {
                        System.out.println("Pertenece al grupo" + Canada.getGroup());
                        System.out.println("Este es el país" + Canada.getCountry());
                        System.out.println("El director del país es:" + Canada.getDirector());
                        System.out.println("El números del jugadores es:" + Canada.getPlayers());
                        System.out.println("Este país ha ganado un mundial?" + Canada.getWorldCup());
                        System.out.println("La posición del equipo es:" + Canada.getPosition());
                        System.out.println("Ha anotado un gol?" + Canada.getGoals());
                        System.out.println("---Se ha creado exitosamente la selección de Canadá!---");
                    }

                    if (pais.equalsIgnoreCase("Marruecos")) {
                        System.out.println("Pertenece al grupo" + Marruecos.getGroup());
                        System.out.println("Este es el país" + Marruecos.getCountry());
                        System.out.println("El director del país es:" + Marruecos.getDirector());
                        System.out.println("El números del jugadores es:" + Marruecos.getPlayers());
                        System.out.println("Este país ha ganado un mundial?" + Marruecos.getWorldCup());
                        System.out.println("La posición del equipo es:" + Marruecos.getPosition());
                        System.out.println("Ha anotado un gol?" + Marruecos.getGoals());
                        System.out.println("---Se ha creado exitosamente la selección de Marruecos!---");
                    }

                   if (España.getCountry().equalsIgnoreCase("España") || Alemania.getCountry().equalsIgnoreCase("Alemania")) {
                      
                    int min = 0;
                        int max = 5;
                        int Random = new Random().nextInt((max - min) + 1) + min;

                        int minx = 0;
                        int maxx = 5;
                        int Randomx = new Random().nextInt((maxx - minx) + 1) + minx;

                        España.setGoals(Random);
                        Alemania.setGoals(Randomx);

                        if (España.getGoals() > Alemania.getGoals()) {
                            System.out.println("El ganador es España!");
                        }else{
                            System.out.println(" EL ganador es Alemania");
                        }

                    } else if (Belgica.getCountry().equalsIgnoreCase("Bélgica") || Marruecos.getCountry().equalsIgnoreCase("Marruecos")) {
                        int min = 0;
                        int max = 5;
                        int Random = new Random().nextInt((max - min) + 1) + min;

                        int minx = 0;
                        int maxx = 5;
                        int Randomx = new Random().nextInt((maxx - minx) + 1) + minx;

                        Belgica.setGoals(Random);
                        Marruecos.setGoals(Randomx);

                        if (Belgica.getGoals() < Alemania.getGoals()) {
                            System.out.println("El ganador es Alemania!");
                        }else{
                            System.out.println("El ganador es Marruecos");
                        }

                    } else if (Japon.getCountry().equalsIgnoreCase("Japón") || CostaRica.getCountry().equalsIgnoreCase("Costa Rica")) {
                        int min = 0;
                        int max = 5;
                        int Random = new Random().nextInt((max - min) + 1) + min;

                        int minx = 0;
                        int maxx = 5;
                        int Randomx = new Random().nextInt((maxx - minx) + 1) + minx;

                        Japon.setGoals(Random);
                        CostaRica.setGoals(Randomx);

                        if (Japon.getGoals() > CostaRica.getGoals()) {
                            System.out.println("El ganador es Japon!");
                        }else{
                            System.out.println("El ganador es Costa Rica");

                        }
                    }else if (Croacia.getCountry().equalsIgnoreCase("Croacia") || Canada.getCountry().equalsIgnoreCase("Canadá")) {
                            int min = 0;
                            int max = 5;
                            int Random = new Random().nextInt((max - min) + 1) + min;

                            int minx = 0;
                            int maxx = 5;
                            int Randomx = new Random().nextInt((maxx - minx) + 1) + minx;

                            Croacia.setGoals(Random);
                            Canada.setGoals(Randomx);

                            if (Croacia.getGoals() > Canada.getGoals()) {
                                System.out.println("El ganador es Croacia!");
                            }else{
                                System.out.println("El ganador es Canada");

                            }
                            break;
                        
                        }
                        break;
                    case 2:
                     quaxly = new Scanner(System.in);
                        System.out.println("Bienvenido al sistema de aviones, Piloto!");
                        System.out.println("Los aviones están fallando y necesitamos tu ayuda!");
                        System.out.println("Debes ingresar los datos del avion para poder accederlos.");
                        
                        System.out.println("Ingrese el modelo del primer avión: ");
                        System.out.println("Ingrese el codigo del primer avión: ");
                        System.out.println("Ingrese el año de fabricación: ");
                        System.out.println("Ingrese la capacidad máxima de pasajeros del primer avión: ");
                        System.out.println("Ingrese el peso del primer avión: ");
                        System.out.println("Ingrese el nombre de la aerolinia: ");
                        int datos = quaxly.nextInt();
                        
                        System.out.println("Ingrese el modelo del segundo avión: ");
                        System.out.println("Ingrese el codigo del segundo avión: ");
                        System.out.println("Ingrese el año de fabricación: ");
                        System.out.println("Ingrese la capacidad máxima de pasajeros del segundo avión: ");
                        System.out.println("Ingrese el peso del segundo avión: ");
                        System.out.println("Ingrese el nombre de la aerolinia: ");
                        int datos1 = quaxly.nextInt();
                        
                        System.out.println("Ingrese el modelo del tercer avión: ");
                        System.out.println("Ingrese el codigo del tercer avión: ");
                        System.out.println("Ingrese el año de fabricación: ");
                        System.out.println("Ingrese la capacidad máxima de pasajeros del tercer avión: ");
                        System.out.println("Ingrese el peso del tercer avión: ");
                        System.out.println("Ingrese el nombre de la aerolinia: ");
                        int datos2 = quaxly.nextInt();
                        
                    
                    
                    break;
                case 3:
                    break;
                default:
                    System.out.print("Adios, no regrese!");
            }
        }while (choice < 3);
            }
            

        }
        


