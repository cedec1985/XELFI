package controle.etat;

import controle.connexion.ControleConnexion;
import controle.utilitaires.Systeme;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class JasperMySQL_Parametres {

    private static Connection laConnexion =
            (Connection) ControleConnexion.getLaConnectionStatique();
    private static JasperDesign design = null;
    private static JasperReport report = null;
    private static JasperPrint print = null;
    private static String code_facture = "";
    private static String code_client = "";
    private static String recherche_article = "";
    private static Object JRExporterParameter;

    public static String getcode_facture() {
        return code_facture;
    }
    public static String getCode_Client() {
        return code_client;
    }
    public static String getRecherche_article() {
        return recherche_article;
    }
    public static void setCode_facture
            (String code_facture) {
        JasperMySQL_Parametres
                .code_facture = code_facture;
    }
    public static void setCode_client
            (String code_client) {
        JasperMySQL_Parametres
                .code_client = code_client;
    }
    public static void setRecherche_article
            (String recherche_article) {
        JasperMySQL_Parametres
                .recherche_article = recherche_article;
    }

    public static void chargeEtcompile(String rapport) {
        design = JRXmlLoader.load(Systeme.getRepertoireCourant()
                + Systeme.getSeparateur() + "jasper"
                + Systeme.getSeparateur() + rapport);
        report = JasperCompileManager.compileReport(design);
        HashMap<String, Object> mesParametres
                = new HashMap<>();
        mesParametres.put("code", new String("%"));
        mesParametres.put("recherche_article",
                new String('%' + getRecherche_article()
                        + '%'));
        mesParametres.put("code_facture",
                new String(getcode_facture()));
        print = JasperFillManager.fillReport
                            (report, mesParametres, laConnexion);
    }

    public static void apercu(String rapport) {
        chargeEtcompile(rapport);
        try {
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erreur lors de l'aperçu : \n" 
                    + e.getMessage()
                    + "\nVeuillez contacter "
                    + "votre administrateur", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void imprimer(String rapport) {
        chargeEtcompile(rapport);
        try {
            JasperPrintManager.printReport(print, true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "L'impression a échoué : \n" 
                    + e.getMessage()
                    + "\nVeuillez contacter "
                    + "votre administrateur", "Erreur",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void exporterPDF(String rapport) {
        JFileChooser save = new JFileChooser();
        save.setSelectedFile(new File("Fichier.pdf"));
        int retour = save.showSaveDialog(save);
        if (retour == JFileChooser.APPROVE_OPTION) {
            try {
                chargeEtcompile(rapport);
                JasperExportManager
                        .exportReportToPdfFile(print, 
                           save.getSelectedFile()
                           .getAbsolutePath());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, 
                        "L'export au format PDF a échoué :"
                        + " \n" + e.getMessage()
                        + "\nVeuillez contacter "
                        + "votre administrateur", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void exportHTML(String rapport) {
        chargeEtcompile(rapport);
        JFileChooser save = new JFileChooser();
        save.setSelectedFile(new File("Fichier.html"));
        int retour = save.showSaveDialog(save);
        if (retour == JFileChooser.APPROVE_OPTION) {
            try {
                JasperExportManager
                        .exportReportToHtmlFile
                           (print, save.getSelectedFile()
                           .getAbsolutePath());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "L'export au format HTML a échoué :"
                        + " \n" + e.getMessage()
                        + "\nVeuillez contacter "
                        + "votre administrateur", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static class JRXmlLoader {

        private static JasperDesign load(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public JRXmlLoader() {
        }
    }

    private static class JasperFillManager {

        private static JasperPrint fillReport(JasperReport report, HashMap<String, Object> mesParametres, Connection laConnexion) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public JasperFillManager() {
        }
    }

    private static class JasperPrintManager {

        private static void printReport(JasperPrint print, boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public JasperPrintManager() {
        }
    }

    private static class JasperCompileManager {

        private static JasperReport compileReport(JasperDesign design) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public JasperCompileManager() {
        }
    }

    private static class JasperDesign {

        public JasperDesign() {
        }
    }

    private static class JasperReport {

        public JasperReport() {
        }
    }

    private static class JasperPrint {

        public JasperPrint() {
        }
    }

    private static class JasperViewer {

        private static void viewReport(JasperPrint print, boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public JasperViewer() {
        }
    }

    private static class JRException {

        public JRException() {
        }
    }

    private static class JasperExportManager {

        private static void exportReportToPdfFile(JasperPrint print, String absolutePath) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void exportReportToHtmlFile(JasperPrint print, String absolutePath) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public JasperExportManager() {
        }
    }

    private static class JRDocxExporter {

        public JRDocxExporter() {
        }
    }

    private static class JROdtExporter {

        public JROdtExporter() {
        }
    }


    private static class JRExporterParameter {

        public JRExporterParameter() {
        }
    }

}
