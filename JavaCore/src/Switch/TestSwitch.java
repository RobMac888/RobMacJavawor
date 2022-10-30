package Switch; //fixed number eg 4 for a cardpack

public class TestSwitch {
	
	public static void main(String[] args ) {
		String card = "Spade";
		switch (card) {
		case "club":
			System.out.println("You have a club");
			break;
		case "Diamond":
			System.out.println();
			break;
		case "Spade":
			System.out.println("You have a Spade");
			break;
		case "heart":
			System.out.println("You have a heart");
			break;
		default:
			
			System.out.println("Not a valid card");
		}
	}

}
