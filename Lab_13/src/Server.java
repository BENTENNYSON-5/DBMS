
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends javax.swing.JFrame {

    private static final long serialVersionUID = -3351076084194353320L;
    static ServerSocket ssckt;
    static Socket sckt;
    static DataInputStream dtinpt;
    static DataOutputStream dtotpt;

    public Server() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtbxarea = new javax.swing.JTextArea();
        txtbxfield = new javax.swing.JTextField();
        btnsend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtbxarea.setColumns(20);
        txtbxarea.setRows(5);
        jScrollPane1.setViewportView(txtbxarea);

        txtbxfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbxfieldActionPerformed(evt);
            }
        });

        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });

        jLabel1.setText("Type your Message Here:");

        jLabel2.setText("Server Machine");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                        layout.createSequentialGroup()
                                                .addComponent(txtbxfield, javax.swing.GroupLayout.PREFERRED_SIZE, 304,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnsend))))
                        .addGroup(layout.createSequentialGroup().addGap(151, 151, 151).addComponent(jLabel2)))
                .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addGap(27, 27, 27).addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18).addComponent(jLabel1).addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtbxfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnsend, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)));

        pack();
    }

    private void txtbxfieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            String msgout = "";
            msgout = txtbxfield.getText().trim();
            dtotpt.writeUTF(msgout);

        } catch (Exception e) {
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });

        String msgin = "";
        try {
            ssckt = new ServerSocket(1201);
            sckt = ssckt.accept();
            dtinpt = new DataInputStream(sckt.getInputStream());
            dtotpt = new DataOutputStream(sckt.getOutputStream());
            while (!msgin.equals("exit")) {
                msgin = dtinpt.readUTF();
                txtbxarea.setText(txtbxarea.getText().trim() + "\n Client:" + msgin);
            }
        } catch (Exception e) {
        }
    }

    private javax.swing.JButton btnsend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea txtbxarea;
    private javax.swing.JTextField txtbxfield;

}
