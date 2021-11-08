package model;

public class Season{
	
	private int seasonNumber;
	private int programedChapters;
	private int publicatedChapters;
	private String releaseDate;
	private String seasonTrailer;
	
	public Season(int seasonNumber, int programedChapters, int publicatedChapters, String releaseDate, String seasonTrailer){
		
		this.seasonNumber=seasonNumber;
		this.programedChapters=programedChapters;
		this.publicatedChapters=publicatedChapters;
		this.releaseDate=releaseDate;
		this.seasonTrailer=seasonTrailer;
	}
	
	public int getSeasonNumber(){
		return seasonNumber;
	}
	
	public void setSeasonNumber(int seasonNumber){
		this.seasonNumber=seasonNumber;
	}
	
	public int getProgramedChapters(){
		return programedChapters;
	}
	
	public void setProgramedChapters(int programedChapters){
		this.programedChapters=programedChapters;
	}
	
	public int getPublicatedChapters(){
		return publicatedChapters;
	}
	
	public void setPublicatedChapters(int publicatedChapters){
		this.publicatedChapters=publicatedChapters;
	}
	
	public String getReleaseDate(){
		return releaseDate;
	}
	
	public void setReleaseDate(String releaseDate){
		this.releaseDate=releaseDate;
	}
	
	public String getSeasonTrailer(){
		return seasonTrailer;
	}
	
	public void setSeasonTrailer(String seasonTrailer){
		this.seasonTrailer=seasonTrailer;
	}
	
	public String toString(){
		
		return "Numero de la temporada: "+seasonNumber+"\n"+
		"Numero de capitulos programados: "+programedChapters+"\n"+
		"Numero de capitulos publicados: "+publicatedChapters+"\n"+
		"Fecha de lanzamiento de la temporada: "+releaseDate+"\n"+
		"Link del trailer de la temporada: "+seasonTrailer+"\n";
	}
}