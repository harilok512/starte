
public class TornState implements State {
	Doller doller;

	public TornState(Doller doller) {
		this.doller = doller;
	}

	@Override
	public void printDoller() {
		System.out.println("printing new doller");
		doller.setState(doller.getPrintState());
	}

	@Override
	public void dublicateDoller() {
		System.out.println("doller is dublicate");
	}

	@Override
	public void tornDoller() {
		System.out.println("Dublicate doller is torned");

	}
}


