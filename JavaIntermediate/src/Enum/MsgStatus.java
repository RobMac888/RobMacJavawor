package Enum;

public enum MsgStatus {
	SENT("Single tick"),
	DELIVERED("Double tick"),
	READ("Double blue tick"),
	DELETED("This msg is deleted");
	//this alone gives errors, so create constructor
	String des;
	
	
	private MsgStatus(String m) {
		des=m;//red lines gone from ln4-7
	}
	public String getMsg()
	{
		return des;
	}

}
