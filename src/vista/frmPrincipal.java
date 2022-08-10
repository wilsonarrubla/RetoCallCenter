/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.CallCenter;
import controlador.Empleado;
import java.awt.Image;
import javax.swing.JOptionPane;
import modelo.modelEmpleado;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class frmPrincipal extends javax.swing.JFrame {

   //Atributos
        modelEmpleado modEmple =new modelEmpleado();
        Empleado emp1;
        CallCenter liquidacion = new CallCenter();
        LinkedList<Empleado> empleadoLista = new LinkedList<>();
        private ImageIcon imagen;
        private Icon icono = new ImageIcon();
        
   
    
        
        
    public frmPrincipal() {
                
        initComponents();
        this.setLocationRelativeTo(this);
        this.pintarImagen(lblImage, "src/Imagenes/imagenNomi.png");
        this.pintarImagen(lblImage1, "src/Imagenes/imagenNomi.png");
        this.pintarImagen(lblImageEditEmpl, "src/Imagenes/imagenNomi.png");  
        this.pintarImagen(lblImageElimEmpl1, "src/Imagenes/imagenNomi.png");
        this.pintarImagen(lblImageRepEmpl2, "src/Imagenes/imagenNomi.png"); 
        this.pintarImagen(lblImageLqMasEmpl, "src/Imagenes/imagenNomi.png");
        this.empleadoLista = modEmple.listaEmpleado();
        this.listaEmpleado();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_generarNomina = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPanel_grupo = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        codigoEmpleado = new javax.swing.JLabel();
        jTextField_codiEmpleado = new javax.swing.JTextField();
        jButton_consultaEmple = new javax.swing.JButton();
        jLabel_nombre = new javax.swing.JLabel();
        jTextField_nombreConsul = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_apellidoconsult = new javax.swing.JTextField();
        jTextField_vlrHorasExtras = new javax.swing.JTextField();
        jTextField_salario = new javax.swing.JTextField();
        jLabel_salario = new javax.swing.JLabel();
        jLabel_vlrHExt = new javax.swing.JLabel();
        jCheckBox_AuxTrans = new javax.swing.JCheckBox();
        jButton_liqudacion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_totalNomina = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_totalPrestaciones = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_Cedula = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        nombreSistemaNomina = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jPanelCrearemple = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Apellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Salario = new javax.swing.JTextField();
        jTextField_HoraExtra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Bonificacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_AuxTrans = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField_CedulaAddEmpl = new javax.swing.JTextField();
        lblImage1 = new javax.swing.JLabel();
        nombreSistemaNomina2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel_nombreMod = new javax.swing.JLabel();
        jTextField_nombreConsulMod = new javax.swing.JTextField();
        jTextField_apellidoconsultMod = new javax.swing.JTextField();
        jLabel_ApellidoMod = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton_GuardarMod = new javax.swing.JButton();
        jLabel_salario1 = new javax.swing.JLabel();
        jTextField_salarioMod = new javax.swing.JTextField();
        jLabel_vlrHExt1 = new javax.swing.JLabel();
        jTextField_vlrHorasExtrasMod = new javax.swing.JTextField();
        jLabel_vlrHExt2 = new javax.swing.JLabel();
        jTextField_vlrBonificacion = new javax.swing.JTextField();
        jCheckBox_AuxTransMod = new javax.swing.JCheckBox();
        jLabelConsultar_consultarEmpleMod = new javax.swing.JLabel();
        codigoEmpleado1 = new javax.swing.JLabel();
        jTextField_codiEmpleadoMod = new javax.swing.JTextField();
        jButton_consultaEmpleMod = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTextField_CedulaEdiEmpl = new javax.swing.JTextField();
        lblImageEditEmpl = new javax.swing.JLabel();
        nombreSistemaNomina3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabelConsultar_consultarEmpleMod1 = new javax.swing.JLabel();
        codigoEmpleado2 = new javax.swing.JLabel();
        jTextField_codiEmpleadoDel = new javax.swing.JTextField();
        jButton_Eliminar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nombreSistemaNomina4 = new javax.swing.JLabel();
        lblImageElimEmpl1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblImageRepEmpl2 = new javax.swing.JLabel();
        nombreSistemaNomina5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListl_EmpleadoLista = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton_ProcMasiv = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_LiquMAsiva = new javax.swing.JList<>();
        lblImageLqMasEmpl = new javax.swing.JLabel();
        nombreSistemaNomina6 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        jButton_generarNomina.setText("Generar Nómina");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        codigoEmpleado.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        codigoEmpleado.setForeground(new java.awt.Color(47, 76, 27));
        codigoEmpleado.setText("Código");

        jTextField_codiEmpleado.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_codiEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_codiEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_codiEmpleadoActionPerformed(evt);
            }
        });

        jButton_consultaEmple.setBackground(new java.awt.Color(124, 147, 99));
        jButton_consultaEmple.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton_consultaEmple.setForeground(new java.awt.Color(255, 255, 255));
        jButton_consultaEmple.setText("Consultar Empleado");
        jButton_consultaEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultaEmpleActionPerformed(evt);
            }
        });

        jLabel_nombre.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(47, 76, 27));
        jLabel_nombre.setText("Nombre");

        jTextField_nombreConsul.setEditable(false);
        jTextField_nombreConsul.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_nombreConsul.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_nombreConsul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField_nombreConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombreConsulActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(47, 76, 27));
        jLabel5.setText("Apellido");

        jTextField_apellidoconsult.setEditable(false);
        jTextField_apellidoconsult.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_apellidoconsult.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_apellidoconsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellidoconsultActionPerformed(evt);
            }
        });

        jTextField_vlrHorasExtras.setEditable(false);
        jTextField_vlrHorasExtras.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_vlrHorasExtras.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_vlrHorasExtras.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField_vlrHorasExtras.setText("0");

        jTextField_salario.setEditable(false);
        jTextField_salario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_salario.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_salario.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField_salario.setText("0");

        jLabel_salario.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel_salario.setForeground(new java.awt.Color(47, 76, 27));
        jLabel_salario.setText("Salario");

        jLabel_vlrHExt.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel_vlrHExt.setForeground(new java.awt.Color(47, 76, 27));
        jLabel_vlrHExt.setText("Valor horas Extras");

        jCheckBox_AuxTrans.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jCheckBox_AuxTrans.setForeground(new java.awt.Color(47, 76, 27));
        jCheckBox_AuxTrans.setText("Auxilio de transporte");

        jButton_liqudacion.setBackground(new java.awt.Color(124, 147, 99));
        jButton_liqudacion.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton_liqudacion.setForeground(new java.awt.Color(255, 255, 255));
        jButton_liqudacion.setText("Generar Liquidación");
        jButton_liqudacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_liqudacionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(47, 76, 27));
        jLabel6.setText("Total Nómina Empleado");

        jTextField_totalNomina.setEditable(false);
        jTextField_totalNomina.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_totalNomina.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_totalNomina.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_totalNomina.setText("0");
        jTextField_totalNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_totalNominaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(47, 76, 27));
        jLabel7.setText("Total Prestaciones ");

        jTextField_totalPrestaciones.setEditable(false);
        jTextField_totalPrestaciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_totalPrestaciones.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_totalPrestaciones.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField_totalPrestaciones.setText("0");
        jTextField_totalPrestaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_totalPrestacionesActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(124, 147, 99));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(47, 76, 27));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nómina Empleado");
        jLabel2.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(47, 76, 27));
        jLabel16.setText("Cedula");

        jTextField_Cedula.setEditable(false);
        jTextField_Cedula.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField_Cedula.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(codigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_codiEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jButton_consultaEmple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField_nombreConsul, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_apellidoconsult, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_vlrHExt)
                            .addComponent(jTextField_vlrHorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(82, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jCheckBox_AuxTrans))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jButton_liqudacion, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_totalNomina)
                            .addComponent(jTextField_totalPrestaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoEmpleado)
                            .addComponent(jTextField_codiEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton_consultaEmple))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jLabel_salario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nombreConsul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_vlrHExt)
                    .addComponent(jTextField_apellidoconsult, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_vlrHorasExtras)
                    .addComponent(jTextField_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jCheckBox_AuxTrans)
                .addGap(30, 30, 30)
                .addComponent(jButton_liqudacion)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_totalNomina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_totalPrestaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(138, 138, 138))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 590));

        lblImage.setForeground(new java.awt.Color(188, 223, 141));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("imagen");
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 160, 140));

        nombreSistemaNomina.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        nombreSistemaNomina.setForeground(new java.awt.Color(255, 255, 255));
        nombreSistemaNomina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreSistemaNomina.setText("SISTEMA DE  NÓMINA ");
        jPanel1.add(nombreSistemaNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jLabel17.setBackground(new java.awt.Color(182, 113, 207));
        jLabel17.setOpaque(true);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 270, 590));

        jScrollPane1.setViewportView(jEditorPane1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        jTabbedPanel_grupo.addTab("liq.Nom", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCrearemple.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(47, 76, 27));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Crear Empleado");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(47, 76, 27));
        jLabel4.setText("Nombre :");

        jTextField_Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 76, 27));
        jLabel8.setText("Apellido");

        jTextField_Apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(47, 76, 27));
        jLabel9.setText("Salario ");

        jTextField_Salario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_Salario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Salario.setText("0");

        jTextField_HoraExtra.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_HoraExtra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_HoraExtra.setText("0");

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(47, 76, 27));
        jLabel10.setText("H. Ext");

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(47, 76, 27));
        jLabel11.setText("Bonificación");

        jTextField_Bonificacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_Bonificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Bonificacion.setText("0");

        jLabel12.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(47, 76, 27));
        jLabel12.setText("Aux Transporte");

        jComboBox_AuxTrans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        jButton1.setBackground(new java.awt.Color(124, 147, 99));
        jButton1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(124, 147, 99));
        jButton2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jButton2.setText("Borrar formulario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(47, 76, 27));
        jLabel18.setText("Cedula");

        jTextField_CedulaAddEmpl.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_CedulaAddEmpl.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_CedulaAddEmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CedulaAddEmplActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCrearempleLayout = new javax.swing.GroupLayout(jPanelCrearemple);
        jPanelCrearemple.setLayout(jPanelCrearempleLayout);
        jPanelCrearempleLayout.setHorizontalGroup(
            jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearempleLayout.createSequentialGroup()
                .addGroup(jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearempleLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelCrearempleLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Bonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(jPanelCrearempleLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jTextField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_CedulaAddEmpl)
                            .addComponent(jTextField_HoraExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                    .addGroup(jPanelCrearempleLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelCrearempleLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCrearempleLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_AuxTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(jTextField_Salario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCrearempleLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelCrearempleLayout.setVerticalGroup(
            jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearempleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_HoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField_Bonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField_CedulaAddEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox_AuxTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanelCrearempleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelCrearemple, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        lblImage1.setForeground(new java.awt.Color(188, 223, 141));
        lblImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage1.setText("imagen");
        jPanel2.add(lblImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 160, 140));

        nombreSistemaNomina2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        nombreSistemaNomina2.setForeground(new java.awt.Color(255, 255, 255));
        nombreSistemaNomina2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreSistemaNomina2.setText("SISTEMA DE  NÓMINA ");
        jPanel2.add(nombreSistemaNomina2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jLabel19.setBackground(new java.awt.Color(182, 113, 207));
        jLabel19.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel19.setOpaque(true);
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 270, 590));

        jTabbedPanel_grupo.addTab("Crear Empleado", jPanel2);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setPreferredSize(new java.awt.Dimension(590, 590));

        jLabel_nombreMod.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel_nombreMod.setForeground(new java.awt.Color(47, 76, 27));
        jLabel_nombreMod.setText("Nombre");

        jTextField_nombreConsulMod.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_nombreConsulMod.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_nombreConsulMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombreConsulModActionPerformed(evt);
            }
        });

        jTextField_apellidoconsultMod.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_apellidoconsultMod.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_apellidoconsultMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellidoconsultModActionPerformed(evt);
            }
        });

        jLabel_ApellidoMod.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel_ApellidoMod.setForeground(new java.awt.Color(47, 76, 27));
        jLabel_ApellidoMod.setText("Apellido");

        jLabel15.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(47, 76, 27));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Editar Empleado");

        jButton_GuardarMod.setBackground(new java.awt.Color(124, 147, 99));
        jButton_GuardarMod.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton_GuardarMod.setForeground(new java.awt.Color(47, 76, 27));
        jButton_GuardarMod.setText("Guardar");
        jButton_GuardarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarModActionPerformed(evt);
            }
        });

        jLabel_salario1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel_salario1.setForeground(new java.awt.Color(47, 76, 27));
        jLabel_salario1.setText("Salario");

        jTextField_salarioMod.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_salarioMod.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_salarioMod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_salarioMod.setText("0");

        jLabel_vlrHExt1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_vlrHExt1.setForeground(new java.awt.Color(47, 76, 27));
        jLabel_vlrHExt1.setText("H. Extras");

        jTextField_vlrHorasExtrasMod.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_vlrHorasExtrasMod.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_vlrHorasExtrasMod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_vlrHorasExtrasMod.setText("0");

        jLabel_vlrHExt2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel_vlrHExt2.setForeground(new java.awt.Color(47, 76, 27));
        jLabel_vlrHExt2.setText("Bonificación");

        jTextField_vlrBonificacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_vlrBonificacion.setForeground(new java.awt.Color(47, 76, 27));
        jTextField_vlrBonificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_vlrBonificacion.setText("0");

        jCheckBox_AuxTransMod.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jCheckBox_AuxTransMod.setForeground(new java.awt.Color(47, 76, 27));
        jCheckBox_AuxTransMod.setText("Auxilio de transporte");

        jLabelConsultar_consultarEmpleMod.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabelConsultar_consultarEmpleMod.setForeground(new java.awt.Color(47, 76, 27));
        jLabelConsultar_consultarEmpleMod.setText("Consultar Empleado");

        codigoEmpleado1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        codigoEmpleado1.setForeground(new java.awt.Color(47, 76, 27));
        codigoEmpleado1.setText("Código");

        jTextField_codiEmpleadoMod.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_codiEmpleadoMod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_codiEmpleadoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_codiEmpleadoModActionPerformed(evt);
            }
        });

        jButton_consultaEmpleMod.setBackground(new java.awt.Color(124, 147, 99));
        jButton_consultaEmpleMod.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton_consultaEmpleMod.setForeground(new java.awt.Color(47, 76, 27));
        jButton_consultaEmpleMod.setText("Consultar Empleado");
        jButton_consultaEmpleMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_consultaEmpleModActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(47, 76, 27));
        jLabel22.setText("Cedula");

        jTextField_CedulaEdiEmpl.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_CedulaEdiEmpl.setForeground(new java.awt.Color(0, 0, 0));
        jTextField_CedulaEdiEmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CedulaEdiEmplActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(303, 303, 303)
                                .addComponent(jLabel_salario1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_salarioMod, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jTextField_vlrHorasExtrasMod)
                                    .addComponent(jTextField_vlrBonificacion)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField_CedulaEdiEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_ApellidoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_nombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_nombreConsulMod, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_apellidoconsultMod, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                        .addComponent(codigoEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_codiEmpleadoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_vlrHExt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_vlrHExt2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                        .addComponent(jButton_consultaEmpleMod, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabelConsultar_consultarEmpleMod, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_GuardarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_AuxTransMod)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelConsultar_consultarEmpleMod)
                .addGap(36, 36, 36)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoEmpleado1)
                    .addComponent(jTextField_codiEmpleadoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_consultaEmpleMod))
                .addGap(42, 42, 42)
                .addComponent(jLabel15)
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombreMod)
                    .addComponent(jTextField_nombreConsulMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_salario1)
                    .addComponent(jTextField_salarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_apellidoconsultMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ApellidoMod)
                    .addComponent(jTextField_vlrHorasExtrasMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_vlrHExt1))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jTextField_CedulaEdiEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_vlrHExt2)
                        .addComponent(jTextField_vlrBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_AuxTransMod)
                .addGap(42, 42, 42)
                .addComponent(jButton_GuardarMod)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblImageEditEmpl.setForeground(new java.awt.Color(188, 223, 141));
        lblImageEditEmpl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageEditEmpl.setText("imagen");
        jPanel8.add(lblImageEditEmpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 160, 140));

        nombreSistemaNomina3.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        nombreSistemaNomina3.setForeground(new java.awt.Color(255, 255, 255));
        nombreSistemaNomina3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreSistemaNomina3.setText("SISTEMA DE  NÓMINA ");
        jPanel8.add(nombreSistemaNomina3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jLabel21.setBackground(new java.awt.Color(182, 113, 207));
        jLabel21.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel21.setOpaque(true);
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 270, 590));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPanel_grupo.addTab("Editar Empleado", jPanel5);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setPreferredSize(new java.awt.Dimension(590, 590));

        jLabelConsultar_consultarEmpleMod1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabelConsultar_consultarEmpleMod1.setForeground(new java.awt.Color(47, 76, 27));
        jLabelConsultar_consultarEmpleMod1.setText("Consultar Empleado");

        codigoEmpleado2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        codigoEmpleado2.setForeground(new java.awt.Color(47, 76, 27));
        codigoEmpleado2.setText("Código");

        jTextField_codiEmpleadoDel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextField_codiEmpleadoDel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_codiEmpleadoDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_codiEmpleadoDelActionPerformed(evt);
            }
        });

        jButton_Eliminar.setBackground(new java.awt.Color(124, 147, 99));
        jButton_Eliminar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton_Eliminar.setForeground(new java.awt.Color(47, 76, 27));
        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(47, 76, 27));
        jLabel14.setText("Eliminar Empleado");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(codigoEmpleado2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_codiEmpleadoDel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelConsultar_consultarEmpleMod1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoEmpleado2)
                    .addComponent(jTextField_codiEmpleadoDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConsultar_consultarEmpleMod1))
                .addGap(32, 32, 32)
                .addComponent(jButton_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 590));

        nombreSistemaNomina4.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        nombreSistemaNomina4.setForeground(new java.awt.Color(255, 255, 255));
        nombreSistemaNomina4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreSistemaNomina4.setText("SISTEMA DE  NÓMINA ");
        jPanel11.add(nombreSistemaNomina4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        lblImageElimEmpl1.setForeground(new java.awt.Color(188, 223, 141));
        lblImageElimEmpl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageElimEmpl1.setText("imagen");
        jPanel11.add(lblImageElimEmpl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 160, 140));

        jLabel25.setBackground(new java.awt.Color(182, 113, 207));
        jLabel25.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel25.setOpaque(true);
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 270, 590));

        jTabbedPanel_grupo.addTab("Eliminar empleado", jPanel11);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImageRepEmpl2.setForeground(new java.awt.Color(188, 223, 141));
        lblImageRepEmpl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageRepEmpl2.setText("imagen");
        jPanel4.add(lblImageRepEmpl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 160, 140));

        nombreSistemaNomina5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        nombreSistemaNomina5.setForeground(new java.awt.Color(255, 255, 255));
        nombreSistemaNomina5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreSistemaNomina5.setText("SISTEMA DE  NÓMINA ");
        jPanel4.add(nombreSistemaNomina5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jLabel26.setBackground(new java.awt.Color(182, 113, 207));
        jLabel26.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel26.setOpaque(true);
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 270, 590));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(47, 76, 27));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Lista de Empleados");

        jListl_EmpleadoLista.setBackground(new java.awt.Color(255, 255, 255));
        jListl_EmpleadoLista.setForeground(new java.awt.Color(47, 76, 27));
        jListl_EmpleadoLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListl_EmpleadoLista);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addComponent(jScrollPane3)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 590));

        jTabbedPanel_grupo.addTab("Reporte", jPanel4);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setPreferredSize(new java.awt.Dimension(590, 161));

        jLabel23.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(47, 76, 27));
        jLabel23.setText("Año");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(47, 76, 27));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("2022");
        jTextField2.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(47, 76, 27));
        jLabel24.setText("Mes:");

        jComboBox1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(47, 76, 27));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));

        jButton_ProcMasiv.setBackground(new java.awt.Color(124, 147, 99));
        jButton_ProcMasiv.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton_ProcMasiv.setForeground(new java.awt.Color(47, 76, 27));
        jButton_ProcMasiv.setText("Procesar");
        jButton_ProcMasiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ProcMasivActionPerformed(evt);
            }
        });

        jList_LiquMAsiva.setBackground(new java.awt.Color(255, 255, 255));
        jList_LiquMAsiva.setForeground(new java.awt.Color(47, 76, 27));
        jScrollPane2.setViewportView(jList_LiquMAsiva);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(43, 43, 43)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, 0, 105, Short.MAX_VALUE)
                .addGap(154, 154, 154))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jButton_ProcMasiv, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_ProcMasiv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        lblImageLqMasEmpl.setForeground(new java.awt.Color(188, 223, 141));
        lblImageLqMasEmpl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageLqMasEmpl.setText("imagen");
        jPanel7.add(lblImageLqMasEmpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 160, 140));

        nombreSistemaNomina6.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        nombreSistemaNomina6.setForeground(new java.awt.Color(255, 255, 255));
        nombreSistemaNomina6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreSistemaNomina6.setText("SISTEMA DE  NÓMINA ");
        jPanel7.add(nombreSistemaNomina6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jLabel27.setBackground(new java.awt.Color(182, 113, 207));
        jLabel27.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel27.setOpaque(true);
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 270, 590));

        jTabbedPanel_grupo.addTab("Liq Masiva", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanel_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanel_grupo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        // TODO add your handling code here:
        int confir = JOptionPane.showConfirmDialog(rootPane, "Desea eliminar el empleado con Id: \n" + jTextField_codiEmpleadoDel.getText());

        System.out.println("Confir: " + confir);

        if( confir ==  JOptionPane.YES_OPTION){

            if(modEmple.eliminarEmpleado(jTextField_codiEmpleadoDel.getText())){
                JOptionPane.showMessageDialog(rootPane, "Empleado eliminado correctamente");
                actVistaEmpleado();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Empleado no existe");
            }

        }else{
            if( confir == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(rootPane, "Empleado no eliminado");
            }
        }
        
        if(confir== JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(rootPane, "Operación Cancelada");
            jTextField_codiEmpleadoDel.setText("");
        }
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void jTextField_codiEmpleadoDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_codiEmpleadoDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_codiEmpleadoDelActionPerformed

    private void jButton_GuardarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarModActionPerformed
        // Guardar Edicion de empleados

        try{
            if(jTextField_CedulaEdiEmpl.getText().equals("")|| jTextField_nombreConsulMod.getText().equals("")||jTextField_apellidoconsultMod.getText().equals("")||Integer.valueOf(jTextField_salarioMod.getText()) <=0||jTextField_codiEmpleadoMod.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Los datos del nombre apellido código y salario son obligatorios :" );
            }else{

               if(modEmple.editEmpleado(Integer.valueOf(jTextField_codiEmpleadoMod.getText()), jTextField_CedulaEdiEmpl.getText(), jTextField_nombreConsulMod.getText(), jTextField_apellidoconsultMod.getText(), Integer.valueOf(jTextField_vlrHorasExtrasMod.getText()), jCheckBox_AuxTransMod.isSelected(), Integer.valueOf(jTextField_salarioMod.getText()), Integer.valueOf(jTextField_vlrBonificacion.getText()  ))){
                    JOptionPane.showMessageDialog(rootPane, "Registro editado Exitosamente!:" );
                
                }

                //Borramos los registros una vez  guardado.

                jTextField_codiEmpleadoMod.setText("");
                jTextField_nombreConsulMod.setText("");
                jTextField_apellidoconsultMod.setText("");
                jTextField_vlrHorasExtrasMod.setText("0");
                jTextField_salarioMod.setText("0");
                jTextField_vlrBonificacion.setText("0");
                jCheckBox_AuxTransMod.setSelected(false);
                jTextField_CedulaEdiEmpl.setText("");
                actVistaEmpleado();
            }
            //revisar los nombres
        } catch(NumberFormatException e){
            jTextField_codiEmpleadoMod.setText("");
            jTextField_nombreConsulMod.setText("");
            jTextField_apellidoconsultMod.setText("");
            jTextField_vlrHorasExtrasMod.setText("");
            jTextField_salarioMod.setText("");
            jTextField_vlrBonificacion.setText("");
            jCheckBox_AuxTransMod.setSelected(false);
            jTextField_CedulaEdiEmpl.setText("");

            JOptionPane.showMessageDialog(rootPane, "Los valores ingresados de Valor o cantidad son incorrectos:" );

        }
    }//GEN-LAST:event_jButton_GuardarModActionPerformed

    private void jTextField_apellidoconsultModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellidoconsultModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellidoconsultModActionPerformed

    private void jTextField_nombreConsulModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombreConsulModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreConsulModActionPerformed

    private void jButton_consultaEmpleModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultaEmpleModActionPerformed
        // Consultar empleado para realizar modificaciones

        emp1 = modEmple.consultaEmpleadoId(jTextField_codiEmpleadoMod.getText());
        if (emp1==null){
            JOptionPane.showMessageDialog(rootPane, "Empleado no Existe");
            jTextField_nombreConsulMod.setText("");
            jTextField_apellidoconsultMod.setText("");
            jTextField_salarioMod.setText("");
            jTextField_vlrHorasExtrasMod.setText("");
            jCheckBox_AuxTransMod.setSelected(false);
            jTextField_codiEmpleadoMod.setText("");
            jTextField_vlrBonificacion.setText("");
            jTextField_CedulaEdiEmpl.setText("");

        }else{
            jTextField_nombreConsulMod.setText(emp1.getNombre());
            jTextField_apellidoconsultMod.setText(emp1.getApellido());
            jTextField_salarioMod.setText(String.valueOf(emp1.getSalario()));
            jTextField_vlrHorasExtrasMod.setText(String.valueOf(emp1.getHorasExtras()));
            jCheckBox_AuxTransMod.setSelected(emp1.isAuxilioTransporte());
            jTextField_vlrBonificacion.setText(String.valueOf(emp1.getBonoNAv()));
            jTextField_CedulaEdiEmpl.setText(emp1.getCedula());
        }
    }//GEN-LAST:event_jButton_consultaEmpleModActionPerformed

    private void jTextField_codiEmpleadoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_codiEmpleadoModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_codiEmpleadoModActionPerformed

    private void jTextField_CedulaAddEmplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CedulaAddEmplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CedulaAddEmplActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Borrar Formulario
        jTextField_Nombre.setText("");
        jTextField_Apellido.setText("");
        jTextField_HoraExtra.setText("0");
        jTextField_Salario.setText("0");
        jTextField_Bonificacion.setText("0");
        jComboBox_AuxTrans.setSelectedItem("NO");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try{
            if(jTextField_CedulaAddEmpl.getText().equals("")|| jTextField_Nombre.getText().equals("")||jTextField_Apellido.getText().equals("")||Integer.valueOf(jTextField_Salario.getText()) <=0){
                JOptionPane.showMessageDialog(rootPane, "Los datos del nombre apellido y salario son obligatorios :" );
            }else{

                boolean auxTraEmp;
                if (jComboBox_AuxTrans.getSelectedItem()=="SI"){
                    auxTraEmp = true;
                }else{
                    auxTraEmp = false;
                }

                //Validacion de cedula
                
                emp1 = modEmple.validarCedula(jTextField_CedulaAddEmpl.getText());
                
                if(emp1 != null){
                    JOptionPane.showMessageDialog(rootPane, "El Empleado ya existe: \n" +
                                                            "Cedula: " + jTextField_CedulaAddEmpl.getText()
                                                          + "\nId: " + emp1.getId() + " - "   + emp1.getNombre() + " " + emp1.getApellido() ); 
                    jTextField_Nombre.setText("");
                    jTextField_Apellido.setText("");
                    jTextField_HoraExtra.setText("0");
                    jTextField_Salario.setText("0");
                    jTextField_Bonificacion.setText("0");
                    jComboBox_AuxTrans.setSelectedItem("NO");
                    jTextField_CedulaAddEmpl.setText("");
                    
                }else{
                    modEmple.agregarEmpleadoBd(jTextField_Nombre.getText(), jTextField_Apellido.getText(),Integer.valueOf(jTextField_HoraExtra.getText()) , auxTraEmp, Integer.valueOf(jTextField_Salario.getText()), Integer.valueOf(jTextField_Bonificacion.getText()),jTextField_CedulaAddEmpl.getText());
                    JOptionPane.showMessageDialog(rootPane, "Empleado guardado correctamente: \n" + jTextField_Nombre.getText() +" " + jTextField_Apellido.getText() );
                

                

                    System.out.println( "nombre:" +jTextField_Nombre.getText()+
                        "\nApellido:" + jTextField_Apellido.getText() +
                        "\nHoras Extras: " + Integer.valueOf(jTextField_HoraExtra.getText()) +
                        "\nAuxilio de Transporte: " + auxTraEmp +
                        "\nSalario: " + Integer.valueOf(jTextField_Salario.getText()) +
                        "Bonificaciòn: " + Integer.valueOf(jTextField_Bonificacion.getText()));

                    jTextField_Nombre.setText("");
                    jTextField_Apellido.setText("");
                    jTextField_HoraExtra.setText("0");
                    jTextField_Salario.setText("0");
                    jTextField_Bonificacion.setText("0");
                    jComboBox_AuxTrans.setSelectedItem("NO");
                    jTextField_CedulaAddEmpl.setText("");
                    actVistaEmpleado();
                }
            }

        } catch(NumberFormatException e){
            jTextField_Nombre.setText("");
            jTextField_Apellido.setText("");
            jTextField_HoraExtra.setText("0");
            jTextField_Salario.setText("0");
            jTextField_Bonificacion.setText("0");
            jComboBox_AuxTrans.setSelectedItem("NO");
            jTextField_CedulaAddEmpl.setText("");
            JOptionPane.showMessageDialog(rootPane, "Error \n Salario y horas Extras son datos númericos:" );

        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jTextField_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CedulaActionPerformed

    private void jTextField_totalPrestacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_totalPrestacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_totalPrestacionesActionPerformed

    private void jTextField_totalNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_totalNominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_totalNominaActionPerformed

    private void jButton_liqudacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_liqudacionActionPerformed
        // TODO add your handling code here:

        emp1 = modEmple.consultaEmpleadoId(jTextField_codiEmpleado.getText());
        if (emp1==null){
            JOptionPane.showMessageDialog(rootPane, "Consulte un empleado para generar su liquidación");
            jTextField_nombreConsul.setText("");
            jTextField_apellidoconsult.setText("");
            jTextField_salario.setText("");
            jTextField_vlrHorasExtras.setText("");
            jCheckBox_AuxTrans.setSelected(false);
            jTextField_codiEmpleado.setText("");
            jTextField_totalNomina.setText("");
            jTextField_totalPrestaciones.setText("");
            jTextField_codiEmpleado.setText("");
        }else{
            //Utilizamos el metodo convertir para no tener problemas con notacion cientifica
            jTextField_totalNomina.setText(convertir(liquidacion.liquidarNominaEmp(emp1)));
            jTextField_totalPrestaciones.setText(convertir(liquidacion.liquidarPrestacionesEmp(emp1)));

            System.out.println("Total Nómina: " + convertir(liquidacion.liquidarNominaEmp(emp1)) +
                "\nTotal Prestaciones: "  +convertir(liquidacion.liquidarPrestacionesEmp(emp1)));

        }
    }//GEN-LAST:event_jButton_liqudacionActionPerformed

    private void jTextField_apellidoconsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellidoconsultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellidoconsultActionPerformed

    private void jTextField_nombreConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombreConsulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreConsulActionPerformed

    private void jButton_consultaEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_consultaEmpleActionPerformed
        // TODO add your handling code here:

        emp1 = modEmple.consultaEmpleadoId(jTextField_codiEmpleado.getText());

        if (emp1==null){
            JOptionPane.showMessageDialog(rootPane, "Empleado no Existe");
            jTextField_nombreConsul.setText("");
            jTextField_apellidoconsult.setText("");
            jTextField_salario.setText("0");
            jTextField_vlrHorasExtras.setText("0");
            jCheckBox_AuxTrans.setSelected(false);
            jTextField_codiEmpleado.setText("");
            jTextField_totalPrestaciones.setText("0");
            jTextField_totalNomina.setText("0");
            jTextField_Cedula.setText("");
        }else{
            jTextField_nombreConsul.setText(emp1.getNombre());
            jTextField_apellidoconsult.setText(emp1.getApellido());
            jTextField_salario.setText(String.valueOf(emp1.getSalario()));
            jTextField_vlrHorasExtras.setText(String.valueOf(emp1.getHorasExtras()));
            jCheckBox_AuxTrans.setSelected(emp1.isAuxilioTransporte());
            jTextField_Cedula.setText(emp1.getCedula());
        }
    }//GEN-LAST:event_jButton_consultaEmpleActionPerformed

    private void jTextField_codiEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_codiEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_codiEmpleadoActionPerformed

    private void jButton_ProcMasivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ProcMasivActionPerformed
        
        LinkedList<Empleado> empleadoLista = modEmple.listaEmpleado();
        HashMap<Integer, ArrayList> listaNominas = new HashMap<Integer, ArrayList>();
        
        listaNominas = liquidacion.procesoMasivoNominaPrestaciones(empleadoLista);
        
        if(empleadoLista == null || listaNominas == null ){
            JOptionPane.showMessageDialog(rootPane, "No existen datos para procesar");
        }else{
            ListaNominasPrestaciones(listaNominas);
        }

        actVistaEmpleado();
    }//GEN-LAST:event_jButton_ProcMasivActionPerformed

    private void jTextField_CedulaEdiEmplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CedulaEdiEmplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CedulaEdiEmplActionPerformed

     //Metodo para escalar imagenes
    private  void pintarImagen(JLabel lbl, String ruta){
            this.imagen = new ImageIcon(ruta);
            this.icono = new ImageIcon(
                    this.imagen.getImage().getScaledInstance(
                            lbl.getWidth(), 
                            lbl.getHeight(), 
                            Image.SCALE_DEFAULT
                    )
            );
            lbl.setIcon(this.icono);
            this.repaint();
        }        
    
    /*Metodo para formatear los numeros de la notación cientifica a numeros */
    public static String convertir(double val){
        Locale.setDefault(Locale.US);
        DecimalFormat num = new DecimalFormat("#,###.00");
        return num.format(val);
}
    
    
    
    //Mostrar Lista de Empleados en la vista
    private void listaEmpleado(){
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        for (Empleado empleado : empleadoLista) {
            String data =(index+1) + ")" + empleado.getId() + "Nombres: " + empleado.getNombre() + " " +empleado.getApellido();
            model.add(index, data);
            index ++;
        }
        
        jListl_EmpleadoLista.setModel(model);
    }
    
    private void ListaNominasPrestaciones(HashMap<Integer, ArrayList> listaNominas){
        
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        
        for (ArrayList i : listaNominas.values()){
            // Lista { id : (id - (nombre empleado + apellido) + nomina + prestacion) }
            String data = "Id: " + i.get(0) + " NOMBRE: " + i.get(1) + " NOMINA: " + i.get(2) + " PRESTACION: " + i.get(3);
            
            model.add(index, data);
            index ++;
            
        }
        
        jList_LiquMAsiva.setModel(model);
        
    }
    /*Metodo para mantener actualizados los registros cuando guardamos
    editamos o eliminamos*/
    
   private void actVistaEmpleado(){
        this.empleadoLista = modEmple.listaEmpleado();
        this.listaEmpleado();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigoEmpleado;
    private javax.swing.JLabel codigoEmpleado1;
    private javax.swing.JLabel codigoEmpleado2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_GuardarMod;
    private javax.swing.JButton jButton_ProcMasiv;
    private javax.swing.JButton jButton_consultaEmple;
    private javax.swing.JButton jButton_consultaEmpleMod;
    private javax.swing.JButton jButton_generarNomina;
    private javax.swing.JButton jButton_liqudacion;
    private javax.swing.JCheckBox jCheckBox_AuxTrans;
    private javax.swing.JCheckBox jCheckBox_AuxTransMod;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox_AuxTrans;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConsultar_consultarEmpleMod;
    private javax.swing.JLabel jLabelConsultar_consultarEmpleMod1;
    private javax.swing.JLabel jLabel_ApellidoMod;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nombreMod;
    private javax.swing.JLabel jLabel_salario;
    private javax.swing.JLabel jLabel_salario1;
    private javax.swing.JLabel jLabel_vlrHExt;
    private javax.swing.JLabel jLabel_vlrHExt1;
    private javax.swing.JLabel jLabel_vlrHExt2;
    private javax.swing.JList<String> jList_LiquMAsiva;
    private javax.swing.JList<String> jListl_EmpleadoLista;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelCrearemple;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPanel_grupo;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField_Apellido;
    private javax.swing.JTextField jTextField_Bonificacion;
    private javax.swing.JTextField jTextField_Cedula;
    private javax.swing.JTextField jTextField_CedulaAddEmpl;
    private javax.swing.JTextField jTextField_CedulaEdiEmpl;
    private javax.swing.JTextField jTextField_HoraExtra;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_Salario;
    private javax.swing.JTextField jTextField_apellidoconsult;
    private javax.swing.JTextField jTextField_apellidoconsultMod;
    private javax.swing.JTextField jTextField_codiEmpleado;
    private javax.swing.JTextField jTextField_codiEmpleadoDel;
    private javax.swing.JTextField jTextField_codiEmpleadoMod;
    private javax.swing.JTextField jTextField_nombreConsul;
    private javax.swing.JTextField jTextField_nombreConsulMod;
    private javax.swing.JTextField jTextField_salario;
    private javax.swing.JTextField jTextField_salarioMod;
    private javax.swing.JTextField jTextField_totalNomina;
    private javax.swing.JTextField jTextField_totalPrestaciones;
    private javax.swing.JTextField jTextField_vlrBonificacion;
    private javax.swing.JTextField jTextField_vlrHorasExtras;
    private javax.swing.JTextField jTextField_vlrHorasExtrasMod;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblImage1;
    private javax.swing.JLabel lblImageEditEmpl;
    private javax.swing.JLabel lblImageElimEmpl1;
    private javax.swing.JLabel lblImageLqMasEmpl;
    private javax.swing.JLabel lblImageRepEmpl2;
    private javax.swing.JLabel nombreSistemaNomina;
    private javax.swing.JLabel nombreSistemaNomina2;
    private javax.swing.JLabel nombreSistemaNomina3;
    private javax.swing.JLabel nombreSistemaNomina4;
    private javax.swing.JLabel nombreSistemaNomina5;
    private javax.swing.JLabel nombreSistemaNomina6;
    // End of variables declaration//GEN-END:variables
}
