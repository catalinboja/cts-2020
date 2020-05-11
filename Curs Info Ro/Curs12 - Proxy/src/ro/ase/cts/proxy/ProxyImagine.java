package ro.ase.cts.proxy;

public class ProxyImagine implements InterfataImagine {

	private Imagine imagineReala = null;
	private String fisier = null;

	public ProxyImagine(final String imagine) {
		this.fisier = imagine;
	}

	@Override
	public void afisareImagine() {

		// check if we have enough memory
		if (DoWeHaveMemory(this.fisier))
			if (imagineReala == null)
				imagineReala = new Imagine(fisier);
		imagineReala.afisareImagine();
	}

	boolean DoWeHaveMemory(String fileName) {
		System.out.println("Memory check...");
		return true;
	}

}
