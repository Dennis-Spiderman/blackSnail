package model;

public class Movie{
	
	private String originalTitle;
	private String producer;
	private String synopsisMovie;
	private int recomendedAge;
	private String trailer;
	private int auxGenre;
	
	private Genre genre;
	
	public Movie(String originalTitle, String producer, String synopsisMovie, int recomendedAge, String trailer, int auxGenre){
		
		this.originalTitle=originalTitle;
		this.producer=producer;
		this.synopsisMovie=synopsisMovie;
		this.recomendedAge=recomendedAge;
		this.trailer=trailer;
		
		setGenre(auxGenre);
	}
	
	public String getOriginalTitle(){
		return originalTitle;
	}
	
	public void setOriginalTitle(String originalTitle){
		this.originalTitle=originalTitle;
	}
	
	public String getProducer(){
		return producer;
	}
	
	public void setProducer(String producer){
		this.producer=producer;
	}
	
	public String getSynopsisMovie(){
		return synopsisMovie;
	}
	
	public void setSynopsisMovie(String synopsisMovie){
		this.synopsisMovie=synopsisMovie;
	}
	
	public int getRecomendedAge(){
		return recomendedAge;
	}
	
	public void setRecomendedAge(int recomendedAge){
		this.recomendedAge=recomendedAge;
	}
	
	public String getTrailer(){
		return trailer;
	}
	
	public void setTrailer(String trailer){
		this.trailer=trailer;
	}
	
	public int getAuxGenre(){
		return auxGenre;
	}
	
	public void setGenre(int auxGenre){
		this.auxGenre=auxGenre;
		switch(auxGenre){
			case 1:
				genre=Genre.ROMANTICA;
				break;
			case 2:
				genre=Genre.ACCION;
				break;
			case 3:
				genre=Genre.SUSPENSO;
				break;
			case 4:
				genre=Genre.TERROR;
				break;
			case 5:
				genre=Genre.COMEDIA;
				break;
		}
	}
	
	public String toString(){
		
		return "Nombre original de la pelicula: "+originalTitle+"\n"+
		"Productora de la pelicula: "+producer+"\n"+
		"Synopsis de la pelicula: "+synopsisMovie+"\n"+
		"Edad recomendada para ver la pelicula: "+recomendedAge+"\n"+
		"Link del trailer de la pelicula: "+trailer+"\n"+
		"Genero de la pelicula: "+genre+"\n";
	}
}