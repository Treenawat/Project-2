public class MesoInherit extends MesoAbstract {
	
	public MesoInherit(MesoStation mesoStation) {
		super(mesoStation);
	}
	
public int[] calAverage() {
		//Create array for containing int valuable of each character
		int[] letter = new int[4];
		letter[0] = StID.charAt(0);
		letter[1] = StID.charAt(1);
		letter[2] = StID.charAt(2);
		letter[3] = StID.charAt(3);
		
		//Calculate mean by adding all number and divide by the length
		double mean = 0;
		for (int i = 0; i < letter.length; i++) {
			mean += letter[i];
		}
		mean = mean/letter.length;
		
		//Take out the first digit of number by spliting by . and then take the first digit number
		String[] split = String.valueOf(mean).split("\\.");
		int[] split2 = new int[2];
		split2[0]=Integer.parseInt(split[0]);
		split2[1]=Integer.parseInt(split[1]); 
		int firstDigit = Integer.parseInt(Integer.toString(split2[1]).substring(0, 1));
		
		//input each type of mean into average array
		average[0] = (int) Math.ceil(mean);
		average[1] = (int) Math.floor(mean);
		if (firstDigit >= 5) {
			average[2] = (int) Math.ceil(mean);
		}
		else {
			average[2] = (int) Math.floor(mean);
		}
		
		//return average[]
		return average;
	}
	public char letterAverage() {
		//cast char on the average to find char at that number
		char answer = 'a';
		answer = (char) average[0];
		//return the letter average
		return answer;
	}
}