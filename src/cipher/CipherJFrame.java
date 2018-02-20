/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Maneesha
 */
public class CipherJFrame extends javax.swing.JFrame {
    private String alphabet="abcdefghijklmnopqrstuvwxyz";
    private ArrayList<Character> originalAlphabet=new ArrayList<>();
    private ArrayList<Character> newAlphabet=new ArrayList<>();
    private String filePath;
    private String fileText="";
    private String newFileText="";
    private String encryptText="";
    private String encrypKey="";
            
    public CipherJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        fileEncryptWarn.setVisible(false);
        for(int i=0;i<alphabet.length();i++){ //adding alphabet to the original alphabet array
            originalAlphabet.add(alphabet.charAt(i));
            newAlphabet.add(alphabet.charAt(i));
        }
    }
    
    private void shuffleArray(){//shuffle array elements
        Collections.shuffle(newAlphabet);
        for(int i=0;i<newAlphabet.size();i++){
            encrypKey+=newAlphabet.get(i);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        encryptLogo = new javax.swing.JLabel();
        encryptTxt = new javax.swing.JLabel();
        encryptKeyTB = new javax.swing.JTextField();
        encryptBtn = new javax.swing.JLabel();
        encryptKeyTitle = new javax.swing.JLabel();
        fileEncryptWarn = new javax.swing.JLabel();
        encryptFilePath = new javax.swing.JLabel();
        decryptLogo = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        divider = new javax.swing.JLabel();
        backgroundOverlay = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setFont(new java.awt.Font("noelan", 2, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cipher/images/cipher.png"))); // NOI18N
        logo.setToolTipText("");
        logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -50, 280, 140));

        encryptLogo.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        encryptLogo.setForeground(new java.awt.Color(255, 255, 255));
        encryptLogo.setText("Encrypt");
        getContentPane().add(encryptLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        encryptTxt.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        encryptTxt.setForeground(new java.awt.Color(255, 153, 0));
        encryptTxt.setText(" Select File");
        encryptTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        encryptTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encryptTxtMouseClicked(evt);
            }
        });
        getContentPane().add(encryptTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 80, 30));

        encryptKeyTB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(encryptKeyTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 400, 30));

        encryptBtn.setBackground(new java.awt.Color(255, 255, 255));
        encryptBtn.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        encryptBtn.setForeground(new java.awt.Color(255, 153, 51));
        encryptBtn.setText(" Encrypt File");
        encryptBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        encryptBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                encryptBtnMouseClicked(evt);
            }
        });
        getContentPane().add(encryptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 30));

        encryptKeyTitle.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        encryptKeyTitle.setForeground(new java.awt.Color(255, 255, 255));
        encryptKeyTitle.setText(" Encrypt Key");
        getContentPane().add(encryptKeyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 292, 100, -1));

        fileEncryptWarn.setForeground(new java.awt.Color(255, 153, 51));
        fileEncryptWarn.setText("File Encrypted, Use Encrypt key to Decrypt");
        getContentPane().add(fileEncryptWarn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 250, -1));

        encryptFilePath.setBackground(new java.awt.Color(255, 255, 255));
        encryptFilePath.setForeground(new java.awt.Color(255, 255, 255));
        encryptFilePath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(encryptFilePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 30));

        decryptLogo.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        decryptLogo.setForeground(new java.awt.Color(255, 255, 255));
        decryptLogo.setText("Decrypt");
        getContentPane().add(decryptLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        exitBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cipher/images/wrong_pane1.png"))); // NOI18N
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        divider.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maneesha\\Desktop\\devider.png")); // NOI18N
        divider.setMaximumSize(new java.awt.Dimension(100, 2048));
        divider.setOpaque(true);
        getContentPane().add(divider, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 3, 390));

        backgroundOverlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cipher/images/overlay.png"))); // NOI18N
        getContentPane().add(backgroundOverlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 6, 860, 450));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cipher/images/why-it-departments-benefit-from-upgrading-to-snmpv3.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitBtnMouseClicked

    private void encryptBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encryptBtnMouseClicked
        shuffleArray();
        //change alphabet and put it into a new textline
        for (int i = 0; i < fileText.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (fileText.charAt(i) == alphabet.charAt(j)) {
                    newFileText += newAlphabet.get(j);
                    break;
                }else if(j==25){
                    newFileText+=fileText.charAt(i);
                }
            }
        }
        //random string dividing
        Random rn = new Random();
        int randomNumber = rn.nextInt(5) + 6;
        
        int newTextlength=newFileText.length();
        int newTextLessCharacterNo=newTextlength%randomNumber;
        
        for(int i=0;i<newTextLessCharacterNo;i++){//setting a fixed length
            newFileText+=" ";
        }
        
        ArrayList<String> tempStrings=new ArrayList<>();
        String temp="";
        int count=0;
        for(int j=0;j<newFileText.length();j++){
            count++;
            temp += newFileText.charAt(j);
            if (count == randomNumber) {
                tempStrings.add(temp);
                temp = "";
                count=0;
            }
        }
        
        ArrayList<Integer> tempIteration=new ArrayList<>(); //create temperory arraylist to store iterations
        for(int i=0;i<randomNumber;i++){
            tempIteration.add(i);
        }
        Collections.shuffle(tempIteration);
        for(int i=0;i<tempIteration.size();i++){
            encrypKey+=tempIteration.get(i);
        }
        for(int i=0;i<tempStrings.size();i++){
            for(int j=0;j<tempIteration.size();j++){
                encryptText+=(tempStrings.get(i).charAt(j));
            }
        }
        encryptKeyTB.setText(encrypKey);
        System.out.println(encrypKey);
        //create a new file to write the output
        try {
            FileWriter fileWriter =new FileWriter("Decrypt.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(encryptText);
            System.out.println(encryptText);
            bufferedWriter.close();
            fileEncryptWarn.setVisible(true);
        }
        catch(IOException ex) {
            System.out.println("Error writing to file");
        }
    }//GEN-LAST:event_encryptBtnMouseClicked

    private void encryptTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_encryptTxtMouseClicked
        fileEncryptWarn.setVisible(false);
        JFileChooser fc=new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        fc.setFileFilter(filter);
        int result=fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();        
            filePath = file.getAbsolutePath(); 
            encryptFilePath.setText(filePath);
            String line = null;
            try {
                // FileReader reads text files in the default encoding.
                FileReader fileReader =new FileReader(filePath);
                // Always wrap FileReader in BufferedReader.
                BufferedReader bufferedReader =new BufferedReader(fileReader);
                while((line = bufferedReader.readLine()) != null) {
                    fileText+=line; //adding all lines to a sin
                }   
                bufferedReader.close();         
            }
            catch(FileNotFoundException ex) {
                System.out.println("Unable to open file");               
            }
            catch(IOException ex) {
                System.out.println("Error reading file" ); 
            }
        }        
    }//GEN-LAST:event_encryptTxtMouseClicked

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CipherJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel backgroundOverlay;
    private javax.swing.JLabel decryptLogo;
    private javax.swing.JLabel divider;
    private javax.swing.JLabel encryptBtn;
    private javax.swing.JLabel encryptFilePath;
    private javax.swing.JTextField encryptKeyTB;
    private javax.swing.JLabel encryptKeyTitle;
    private javax.swing.JLabel encryptLogo;
    private javax.swing.JLabel encryptTxt;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel fileEncryptWarn;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
