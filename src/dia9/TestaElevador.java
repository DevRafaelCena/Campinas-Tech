package dia9;

public class TestaElevador {

	public static void main(String[] args) {
		Elevador elevador1 = new Elevador(3, 20);
		elevador1.Entra();
		elevador1.Entra();
		elevador1.Sai();

		elevador1.SobeDesce(4);
		elevador1.SobeDesce(3);

	}

}
