
public class DublicateState implements State
{
	Doller doller;
	public DublicateState(Doller doller)
	{
		this.doller = doller;
	}
	@Override
	public void printDoller() {
		System.out.println("Doller already printed");
		doller.setState(doller.getPrintState());
	}

	@Override
	public void dublicateDoller() {
		System.out.println("doller is dublicate");
	}

	@Override
	public void tornDoller() {
		System.out.println("dublicate doller torned");
		doller.setState(doller.getTornState());
	}


}
