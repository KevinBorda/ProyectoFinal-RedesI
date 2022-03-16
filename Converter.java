import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;

import com.sun.java.swing.plaf.windows.*;
import javax.swing.*;

public class Converter  extends JFrame{
  //0
  private JTextField txtMensajeTranscribir;
  //1
  private JLabel lblTitulo1, lblTitulo2, lblTitulo3, lblTitulo4;
  private JTextField txtnFrames;
  //2
  private JLabel lblOpc0, lblOpc1, lblOpc2, lblOpc3, lblOpc4, lblOpc5, lblOpc6, lblOpc7, lblOpc8, lblOpc9;
  //3
  private JTextField txtOpc0, txtOpc1,txtOpc2,txtOpc3,txtOpc4,txtOpc5, txtOpc6, txtOpc7,txtOpc8,txtOpc9;
  private JTextArea lblHistorial;
  //4
  private JCheckBox chbOpc1, chbOpc2, chbOpc3,chbOpc4, chbOpc5, chbOpc6;
  private JButton btnEnviar;
  //5 6 7
  private JLabel lblTitulo5, lblTitulo6,lblTitulo7;
  //8
  private JTextArea txtATR1, txtATR2,txtATR3,txtATR4;
  //9
  private JLabel lblHeader, lblInfo, lblTrailer;
  //10
  private JLabel lblRta;
  //11
  private JLabel lblOpc10 ,lblOpc11, lblOpc12, lblOpc13, lblOpc14, lblOpc15, lblOpc16, lblOpc17, lblOpc18, lblOpc19;
  //12
  private JTextArea txtOpc10, txtOpc11,txtOpc12,txtOpc13,txtOpc14,txtOpc15, txtOpc16, txtOpc17,txtOpc18,txtOpc19;
  private JButton btnResponder;
  //13
  private JLabel lblTramaRecibida;
  //14
  private JLabel lblMsjRecibido;
  private JTextArea txtMsjRecibido;
  public Converter() {
  
    super("Transmisor / receptor");
    //1 Nivel
    txtMensajeTranscribir = new JTextField(12);
    //2 Nivel
    lblTitulo1 = new JLabel("TRANSMISOR");
    lblTitulo1.setFont(new Font("Serif", Font.PLAIN, 1));
    lblTitulo2 = new JLabel("Mensaje a transcribir:");
    lblTitulo1.setFont(new Font("Serif", Font.CENTER_BASELINE, 14));
    txtnFrames = new JTextField(2);
    lblTitulo3 = new JLabel("Numero de frames:");

    lblTitulo4 = new JLabel("Secuencia de tramas");
    //3 Nivel
    lblOpc0 = new JLabel("Indicador");
    lblOpc1 = new JLabel("ACK");
    lblOpc2 = new JLabel("ENQ");
    lblOpc3 = new JLabel("CTR");
    lblOpc4 = new JLabel("DAT");
    lblOpc5 = new JLabel("PPT");
    lblOpc6 = new JLabel("LPT");
    lblOpc7 = new JLabel("NUM");
    lblOpc8 = new JLabel("INFORMACIÓN");
    lblOpc9 = new JLabel("INDICAROR");
    
    lblHistorial = new JTextArea(20, 17); 
    lblHistorial.setBackground(Color.BLUE);


    //4 Nivel
    txtOpc0 = new JTextField(10);
    txtOpc1 = new JTextField(1);
    txtOpc2 = new JTextField(1);
    txtOpc3 = new JTextField(1);
    txtOpc4 = new JTextField(1);
    txtOpc5 = new JTextField(1);
    txtOpc6 = new JTextField(1);
    txtOpc7 = new JTextField(1);
    txtOpc8 = new JTextField(1);
    txtOpc9 = new JTextField(7);
    btnEnviar = new JButton("Enviar");
    btnEnviar.setMnemonic(KeyEvent.VK_V);

    //5 nivel
    chbOpc1 = new JCheckBox();
    chbOpc2 = new JCheckBox();
    chbOpc3 = new JCheckBox();
    chbOpc4 = new JCheckBox();
    chbOpc5 = new JCheckBox();
    chbOpc6 = new JCheckBox();

    //6 nivel
    lblTitulo5 = new JLabel("Semantica de trama");
    //7 nivel
    lblTitulo6 = new JLabel("RECEPTOR");
    //8 nivel
    lblTitulo7 = new JLabel("Trama recibida");
    //9 nivel
    txtATR1 = new JTextArea(1,15);
    txtATR2 = new JTextArea(1,15);
    txtATR2.setSelectionColor(Color.red);
    txtATR3 = new JTextArea(1,15);
    txtATR4 = new JTextArea(1,15);
    //10 nivel
    lblHeader = new JLabel("Header");
    lblInfo = new JLabel("Información");
    lblTrailer = new JLabel("Trailer");
    //11 nivel
    lblRta = new JLabel("Respuesta");
    //12 nivel
    lblOpc10 = new JLabel("Indicador");
    lblOpc11 = new JLabel("ACK");
    lblOpc12 = new JLabel("ENQ");
    lblOpc13 = new JLabel("CTR");
    lblOpc14 = new JLabel("DAT");
    lblOpc15 = new JLabel("PPT");
    lblOpc16 = new JLabel("LPT");
    lblOpc17 = new JLabel("NUM");
    lblOpc18 = new JLabel("INFORMACIÓN");
    lblOpc19 = new JLabel("INDICAROR");
    //13 nivel
    txtOpc10 = new JTextArea(1,1);
    txtOpc11 = new JTextArea(1,1);
    txtOpc12 = new JTextArea(1,1);
    txtOpc13 = new JTextArea(1,1);
    txtOpc14 = new JTextArea(1,1);
    txtOpc15 = new JTextArea(1,1);
    txtOpc16 = new JTextArea(1,1);
    txtOpc17 = new JTextArea(1,1);
    txtOpc18 = new JTextArea(1,1);
    txtOpc19 = new JTextArea(1,1);
    btnResponder = new JButton("Responder");
    btnResponder.setMnemonic(KeyEvent.VK_V);
    //14 nivel
    lblTramaRecibida = new JLabel("Semánitca trama de control");
    //15 nivel
    lblMsjRecibido = new JLabel("Mensaje recibido:");
    txtMsjRecibido = new JTextArea(1,1);


    ButtonHandler objButtonHandler = new ButtonHandler(this);

    btnEnviar.addActionListener(new ButtonHandler());
    btnResponder.addActionListener(objButtonHandler);

    JPanel UIPanelTrans = new JPanel();

    //****************************************************
    GridBagLayout gridbag = new GridBagLayout();
    UIPanelTrans.setLayout(gridbag);
    GridBagConstraints gbc = new GridBagConstraints();
    
    UIPanelTrans.add(lblTitulo1);
    UIPanelTrans.add(lblTitulo2);
    UIPanelTrans.add(txtMensajeTranscribir);
    UIPanelTrans.add(lblTitulo3);
    UIPanelTrans.add(lblTitulo4);
    UIPanelTrans.add(txtnFrames);
    UIPanelTrans.add(lblHistorial);
    UIPanelTrans.add(lblOpc0);
    UIPanelTrans.add(lblOpc1);
    UIPanelTrans.add(lblOpc2);
    UIPanelTrans.add(lblOpc3);
    UIPanelTrans.add(lblOpc4);
    UIPanelTrans.add(lblOpc5);
    UIPanelTrans.add(lblOpc6);
    UIPanelTrans.add(lblOpc7);
    UIPanelTrans.add(lblOpc8);
    UIPanelTrans.add(lblOpc9);
    UIPanelTrans.add(txtOpc0);
    UIPanelTrans.add(txtOpc1);
    UIPanelTrans.add(txtOpc2);
    UIPanelTrans.add(txtOpc3);
    UIPanelTrans.add(txtOpc4);
    UIPanelTrans.add(txtOpc5);
    UIPanelTrans.add(txtOpc6);
    UIPanelTrans.add(txtOpc7);
    UIPanelTrans.add(txtOpc8);
    UIPanelTrans.add(txtOpc9);
    UIPanelTrans.add(btnEnviar);
    UIPanelTrans.add(chbOpc1);
    UIPanelTrans.add(chbOpc2);
    UIPanelTrans.add(chbOpc3);
    UIPanelTrans.add(chbOpc4);
    UIPanelTrans.add(chbOpc5);
    UIPanelTrans.add(chbOpc6);
    UIPanelTrans.add(lblTitulo5);

    UIPanelTrans.add(lblTitulo6);
    UIPanelTrans.add(lblTitulo7);
    UIPanelTrans.add(txtATR1);
    UIPanelTrans.add(txtATR2);
    UIPanelTrans.add(txtATR3);
    UIPanelTrans.add(txtATR4);

    UIPanelTrans.add(lblHeader);
    UIPanelTrans.add(lblInfo);
    UIPanelTrans.add(lblTrailer);

    UIPanelTrans.add(lblRta);

    UIPanelTrans.add(lblOpc10);
    UIPanelTrans.add(lblOpc11);
    UIPanelTrans.add(lblOpc12);
    UIPanelTrans.add(lblOpc13);
    UIPanelTrans.add(lblOpc14);
    UIPanelTrans.add(lblOpc15);
    UIPanelTrans.add(lblOpc16);
    UIPanelTrans.add(lblOpc17);
    UIPanelTrans.add(lblOpc18);
    UIPanelTrans.add(lblOpc19);
    UIPanelTrans.add(txtOpc10);
    UIPanelTrans.add(txtOpc11);
    UIPanelTrans.add(txtOpc12);
    UIPanelTrans.add(txtOpc13);
    UIPanelTrans.add(txtOpc14);
    UIPanelTrans.add(txtOpc15);
    UIPanelTrans.add(txtOpc16);
    UIPanelTrans.add(txtOpc17);
    UIPanelTrans.add(txtOpc18);
    UIPanelTrans.add(txtOpc19);

    UIPanelTrans.add(btnResponder);

    UIPanelTrans.add(lblTramaRecibida);
    UIPanelTrans.add(lblMsjRecibido);
    UIPanelTrans.add(txtMsjRecibido);

    gbc.insets.top = 15;
    gbc.insets.bottom = 15;
    gbc.insets.left = 15;
    gbc.insets.right = 15;
    gbc.anchor = GridBagConstraints.WEST;

    gbc.gridx = 0;
    gbc.gridy = 0;
    gridbag.setConstraints(lblTitulo1, gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    gridbag.setConstraints(lblTitulo2, gbc);
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.gridwidth = 6;
    gridbag.setConstraints(txtMensajeTranscribir, gbc);
    gbc.gridwidth = 1;
    gbc.gridx = 2;
    gbc.gridy = 1;
    gridbag.setConstraints(lblTitulo3, gbc);
    gbc.gridx = 3;
    gbc.gridy = 1;
    gridbag.setConstraints(txtnFrames, gbc);
    gbc.gridx = 11;
    gbc.gridy = 1;
    gridbag.setConstraints(lblTitulo4, gbc);


    gbc.gridx = 0;
    gbc.gridy = 2;
    gridbag.setConstraints(lblOpc0, gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    gridbag.setConstraints(lblOpc1, gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    gridbag.setConstraints(lblOpc2, gbc);
    gbc.gridx = 3;
    gbc.gridy = 2;
    gridbag.setConstraints(lblOpc3, gbc);
    gbc.gridx = 4;
    gbc.gridy = 2;
    gridbag.setConstraints(lblOpc4, gbc);
    gbc.gridx = 5;
    gbc.gridy = 2;
    gridbag.setConstraints(lblOpc5, gbc);
    gbc.gridx = 6;
    gbc.gridy = 2;
    gridbag.setConstraints(lblOpc6, gbc);
    gbc.gridx = 7;
    gbc.gridy = 2;
    gridbag.setConstraints(lblOpc7, gbc);
    gbc.gridx = 8;
    gbc.gridy = 2;
    gridbag.setConstraints(lblOpc8, gbc);
    gbc.gridx = 9;
    gbc.gridy = 2;
    gridbag.setConstraints(lblOpc9, gbc);


    gbc.gridx = 0;
    gbc.gridy = 3;
    gridbag.setConstraints(txtOpc0, gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    gridbag.setConstraints(txtOpc1, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    gridbag.setConstraints(txtOpc2, gbc);
    gbc.gridx = 3;
    gbc.gridy = 3;
    gridbag.setConstraints(txtOpc3, gbc);
    gbc.gridx = 4;
    gbc.gridy = 3;
    gridbag.setConstraints(txtOpc4, gbc);
    gbc.gridx = 5;
    gbc.gridy = 3;
    gridbag.setConstraints(txtOpc5, gbc);
    gbc.gridx = 6;
    gbc.gridy = 3;
    gridbag.setConstraints(txtOpc6, gbc);
    gbc.gridx = 7;
    gbc.gridy = 3;
    gridbag.setConstraints(txtOpc7, gbc);
    gbc.gridx = 8;
    gbc.gridy = 3;
    gridbag.setConstraints(txtOpc8, gbc);
    gbc.gridx = 9;
    gbc.gridy = 3;
    gridbag.setConstraints(txtOpc9, gbc);
    gbc.gridx = 10;
    gbc.gridy = 3;
    gridbag.setConstraints(btnEnviar, gbc);
    gbc.gridx = 11;
    gbc.gridy = 2;
    gbc.gridheight = 10;
    gridbag.setConstraints(lblHistorial, gbc);
    
    gbc.gridheight = 1;
    gbc.gridx = 1;
    gbc.gridy = 4;
    gridbag.setConstraints(chbOpc1, gbc);
    gbc.gridx = 2;
    gbc.gridy = 4;
    gridbag.setConstraints(chbOpc2, gbc);
    gbc.gridx = 3;
    gbc.gridy = 4;
    gridbag.setConstraints(chbOpc3, gbc);
    gbc.gridx = 4;
    gbc.gridy = 4;
    gridbag.setConstraints(chbOpc4, gbc);
    gbc.gridx = 5;
    gbc.gridy = 4;
    gridbag.setConstraints(chbOpc5, gbc);
    gbc.gridx = 6;
    gbc.gridy = 4;
    gridbag.setConstraints(chbOpc6, gbc);

    gbc.gridx = 2;
    gbc.gridy = 5;
    gridbag.setConstraints(lblTitulo5, gbc);
   

   
 
    gbc.gridx = 0;
    gbc.gridy = 6;
    gridbag.setConstraints(lblTitulo6, gbc);
    gbc.gridx = 0;
    gbc.gridy = 7;
    gridbag.setConstraints(lblTitulo7, gbc);
    
    gbc.gridx = 0;
    gbc.gridy = 8;
    gridbag.setConstraints(txtATR1, gbc);
    gbc.gridx = 1;
    gbc.gridy = 8;
    gridbag.setConstraints(txtATR2, gbc);
    txtATR2.setSize(4, 2);
    gbc.gridx = 2;
    gbc.gridy = 8;
    gridbag.setConstraints(txtATR3, gbc);
    gbc.gridx = 3;
    gbc.gridy = 8;
    gridbag.setConstraints(txtATR4, gbc);

    gbc.gridx = 0;
    gbc.gridy = 9;
    gridbag.setConstraints(lblHeader, gbc);
    gbc.gridx = 2;
    gbc.gridy = 9;
    gridbag.setConstraints(lblInfo, gbc);
    gbc.gridx = 3;
    gbc.gridy = 9;
    gridbag.setConstraints(lblTrailer, gbc);

    gbc.gridx = 0;
    gbc.gridy = 10;
    gridbag.setConstraints(lblRta, gbc);

    gbc.gridx = 0;
    gbc.gridy = 11;
    gridbag.setConstraints(lblOpc10, gbc);
    gbc.gridx = 1;
    gbc.gridy = 11;
    gridbag.setConstraints(lblOpc11, gbc);
    gbc.gridx = 2;
    gbc.gridy = 11;
    gridbag.setConstraints(lblOpc12, gbc);
    gbc.gridx = 3;
    gbc.gridy = 11;
    gridbag.setConstraints(lblOpc13, gbc);
    gbc.gridx = 4;
    gbc.gridy = 11;
    gridbag.setConstraints(lblOpc14, gbc);
    gbc.gridx = 5;
    gbc.gridy = 11;
    gridbag.setConstraints(lblOpc15, gbc);
    gbc.gridx = 6;
    gbc.gridy = 11;
    gridbag.setConstraints(lblOpc16, gbc);
    gbc.gridx = 7;
    gbc.gridy = 11;
    gridbag.setConstraints(lblOpc17, gbc);
    gbc.gridx = 8;
    gbc.gridy = 11;
    gridbag.setConstraints(lblOpc18, gbc);
    gbc.gridx = 9;
    gbc.gridy = 11;
    gridbag.setConstraints(lblOpc19, gbc);
  
    gbc.gridx = 0;
    gbc.gridy = 12;
    gridbag.setConstraints(txtOpc10, gbc);
    gbc.gridx = 1;
    gbc.gridy = 12;
    gridbag.setConstraints(txtOpc11, gbc);
    gbc.gridx = 2;
    gbc.gridy = 12;
    gridbag.setConstraints(txtOpc12, gbc);
    gbc.gridx = 3;
    gbc.gridy = 12;
    gridbag.setConstraints(txtOpc13, gbc);
    gbc.gridx = 4;
    gbc.gridy = 12;
    gridbag.setConstraints(txtOpc14, gbc);
    gbc.gridx = 5;
    gbc.gridy = 12;
    gridbag.setConstraints(txtOpc15, gbc);
    gbc.gridx = 6;
    gbc.gridy = 12;
    gridbag.setConstraints(txtOpc16, gbc);
    gbc.gridx = 7;
    gbc.gridy = 12;
    gridbag.setConstraints(txtOpc17, gbc);
    gbc.gridx = 8;
    gbc.gridy = 12;
    gridbag.setConstraints(txtOpc18, gbc);
    gbc.gridx = 9;
    gbc.gridy = 12;
    gridbag.setConstraints(txtOpc19, gbc);
    gbc.gridx = 10;
    gbc.gridy = 12;
    gridbag.setConstraints(btnResponder, gbc);

    gbc.gridx = 1;
    gbc.gridy = 13;
    gridbag.setConstraints(lblTramaRecibida, gbc);

    gbc.gridx = 0;
    gbc.gridy = 14;
    gridbag.setConstraints(lblMsjRecibido, gbc);
    gbc.gridx = 1;
    gbc.gridy = 14;
    gridbag.setConstraints(txtMsjRecibido, gbc);

    gbc.insets.left = 2;
    gbc.insets.right = 2;
    gbc.insets.top = 40;

    //

    //Add the buttons and the log to the frame
    Container contentPane = getContentPane();
    contentPane.add(UIPanelTrans, BorderLayout.CENTER);

    try {
      UIManager.setLookAndFeel(new WindowsLookAndFeel());
      SwingUtilities.updateComponentTreeUI(
        Converter.this);
    } catch (Exception ex) {
      System.out.println(ex);
    }

  }
  public static void main(String[] args) {
    Converter conv = new Converter();
    
    conv.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {
      System.exit(0);
    }
    }
                     );

  //frame.pack();
  conv.setSize(1500, 900);
  conv.setVisible(true);
  conv.setLocationRelativeTo(null);


  }
  }// End of class

class ButtonHandler implements ActionListener {
  Converter objConverter;
  public void actionPerformed(ActionEvent e) {
    String validationResult = null;
    //System.out.println(e.getActionCommand());
    if (e.getActionCommand().equals("Enviar")) {
      System.exit(1);
    }
    if (e.getActionCommand().equals("Responder")) {
      
    }
  }
  public ButtonHandler() {
  }
  public ButtonHandler(Converter inObjPRManager) {
    objConverter = inObjPRManager;
  }

} // End of class ButtonHandler

