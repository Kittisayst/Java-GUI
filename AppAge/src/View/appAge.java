package View;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class appAge extends javax.swing.JFrame {

    public appAge() {
        initComponents();
        // ດຶງວັນທີປະຈຸບັນ
        Calendar dateNow = Calendar.getInstance();
        //ກຳນົດວັນທີ່ໃຫ້ກັບ lblshowTime
        //ການກຳນົດຮູບແບບວັນທີ່ FormatDate // SimpleDateFormet
        // ວັນ/ເດືອນ/ປີ ຊົ່ວໂມງ:ນາທີ:ວິນາທີ   dd/MM/YYYY hh:mm:ss
        SimpleDateFormat format
                = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        String mydate = format.format(dateNow.getTime());
        lblshowTime.setText("ເວລາປະຈຸບັນ: " + mydate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblshowTime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnAge = new javax.swing.JButton();
        lblYourAge = new javax.swing.JLabel();
        lblmessage = new javax.swing.JLabel();
        lblNextBirthDay = new javax.swing.JLabel();
        lblDayName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblshowTime.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        lblshowTime.setForeground(new java.awt.Color(255, 51, 51));
        lblshowTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblshowTime.setText("ເວລາປະຈຸບັນ 26/01/2023 3:53 ນາທີ");
        getContentPane().add(lblshowTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 400, 30));

        jLabel3.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        jLabel3.setText("ປ້ອນ ວັນ ເດືອນ ປີ ເກີດ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 400, 30));

        txtDate.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setText("05/02/1995");
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 400, 50));

        btnAge.setBackground(new java.awt.Color(51, 102, 0));
        btnAge.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        btnAge.setForeground(new java.awt.Color(255, 255, 255));
        btnAge.setText("ຄິດໄລອາຍຸ");
        btnAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 400, 50));

        lblYourAge.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        lblYourAge.setForeground(new java.awt.Color(51, 0, 255));
        lblYourAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYourAge.setText("ອາຍຸຂອງທ່ານແມ່ນ: 1 ປີ");
        getContentPane().add(lblYourAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 400, -1));

        lblmessage.setBackground(new java.awt.Color(243, 198, 209));
        lblmessage.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        lblmessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmessage.setText("ກະລຸນາປ້ອນວັນທີ່");
        lblmessage.setOpaque(true);
        getContentPane().add(lblmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 400, 50));

        lblNextBirthDay.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        lblNextBirthDay.setForeground(new java.awt.Color(51, 0, 255));
        lblNextBirthDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNextBirthDay.setText("ນັບຖອຍຫຼັງສູ່ ວັນເກີດ ຕໍ່ໄປ");
        getContentPane().add(lblNextBirthDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 400, -1));

        lblDayName.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        lblDayName.setForeground(new java.awt.Color(51, 0, 255));
        lblDayName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDayName.setText("ເກີດວັນ:");
        getContentPane().add(lblDayName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 400, -1));

        setSize(new java.awt.Dimension(514, 585));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgeActionPerformed
        //ດຶງຂໍ້ມູນວັນເດືອນປີເກີດຈາກ txtDate
        String dateInput = txtDate.getText();
        //ກວດສອຍຂໍ້ມູນວັນທີ ຖ້າວ່າມີຂໍ້ມູນວັນທີ່
        if (dateInput.equals("")) {
            //ສະແດງຂໍ້ຄວາມ
            lblmessage.setText("ກະລຸນາປ້ອນວັນທີ່ໃຫ້ຖືກຕ້ອງ");
        } else {
            lblmessage.setText("ຂໍ້ມູນຖືກຕ້ອງແລ້ວ");
            lblmessage.setBackground(Color.GREEN);
            //ດັກຈັບການ Error (try catch)
            try {
                //ກຳນົດ Format ວັນທີ່ dd/MM/yyyy
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                //ກຳນົດ Format ຂໍ້ມູນວັນທີ່ dd/MM/yyyy
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                //ຮັບຂໍ້ມູນວັນທີ່ຈາກ Textfiled ຈາກຕົວປ່ຽນ dateInput
                LocalDate dfb = LocalDate.parse(dateInput, formatter);
                //ດຶງຂໍ້ມູນວັນທີ່ນະປັດຈຸບັນ
                LocalDate today = LocalDate.now();
                //ຄິດໄລວັນເດືອນປີເກີດຄັ້ງຕໍ່ໄປ
                LocalDate nextBday = dfb.withYear(today.getYear());
                //ຄິດໄລອາຍຸ ຕາມ ປີ  ເດືອນ  ວັນ
                Period CountAge = Period.between(dfb, today);
                //ນັບວັນເກີດຄັ້ງຕໍ່ໄປ
                Long CountDay = ChronoUnit.DAYS.between(today, nextBday);
                //ຫາຊື່ວັນເກີດ (ຈັນ,ອັງຄານ,ພຸດ,.....)
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(format.parse(dateInput));
                int numDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
                String[] DayName = {"ອາທິດ", "ຈັນ", "ອັງຄານ", "ພຸດ", "ພະຫັດ", "ສຸກ", "ເສົາ"};
                //ສະແດງ ປີ ເດືອນ ວັນ  lblYourAge
                lblYourAge.setText(
                        "ອາຍຸ: " + CountAge.getYears() + " ປີ "
                        + CountAge.getMonths() + " ເດືອນ "
                        + CountAge.getDays() + " ວັນ");
                //ສະແດງ ນັບຖອຍຫຼັງວັນເກີດ ຄັ້ງຕໍ່ໄປ lblNextBirthDay
                lblNextBirthDay.setText("ວັນເກີດຄັ້ງຕໍ່ໄປອີກ " + CountDay + " ວັນ");
                //ສະແດງຊື່ວັນ lblDayName
                lblDayName.setText("ທ່ານເກີດວັນ: " + DayName[numDay]);
            } catch (Exception e) {
                //ສະແດງ Error ອອກມາທາງ Output
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAgeActionPerformed

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
            java.util.logging.Logger.getLogger(appAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appAge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAge;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDayName;
    private javax.swing.JLabel lblNextBirthDay;
    private javax.swing.JLabel lblYourAge;
    private javax.swing.JLabel lblmessage;
    private javax.swing.JLabel lblshowTime;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
