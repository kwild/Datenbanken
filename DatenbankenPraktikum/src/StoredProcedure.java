import java.sql.Connection;

public class StoredProcedure {
	/*
	 * Methode zum anlgen von Flüchtlingen. Parameter gebDatum, einzugsdatum und
	 * date müssen in der Form YYYY-DD-MM sein.
	 */
	public static void anlegenFlüchtling(Connection conn, int pid,
			String email, String vorname, String nachname, String tel,
			String handy, String geschlecht, String passExistiert,
			String gebDatum, int registriert, int unterkunft,
			String einzugsdatum, String wunschland, String orginalNachname,
			String orginalVorname, String aufenthalt, String gebdatValidiert,
			String antragstatus, int kommtAus, int sid, String thema,
			String date, String sprache, String sprachniveau,
			String schreibniveau, String lesenivau, int qid,
			String bezeichnung, String art) {

		String[] input = new String[29];
		input[0] = "" + pid;
		input[1] = "'" + email + "'";
		input[2] = "'" + vorname + "'";
		input[3] = "'" + nachname + "'";
		input[4] = "'" + tel + "'";
		input[5] = "'" + handy + "'";
		input[6] = "'" + geschlecht + "'";
		input[7] = "'" + passExistiert + "'";
		input[8] = "'" + gebDatum + "'";
		input[9] = "" + registriert;
		input[10] = "" + unterkunft;
		input[11] = "'" + einzugsdatum + "'";
		input[12] = "'" + wunschland + "'";
		input[13] = "'" + orginalNachname + "'";
		input[14] = "'" + orginalVorname + "'";
		input[15] = "'" + aufenthalt + "'";
		input[16] = "'" + gebdatValidiert + "'";
		input[17] = "'" + antragstatus + "'";
		input[18] = "" + kommtAus;
		input[19] = sid + "";
		input[20] = "'" + thema + "'";
		input[21] = "'" + date + "'";
		input[22] = "'" + sprache + "'";
		input[23] = "'" + sprachniveau + "'";
		input[24] = "'" + schreibniveau + "'";
		input[25] = "'" + lesenivau + "'";
		input[26] = "" + qid;
		input[27] = "'" + bezeichnung + "'";
		input[28] = "'" + art + "'";

		ExecutionHelper.executeStoredProcedure(conn, "GesFlüchtlingAnlegen",
				input);

	}

	/*
	 * Methode zum einfügen von... Parameter aZeit muss in der Form HH:MM:SS.X
	 * sein.
	 */
	public static void anlegenAndere(Connection conn, int aid, String aTel,
			String aName, int amaxTn, String aZeit, String aOrt, int aGem,
			String wotag, String beschreibung) {

		String[] input = new String[9];
		input[0] = "" + aid;
		input[1] = "'" + aTel + "'";
		input[2] = "'" + aName + "'";
		input[3] = "" + amaxTn;
		input[4] = "'" + aZeit + "'";
		input[5] = "'" + aOrt + "'";
		input[6] = "" + aGem;
		input[7] = "'" + wotag + "'";
		input[8] = "'" + beschreibung + "'";

		ExecutionHelper.executeStoredProcedure(conn, "GesAndereAnlegen", input);
	}
	
	/*
	 * Methode zum Anlegen von Helfern.
	 */
	public static void anlegenHelfer(Connection conn, int pid, String email,
			String vorname, String nachname, String tel, String handy,
			int gemeinde, int adresse, String straße, int plz,
			String hausnummer, int aid, String stadt) {

		String[] input = new String[13];
		input[0] = "" + pid;
		input[1] = "'" + email + "'";
		input[2] = "'" + vorname + "'";
		input[3] = "'" + nachname + "'";
		input[4] = "'" + tel + "'";
		input[5] = "'" + handy + "'";
		input[6] = "" + gemeinde;
		input[7] = "" + adresse;
		input[8] = "'" + straße + "'";
		input[9] = "" + plz;
		input[10] = "'" + hausnummer + "'";
		input[7] = "'" + stadt + "'";

		ExecutionHelper.executeStoredProcedure(conn, "GesHelferAnlegen", input);

	}
	
	/*
	 * Methode zum Anlegen von Spenden.
	 */
	public static void anlegenSpenden(Connection conn, int sid, String name,
			int anzahl, int gid, int pid, String email, String vorname,
			String nachname, String tel, String handy) {

		String[] input = new String[10];
		input[0] = "" + sid;
		input[1] = "'" + name + "'";
		input[2] = "" + anzahl;
		input[3] = "" + gid;
		input[4] = "" + pid;
		input[5] = "'" + email + "'";
		input[6] = "'" + vorname + "'";
		input[7] = "'" + nachname + "'";
		input[8] = "'" + tel + "'";
		input[9] = "'" + handy + "'";

		ExecutionHelper
				.executeStoredProcedure(conn, "GesSpendenAnlegen", input);

	}
	/*
	 * Methode zum einfügen von Sprachkursen Parameter aZeit muss in der Form HH:MM:SS.X
	 * sein.
	 */
	public static void anlegenSprachkurs(Connection conn, int aid, String aTel,
			String aName, int amaxTn, String aZeit, String aOrt, int aGem,
			String wotag, String sprachniveau, String schreibnivau,
			String lesenivau, String beschreibung) {
		
		String[] input = new String[12];
		input[0] = "" + aid;
		input[1] = "'" + aTel + "'";
		input[2] = "'" + aName + "'";
		input[3] = "" + amaxTn;
		input[4] = "'" + aZeit + "'";
		input[5] = "'" + aOrt + "'";
		input[6] = "" + aGem;
		input[7] = "'" + wotag + "'";
		input[8] = "'" + sprachniveau + "'";
		input[9] = "'" + schreibnivau + "'";
		input[10] = "'" + lesenivau + "'";
		input[11] = "'" + beschreibung + "'";
		
		ExecutionHelper
		.executeStoredProcedure(conn, "GesSprachkursAnlegen", input);
		
	}

}
