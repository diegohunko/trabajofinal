/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.clientes;

import controlador.Controlador;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import modelo.Cliente;
import modelo.Cliente_;
import org.eclipse.persistence.exceptions.QueryException;

/**
 *
 * @author Diego Raul Fernandez
 */
public class VentanaCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCliente
     */
    private final JFrame vp;
    private final Controlador controlador;
    public VentanaCliente(Controlador c, JFrame previo) {
        this.controlador = c;
        this.vp = previo;
        initComponents();
        /*Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;*/
        //setSize(width/2, height);
        setLocationRelativeTo(null);
        setVisible(true);
        this.vp.setVisible(false);
        limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtCUIT = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        btnCrearCliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstClientes = new javax.swing.JList();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cmbxCriterio = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtCriterio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NUEVO CLIENTE");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setText("Razon social");

        jLabel3.setText("CUIT");

        jLabel4.setText("Domicilio Fiscal");

        jLabel5.setText("Calle");

        jLabel6.setText("Número");

        jLabel7.setText("Localidad");

        jLabel8.setText("Provincia");

        txtRazonSocial.setName("txtRazonSocial"); // NOI18N

        txtCUIT.setName("txtCuit"); // NOI18N

        txtCalle.setName("txtCalle"); // NOI18N

        txtNumero.setName("txtNumero"); // NOI18N

        txtLocalidad.setName("txtLocalidad"); // NOI18N

        txtProvincia.setName("txtProvincia"); // NOI18N

        btnCrearCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diego Raul Fernandez\\Pictures\\UN_MAS.png")); // NOI18N
        btnCrearCliente.setText("Guardar");
        btnCrearCliente.setToolTipText("Guarda los datos del cliente, si es nuevo lo crea en la BD, sino lo actualiza");
        btnCrearCliente.setName(""); // NOI18N
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("Nr Cliente");

        lblID.setText("- numero cliente -");

        lstClientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstClientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstClientes);

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Elimina el cliente seleccionado en la lista.");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cmbxCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "CUIT", "Razón Social" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(83, 83, 83)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRazonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(txtCUIT)
                                        .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(8, 8, 8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnLimpiar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnCrearCliente)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnEliminar))
                                        .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbxCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbxCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCliente)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        // TODO add your handling code here:
        try {
            if (this.lstClientes.isSelectionEmpty() ) {
                if (!this.controlador.esCliente(this.txtCUIT.getText())) {
                    this.controlador.nuevoCliente(this.txtRazonSocial.getText().toUpperCase(),
                            this.txtCUIT.getText().toUpperCase(), this.txtCalle.getText().toUpperCase(),
                            this.txtNumero.getText().toUpperCase(), this.txtLocalidad.getText().toUpperCase(),
                            this.txtProvincia.getText().toUpperCase());
                }              
                //limpiar();
            } else {
                Cliente clienteEditado;
                clienteEditado = (Cliente) this.lstClientes.getSelectedValue();
                String razon = this.txtRazonSocial.getText().toUpperCase();
                String calle = this.txtCalle.getText().toUpperCase();
                String numero = this.txtNumero.getText().toUpperCase();
                String localidad = this.txtLocalidad.getText().toUpperCase();
                String provincia = this.txtProvincia.getText().toUpperCase();
                this.controlador.modificarCliente(clienteEditado, razon, calle, numero, localidad, provincia);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()+" "+e.getCause().toString());
        } finally {
            limpiar();
        }
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void lstClientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstClientesValueChanged
        if (!this.lstClientes.isSelectionEmpty()){
            //recuperar cliente
            Cliente cli = (Cliente) this.lstClientes.getSelectedValue();
            //popu, popu, popular elementos.
            this.lblID.setText(cli.getNroCliente().toString());
            this.txtRazonSocial.setText(cli.getRazonSocial());
            this.txtCUIT.setText(cli.getCuit());
            this.txtCalle.setText(cli.getDomicilioFiscal().getCalle());
            this.txtNumero.setText(cli.getDomicilioFiscal().getNumero());
            this.txtLocalidad.setText(cli.getDomicilioFiscal().getLocalidad());
            this.txtProvincia.setText(cli.getDomicilioFiscal().getProvincia());
            this.txtRazonSocial.grabFocus();
        }
    }//GEN-LAST:event_lstClientesValueChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!this.lstClientes.isSelectionEmpty()){
            Cliente cli = (Cliente) this.lstClientes.getSelectedValue();
            try {
                this.controlador.eliminarCliente(cli);
                limpiar();
            } catch (Exception ex) {
                Logger.getLogger(VentanaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            switch (this.cmbxCriterio.getSelectedIndex()) {
                //ID
                case 0:
                    this.lstClientes.setListData(this.controlador.buscarClientes(Cliente_.nroCliente, Long.parseLong(this.txtCriterio.getText())).toArray());
                    break;
                //CUIT
                case 1:
                    this.lstClientes.setListData(this.controlador.buscarClientes(Cliente_.cuit, this.txtCriterio.getText()).toArray());
                    break;
                //Razon social
                case 2:
                    this.lstClientes.setListData(this.controlador.buscarClientes(Cliente_.razonSocial, this.txtCriterio.getText().toUpperCase()).toArray());
                    break;
            }
        } catch (NumberFormatException numberFormatException) {
            this.cmbxCriterio.setSelectedIndex(-1);
            
        } catch (QueryException qe){
            System.out.println(qe.getMessage());
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void limpiar(){
        this.lblID.setText("");
        this.txtRazonSocial.setText("");
        this.txtCUIT.setText("");
        this.txtCalle.setText("");
        this.txtNumero.setText("");
        this.txtLocalidad.setText("");
        this.txtProvincia.setText("");
        this.txtRazonSocial.grabFocus();
        this.lstClientes.setListData(this.controlador.listarClientes().toArray());
        this.lstClientes.clearSelection();
    }
// <editor-fold defaultstate="collapsed" desc="Elementos de la ventana">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbxCriterio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JList lstClientes;
    private javax.swing.JTextField txtCUIT;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCriterio;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtRazonSocial;
    // End of variables declaration//GEN-END:variables
// </editor-fold>  
}
