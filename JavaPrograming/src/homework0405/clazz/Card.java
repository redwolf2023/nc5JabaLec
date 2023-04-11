package homework0405.clazz;

public class Card {
	
	 private String cardName;
	 private int validYear;
	 
	 
	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public int getValidYear() {
		return validYear;
	}
	
	public void setValidYear(int validYear) {
		this.validYear = validYear;
	}
	
	
	 
	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", validYear=" + validYear + "]";
	}

	public void validEnlong(int year, CardVali cardvali ) {
		
	}
	 

}
