/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VT8_desa_interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;

/**
 *
 * @author Bananawaga
 */
public class javaNotepad extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form notepad_v2
     */
    
    public javaNotepad() {
        initComponents();
        start();
    }

    public void start(){
        textArea.setFont(textArea.getFont().deriveFont(15f));
        open.addActionListener(this);
        quit.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        wordCounter.addActionListener(this);
        charCounter.addActionListener(this);
        black.addActionListener(this);
        white.addActionListener(this);
        smallRes.addActionListener(this);
        medRes.addActionListener(this);
        bigRes.addActionListener(this);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBody = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        quit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        copy = new javax.swing.JMenuItem();
        cut = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        selectAll = new javax.swing.JMenuItem();
        wordCounter = new javax.swing.JMenuItem();
        charCounter = new javax.swing.JMenuItem();
        format = new javax.swing.JMenu();
        visuals = new javax.swing.JMenu();
        black = new javax.swing.JMenuItem();
        white = new javax.swing.JMenuItem();
        smallRes = new javax.swing.JMenuItem();
        medRes = new javax.swing.JMenuItem();
        bigRes = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Notepad by Marc");

        textArea.setColumns(20);
        textArea.setRows(5);
        panelBody.setViewportView(textArea);

        file.setText("File");

        open.setText("Open");
        file.add(open);

        quit.setText("Quit");
        file.add(quit);

        menuBar.add(file);

        edit.setText("Edit");

        copy.setText("Copy");
        edit.add(copy);

        cut.setText("Cut");
        edit.add(cut);

        paste.setText("Paste");
        edit.add(paste);

        selectAll.setText("Select All");
        edit.add(selectAll);

        wordCounter.setText("Word Counter");
        edit.add(wordCounter);

        charCounter.setText("Character Counter");
        edit.add(charCounter);

        menuBar.add(edit);

        format.setText("Format");
        menuBar.add(format);

        visuals.setText("Visuals");

        black.setText("Dark Mode");
        visuals.add(black);

        white.setText("Light Mode");
        visuals.add(white);

        smallRes.setText("800x600");
        visuals.add(smallRes);

        medRes.setText("1280x920");
        visuals.add(medRes);

        bigRes.setText("1920x1080");
        visuals.add(bigRes);

        menuBar.add(visuals);

        help.setText("Help");
        menuBar.add(help);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(javaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javaNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaNotepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bigRes;
    private javax.swing.JMenuItem black;
    private javax.swing.JMenuItem charCounter;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenu edit;
    private javax.swing.JMenu file;
    private javax.swing.JMenu format;
    private javax.swing.JMenu help;
    private javax.swing.JMenuItem medRes;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem open;
    private javax.swing.JScrollPane panelBody;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem quit;
    private javax.swing.JMenuItem selectAll;
    private javax.swing.JMenuItem smallRes;
    private javax.swing.JTextArea textArea;
    private javax.swing.JMenu visuals;
    private javax.swing.JMenuItem white;
    private javax.swing.JMenuItem wordCounter;
    // End of variables declaration//GEN-END:variables

        private void examine(){
        JFileChooser examineFile = new JFileChooser();
        int i = examineFile.showOpenDialog(this);
        if (i==JFileChooser.APPROVE_OPTION){
            File file = examineFile.getSelectedFile();
            String filePath = file.getPath();
            try{
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                String s1 = "", s2 = "";
                while ((s1=br.readLine())!=null){
                    s2+=s1+"\n";
                }
                textArea.setText(s2);
                br.close();
            }catch(Exception ex){ex.printStackTrace();}
        }
  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==open){
            examine();
        }else if(e.getSource()==quit){
            dispose();
        }else if (e.getSource()==copy){
            textArea.copy();
        }else if (e.getSource()==cut){
            textArea.cut();
        }else if (e.getSource()==paste){  
            textArea.paste();
        }else if (e.getSource()==selectAll){
            textArea.selectAll();
        }else if (e.getSource()==wordCounter){
            String text = textArea.getText();
                String words[] = text.split("\\s");
                wordCounter.setText("Words: "+words.length);
                charCounter.setText("Characters: "+text.length());
        }else if (e.getSource()==black){
            textArea.setBackground(Color.black);   
        }else if (e.getSource()==white){
            textArea.setBackground(Color.white);
        }else if (e.getSource()==smallRes){
            setSize(800,600);
        } else if (e.getSource()==medRes){
            setSize(1280,960);
        }else if (e.getSource()==bigRes){
            setSize(1920,1024);
        }
    }
}
