package no.hvl.dat100.prosjekt.kontroll;

import no.hvl.dat100.prosjekt.modell.KortSamling;
import no.hvl.dat100.prosjekt.modell.KortUtils;
import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.spill.Spillere;
import no.hvl.dat100.prosjekt.modell.Kort;

/**
 * Abstrakt klasse som implementerer alle metodene i kontrakten (interfacet) ISpiller,
 * bortsett fra nesteHandling(). Dette er grunnen til at klassen er abstrakt.
 * For å lage "virkelige" spillere, må vi arve fra denne klassen og implementere
 * nesteHandling (fra ISpiller).
 * 
 * Klassen har objektvariablene hand (Hand), antalltrekk (heltall) og spiller
 * (Spillere). Den har to konstruktører. Se beskrivelse av disse.
 * 
 */
public abstract class Spiller implements ISpiller {

	// hand for spilleren (samling)
	private KortSamling hand; 
	
	// antall trekk spilleren har gjort fra fra-bunken
	private int antalltrekk; 
	
	// hvem spilleren er (Nord,Syd,Ingen) - se oppramsklassen Spillere
	private Spillere spiller;

	/**
	 * Standard konstruktør som oppretter en Spiller med en hånd uten kort,
	 * antalltrekk som 0 og setter spiller til Spillere.INGEN.
	 */
	public Spiller() {
		this.antalltrekk = 0;
		this.spiller = Spillere.INGEN;
		this.hand = new KortSamling();

		// TODO - END
	}

	/**
	 * Konstruktør der vi kan sette hvilken spiller det er (NORD, SYD eller
	 * INGEN).
	 * 
	 * @param spiller
	 *            hvilken spiller det er.
	 */
	public Spiller(Spillere spiller) {
		
		// TODO - START
		this.hand = new KortSamling();
		this.antalltrekk = 0;
		this.spiller = spiller;
		// TODO - END
	}

	public int getAntallKort() {
		return hand.getAntalKort();
	}

	public KortSamling getHand() {
		
		// TODO - START
		
		return hand;

		// TODO - END
	}

	public int getAntallTrekk() {
		
		// TODO - START
		
		return antalltrekk;

		// TODO - END
	}

	public Spillere hvem() {
		
		// TODO - START
		
		return spiller;

		// TODO - END
		
	}

	public void setAntallTrekk(int t) {
		
		// TODO - START
		
		this.antalltrekk = t;
		// TODO - END
	}

	public boolean erFerdig() {
		
		// TODO - START
		return hand.erTom();
		// TODO - END
		
	}

	public void leggTilKort(Kort kort) {
		
		// TODO - START

		hand.leggTil(kort);
		// TODO - END
		
	}

	public void fjernKort(Kort kort) {
		
		// TODO - START
		
		hand.fjern(kort);
		// TODO - END
		
	}

	public void fjernAlleKort() {
		
		// TODO - START
		
		hand.fjernAlle();
		// TODO - END
	}

	public void trekker(Kort kort) {
		
		// TODO - START
		hand.leggTil(kort);
		antalltrekk++;


		// TODO - END
		
	}
}
