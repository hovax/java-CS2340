package spaceTrader.Model;

public class Capital {
	
	private PoliticalSystem politicalSystem;
	private ResourcesLevel resourcesLevel;
	private String solarSystem;
	private TechLevels techLevel;
	private Pirates pirate;
	private String name;
	
	public Capital (int politicalSystem, 
			int resourcesLevel, int techLevel, 
			int pirate, String name){
		
		setName(name);
		setPoliticalSystem(politicalSystem);
		setResourcesLevel(resourcesLevel);
		setSolarSystem(name);
		setTechLevel(techLevel);
		setPirate(pirate);
		
	}
	
	@Override 
	public String toString() {
		return String.format("Planet name: %s, political system: %s, "
				+ "resources level: %s, pirate type: %s, "
				+ "belongs to solar system: %s, "
				+ "techLevel: %s \n", name, politicalSystem.toString(),
				resourcesLevel.toString(), pirate.toString(), 
				solarSystem.toString(), techLevel.toString());
	}
	
	
	
	
	public PoliticalSystem getPoliticalSystem() {
		return politicalSystem;
	}
	public void setPoliticalSystem(int politicalSystem) {
		switch (politicalSystem) {
			case 1:
				this.politicalSystem = PoliticalSystem.ANARCHY;
				break;
			case 2:
				this.politicalSystem = PoliticalSystem.CAPITALIST;
				break;
			case 3:
				this.politicalSystem = PoliticalSystem.COMMUNIST;
				break;
			case 4:
				this.politicalSystem = PoliticalSystem.CONFEDERACY;
				break;
			case 5:
				this.politicalSystem = PoliticalSystem.CORPORATE;
				break;
			case 6:
				this.politicalSystem = PoliticalSystem.CYBERNETIC;
				break;
			case 7:
				this.politicalSystem = PoliticalSystem.DEMOCRACY;
				break;
			case 8:
				this.politicalSystem = PoliticalSystem.DICTATORSHIP;
				break;
			case 9:
				this.politicalSystem = PoliticalSystem.FASCIST;
				break;
			case 10:
				this.politicalSystem = PoliticalSystem.FEUDAL;
				break;	
			case 11:
				this.politicalSystem = PoliticalSystem.MILITARY;
				break;
			case 12:
				this.politicalSystem = PoliticalSystem.PACIFIST;
				break;
			case 13:
				this.politicalSystem = PoliticalSystem.SATORI;
				break;
			case 14:
				this.politicalSystem = PoliticalSystem.SOCIALIST;
				break;
			case 15:
				this.politicalSystem = PoliticalSystem.TECHNOCRACY;
				break;
			case 16:
				this.politicalSystem = PoliticalSystem.THEOCRACY;
				break;
			default:
				this.politicalSystem = PoliticalSystem.ANARCHY;
				break;
		}
		
	}
	public ResourcesLevel getResourcesLevel() {
		return resourcesLevel;
	}
	public void setResourcesLevel(int resourcesLevel) {
		switch (resourcesLevel) {
			case 0: 
				this.resourcesLevel = ResourcesLevel.ARTISTIC;
				break;
			case 1: 
				this.resourcesLevel = ResourcesLevel.DESERT;
				break;
			case 2:
				this.resourcesLevel = ResourcesLevel.LIFELESS;
				break;
			case 3: 
				this.resourcesLevel = ResourcesLevel.LOTSOFHERBS;
				break;
			case 4: 
				this.resourcesLevel = ResourcesLevel.LOTSOFWAR;
				break;
			case 5: 
				this.resourcesLevel = ResourcesLevel.MINERALPOOR;
				break;
			case 6: 
				this.resourcesLevel = ResourcesLevel.NOSPECIAL;
				break;
			case 7: 
				this.resourcesLevel = ResourcesLevel.POORSOIL;
				break;
			case 8: 
				this.resourcesLevel = ResourcesLevel.RICHFAUNA;
				break;
			case 9: 
				this.resourcesLevel = ResourcesLevel.RICHSOIL;
				break;
			case 10: 
				this.resourcesLevel = ResourcesLevel.WARLIKE;
				break;
			case 11: 
				this.resourcesLevel = ResourcesLevel.WEIRDMUSHROOMS;
				break;	
				
			default: 
				this.resourcesLevel = ResourcesLevel.NOSPECIAL;
				break;
				
				
				
		};
	}
	public String getSolarSystem() {
		return solarSystem;
	}
	public void setSolarSystem(String solarSystem) {
		this.solarSystem = solarSystem;
	}
	public TechLevels getTechLevel() {
		return techLevel;
	}
	public void setTechLevel(int techLevel) {
		switch (techLevel) {
			case 0:
				this.techLevel = TechLevels.EARLYINDUSTRIAL;
				break;
			case 1:
				this.techLevel = TechLevels.HITECH;
				break;
			case 2:
				this.techLevel = TechLevels.INDUSTRIAL;
				break;
			case 3:
				this.techLevel = TechLevels.MEDIEVAL;
				break;
			case 4:
				this.techLevel = TechLevels.POSTINDUSTRIAL;
				break;
			case 5:
				this.techLevel = TechLevels.PREARGICULCURE;
				break;
			case 6:
				this.techLevel = TechLevels.RENAISSANCE;
				break;
			default:
				this.techLevel = TechLevels.MEDIEVAL;
				break;
		};
		
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}

	public Pirates getPirate() {
		return pirate;
	}

	public void setPirate(int pirate) {
		switch (pirate) {
			case 0:
				this.pirate = Pirates.ASKFORMONEY;
				break;
			case 1:
				this.pirate = Pirates.FIREONSIGHT;
				break;
			case 2:
				this.pirate = Pirates.KILLONSIGHT;
				break;
			case 3:
				this.pirate = Pirates.RECRUTER;
				break;
			default:
				this.pirate = Pirates.ASKFORMONEY;
				break;
				
		};
		
	}
	
}
