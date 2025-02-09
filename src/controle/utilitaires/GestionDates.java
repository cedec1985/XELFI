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
        return  dateFormat.format(ladate);
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

public static Date dateJavaEnDateSQL(Date laDateDate) {
    return new java.sql.Date(laDateDate.getTime());
    }
}
