package model;

public class BlackSnail{
	
	private Subscriber[] subscribers;
	private Serie[] series;
	private Movie[] movies;
	private final int INACTIVE=2;
	private final int NORMAL=1;
	public BlackSnail(){
		subscribers= new Subscriber[50];
		series= new Serie[85];
		movies= new Movie[85];
	}
	
	public void createSubscriber(String id, String name, int age, int hoursToConsume, int type, int state){
		
		Subscriber subscriber=new Subscriber(id, name, age, hoursToConsume, type, state);
		
		for(int i=0;i<subscribers.length;i++){
			if(subscribers[i]!=null && subscriber.getId().equals(subscribers[i].getId())){
				System.out.println("Lo siento, ese ID ya esta registrado");
				i=subscribers.length;
			}
			else if(subscribers[i]==null){
				subscribers[i]=subscriber;
				System.out.println("El suscriptor fue creado ");
				i=subscribers.length;
			}
			
		}
	}
	
	public void deactivateSubscriber(String id){
		boolean aux2=false;
		for(int i=0;i<subscribers.length;i++){
			if(subscribers[i]!=null){
				if(id.equals(subscribers[i].getId())){
					
					subscribers[i].setState(INACTIVE);
					subscribers[i].setType(NORMAL);
					i=subscribers.length;
					aux2=true;
					System.out.println("El suscriptor a sido desactivado correctamente");
				}
			}
			else if(subscribers[0]==null){
				
				System.out.println("No hay suscriptores creados todavia");
				i=subscribers.length;
			}
		}
		if(!aux2){
			System.out.println("Lo siento, ha habido un error desactivando el suscriptor");
		}
		
	}
	
	public void activeSubscriber(){
		
		int normalQuantity=0;
		int platinumQuantity=0;
		int goldQuantity=0;
		int diamondQuantity=0;
		int totalSubs=0;
		
		for(int i=0;i<subscribers.length;i++){
			if(subscribers[i]!=null){
				
				if(subscribers[i].getAuxType()==1 && subscribers[i].getAuxState()==1){
				
					normalQuantity+=1;
				}
				else if(subscribers[i].getAuxType()==2 && subscribers[i].getAuxState()==1){
				
					platinumQuantity+=1;
				}
				else if(subscribers[i].getAuxType()==3 && subscribers[i].getAuxState()==1){
					
					goldQuantity+=1;
				}
				else if(subscribers[i].getAuxType()==4 && subscribers[i].getAuxState()==1){
					
					diamondQuantity+=1;
				}
			}
		}
		totalSubs= normalQuantity+platinumQuantity+goldQuantity+diamondQuantity;
		System.out.println("La cantidad total de suscriptores activos es de: "+totalSubs);
		System.out.println("NORMAL: "+normalQuantity+"\nPLATINO: "+platinumQuantity+"\nORO: "+goldQuantity+"\nDIAMANTE: "+diamondQuantity);	
	}
	
	public void youngerSuscriber(){
		Subscriber[] subsUnderEighteen= new Subscriber [50];
		for(int i=0;i<subscribers.length;i++){
			if(subscribers[i]!=null){
				if(subscribers[i].getAge()<18){
					for(int j=0;j<subsUnderEighteen.length;j++){
						if(subsUnderEighteen[j]==null){
							subsUnderEighteen[j]=subscribers[i];
							j=subsUnderEighteen.length;
						}
					}
					
				}
				
				
			}
			
			
		}
		int aux=0;
		for(int i=1;i<subsUnderEighteen.length;i++){
			if(subsUnderEighteen[i]!=null){
				if(subsUnderEighteen[i].getHoursToConsume()>subsUnderEighteen[aux].getHoursToConsume()){
					aux=i;
				}
				
			}
			
		}
		System.out.println("El nombre del menor de 18 anyos con mas horas a disposicion es: "+subsUnderEighteen[aux].getName());
	}
	
	public void createSerie(String serieName, String dateOfIssue, String protagonistsName, String directorsName, String synopsis, String censure, int seasonNumber, int programedChapters, int publicatedChapters, String releaseDate, String seasonTrailer){
		
		Serie serie= new Serie(serieName, dateOfIssue, protagonistsName, directorsName, synopsis, censure);
		
		for(int i=0;i<series.length;i++){
			if(series[i]!=null && serieName.equalsIgnoreCase(series[i].getSerieName())){
				System.out.println("Ya existe una serie con ese nombre");
				i=series.length;
			}
			else if(series[i]==null){
				series[i]=serie;
				System.out.println("La serie fue agregada");
				serie.createFirstSeason(seasonNumber, programedChapters, publicatedChapters, releaseDate, seasonTrailer);
				i=series.length;
			}
		}
	}
	
	public void createMovie(String originalTitle, String producer, String synopsis, int recomendedAge, String trailer, int genre){
		
		Movie movie= new Movie(originalTitle, producer, synopsis, recomendedAge, trailer, genre);
		
		for(int i=0;i<movies.length;i++){
			if(movies[i]!=null){
				System.out.println("Lo siento, ha ocurrido un error agregando la pelicula");
				
			}
			else if(movies[i]==null){
				movies[i]=movie;
				System.out.println("La pelicula fue agregada");
				i=movies.length;
			}
			
		}
	}
	
	public void showSerie(String serieName){
		boolean aux7=false;
		for(int i=0;i<series.length;i++){
			if(series[i]!=null){
				if(serieName.equals(series[i].getSerieName())){
					System.out.println(series[i].toString());
					i=series.length;
					aux7=true;
				}
			}
			else if(series[0]==null){
				System.out.println("No hay series creadas todavia");
				i=series.length;
			}
		}
		if(!aux7){
			System.out.println("Lo siento ha ocurrido un error");
		}
	}
	
	public void showMovie(String originalTitle){
		boolean aux8=false;
		for(int i=0;i<movies.length;i++){
			if(movies[i]!=null){
				if(originalTitle.equals(movies[i].getOriginalTitle())){
					System.out.println(movies[i].toString());
					i=movies.length;
					aux8=true;
				}
			}
			else if(movies[0]==null){
				System.out.println("No hay peliculas creadas todavia");
				i=movies.length;
			}
		}
		if(!aux8){
			System.out.println("Lo siento ha ocurrido un error");
		}
	}
	
	public void addSeason(String seasonSerieName, int seasonNumber, int programedChapters, int publicatedChapters, String releaseDate, String seasonTrailer){
		
		Season season= new Season(seasonNumber, programedChapters, publicatedChapters, releaseDate, seasonTrailer);
		boolean aux4=false;
		for(int i=0;i<series.length;i++){
			if(series[0]==null){
				System.out.println("Lo siento, no hay ninguna serie creada todavia");
				i=series.length;
			}
			else if(series[i]!=null && seasonSerieName.equalsIgnoreCase(series[i].getSerieName())){
				Season[] auxSeasons=series[i].getSeason();
				boolean aux5=false;
				for(int j=0;j<auxSeasons.length;j++){
					if(auxSeasons[j]!=null && seasonNumber==auxSeasons[j].getSeasonNumber()){
						System.out.println("Lo siento, ya hay una temporada con ese numero");
						j=auxSeasons.length;
						i=series.length;
						aux5=true;
					}
				}
				if(!aux5){
					series[i].addSeason(season);
					System.out.println("La temporada ha sido agregada correctamente");
					i=series.length;
					aux4=true;
				}
			}
		}
		if(!aux4){
			System.out.println("Ha ocurrido un error");
		}
	}
	
	public void showMoviePerCategory(int optionMovie){
		String info="";
		boolean aux6=false;
		Movie[] moviesPerGenre= new Movie[85];
		if(movies[0]==null){
			System.out.println("No hay peliculas creadas todavia");
		}
		for(int i=0;i<movies.length;i++){
			
			if(movies[i]!=null && movies[i].getAuxGenre()==optionMovie){
				moviesPerGenre[i]=movies[i];
				aux6=true;
			}
		}
		for(int i=0;i<moviesPerGenre.length;i++){
			if(moviesPerGenre[i]!=null){
				info+=moviesPerGenre[i].toString();
			}
		}
		if(!aux6){
			System.out.println("No hay ninguna pelicula con ese genero");
		}
		System.out.println(info);
	}
	
	public void showAllSeries(){
		String seriesInfo="";
		if(series[0]==null){
			System.out.println("No hay series creadas todavia");
		}
		for(int i=0;i<series.length;i++){
			if(series[i]!=null){
				seriesInfo+=series[i].toString2();
			}
		}
		System.out.println(seriesInfo);
	}
}