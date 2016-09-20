import java.util.Queue;

public class AddressBook {

	Queue<BuddyInfo> buddyList;
	
	public AddressBook()
	{
		
	}
	
	public void addBuddy(BuddyInfo bud)
	{
		buddyList.add(bud);
	}
	
	public void removeBuddy(BuddyInfo bud)
	{
		buddyList.remove(bud);
	}
	
	public static void main(String args[])
	{
		AddressBook adbk = new AddressBook();
		BuddyInfo morecrap = new BuddyInfo();
		adbk.addBuddy(morecrap);
	}
	
}
