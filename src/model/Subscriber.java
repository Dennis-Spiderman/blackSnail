package model;

public class Subscriber{
	
	private String id;
	private String name;
	private int age;
	private int hoursToConsume;
	private int auxType;
	private int auxState;
	
	private ClientType type;
	private State state;
	
	public Subscriber(String id, String name, int age, int hoursToConsume, int auxType, int auxState){
		
		this.id=id;
		this.name=name;
		this.age=age;
		this.hoursToConsume=hoursToConsume;
		this.auxType=auxType;
		this.auxState=auxState;
		
		setType(auxType);
		setState(auxState);
	}
	
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getHoursToConsume(){
		return hoursToConsume;
	}
	
	public void setHoursToConsume(int hoursToConsume){
		this.hoursToConsume=hoursToConsume;
	}
	
	public ClientType getType(){
		return type;
	}
	
	public int getAuxType(){
		return auxType;
	}
	
	public void setType(int auxType){
		this.auxType=auxType;
		switch(auxType){
			case 1:
				type=ClientType.Normal;
				break;
			case 2:
				type=ClientType.Platinum;
				break;
			case 3:
				type=ClientType.Gold;
				break;
			case 4:
				type=ClientType.Diamond;
				break;
		}
	}
	
	public int getAuxState(){
		return auxState;
	}
	
	public void setState(int auxState){
		this.auxState=auxState;
		switch(auxState){
			case 1:
				state=State.Active;
				break;
			case 2:
				state=State.Inactive;
				break;
		}
	}
}