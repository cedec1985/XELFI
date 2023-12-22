/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle.connexion;

import com.sun.jdi.connect.spi.Connection;
import static controle.connexion.ControleConnexion.laConnectionStatique;

/**
 *
 * @author cedec
 */
class DriverManager {

    static Connection getConnection(String urlBD, String nomUtilisateur, String MDP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Connection  GetConnection(){
        return laConnectionStatique;
    }
}
