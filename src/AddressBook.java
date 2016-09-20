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
	
}
