package controle.utilitaires;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GestionDates{
    public static String dateEnChaineFR(Date ladate) {
        Locale locale = Locale.FRANCE;
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy",locale);
        String date = dateFormat.format(ladate);
        return date;
}

public static String chaineDateFRversEN(String dateFR){
    String dateEN = "";
    String vAnneeEN = dateFR.substring(7, 10);
    String vMoisEN = dateFR.substring(4, 5);
    String vJourEN = dateFR.substring(1, 2);
    dateEN = vAnneeEN + "-" + vMoisEN + "-" + vJourEN;
    return dateEN;
}

public static String chaineDateENversFR(String dateEN){
    String dateFR = null;
    String vJourFR = dateEN.substring(9, 10);
    String vMoisFR = dateEN.substring(6, 7);
    String vAnneeFR = dateEN.substring(1, 4);
    dateEN = vJourFR + "/" + vMoisFR + "/" + vAnneeFR;
    return dateFR;
}

public static Date chaineENversDateJava (String laDateChaineEN)
        throws ParseException{
SimpleDateFormat dateStandard = new SimpleDateFormat("yyyy-MM-dd");
Date laDateDate = dateStandard.parse(laDateChaineEN);
return laDateDate;
}

public static Date dateJavaEnDateSQL(GestionDates laDate) {
    return new java.sql.Date(laDate.getTime());
    
    }

public static GestionDates dateJavaEnDateSQL() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public static Date dateJavaEnDateSQL(Date dtDate) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

private long getTime() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
