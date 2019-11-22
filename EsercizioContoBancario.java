/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author LABSISE
 */
public class EsercizioContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoEsteso banana = new ContoEsteso("1F220", 200000000);
        banana.deposito();
        banana.prelievo();
        System.out.println("Bilancio conto bancario : " + banana.getBilancio());
        System.out.println("Numero conto : " + banana.getNumeroConto());
        System.out.println("Fido : " + banana.getFido());

        ContoBancario mela = new ContoBancario("14420", 200550000);
        System.out.println("Bilancio conto esteso : " + mela.getBilancio());
        System.out.println("Numero conto : " + mela.getNumeroConto());

    }

}
