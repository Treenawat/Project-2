import java.util.Arrays;

public abstract class MesoAbstract 
{
	protected String StID;
	
	public MesoAbstract(MesoStation mesoStation) {
		StID = mesoStation.getStID();
	}
	
	int[] average = new int[3];
	
}
