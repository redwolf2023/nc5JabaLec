package chap18_enum.enums;

public enum Season {
	
	SPRING("봄") {
		@Override
		public void printSeasonMonth() {
			//봄은 3, 4, 5월 입니다.
			int [] month = {3, 4, 5};
			for(int s : month) {
				System.out.println(s + "월");				
			}
			System.out.println("입니다.");
		}
	}, SUMMER("여름") {
		@Override
		public void printSeasonMonth() {
			//여름은 6, 7, 8월 입니다.
			int [] month = {6, 7, 8};
			for(int s : month) {
				System.out.println(s + "월");				
			}
			System.out.println("입니다.");
		}
	}, FALL("가을") {
		@Override
		public void printSeasonMonth() {
			//가을은 9, 10 ,11월 입니다.
			int [] month = {9, 10, 11};
			for(int s : month) {
				System.out.println(s + "월");				
			}
			System.out.println("입니다.");
		}
	}, WINTER("겨울") {
		@Override
		public void printSeasonMonth() {
			//겨울은 12, 1, 2월 입니다.
			int [] month = {12, 1, 2};
			for(int s : month) {
				System.out.println(s + "월");				
			}
			System.out.println("입니다.");
		}
	};
	
	private String koreaSeason;
	
	private Season(String koreaSeason) {
		this.koreaSeason = koreaSeason;
	}

	public String getKoreaSeason() {
		return koreaSeason;
	}
	
	public abstract void printSeasonMonth();
}
