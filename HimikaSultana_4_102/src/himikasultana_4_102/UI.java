
package himikasultana_4_102;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Random;

public class UI extends javax.swing.JFrame {
    Random randomNumberGenerator=new Random();
    int counter=0;
    String PrevWinner=null;
    String j=null;
    
    public UI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        txtStartingNumber = new javax.swing.JTextField();
        txtEndingNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlayer1Guess = new javax.swing.JTextField();
        txtPlayer2Guess = new javax.swing.JTextField();
        btn3Guess = new javax.swing.JButton();
        txtComputerGuess = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnPrevWinner = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guessing Game");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtStartingNumber.setText("0");
        txtStartingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartingNumberActionPerformed(evt);
            }
        });

        txtEndingNumber.setText("102");
        txtEndingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndingNumberActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("TO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("FROM");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Player 1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Player 2");

        btn3Guess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn3Guess.setText("Computer Guess");
        btn3Guess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3GuessMouseClicked(evt);
            }
        });
        btn3Guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3GuessActionPerformed(evt);
            }
        });

        txtComputerGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComputerGuessActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 204, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClear.setText("Clear Guesses");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Guess Number Between 0 to 102");

        btnPrevWinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPrevWinner.setText("Previous Winner");
        btnPrevWinner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrevWinnerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlayer1Guess, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStartingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEndingNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtPlayer2Guess)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPrevWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3Guess, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComputerGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlayer2Guess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlayer1Guess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btn3Guess, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtComputerGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrevWinner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtComputerGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComputerGuessActionPerformed
        
    }//GEN-LAST:event_txtComputerGuessActionPerformed

    private void txtStartingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartingNumberActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int startingNumber=Integer.valueOf(txtStartingNumber.getText());
        randomNumberGenerator.setSeed(startingNumber);
    }//GEN-LAST:event_formWindowOpened

    private void btn3GuessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3GuessMouseClicked
        counter++;
        int EndingNumber=Integer.valueOf(txtEndingNumber.getText());
        int newNumber=randomNumberGenerator.nextInt(EndingNumber);
        txtComputerGuess.setText(String.valueOf(newNumber));
        JOptionPane.showMessageDialog(null, "Previous Winner: "+ PrevWinner);
        j=PrevWinner;
        if(txtPlayer1Guess.getText().equals(txtComputerGuess.getText())==true){
            
            JOptionPane.showMessageDialog(null, "Congratulation Player-1 won  :)"+"\nNumber Of Required Chances: "+counter +" Times");
            String Winner1=JOptionPane.showInputDialog("Enter Player-1 Name");
            PrevWinner=Winner1;
            txtPlayer1Guess.setText("Name: "+Winner1 +","+" Times Required: "+ counter);
            System.out.println("Name: "+ Winner1+","+" Number Of Required Chances: "+counter );
            
        }
        else if (txtPlayer2Guess.getText().equals(txtComputerGuess.getText())==true){
          
          JOptionPane.showMessageDialog(null, "Congratulation Player-2 won  :)"+"\nNumber Of Required Chances: "+counter +" Times");
          String Winner2=JOptionPane.showInputDialog("Enter Player-2 Name");
          PrevWinner=Winner2;
          txtPlayer2Guess.setText("Name: "+Winner2 +","+" Times Required: "+ counter);
          System.out.println("Name:"+ Winner2+","+" Number Of Required Chances: "+counter );
          
        }
       
        else{
            JOptionPane.showMessageDialog(null, "Sorry you have lost. Try again  :(");
        }
        
    }//GEN-LAST:event_btn3GuessMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        txtPlayer1Guess.setText("");
        txtPlayer2Guess.setText("");
        txtComputerGuess.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    private void txtEndingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndingNumberActionPerformed

    private void btn3GuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3GuessActionPerformed
       
    }//GEN-LAST:event_btn3GuessActionPerformed

    private void btnPrevWinnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevWinnerMouseClicked
        btnPrevWinner.setToolTipText("Click Here To See Previous Winner Name ^-^");
        JOptionPane.showMessageDialog(null, "Previous Winner: " +j);
    }//GEN-LAST:event_btnPrevWinnerMouseClicked

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn3Guess;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPrevWinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtComputerGuess;
    private javax.swing.JTextField txtEndingNumber;
    private javax.swing.JTextField txtPlayer1Guess;
    private javax.swing.JTextField txtPlayer2Guess;
    private javax.swing.JTextField txtStartingNumber;
    // End of variables declaration//GEN-END:variables
}
