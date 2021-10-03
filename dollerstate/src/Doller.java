
public class Doller
{
	State printState;
	State tornState;
	State dublicateState;
	State state;
	
	public Doller()
	{
		printState = new PrintState(this);
		tornState = new TornState(this);
		dublicateState = new DublicateState(this);
		state = printState;
	}
	
	public void setState(State state)
	{
		this.state = state;
	}
	
	public State getState() 
	{
		return state;
	}

	public State getPrintState()
	{
		return printState;
	}

	public State getTornState()
	{
		return tornState;
	}

	public State getDublicateState()
	{
		return dublicateState;
	}

	
	public void printDoller()
	{
		state.printDoller();
	}
	
	public void dublicateDoller()
	{
		state.dublicateDoller();
	}

	
	public void tornDoller()
	{
		state.tornDoller();
	}
	

}
