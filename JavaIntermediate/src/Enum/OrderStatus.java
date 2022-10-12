package Enum;

public enum OrderStatus {


	PENDING("Order is pending"),
	COMPLETED("Order is completed"),
	REJECTED("Order is rejected"),
	DELIVERED("Order is delivered"),
	FEEDBACKCOLLECTED("Feedback collected");
	
	//this alone gives errors, so create constructor
	String des;
	
	
	private OrderStatus(String o) {
		des=o;//red lines gone from ln4-7
	}
	public String getOrder()
	{
		return des;
	}

}
