/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jbingo.gui;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import jbingo.clases.Cartones;
import jbingo.clases.Configuracion;

/**Interfaz gráfica de la aplicación
 *
 * @author Jesús Alcalde Alcázar
 * @version 4.0
 */
public class Main extends javax.swing.JFrame {
    private JFileChooser jFileChooser1;
    private Configuracion conf;
    private int numbolas = 0;
    /**
     * Crea la interfaz gráfica.
     */
    public Main() throws IOException {
        initComponents();
        setIconImage (new ImageIcon(getClass().getResource("/images/icono.png")).getImage());
        this.menu.setVisible(true);
        this.juego.setVisible(false);
        this.configuracion.setVisible(false);
        this.cartonespane.setVisible(false);
        this.conf = new Configuracion();
        if(conf.existe()){
            conf.cargar();
            System.out.println("Cargando configuracion...");
            System.out.println(conf.toString());
        }else{
            System.out.println("Generando archivo de configuracion config.dat por defecto...");
            conf.guardar();
        }
        switch(conf.getDuracion()){
                            case 1:numbolas=40;break;
                            case 2:numbolas=60;break;
                            case 3:numbolas=90;break;
                        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jugar = new javax.swing.JButton();
        cartones = new javax.swing.JButton();
        config = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        juego = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        cartonespane = new javax.swing.JPanel();
        numcartones = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        explorar = new javax.swing.JButton();
        direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        volver1 = new javax.swing.JButton();
        generarcartones = new javax.swing.JButton();
        configuracion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        duracion = new javax.swing.JComboBox();
        voz = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        solascheck = new javax.swing.JCheckBox();
        configCancel = new javax.swing.JButton();
        defaut = new javax.swing.JButton();
        configApli = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("jBingo 4.0.1");
        setBounds(new java.awt.Rectangle(300, 150, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusCycleRoot(false);
        setFocusTraversalPolicyProvider(true);
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(650, 450));
        setName("principal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(650, 450));

        menu.setBackground(new java.awt.Color(202, 212, 249));
        menu.setForeground(new java.awt.Color(0, 0, 153));
        menu.setMinimumSize(new java.awt.Dimension(650, 450));
        menu.setPreferredSize(new java.awt.Dimension(650, 450));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_disable.png"))); // NOI18N
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoMouseExited(evt);
            }
        });

        jugar.setText("Jugar");
        jugar.setToolTipText("");
        jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jugarMouseClicked(evt);
            }
        });
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        cartones.setText("Cartones");
        cartones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartonesMouseClicked(evt);
            }
        });
        cartones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartonesActionPerformed(evt);
            }
        });

        config.setText("Configuración");
        config.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configMouseClicked(evt);
            }
        });
        config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(60, 127, 177));
        jLabel5.setText("v 4.0");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(config, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartones, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cartones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(config, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );

        juego.setBackground(new java.awt.Color(202, 212, 249));

        volver.setText("Volver");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout juegoLayout = new javax.swing.GroupLayout(juego);
        juego.setLayout(juegoLayout);
        juegoLayout.setHorizontalGroup(
            juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, juegoLayout.createSequentialGroup()
                .addContainerGap(550, Short.MAX_VALUE)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        juegoLayout.setVerticalGroup(
            juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, juegoLayout.createSequentialGroup()
                .addContainerGap(405, Short.MAX_VALUE)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cartonespane.setBackground(new java.awt.Color(202, 212, 249));
        cartonespane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        numcartones.setToolTipText("");
        numcartones.setName(""); // NOI18N
        numcartones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numcartonesActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero de cartones a generar:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        logo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logo1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_disable.png"))); // NOI18N
        logo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logo1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logo1MouseExited(evt);
            }
        });

        explorar.setText("Explorar...");
        explorar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                explorarMouseClicked(evt);
            }
        });
        explorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explorarActionPerformed(evt);
            }
        });

        direccion.setToolTipText("");
        direccion.setName(""); // NOI18N
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Dode lo guardamos:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        volver1.setText("Volver");
        volver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volver1MouseClicked(evt);
            }
        });

        generarcartones.setFont(new java.awt.Font("Segoe Keycaps", 1, 30)); // NOI18N
        generarcartones.setText("CR3AR");
        generarcartones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generarcartones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generarcartonesMouseClicked(evt);
            }
        });
        generarcartones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarcartonesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cartonespaneLayout = new javax.swing.GroupLayout(cartonespane);
        cartonespane.setLayout(cartonespaneLayout);
        cartonespaneLayout.setHorizontalGroup(
            cartonespaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartonespaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(cartonespaneLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(cartonespaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cartonespaneLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numcartones, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cartonespaneLayout.createSequentialGroup()
                        .addGroup(cartonespaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(generarcartones)
                            .addGroup(cartonespaneLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(explorar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 88, Short.MAX_VALUE))
        );
        cartonespaneLayout.setVerticalGroup(
            cartonespaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartonespaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(cartonespaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numcartones, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(cartonespaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(explorar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(cartonespaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generarcartones, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        configuracion.setBackground(new java.awt.Color(202, 212, 249));
        configuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Duración de  la partida:");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        duracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Corta", "Media", "Larga" }));
        duracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracionActionPerformed(evt);
            }
        });

        voz.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Juana" }));
        voz.setMinimumSize(new java.awt.Dimension(53, 20));

        jLabel2.setText("Voz:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        solascheck.setText("Quiero que las bolas salgan solas.");
        solascheck.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        solascheck.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        solascheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solascheckActionPerformed(evt);
            }
        });

        configCancel.setText("Cancelar");
        configCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configCancelMouseClicked(evt);
            }
        });

        defaut.setText("Valores Por Defecto");
        defaut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                defautMouseClicked(evt);
            }
        });

        configApli.setText("Guardar");
        configApli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configApliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout configuracionLayout = new javax.swing.GroupLayout(configuracion);
        configuracion.setLayout(configuracionLayout);
        configuracionLayout.setHorizontalGroup(
            configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuracionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(configCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(configuracionLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configApli, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(configuracionLayout.createSequentialGroup()
                        .addGroup(configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(configuracionLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(solascheck, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(129, 129, 129)
                        .addGroup(configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(configuracionLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(voz, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(defaut, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        configuracionLayout.setVerticalGroup(
            configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configuracionLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configuracionLayout.createSequentialGroup()
                        .addGroup(configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(voz, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(142, 142, 142)
                        .addComponent(solascheck))
                    .addComponent(defaut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(configCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(configApli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(configuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cartonespane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(juego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(configuracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cartonespane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartonesActionPerformed

    private void configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_configActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void logoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseEntered
        logo.setEnabled(false);
    }//GEN-LAST:event_logoMouseEntered

    private void logoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseExited
        logo.setEnabled(true);
    }//GEN-LAST:event_logoMouseExited

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        int resp = JOptionPane.showConfirmDialog(this, "¿ Seguro que quieres salir ?", "Confirmar", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(resp == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_salirMouseClicked

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jugarActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        this.menu.setVisible(true);
        this.juego.setVisible(false);
        this.configuracion.setVisible(false);
        this.cartonespane.setVisible(false);
    }//GEN-LAST:event_volverMouseClicked

    private void jugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarMouseClicked
        this.menu.setVisible(false);
        this.juego.setVisible(true);
        this.configuracion.setVisible(false);
        this.cartonespane.setVisible(false);
    }//GEN-LAST:event_jugarMouseClicked

    private void duracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracionActionPerformed

    private void configMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configMouseClicked
       this.menu.setVisible(false);
        this.juego.setVisible(false);
        this.configuracion.setVisible(true);
        this.cartonespane.setVisible(false);
        
        switch(conf.getDuracion()){
            case 1:this.duracion.setSelectedItem("Corta");break;
            case 2:this.duracion.setSelectedItem("Media");break;
            case 3:this.duracion.setSelectedItem("Larga");break;
        }
        this.voz.setSelectedItem(conf.getVoz());
        this.solascheck.setSelected(conf.isSolas());
    }//GEN-LAST:event_configMouseClicked

    private void solascheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solascheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solascheckActionPerformed

    private void configCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configCancelMouseClicked
        this.menu.setVisible(true);
        this.juego.setVisible(false);
        this.configuracion.setVisible(false);
        this.cartonespane.setVisible(false);
    }//GEN-LAST:event_configCancelMouseClicked

    private void numcartonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numcartonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numcartonesActionPerformed

    private void logo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logo1MouseEntered
        logo1.setEnabled(false);
    }//GEN-LAST:event_logo1MouseEntered

    private void logo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logo1MouseExited
        logo1.setEnabled(true);
    }//GEN-LAST:event_logo1MouseExited

    private void cartonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartonesMouseClicked
        this.menu.setVisible(false);
        this.juego.setVisible(false);
        this.configuracion.setVisible(false);
        this.cartonespane.setVisible(true);
    }//GEN-LAST:event_cartonesMouseClicked

    private void explorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explorarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_explorarActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void explorarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_explorarMouseClicked
        jFileChooser1 = new JFileChooser(new File(".").getAbsolutePath());
        //Le cambiamos el titulo
        jFileChooser1.setDialogTitle("Guardar como...");
        //Agregamos un filtro de extensiones
        jFileChooser1.setFileFilter(new FileNameExtensionFilter("Documento de texto (*.txt)", "txt"));
       jFileChooser1.setAcceptAllFileFilterUsed(false);
       
        if (jFileChooser1.showSaveDialog(this)==jFileChooser1.APPROVE_OPTION) {
            String path = jFileChooser1.getSelectedFile().getAbsolutePath();
            if(!(path.endsWith(".txt"))){
                        path += ".txt";
                    }
            direccion.setText(path);
        }
    }//GEN-LAST:event_explorarMouseClicked

    private void volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseClicked
        this.menu.setVisible(true);
        this.juego.setVisible(false);
        this.configuracion.setVisible(false);
        this.cartonespane.setVisible(false);
    }//GEN-LAST:event_volver1MouseClicked

    private void generarcartonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarcartonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generarcartonesActionPerformed

    private void generarcartonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarcartonesMouseClicked
        int numcart = Integer.parseInt(numcartones.getText().replaceAll(" ", ""));
        String dir = direccion.getText().trim();
        if(!(dir.endsWith(".txt"))){
              dir += ".txt";
        }
        Cartones cart = new Cartones(this.numbolas,numcart,dir);

        numcart = JOptionPane.showConfirmDialog(this, "¿ Quieres abrir el archivo ?", "Abrir el archivo", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(numcart == JOptionPane.YES_OPTION){
            try{ 
                /* directorio/ejecutable es el path del ejecutable y un nombre */ 
                Process p = Runtime.getRuntime().exec ("C:/Windows/System32/NOTEPAD.EXE "+direccion.getText().trim()); 
           }catch (Exception e){ 
                /* Se lanza una excepción si no se encuentra en ejecutable o el fichero no es ejecutable. */ 
            }
        }
    }//GEN-LAST:event_generarcartonesMouseClicked

    private void configApliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configApliMouseClicked
        try {
            conf.setDuracion(this.duracion.getSelectedIndex()+1);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        conf.setSolas(this.solascheck.isSelected());
        conf.setVoz((String)this.voz.getSelectedItem());
        try {
            conf.guardar();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.menu.setVisible(true);
        this.juego.setVisible(false);
        this.configuracion.setVisible(false);
        this.cartonespane.setVisible(false);
    }//GEN-LAST:event_configApliMouseClicked

    private void defautMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_defautMouseClicked
        conf = new Configuracion();
         switch(conf.getDuracion()){
            case 1:this.duracion.setSelectedItem("Corta");break;
            case 2:this.duracion.setSelectedItem("Media");break;
            case 3:this.duracion.setSelectedItem("Larga");break;
        }
        this.voz.setSelectedItem(conf.getVoz());
        this.solascheck.setSelected(conf.isSolas());
    }//GEN-LAST:event_defautMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the NiJOptionPanembus look and feel */
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cartones;
    private javax.swing.JPanel cartonespane;
    private javax.swing.JButton config;
    private javax.swing.JButton configApli;
    private javax.swing.JButton configCancel;
    private javax.swing.JPanel configuracion;
    private javax.swing.JButton defaut;
    private javax.swing.JTextField direccion;
    private javax.swing.JComboBox duracion;
    private javax.swing.JButton explorar;
    private javax.swing.JButton generarcartones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel juego;
    private javax.swing.JButton jugar;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField numcartones;
    private javax.swing.JButton salir;
    private javax.swing.JCheckBox solascheck;
    private javax.swing.JButton volver;
    private javax.swing.JButton volver1;
    private javax.swing.JComboBox voz;
    // End of variables declaration//GEN-END:variables
}
