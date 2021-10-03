
public class PrintState implements State
{
	Doller doller;
	public PrintState(Doller doller)
	{
		this.doller = doller;
	}
	
	@Override
	public void printDoller() {
		System.out.println("printing new doller");
	}

	@Override
	public void dublicateDoller() {
		System.out.println("doller is dublicate");
		doller.setState(doller.getDublicateState());
    }

	@Override
	public void tornDoller() {
		System.out.println("doller got torned");
		doller.setState(doller.getDublicateState());
	}

}
