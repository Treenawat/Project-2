import java.util.Arrays;

public abstract class MesoAbstract 
{
	//Protected String
	protected String StID;
	
	//Abstract
	public MesoAbstract(MesoStation mesoStation) {
		StID = mesoStation.getStID();
	}
	
	//Array created for MesoInherit
	int[] average = new int[3];
}
