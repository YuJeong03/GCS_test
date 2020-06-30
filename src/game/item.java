package game;

public class item {
	private String mname;
	private int mitemcode;
	private int mitemCount;
	private long mGUID;
	
	public item(String name, int itemcode, int guid, int itemcount) {
		mname = name;
		mitemcode = itemcode;
		mGUID = guid;
		mitemCount = itemcount;		
	}
}
