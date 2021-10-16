package no.hvl.dat100.prosjekt.modell;

import java.util.Arrays;
import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		// TODO - START
		int antall = samling.getAntalKort();
		Kort[] tempSamling = samling.getSamling();
		
		for (int i = 0; i < antall; i++) {
			for (int j = 1; j < antall - i; j++) {
				if (tempSamling[j - 1].getVerdi() > tempSamling[j].getVerdi()) {
					Kort temp = tempSamling[j - 1];
					tempSamling[j - 1] = tempSamling[j];
					tempSamling[j] = temp;
				}
			}
		}
		
		// TODO - END
	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		// TODO - START
		int antall = samling.getAntalKort();
		Kort[] tempSamling = samling.getSamling();
		Random random = new Random();

		
		for (int i = 0; i < antall; i++) {
			int j = random.nextInt(antall);
			Kort temp = tempSamling[i];
			tempSamling[i] = tempSamling[j];
			tempSamling[j] = temp;
		}
		
		// TODO - END
	}
	
}
