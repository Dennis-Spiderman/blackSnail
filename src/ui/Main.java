package ui;

import java.util.Scanner;
import model.BlackSnail;

public class Main{
	
	private static Scanner sc=new Scanner(System.in);
	private static BlackSnail bs=new BlackSnail();
	
	public static void main(String [] args){
		
		System.out.println("Bienvenido");
		
		showMenu();
	}
	
	public static void showMenu(){
		int option=0;

		System.out.println(
				"Bienvenido al menú principal, seleccione una opción para empezar\n" +
				"(1) Para crear un Suscriptor \n"+
				"(2) Para desactivar un suscriptor \n"+
				"(3) Para desplegar la cantidad de suscriptores activos por cada tipo de cliente\n"+
				"(4) Para desplegar el nombre del suscriptor menor de edad con mayor numero de horas dispuesto a consumir\n"+
				"(5) Para crear un producto\n"+
				"(6) Para desplegar la informacion de un producto\n"+
				"(7) Para agregar una temporada a una serie existente\n"+
				"(8) Para mostrar las peliculas de una categoria\n"+
				"(9) Para mostrar todas las series creadas y sus ultimas temporadas\n"+
				"(0) Para salir"
				);
		option = sc.nextInt();
		sc.nextLine();
		switch(option){
			case 1: 
				createSubscriber();
				break;
			case 2:
				deactivateSubscriber();
				break;
			case 3:
				activeSubscriber();
				break;
			case 4:
				youngerSubscriber();
				break;
			case 5:
				createProduct();
				break;
			case 6:
				showProduct();
				break;
			case 7:
				createSeason();
				break;
			case 8:
				showMoviePerCategory();
				break;
			case 9:
				showAllSeries();
				break;
			case 0:
				System.out.println("Bye!");
				break;
			default:
				System.out.println("Su opcion no es valida, porfavor intente de nuevo");
				showMenu();
		}
	}
	
	public static void createSubscriber(){
		System.out.println("Ingrese el ID del suscriptor: ");
		String id=sc.nextLine();
		
		System.out.println("Ingrese el nombre del suscriptor: ");
		String name=sc.nextLine();
		
		System.out.println("Ingrese la edad del suscriptor: ");
		int age=sc.nextInt();
		
		System.out.println("Ingrese la canidad de horas dispuestas a consumir del suscriptor: ");
		int hoursToConsume=sc.nextInt();
		
		System.out.println("Ingrese el tipo del suscriptor: \n(1)Para Normal\n(2)Para Platino\n(3)Para Oro\n(4)Para Diamante");
		int type=sc.nextInt();
		
		System.out.println("Ingrese el estado del suscriptor: \n(1)Para Activo\n(2)Para Inactivo");
		int state=sc.nextInt();
		
		bs.createSubscriber(id, name, age, hoursToConsume, type, state);
		showMenu();
	}
	
	public static void deactivateSubscriber(){
		System.out.println("Ingrese el ID del suscriptor a desactivar: ");
		String auxId=sc.nextLine();
		bs.deactivateSubscriber(auxId);
		showMenu();
	}
	
	public static void activeSubscriber(){
		bs.activeSubscriber();
		showMenu();
	}
	
	public static void youngerSubscriber(){
		bs.youngerSuscriber();
		showMenu();
	}
	
	public static void createProduct(){
		
		int option2=0;
		
		System.out.println(
		"Bienvenido al menu de productos, selecciona una opcion para empezar\n"+
		"(1) Para agregar una serie\n"+
		"(2) Para agregar una pelicula");
		
		option2=sc.nextInt();
		sc.nextLine();
		switch(option2){
			case 1:
				System.out.println("Ingrese el nombre de la serie");
				String serieName=sc.nextLine();
				
				System.out.println("Ingrese la fecha de lanzamiento de la serie: ");
				String dateOfIssue=sc.nextLine();
				
				System.out.println("Ingrese el nombre del protagonista: ");
				String protagonistsName=sc.nextLine();
				
				System.out.println("Ingrese el nombre del director: ");
				String directorsName=sc.nextLine();
				
				System.out.println("Ingrese la synopsis de la serie: ");
				String synopsis=sc.nextLine();
				
				System.out.println("Ingrese si la serie tiene censura: ");
				String censure=sc.nextLine();
				
				System.out.println("Ingrese los datos de la primera temporada");
		
				System.out.println("Ingrese el numero de temporada: ");
				int seasonNumber=sc.nextInt();
				
				System.out.println("Ingrese la cantidad de capitulos programados: ");
				int programedChapters=sc.nextInt();
				
				System.out.println("Ingrese la cantidad de capitulos publicados: ");
				int publicatedChapters=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Ingrese la fecha de estreno de la temporada: ");
				String releaseDate=sc.nextLine();
				
				System.out.println("Ingrese el link del trailer de la temporada: ");
				String seasonTrailer=sc.nextLine();
				
				bs.createSerie(serieName, dateOfIssue, protagonistsName, directorsName, synopsis, censure, seasonNumber, programedChapters, publicatedChapters, releaseDate, seasonTrailer);
				showMenu();
				break;
			case 2:
				System.out.println("Ingrese el titulo original de la pelicula: ");
				String originalTitle=sc.nextLine();
				
				System.out.println("Ingrese el nombre de la productora: ");
				String producer=sc.nextLine();
				
				System.out.println("Ingrese la synopsis de la pelicula: ");
				String synopsisMovie=sc.nextLine();
				
				System.out.println("Ingrese la edad recomendada para ver la pelicula: ");
				int recomendedAge=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese el link del trailer de la pelicula: ");
				String trailer=sc.nextLine();
				
				System.out.println("Ingrese el genero de la pelicula: \n(1) Para Romantica\n(2) Para Accion\n(3) Para Suspenso\n(4) Para Terror\n(5) Para Comedia");
				int genre=sc.nextInt();
				
				bs.createMovie(originalTitle, producer, synopsisMovie, recomendedAge, trailer, genre);
				showMenu();
				break;
			default:
				System.out.println("Su opcion no es valida, porfavor intente de nuevo");
				showMenu();
		}
	}
	
	public static void showProduct(){
		
		int option3;
		
		System.out.println(
		"Bienvenido al menu de productos, selecciona una opcion para empezar\n"+
		"(1) Para desplegar una serie\n"+
		"(2) Para desplegar una pelicula");
		
		option3=sc.nextInt();
		sc.nextLine();
		switch(option3){
			case 1:
				System.out.println("Ingrese el nombre de la serie a mostrar: ");
				
				String auxSerieName=sc.nextLine();
				
				bs.showSerie(auxSerieName);
				showMenu();
				break;
			case 2:
				System.out.println("Ingrese el nombre original de la pelicula a mostrar: ");
				
				String auxOriginalTitle=sc.nextLine();
				
				bs.showMovie(auxOriginalTitle);
				showMenu();
				break;
			default:
				System.out.println("Su opcion no es valida, porfavor intente de nuevo");
				showMenu();
		}
		
	}
	
	public static void createSeason(){
		System.out.println("Recuerda que la maxima cantidad de temporadas de una serie que se pueden agregar es de 35");
		
		System.out.println("Ingrese el nombre de la serie a agregar temporada: ");
		String seasonSerieName=sc.nextLine();
		
		System.out.println("Ingrese el numero de temporada: ");
		int seasonNumber=sc.nextInt();
		
		System.out.println("Ingrese la cantidad de capitulos programados: ");
		int programedChapters=sc.nextInt();
		
		System.out.println("Ingrese la cantidad de capitulos publicados: ");
		int publicatedChapters=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Ingrese la fecha de estreno de la temporada: ");
		String releaseDate=sc.nextLine();
		
		System.out.println("Ingrese el link del trailer de la temporada: ");
		String seasonTrailer=sc.nextLine();
		
		bs.addSeason(seasonSerieName, seasonNumber, programedChapters, publicatedChapters, releaseDate, seasonTrailer);
		showMenu();
	}
	
	public static void showMoviePerCategory(){
		System.out.println("Selecciona una categoria para ver las peliculas");
		
		System.out.println(
		"(1) Para ver las peliculas de romance\n"+
		"(2) Para ver las peliculas de accion\n"+
		"(3) Para ver las peliculas de suspenso\n"+
		"(4) Para ver las peliculas de terror\n"+
		"(5) Para ver las peliculas de comedia\n");
		
		int optionMovie=sc.nextInt();
		
		bs.showMoviePerCategory(optionMovie);
		showMenu();
	}
	
	public static void showAllSeries(){
		bs.showAllSeries();
		showMenu();
	}
}