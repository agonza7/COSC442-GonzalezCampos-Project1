package edu.towson.cis.cosc442.project1.monopoly;

//Adding some chnges in order to keep track in the TASK 15 Commit!
public abstract class Cell implements IOwnable {
	private boolean available = true;
	private String name;
	protected Player theOwner;

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#getTheOwner()
	 */
	@Override
	public Player getTheOwner() {
		return theOwner;
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#getPrice()
	 */
	@Override
	public int getPrice() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.IOwnable#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		return available;
	}
	
	public abstract boolean playAction(String msg);

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    public String toString() {
        return name;
    }
}
