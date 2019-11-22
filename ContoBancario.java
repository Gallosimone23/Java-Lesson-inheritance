/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author gallo.simone
 */
public class ContoBancario {

    protected String numeroConto;
    protected int bilancio = 0;

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
    }

    public ContoBancario(String numeroConto, int bilancio) {
        this.numeroConto = numeroConto;
        this.bilancio = bilancio;
    }

    public String getNumeroConto() {
        return numeroConto;
    }

    public int getBilancio() {
        return bilancio;

    }

    public void prelievo() {
        int soldi = 0;
        do {
            soldi = Integer.parseInt(JOptionPane.showInputDialog("Inserire soldi"));
            if (bilancio > soldi) {
                bilancio = bilancio - soldi;
            } else {
                JOptionPane.showMessageDialog(null, "Non ci sono abbastanza soldi");
            }
        } while (bilancio < soldi);
        
    }

    
public void deposito() {
        int soldi = 0;
        soldi = Integer.parseInt(JOptionPane.showInputDialog("Quanti soldi vuoi depositare?"));
        bilancio = bilancio + soldi;
    }
}