public abstract class MesoInherit {
public int[] calAverage() {
		String StID = "OKCE";
		int[] letter = new int[4];
		letter[0] = StID.charAt(0);
		letter[1] = StID.charAt(1);
		letter[2] = StID.charAt(2);
		letter[3] = StID.charAt(3);
		
		int[] average = new int[4];
		double mean = 0;
		for (int i = 0; i < letter.length; i++) {
			mean += letter[i];
		}
		mean = mean/letter.length;
		average[0] = ;
		average[1] = Math.ceil(mean);
		average[2] = ;
		
	}
	public char letterAverage() {
		
	}
}