/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import classes.AI;
import classes.Admin;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Sebastian Rodriguez
 */
public class MainInterfaz extends javax.swing.JFrame {

    public static DefaultListModel<String> modeloListaGanadores;

    /**
     * Creates new form MainInterfaz
     */
    public MainInterfaz() {
        initComponents();
        coronaLabelZ.setVisible(false);
        coronaLabelSF.setVisible(false);
        empateLabel.setVisible(false);
        cancelLabel.setVisible(false);
        modeloListaGanadores = new DefaultListModel<>();
        ListaGanadores.setModel(modeloListaGanadores);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Colas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ColasZelda1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ColasZelda2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ColasZelda3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ColasZelda4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Colas2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ColasSF1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ColasSF2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ColasSF3 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ColasSF4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cancelLabel = new javax.swing.JLabel();
        UniquePointsSF = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StreetIMG = new javax.swing.JLabel();
        ZeldaIMG = new javax.swing.JLabel();
        UniquePointsZelda = new javax.swing.JLabel();
        nombreZ = new javax.swing.JLabel();
        nombreSF = new javax.swing.JLabel();
        PuntosZ1 = new javax.swing.JLabel();
        PuntosSF1 = new javax.swing.JLabel();
        coronaLabelZ = new javax.swing.JLabel();
        coronaLabelSF = new javax.swing.JLabel();
        AIState = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empateLabel = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ListaGanadores = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        SliderAITimer = new javax.swing.JSlider();
        jPanel4 = new javax.swing.JPanel();
        ganadoresSF = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ganadoresZelda = new javax.swing.JLabel();
        StreetFighterFondo = new javax.swing.JLabel();
        ZeldaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Street Fighter 6");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 50, 270, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FIGHT!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 190, 80));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Zelda: Tears of the Kingdom");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 490, 80));

        Colas.setBackground(new java.awt.Color(0, 0, 102));
        Colas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        Colas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ColasZelda1.setBackground(new java.awt.Color(0, 0, 255));
        ColasZelda1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ColasZelda1.setForeground(new java.awt.Color(0, 0, 0));
        ColasZelda1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(ColasZelda1);

        Colas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 270, 60));

        ColasZelda2.setBackground(new java.awt.Color(0, 0, 255));
        ColasZelda2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ColasZelda2.setForeground(new java.awt.Color(0, 0, 0));
        ColasZelda2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane3.setViewportView(ColasZelda2);

        Colas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 60));

        ColasZelda3.setBackground(new java.awt.Color(0, 0, 255));
        ColasZelda3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ColasZelda3.setForeground(new java.awt.Color(0, 0, 0));
        ColasZelda3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane4.setViewportView(ColasZelda3);

        Colas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 270, 60));

        ColasZelda4.setBackground(new java.awt.Color(0, 0, 255));
        ColasZelda4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ColasZelda4.setForeground(new java.awt.Color(0, 0, 0));
        ColasZelda4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane5.setViewportView(ColasZelda4);

        Colas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 270, 60));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Colas de prioridad");
        Colas.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 40));

        jPanel1.add(Colas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 290, 360));

        Colas2.setBackground(new java.awt.Color(102, 0, 0));
        Colas2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        Colas2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ColasSF1.setBackground(new java.awt.Color(0, 0, 0));
        ColasSF1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ColasSF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setViewportView(ColasSF1);

        Colas2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 270, 60));

        ColasSF2.setBackground(new java.awt.Color(0, 0, 0));
        ColasSF2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ColasSF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane6.setViewportView(ColasSF2);

        Colas2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 60));

        ColasSF3.setBackground(new java.awt.Color(0, 0, 0));
        ColasSF3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ColasSF3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane7.setViewportView(ColasSF3);

        Colas2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 270, 60));

        ColasSF4.setBackground(new java.awt.Color(0, 0, 0));
        ColasSF4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ColasSF4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane8.setViewportView(ColasSF4);

        Colas2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 270, 60));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Colas de prioridad");
        Colas2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 40));

        jPanel1.add(Colas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 200, 290, 370));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Cancel.png"))); // NOI18N
        jPanel2.add(cancelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 420, 150));

        UniquePointsSF.setBackground(new java.awt.Color(255, 255, 255));
        UniquePointsSF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UniquePointsSF.setForeground(new java.awt.Color(255, 255, 255));
        UniquePointsSF.setText("0");
        jPanel2.add(UniquePointsSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 50, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/VS.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 80, 100));

        StreetIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/question.jpg"))); // NOI18N
        jPanel2.add(StreetIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 150, 150));

        ZeldaIMG.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ZeldaIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/question.jpg"))); // NOI18N
        jPanel2.add(ZeldaIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 150));

        UniquePointsZelda.setBackground(new java.awt.Color(255, 255, 255));
        UniquePointsZelda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UniquePointsZelda.setForeground(new java.awt.Color(255, 255, 255));
        UniquePointsZelda.setText("0");
        jPanel2.add(UniquePointsZelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 50, 30));

        nombreZ.setBackground(new java.awt.Color(255, 255, 255));
        nombreZ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreZ.setForeground(new java.awt.Color(255, 255, 255));
        nombreZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreZ.setText("Nombre");
        jPanel2.add(nombreZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, 30));

        nombreSF.setBackground(new java.awt.Color(255, 255, 255));
        nombreSF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreSF.setForeground(new java.awt.Color(255, 255, 255));
        nombreSF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreSF.setText("Nombre");
        jPanel2.add(nombreSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 170, 30));

        PuntosZ1.setBackground(new java.awt.Color(255, 255, 255));
        PuntosZ1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PuntosZ1.setForeground(new java.awt.Color(255, 255, 255));
        PuntosZ1.setText("Puntos:");
        jPanel2.add(PuntosZ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 60, 30));

        PuntosSF1.setBackground(new java.awt.Color(255, 255, 255));
        PuntosSF1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PuntosSF1.setForeground(new java.awt.Color(255, 255, 255));
        PuntosSF1.setText("Puntos:");
        jPanel2.add(PuntosSF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 70, 30));

        coronaLabelZ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coronaLabelZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/crown.png"))); // NOI18N
        jPanel2.add(coronaLabelZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, 60));

        coronaLabelSF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coronaLabelSF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/crown.png"))); // NOI18N
        jPanel2.add(coronaLabelSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 80, 60));

        AIState.setBackground(new java.awt.Color(255, 255, 255));
        AIState.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AIState.setForeground(new java.awt.Color(255, 255, 255));
        AIState.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AIState.setText("CREANDO COLAS");
        jPanel2.add(AIState, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 150, 50));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Timer (seg)");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        empateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empateLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/bruja.jpg"))); // NOI18N
        jPanel2.add(empateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 80, 80));

        jScrollPane9.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ListaGanadores.setBackground(new java.awt.Color(0, 0, 0));
        ListaGanadores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ListaGanadores.setForeground(new java.awt.Color(255, 255, 255));
        ListaGanadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ganador 1", "Ganador 2", "Ganador 3", "Ganador 4", "Ganadro 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(ListaGanadores);

        jPanel2.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 290, 80));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GANADORES =");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        SliderAITimer.setBackground(new java.awt.Color(0, 0, 0));
        SliderAITimer.setForeground(new java.awt.Color(255, 0, 0));
        SliderAITimer.setMajorTickSpacing(1);
        SliderAITimer.setMaximum(10);
        SliderAITimer.setMinimum(1);
        SliderAITimer.setPaintLabels(true);
        SliderAITimer.setPaintTicks(true);
        SliderAITimer.setSnapToTicks(true);
        SliderAITimer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SliderAITimer.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderAITimerStateChanged(evt);
            }
        });
        jPanel2.add(SliderAITimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 440, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 460, 580));

        jPanel4.setBackground(new java.awt.Color(102, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ganadoresSF.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        ganadoresSF.setForeground(new java.awt.Color(255, 255, 255));
        ganadoresSF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ganadoresSF.setText("0");
        ganadoresSF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel4.add(ganadoresSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 110, 70));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ganadoresZelda.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        ganadoresZelda.setForeground(new java.awt.Color(255, 255, 255));
        ganadoresZelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ganadoresZelda.setText("0");
        ganadoresZelda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.add(ganadoresZelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 110, 70));

        StreetFighterFondo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        StreetFighterFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/StreetFighterFondo.jpg"))); // NOI18N
        StreetFighterFondo.setToolTipText("");
        jPanel1.add(StreetFighterFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 810, 840));

        ZeldaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/zeldaFondo.jpg"))); // NOI18N
        jPanel1.add(ZeldaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 840));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SliderAITimerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderAITimerStateChanged
        AI.time = SliderAITimer.getValue();
    }//GEN-LAST:event_SliderAITimerStateChanged

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
            java.util.logging.Logger.getLogger(MainInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterfaz().setVisible(true);
            }
        });

        // Crear instancias de las clases necesarias
        Admin admin = new Admin();
        AI ai = new AI();

        // Inicializar personajes y colocarlos en las colas
        admin.initializeCharacters();

        // Simular rondas de la IA
        for (int round = 1; round <= 1000; round++) { // Ejemplo: 1000 rondas
            System.out.println("\n--- Ronda " + round + " ---");

            // Mostrar las colas antes de la ronda
            admin.printQueues();

            // Seleccionar personajes para el combate desde las colas
            classes.Character[] charactersForBattle = admin.selectCharactersForBattle();
            classes.Character zeldaCharacter = charactersForBattle[0];
            classes.Character streetFighterCharacter = charactersForBattle[1];

            if (zeldaCharacter != null && streetFighterCharacter != null) {
                System.out.println("Inicia el combate: " + zeldaCharacter.getName() + " vs " + streetFighterCharacter.getName());
            }
            // Mostrar las colas en la interfaz
            admin.actualizarColasEnInterfaz();

            // Procesar la batalla en la IA
            ai.processBattle(zeldaCharacter, streetFighterCharacter);

            // Actualizar las colas después de la ronda
//            admin.updateQueues(); ESTO HACE QUE SE SUBAN LAS POSICIONES 1 DE LAS COLAS AL FINAL DE CADA RONDA.
        }

        // Mostrar las colas al final de la simulación
        System.out.println("\n--- Colas finales ---");
        admin.printQueues();
        admin.actualizarColasEnInterfaz();
    }

    public static void setDefStats() {
        if (ZeldaIMG != null && StreetIMG != null) {
            ZeldaIMG.setIcon(new ImageIcon("src\\imgs\\question.jpg"));
            StreetIMG.setIcon(new ImageIcon("src\\imgs\\question.jpg"));
            nombreZ.setText("Buscando oponente");
            nombreSF.setText("Buscando oponente");
            UniquePointsZelda.setText("0");
            UniquePointsSF.setText("0");

        } else {
            System.out.println("ZeldaIMG o StreetIMG es null. Asegúrate de que estén inicializados correctamente.");
        }
    }

    public static void setZeldaIcon(String name, int power) {
        ZeldaIMG.setIcon(new ImageIcon("src\\imgs\\" + name + ".jpg"));
        nombreZ.setText(name);
        UniquePointsZelda.setText(Integer.toString(power));
    }

    public static void setSFIcon(String name, int power) {
        StreetIMG.setIcon(new ImageIcon("src\\imgs\\" + name + ".jpg"));
        nombreSF.setText(name);
        UniquePointsSF.setText(Integer.toString(power));
    }

    public static void marcadorZelda(int puntaje) {
        ganadoresZelda.setText(Integer.toString(puntaje));
    }

    public static void marcadorSF(int puntaje) {
        ganadoresSF.setText(Integer.toString(puntaje));
    }

    public static JLabel getGanadoresSF() {
        return ganadoresSF;
    }

    public static void setGanadoresSF(JLabel ganadoresSF) {
        MainInterfaz.ganadoresSF = ganadoresSF;
    }

    public static JLabel getGanadoresZelda() {
        return ganadoresZelda;
    }

    public static void setGanadoresZelda(JLabel ganadoresZelda) {
        MainInterfaz.ganadoresZelda = ganadoresZelda;
    }

    // Método para colocar la corona sobre la imagen del personaje ganador
    public static void setCoronaPositionZelda(JLabel characterImage) {
        coronaLabelZ.setVisible(true);
    }

    public static void setCoronaPositionStreetF(JLabel characterImage) {
        coronaLabelSF.setVisible(true);
    }

    public static void setEmpateVisible() {
        empateLabel.setVisible(true);
    }

    public static void setCancelVisible() {
        cancelLabel.setVisible(true);
    }

    public static JLabel getCancelLabel() {
        return cancelLabel;
    }

    public static void setCancelLabel(JLabel cancelLabel) {
        MainInterfaz.cancelLabel = cancelLabel;
    }

    public static JLabel getEmpateLabel() {
        return empateLabel;
    }

    public static void setEmpateLabel(JLabel empateLabel) {
        MainInterfaz.empateLabel = empateLabel;
    }

    public static void setNombreZ(String name) {
        nombreZ.setText(name);
    }

    public static void setNombreSF(String name) {
        nombreSF.setText(name);
    }

    public static JLabel getColasZelda(int index) {
        switch (index) {
            case 1:
                return ColasZelda1;
            case 2:
                return ColasZelda2;
            case 3:
                return ColasZelda3;
            case 4:
                return ColasZelda4;
            default:
                return null;
        }
    }

    public static JLabel getColasSF(int index) {
        switch (index) {
            case 1:
                return ColasSF1;
            case 2:
                return ColasSF2;
            case 3:
                return ColasSF3;
            case 4:
                return ColasSF4;
            default:
                return null;
        }
    }

    public static JLabel getStreetIMG() {
        return StreetIMG;
    }

    public static void setStreetIMG(JLabel StreetIMG) {
        MainInterfaz.StreetIMG = StreetIMG;
    }

    public static JLabel getZeldaIMG() {
        return ZeldaIMG;
    }

    public static void setZeldaIMG(JLabel ZeldaIMG) {
        MainInterfaz.ZeldaIMG = ZeldaIMG;
    }

    public static JLabel getUniquePointsSF() {
        return UniquePointsSF;
    }

    public static void setUniquePointsSF(JLabel UniquePointsSF) {
        MainInterfaz.UniquePointsSF = UniquePointsSF;
    }

    public static JLabel getUniquePointsZelda() {
        return UniquePointsZelda;
    }

    public static void setUniquePointsZelda(JLabel UniquePointsZelda) {
        MainInterfaz.UniquePointsZelda = UniquePointsZelda;
    }

    public static JLabel getNombreSF() {
        return nombreSF;
    }

    public static void setNombreSF(JLabel nombreSF) {
        MainInterfaz.nombreSF = nombreSF;
    }

    public static JLabel getNombreZ() {
        return nombreZ;
    }

    public static void setNombreZ(JLabel nombreZ) {
        MainInterfaz.nombreZ = nombreZ;
    }

    public static JLabel getColasSF1() {
        return ColasSF1;
    }

    public static void setColasSF1(JLabel ColasSF) {
        MainInterfaz.ColasSF1 = ColasSF;
    }

    public static JLabel getColasZelda1() {
        return ColasZelda1;
    }

    public static void setColasZelda1(JLabel ColasZelda) {
        MainInterfaz.ColasZelda1 = ColasZelda;
    }

    public static JLabel getColasSF2() {
        return ColasSF2;
    }

    public static void setColasSF2(JLabel ColasSF2) {
        MainInterfaz.ColasSF2 = ColasSF2;
    }

    public static JLabel getColasSF3() {
        return ColasSF3;
    }

    public static void setColasSF3(JLabel ColasSF3) {
        MainInterfaz.ColasSF3 = ColasSF3;
    }

    public static JLabel getColasSF4() {
        return ColasSF4;
    }

    public static void setColasSF4(JLabel ColasSF4) {
        MainInterfaz.ColasSF4 = ColasSF4;
    }

    public static JLabel getColasZelda2() {
        return ColasZelda2;
    }

    public static void setColasZelda2(JLabel ColasZelda2) {
        MainInterfaz.ColasZelda2 = ColasZelda2;
    }

    public static JLabel getColasZelda3() {
        return ColasZelda3;
    }

    public static void setColasZelda3(JLabel ColasZelda3) {
        MainInterfaz.ColasZelda3 = ColasZelda3;
    }

    public static JLabel getColasZelda4() {
        return ColasZelda4;
    }

    public static void setColasZelda4(JLabel ColasZelda4) {
        MainInterfaz.ColasZelda4 = ColasZelda4;
    }

    public static void agregarGanador(String elemento) {
        modeloListaGanadores.addElement(elemento);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel AIState;
    private javax.swing.JPanel Colas;
    private javax.swing.JPanel Colas2;
    public static javax.swing.JLabel ColasSF1;
    public static javax.swing.JLabel ColasSF2;
    public static javax.swing.JLabel ColasSF3;
    public static javax.swing.JLabel ColasSF4;
    public static javax.swing.JLabel ColasZelda1;
    public static javax.swing.JLabel ColasZelda2;
    public static javax.swing.JLabel ColasZelda3;
    public static javax.swing.JLabel ColasZelda4;
    public static javax.swing.JList<String> ListaGanadores;
    public static javax.swing.JLabel PuntosSF1;
    public static javax.swing.JLabel PuntosZ1;
    private javax.swing.JSlider SliderAITimer;
    private javax.swing.JLabel StreetFighterFondo;
    public static javax.swing.JLabel StreetIMG;
    public static javax.swing.JLabel UniquePointsSF;
    public static javax.swing.JLabel UniquePointsZelda;
    private javax.swing.JLabel ZeldaFondo;
    public static javax.swing.JLabel ZeldaIMG;
    public static javax.swing.JLabel cancelLabel;
    public static javax.swing.JLabel coronaLabelSF;
    public static javax.swing.JLabel coronaLabelZ;
    public static javax.swing.JLabel empateLabel;
    public static javax.swing.JLabel ganadoresSF;
    public static javax.swing.JLabel ganadoresZelda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public static javax.swing.JLabel nombreSF;
    public static javax.swing.JLabel nombreZ;
    // End of variables declaration//GEN-END:variables
}
