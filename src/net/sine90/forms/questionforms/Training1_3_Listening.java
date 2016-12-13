/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sine90.forms.questionforms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.Timer;
import net.sine90.forms.ListeningTestParameters;

/**
 *
 * @author rohini
 */
public class Training1_3_Listening extends javax.swing.JFrame {

    /**
     * Creates new form Training1_3_Listening
     */
    Timer timer;
    public Training1_3_Listening() {
        initComponents();
        addButtonGroups();
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        }; 
        timer = new Timer(180000,taskPerformer);
        timer.start();
        new Utilities().startTimer(3, jLabel28);
    }
    private void submitForm()
    {
        timer.stop();
        String fileName = ListeningTestParameters.student_name+"Training1_TrueOrFalse"+new SimpleDateFormat("yyyyMMddhhmm'.txt'").format(new Date());
        String correctAnswer="Correct Answer :";
        String wrongAnswer="Wrong Answer :";
        StringBuilder pretest_answer=new StringBuilder();
        int marks_obtained=0;
        int total=5;
        BufferedWriter bw;
        FileWriter fw;
        File file=new File("C:\\Results\\Listening\\"+fileName);
        if(!file.exists())
            try {
                file.createNewFile();
                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
        if(jRadioButton34.isSelected())
        {
            pretest_answer.append("1."+correctAnswer+jRadioButton34.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            pretest_answer.append("1."+correctAnswer+jRadioButton34.getText().trim()+System.getProperty("line.separator")+wrongAnswer+"True"+System.getProperty("line.separator"));
        if(jRadioButton35.isSelected())
        {
            pretest_answer.append("2."+correctAnswer+jRadioButton35.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            pretest_answer.append("2."+correctAnswer+jRadioButton35.getText().trim()+System.getProperty("line.separator")+wrongAnswer+"False"+System.getProperty("line.separator"));
        if(jRadioButton38.isSelected())
        {
            pretest_answer.append("3."+correctAnswer+jRadioButton38.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            pretest_answer.append("3."+correctAnswer+jRadioButton38.getText().trim()+System.getProperty("line.separator")+wrongAnswer+"True"+System.getProperty("line.separator"));
        if(jRadioButton40.isSelected())
        {
            pretest_answer.append("4."+correctAnswer+jRadioButton40.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            pretest_answer.append("4."+correctAnswer+jRadioButton40.getText().trim()+System.getProperty("line.separator")+wrongAnswer+"True"+System.getProperty("line.separator"));
        if(jRadioButton41.isSelected())
        {
            pretest_answer.append("5."+correctAnswer+jRadioButton41.getText().trim()+System.getProperty("line.separator"));
             marks_obtained++;
        }
        else
            pretest_answer.append("5."+correctAnswer+jRadioButton41.getText().trim()+System.getProperty("line.separator")+wrongAnswer+"False"+System.getProperty("line.separator"));
        pretest_answer.append("Score for this Test : "+marks_obtained+" / "+total);
        ListeningTestParameters.marks_obtained_listening+=marks_obtained;
        bw.write(pretest_answer.toString());
        bw.flush();
        fw.close();
        bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Training1_3_Listening.class.getName()).log(Level.SEVERE, null, ex);
        } 
        super.dispose();
        ListeningTestMain.main(null);
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
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel1.setText("Select True or False");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("A revision timetable could be from one to six weeks.");

        jRadioButton33.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton33.setText("True");

        jRadioButton34.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton34.setText("False");
        jRadioButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton34ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("You should try to forget about the internet, text messages, Twitter, Face book, etc. while you're studying.");

        jRadioButton37.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton37.setText("True");

        jRadioButton38.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton38.setText("False");
        jRadioButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton38ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("You should try not to have a break until you really need one.");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel15.setText("Underlining or highlighting your notes is better than writing more notes.");

        jRadioButton39.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton39.setText("True");

        jRadioButton40.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton40.setText("False");
        jRadioButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton40ActionPerformed(evt);
            }
        });

        jRadioButton42.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton42.setText("False");
        jRadioButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton42ActionPerformed(evt);
            }
        });

        jRadioButton41.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton41.setText("True");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Mind maps are good because they mirror the way the brain works.");

        jRadioButton35.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton35.setText("True");
        jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton35ActionPerformed(evt);
            }
        });

        jRadioButton36.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jRadioButton36.setText("False");
        jRadioButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton36ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times", 0, 18)); // NOI18N
        jLabel28.setText("03 : 00");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("Answers are auto submited");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Time :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jRadioButton39)
                                    .addGap(95, 95, 95)
                                    .addComponent(jRadioButton40))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(704, 704, 704)
                                    .addComponent(jButton1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel15))))
                            .addGap(97, 97, 97))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel29)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel28)
                                    .addGap(32, 32, 32))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel30)))
                            .addGap(71, 71, 71)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jRadioButton33)
                        .addGap(94, 94, 94)
                        .addComponent(jRadioButton34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jRadioButton35)
                        .addGap(94, 94, 94)
                        .addComponent(jRadioButton36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jRadioButton37)
                        .addGap(93, 93, 93)
                        .addComponent(jRadioButton38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jRadioButton41)
                        .addGap(92, 92, 92)
                        .addComponent(jRadioButton42)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton34ActionPerformed

    private void jRadioButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton38ActionPerformed

    private void jRadioButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton40ActionPerformed

    private void jRadioButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton42ActionPerformed

    private void jRadioButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton36ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       submitForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton35ActionPerformed

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
            java.util.logging.Logger.getLogger(Training1_3_Listening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Training1_3_Listening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Training1_3_Listening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Training1_3_Listening.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Training1_3_Listening().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    // End of variables declaration//GEN-END:variables

    private void addButtonGroups() {
        ButtonGroup group1=new ButtonGroup();
                group1.add(jRadioButton33);
                group1.add(jRadioButton34);
        ButtonGroup group2=new ButtonGroup();
                group2.add(jRadioButton35);
                group2.add(jRadioButton36);
        ButtonGroup group3=new ButtonGroup();
                group3.add(jRadioButton37);
                group3.add(jRadioButton38);
        ButtonGroup group4=new ButtonGroup();
                group4.add(jRadioButton39);
                group4.add(jRadioButton40);
        ButtonGroup group5=new ButtonGroup();
                group5.add(jRadioButton41);
                group5.add(jRadioButton42);
    }
}
