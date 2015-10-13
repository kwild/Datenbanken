

public class MainGui {
	public MainGui (){
		super();
	}
	public MainGui (String rolle, String datenbankBenutzerName, String datenbankBenutzerPasswort, String user_id){
		System.out.println("Datenbank-Verbindung hergestellt.");
		System.out.println(datenbankBenutzerName);
		System.out.println(datenbankBenutzerPasswort);
		System.out.println(user_id);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainWindow theAppWindow = new MainWindow();
		theAppWindow.setTitle("Login");
		theAppWindow.setBounds(10, 10, 465, 290);
		theAppWindow.show();
	}

}
