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
public class ContoEsteso extends ContoBancario {

    protected int fido;

    public ContoEsteso(String numeroConto) {
        super(numeroConto);
        fido = 1000;
    }

    public ContoEsteso(String numeroConto, int bilancio) {
        super(numeroConto, bilancio);
        fido = 1000;
    }

    public ContoEsteso(int fido, String numeroConto, int bilancio) {
        super(numeroConto, bilancio);
        this.fido = fido;
    }

    public int getFido() {
        return fido;
    }

    public void setFido(int fido) {
        this.fido = fido;
    }

    @Override
    public void prelievo() {
        int soldi = 0;

        soldi = Integer.parseInt(JOptionPane.showInputDialog("Inserire soldi da prelevare soldi"));
        if (bilancio + fido > soldi) {
            bilancio = bilancio - soldi;
        } else {
            JOptionPane.showMessageDialog(null, "Non ci sono abbastanza soldi");
        }
    }
}
