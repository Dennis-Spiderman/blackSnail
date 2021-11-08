package model;

public class Serie{
	
	private Season[] seasons;
	
	private String serieName;
	private String dateOfIssue;
	private String protagonistsName;
	private String directorsName;
	private String synopsis;
	private String censure;
	
	public Serie(String serieName, String dateOfIssue, String protagonistsName, String directorsName, String synopsis, String censure){
		
		this.serieName=serieName;
		this.dateOfIssue=dateOfIssue;
		this.protagonistsName=protagonistsName;
		this.directorsName=directorsName;
		this.synopsis=synopsis;
		this.censure=censure;
		
		seasons=new Season[35];
	}
	
	public void createFirstSeason(int seasonNumber, int programedChapters, int publicatedChapters, String releaseDate, String seasonTrailer){
		Season auxSeason=new Season(seasonNumber, programedChapters, publicatedChapters, releaseDate, seasonTrailer);
		seasons[0]=auxSeason;
	}
	
	public void addSeason(Season season){
		for(int i=1;i<seasons.length;i++){
			if(seasons[i]==null){
				seasons[i]=season;
				i=seasons.length;
			}
		}
	}
	
	public Season[] getSeason(){
		return seasons;
	}
	
	public String getSerieName(){
		return serieName;
	}
	
	public void setSerieName(String serieName){
		this.serieName=serieName;
	}
	
	public String getDateOfIssue(){
		return dateOfIssue;
	}
	
	public void setDateOfIssue(String dateOfIssue){
		this.dateOfIssue=dateOfIssue;
	}
	
	public String getProtagonistsName(){
		return protagonistsName;
	}
	
	public void setProtagonistsName(String protagonistsName){
		this.protagonistsName=protagonistsName;
	}
	
	public String getDirectorsName(){
		return directorsName;
	}
	
	public void setDirectorsName(String directorsName){
		this.directorsName=directorsName;
	}
	
	public String getSynopsis(){
		return synopsis;
	}
	
	public void setSynopsis(String synopsis){
		this.synopsis=synopsis;
	}
	
	public String getCensure(){
		return censure;
	}
	
	public void setCensure(String censure){
		this.censure=censure;
	}
	
	public Season findMajor(){
		
		Season major= seasons[0];
		
		for(int i=1;i<seasons.length;i++){
			
			if(seasons[i]!=null && seasons[i].getSeasonNumber()>major.getSeasonNumber()){
				major=seasons[i];
			}
		}
		
		return major;
	}
	
	public String toString(){
		
		return "Nombre de la serie: "+serieName+"\n"+
		"Fecha de lanzamiento: "+dateOfIssue+"\n"+
		"Nombre de los protagonistas: "+protagonistsName+"\n"+
		"Nombre del director de la serie: "+directorsName+"\n"+
		"Syonpsis de la serie: "+synopsis+"\n"+
		"Censura de la serie: "+censure+"\n";
	}
	
	public String toString2(){
		Season major=findMajor();
		return "Nombre de la serie: "+serieName+"\n"+
		"Fecha de lanzamiento: "+dateOfIssue+"\n"+
		"Nombre de los protagonistas: "+protagonistsName+"\n"+
		"Nombre del director de la serie: "+directorsName+"\n"+
		"Syonpsis de la serie: "+synopsis+"\n"+
		"Censura de la serie: "+censure+"\n"+
		"Esta es la informacion de la ultima temporada de la serie: \n"+
		major.toString();
	}
}