import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.*;
import javax.swing.*;

public class Converter  extends JFrame{
  //0
  public JTextField txtMensajeTranscribir;
  //1
  private JLabel lblTitulo1, lblTitulo2, lblTitulo3, lblTitulo4;
  public JTextField txtnFrames;
  //2
  private JLabel lblIND1, lblACK, lblENQ, lblCTR, lblDAT, lblPPT, lblLPT, lblNUM, lblINF, lblIND2;
  //3
  public JTextField txtIND1, txtACK,txtENQ,txtCTR,txtDAT,txtPPT, txtLPT, txtNUM,txtINF,txtIND2;
  private JTextArea lblHistorial;
  //4
  public JCheckBox chkACK, chkENQ, chkCTR,chkDAT, chkPPT, chkLPT;
  public JButton btnEnviar;
  //5 6 7
  private JLabel lblTramaTrans, lblTitulo6,lblTitulo7;
  //8
  public JTextArea txtHeader, txtATR2,txtATR3,txtTrailer;
  //9
  private JLabel lblHeader, lblInfo, lblTrailer;
  //10
  private JLabel lblRta;
  //11
  private JLabel lblOpc10 ,lblOpc11, lblOpc12, lblOpc13, lblOpc14, lblOpc15, lblOpc16, lblOpc17, lblOpc18, lblOpc19;
  //12
  private JTextArea txtRIND1, txtRACK,txtRENQ,txtRCTR,txtRDAT,txtRPPT, txtRLPT, txtRNUM,txtRINF,txtRIND2;
  public JButton btnResponder;
  //13
  private JLabel lblTramaRecibida;
  //14
  private JLabel lblMsjRecibido;
  private JTextArea txtMsjRecibido;
  
  private int itera;
  private String[] infoTramas;

  public Converter() {
    
    super("Protocolo de transmisión de datos");
    //1 Nivel
    txtMensajeTranscribir = new JTextField(15);
    //2 Nivel
    lblTitulo1 = new JLabel("TRANSMISOR");
    lblTitulo1.setFont(new Font("Serif", Font.PLAIN, 1));
    lblTitulo2 = new JLabel("Mensaje a transcribir:");
    lblTitulo1.setFont(new Font("Serif", Font.CENTER_BASELINE, 14));
    txtnFrames = new JTextField(2);
    lblTitulo3 = new JLabel("Numero de frames:");

    lblTitulo4 = new JLabel("Secuencia de tramas");
    //3 Nivel
    lblIND1 = new JLabel("Indicador");
    lblACK = new JLabel("ACK");
    lblENQ = new JLabel("ENQ");
    lblCTR = new JLabel("CTR");
    lblDAT = new JLabel("DAT");
    lblPPT = new JLabel("PPT");
    lblLPT = new JLabel("LPT");
    lblNUM = new JLabel("NUM");
    lblINF = new JLabel("INFORMACIÓN");
    lblIND2 = new JLabel("INDICAROR");
    
    lblHistorial = new JTextArea(20, 17); 


    //4 Nivel
    txtIND1 = new JTextField(7);
    txtACK = new JTextField(1);
    txtENQ = new JTextField(1);
    txtCTR = new JTextField(1);
    txtDAT = new JTextField(1);
    txtPPT = new JTextField(1);
    txtLPT = new JTextField(1);
    txtNUM = new JTextField(1);
    txtINF = new JTextField(10);
    txtIND2 = new JTextField(7);
    btnEnviar = new JButton("Enviar");
    btnEnviar.setMnemonic(KeyEvent.VK_V);

    //5 nivel
    chkACK = new JCheckBox();
    chkENQ = new JCheckBox();
    chkCTR = new JCheckBox();
    chkDAT = new JCheckBox();
    chkPPT = new JCheckBox();
    chkLPT = new JCheckBox();

    //6 nivel
    lblTramaTrans = new JLabel("Semantica de trama");
    //7 nivel
    lblTitulo6 = new JLabel("RECEPTOR");
    //8 nivel
    lblTitulo7 = new JLabel("Trama recibida");
    //9 nivel
    txtHeader = new JTextArea(1,15);
    txtATR2 = new JTextArea(1,15);
    txtATR2.setSelectionColor(Color.red);
    txtATR3 = new JTextArea(1,15);
    txtTrailer = new JTextArea(1,15);
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
    txtRIND1 = new JTextArea(1,1);
    txtRACK = new JTextArea(1,1);
    txtRENQ = new JTextArea(1,1);
    txtRCTR = new JTextArea(1,1);
    txtRDAT = new JTextArea(1,1);
    txtRPPT = new JTextArea(1,1);
    txtRLPT = new JTextArea(1,1);
    txtRNUM = new JTextArea(1,1);
    txtRINF = new JTextArea(1,1);
    txtRIND2 = new JTextArea(1,1);
    btnResponder = new JButton("Responder");
    btnResponder.setMnemonic(KeyEvent.VK_V);
    //14 nivel
    lblTramaRecibida = new JLabel("Semántica trama de control");
    //15 nivel
    lblMsjRecibido = new JLabel("Mensaje recibido:");
    txtMsjRecibido = new JTextArea(1,1);


    ButtonHandler objButtonHandler = new ButtonHandler(this);

    btnEnviar.addActionListener(objButtonHandler);
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
    UIPanelTrans.add(lblIND1);
    UIPanelTrans.add(lblACK);
    UIPanelTrans.add(lblENQ);
    UIPanelTrans.add(lblCTR);
    UIPanelTrans.add(lblDAT);
    UIPanelTrans.add(lblPPT);
    UIPanelTrans.add(lblLPT);
    UIPanelTrans.add(lblNUM);
    UIPanelTrans.add(lblINF);
    UIPanelTrans.add(lblIND2);
    UIPanelTrans.add(txtIND1);
    UIPanelTrans.add(txtACK);
    UIPanelTrans.add(txtENQ);
    UIPanelTrans.add(txtCTR);
    UIPanelTrans.add(txtDAT);
    UIPanelTrans.add(txtPPT);
    UIPanelTrans.add(txtLPT);
    UIPanelTrans.add(txtNUM);
    UIPanelTrans.add(txtINF);
    UIPanelTrans.add(txtIND2);
    UIPanelTrans.add(btnEnviar);
    UIPanelTrans.add(chkACK);
    UIPanelTrans.add(chkENQ);
    UIPanelTrans.add(chkCTR);
    UIPanelTrans.add(chkDAT);
    UIPanelTrans.add(chkPPT);
    UIPanelTrans.add(chkLPT);
    UIPanelTrans.add(lblTramaTrans);

    UIPanelTrans.add(lblTitulo6);
    UIPanelTrans.add(lblTitulo7);
    UIPanelTrans.add(txtHeader);
    UIPanelTrans.add(txtATR2);
    UIPanelTrans.add(txtATR3);
    UIPanelTrans.add(txtTrailer);

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
    UIPanelTrans.add(txtRIND1);
    UIPanelTrans.add(txtRACK);
    UIPanelTrans.add(txtRENQ);
    UIPanelTrans.add(txtRCTR);
    UIPanelTrans.add(txtRDAT);
    UIPanelTrans.add(txtRPPT);
    UIPanelTrans.add(txtRLPT);
    UIPanelTrans.add(txtRNUM);
    UIPanelTrans.add(txtRINF);
    UIPanelTrans.add(txtRIND2);

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
    gbc.gridwidth = 10;
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
    gridbag.setConstraints(lblIND1, gbc);
    gbc.gridx = 1;
    gbc.gridy = 2;
    gridbag.setConstraints(lblACK, gbc);
    gbc.gridx = 2;
    gbc.gridy = 2;
    gridbag.setConstraints(lblENQ, gbc);
    gbc.gridx = 3;
    gbc.gridy = 2;
    gridbag.setConstraints(lblCTR, gbc);
    gbc.gridx = 4;
    gbc.gridy = 2;
    gridbag.setConstraints(lblDAT, gbc);
    gbc.gridx = 5;
    gbc.gridy = 2;
    gridbag.setConstraints(lblPPT, gbc);
    gbc.gridx = 6;
    gbc.gridy = 2;
    gridbag.setConstraints(lblLPT, gbc);
    gbc.gridx = 7;
    gbc.gridy = 2;
    gridbag.setConstraints(lblNUM, gbc);
    gbc.gridx = 8;
    gbc.gridy = 2;
    gridbag.setConstraints(lblINF, gbc);
    gbc.gridx = 9;
    gbc.gridy = 2;
    gridbag.setConstraints(lblIND2, gbc);


    gbc.gridx = 0;
    gbc.gridy = 3;
    gridbag.setConstraints(txtIND1, gbc);
    gbc.gridx = 1;
    gbc.gridy = 3;
    gridbag.setConstraints(txtACK, gbc);
    gbc.gridx = 2;
    gbc.gridy = 3;
    gridbag.setConstraints(txtENQ, gbc);
    gbc.gridx = 3;
    gbc.gridy = 3;
    gridbag.setConstraints(txtCTR, gbc);
    gbc.gridx = 4;
    gbc.gridy = 3;
    gridbag.setConstraints(txtDAT, gbc);
    gbc.gridx = 5;
    gbc.gridy = 3;
    gridbag.setConstraints(txtPPT, gbc);
    gbc.gridx = 6;
    gbc.gridy = 3;
    gridbag.setConstraints(txtLPT, gbc);
    gbc.gridx = 7;
    gbc.gridy = 3;
    gridbag.setConstraints(txtNUM, gbc);
    gbc.gridx = 8;
    gbc.gridy = 3;
    gridbag.setConstraints(txtINF, gbc);
    gbc.gridx = 9;
    gbc.gridy = 3;
    gridbag.setConstraints(txtIND2, gbc);
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
    gridbag.setConstraints(chkACK, gbc);
    gbc.gridx = 2;
    gbc.gridy = 4;
    gridbag.setConstraints(chkENQ, gbc);
    gbc.gridx = 3;
    gbc.gridy = 4;
    gridbag.setConstraints(chkCTR, gbc);
    gbc.gridx = 4;
    gbc.gridy = 4;
    gridbag.setConstraints(chkDAT, gbc);
    gbc.gridx = 5;
    gbc.gridy = 4;
    gridbag.setConstraints(chkPPT, gbc);
    gbc.gridx = 6;
    gbc.gridy = 4;
    gridbag.setConstraints(chkLPT, gbc);

    gbc.gridx = 2;
    gbc.gridy = 5;
    gridbag.setConstraints(lblTramaTrans, gbc);
   

   
 
    gbc.gridx = 0;
    gbc.gridy = 6;
    gridbag.setConstraints(lblTitulo6, gbc);
    gbc.gridx = 0;
    gbc.gridy = 7;
    gridbag.setConstraints(lblTitulo7, gbc);
    
    gbc.gridx = 0;
    gbc.gridy = 8;
    gridbag.setConstraints(txtHeader, gbc);
    gbc.gridx = 1;
    gbc.gridy = 8;
    gridbag.setConstraints(txtATR2, gbc);
    txtATR2.setSize(4, 2);
    gbc.gridx = 2;
    gbc.gridy = 8;
    gridbag.setConstraints(txtATR3, gbc);
    gbc.gridx = 3;
    gbc.gridy = 8;
    gridbag.setConstraints(txtTrailer, gbc);

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
    gridbag.setConstraints(txtRIND1, gbc);
    gbc.gridx = 1;
    gbc.gridy = 12;
    gridbag.setConstraints(txtRACK, gbc);
    gbc.gridx = 2;
    gbc.gridy = 12;
    gridbag.setConstraints(txtRENQ, gbc);
    gbc.gridx = 3;
    gbc.gridy = 12;
    gridbag.setConstraints(txtRCTR, gbc);
    gbc.gridx = 4;
    gbc.gridy = 12;
    gridbag.setConstraints(txtRDAT, gbc);
    gbc.gridx = 5;
    gbc.gridy = 12;
    gridbag.setConstraints(txtRPPT, gbc);
    gbc.gridx = 6;
    gbc.gridy = 12;
    gridbag.setConstraints(txtRLPT, gbc);
    gbc.gridx = 7;
    gbc.gridy = 12;
    gridbag.setConstraints(txtRNUM, gbc);
    gbc.gridx = 8;
    gbc.gridy = 12;
    gridbag.setConstraints(txtRINF, gbc);
    gbc.gridx = 9;
    gbc.gridy = 12;
    gridbag.setConstraints(txtRIND2, gbc);
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
    intialize();
    try {
      SwingUtilities.updateComponentTreeUI(
        Converter.this);
    } catch (Exception ex) {
      System.out.println(ex);
    }

  }

  public void intialize (){
    txtIND1.setText("10000001");
    txtACK.setText("0");
    txtENQ.setText("0");
    txtLPT.setText("0");
    txtPPT.setText("0");
    txtDAT.setText("0");
    txtNUM.setText("0");
    txtCTR.setText("0");
    txtINF.setText("EJEMPLO");
    txtIND2.setText("10000001");
    txtMensajeTranscribir.setText("Escriba aqui su mensaje");
    txtnFrames.setText("X");
    txtRIND1.setText("Ind1");
    txtRACK.setText("0");
    txtRENQ.setText("0");
    txtRCTR.setText("0");
    txtRDAT.setText("0");
    txtRPPT.setText("0");
    txtRLPT.setText("0");
    txtRNUM.setText("0");
    txtRINF.setText("Info");
    txtRIND2.setText("Ind2");
    btnResponder.setEnabled(false);
    txtHeader.setText("------");
    txtATR2.setText("------");
    txtATR3.setText("------");
    txtTrailer.setText("------");
    itera = 0;
  }
  
  public int getACK(){
    int x = Integer.parseInt(txtACK.getText());
    return x;
  }
  public int getENQ(){
    int x = Integer.parseInt(txtENQ.getText());
    return x;
  }
  public int getIND2(){
    int x = Integer.parseInt(txtIND2.getText());
    return x;
  }
  public int getIND1(){
    int x = Integer.parseInt(txtIND1.getText());
    return x;
  }
  public int getCTR(){
    int x = Integer.parseInt(txtCTR.getText());
    return x;
  }
  public int getDAT(){
    int x = Integer.parseInt(txtDAT.getText());
    return x;
  }
  public int getLPT(){
    int x = Integer.parseInt(txtLPT.getText());
    return x;
  }
  public int getPPT(){
    int x = Integer.parseInt(txtPPT.getText());
    return x;
  }
  public int getNUM(){
    int x = Integer.parseInt(txtNUM.getText());
    return x;
  }
  public String getINF(){
    String x = txtINF.getText();
    return x;
  } 

  public void setRACK(String t){
    txtRACK.setText(t);
  }
  public void setRENQ(String t){
    txtRENQ.setText(t);
  }
  public void setRCTR(String t){
    txtRCTR.setText(t);
  }
  public void setRLPT(String t){
    txtRLPT.setText(t);
  }
  public void setRPPT(String t){
    txtRPPT.setText(t);
  }
  public void setRDAT(String t){
    txtRDAT.setText(t);
  }
  public void setRIND(String t){
    txtRIND1.setText(t);
    txtRIND2.setText(t);
  }
  public void setRNUM(String t){
    txtRNUM.setText(t);
  }
  public void setRINF(String t){
    txtRINF.setText(t);
  }
  public void setTTMessage( String msg){
    lblTramaTrans.setText(msg);
  }
  public void setTRMessage( String msg){
    lblTramaRecibida.setText(msg);
  }

  public void setTRMessageRcb( String msg){
    txtMsjRecibido.setText(msg);
  }
  public void uploadH(int a, String t){
    itera ++;
    String cadena = "Trama " + itera;
    if (a==1)
      cadena += " (Tx)";
    else
      cadena += " (Rx)";
    cadena+= "\n" + t + "\n";
    lblHistorial.setText(lblHistorial.getText()+cadena);
  }
  public boolean casillasPermiso(){
    if (chkPPT.isSelected() && chkCTR.isSelected() && !chkACK.isSelected() && !chkLPT.isSelected()
    && !chkDAT.isSelected() && !chkENQ.isSelected()){
      return true;
    }
    return false;
  }

  public boolean casillasTransmision(){
    if (!chkPPT.isSelected() && !chkCTR.isSelected() && !chkACK.isSelected() && !chkLPT.isSelected()
    && chkDAT.isSelected()){
      return true;
    }
    return false;
  }



  public void setInfoTramas(String[] x){
    infoTramas = x;
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
  Trama tramaTransmisora;
  Trama tramaReceptora;
  int iteracion = 0;
  String[] mensaje; 
  String[] mensajeRecibido = new String[6];
  public void actionPerformed(ActionEvent e) {
    tramaTransmisora = new Trama(objConverter.getIND1(), objConverter.getACK(), 
    objConverter.getENQ(), objConverter.getCTR(), objConverter.getDAT(), objConverter.getPPT(), objConverter.getLPT(), objConverter.getNUM(), objConverter.getINF());
    if (e.getActionCommand().equals("Enviar")) {
      System.out.println("nueva iteracion");

      if (tramaTransmisora.validate()){
        if(tramaTransmisora.permissToT() && objConverter.casillasPermiso()){
          //Caso en que se este pidiendo control
          if (iteracion < 1 ){
            tranCase1();
            updateTramaRecibida(tramaTransmisora);            
            tramaReceptora = tramaTransmisora;
            objConverter.txtHeader.setText(Integer.toString(tramaReceptora.indicador));
            tramaReceptora.tramaRdyToRive();
            updateRecep(tramaReceptora);
            iteracion ++;
          }
          else 
            JOptionPane.showMessageDialog(null, "Permiso ya pedido anteriormente");
        }else if (tramaTransmisora.txData() && objConverter.casillasTransmision()){
          System.out.println("voy a transmitir");
          //Caso en que se  transmita 
          if ( mensaje == null || tramaTransmisora.NUM > mensaje.length ){
            JOptionPane.showMessageDialog(null, "Frame no encontrado en el mensaje");
          }else{
            objConverter.txtINF.setText(mensaje[tramaTransmisora.NUM-1]);
            tramaTransmisora.info = mensaje[tramaTransmisora.NUM-1];
            tranCase2(tramaTransmisora.NUM);
            updateTramaRecibida(tramaTransmisora);            
            tramaReceptora = tramaTransmisora;
            objConverter.txtHeader.setText(Integer.toString(tramaReceptora.indicador));
            tramaReceptora.tramaRecibida();
            updateRecep(tramaReceptora);
            System.out.println("num: " + tramaReceptora.NUM);
            iteracion ++;
          }
        }
      } else 
        System.out.println("Error en la trama");

    }
    if (e.getActionCommand().equals("Responder")) {
      if(tramaReceptora.validate()){
        if (tramaReceptora.rdyToRecept()){
          recepCase1();
          String msg = JOptionPane.showInputDialog(null, "Digite el mensaje a enviar");
          String[] ptes = msg.split(" ");
          mensaje = ptes;
          objConverter.txtMensajeTranscribir.setText(msg);
          objConverter.setInfoTramas(ptes);
          String numF = Integer.toString(ptes.length);
          objConverter.txtnFrames.setText(numF);
        }else if (tramaReceptora.recibida()){
          System.out.println(tramaReceptora.ENQ);
          if (tramaReceptora.ENQ == 0){
            mensajeRecibido[tramaTransmisora.NUM-1] = tramaTransmisora.info;
            String aux = "";
            for (int i=0; i<mensajeRecibido.length; i++){
              if(mensajeRecibido[i] !=null){
                System.out.println(mensajeRecibido[i]);
                aux = aux + mensajeRecibido[i] + " ";
              }
            }
            objConverter.setTRMessageRcb(aux);
            recepCase2(tramaTransmisora.NUM);
          }else{
            mensajeRecibido[tramaTransmisora.NUM-1] = tramaTransmisora.info;
            String aux = "";
            for (int i=0; i<mensajeRecibido.length; i++){
              if(mensajeRecibido[i] !=null){
                System.out.println(mensajeRecibido[i]);
                aux = aux + mensajeRecibido[i] + " ";
              }
            }
            objConverter.setTRMessageRcb(aux);
            recepCase3(tramaTransmisora.NUM);

          }
        }
      }
    }
  }


  public void tranCase1 (){
    objConverter.setTTMessage("Semántica: Trama de control, permiso para transmitir");
    objConverter.btnEnviar.setEnabled(false);
    objConverter.btnResponder.setEnabled(true);
    objConverter.uploadH(1, "Control, permiso para transmitir");
  }

  public void tranCase2 (int numTrama){
    objConverter.setTTMessage("Semántica: Trama de datos");
    objConverter.btnEnviar.setEnabled(false);
    objConverter.btnResponder.setEnabled(true);
    objConverter.uploadH(1, "Datos, Trama " + numTrama);
  }

  public void recepCase1 (){
    objConverter.setTRMessage("Semántica: Trama de control, listo para recibir");
    objConverter.uploadH(0, "Control, listo para recibir");
    objConverter.btnEnviar.setEnabled(true);
    objConverter.btnResponder.setEnabled(false);
  }

  public void recepCase2 (int numTrama){
    objConverter.setTRMessage("Semántica: Trama de datos");
    objConverter.uploadH(0, "Control, Trama " + numTrama);
    objConverter.btnEnviar.setEnabled(true);
    objConverter.btnResponder.setEnabled(false);
  }

  public void recepCase3 (int numTrama){
    objConverter.setTRMessage("Semántica: Trama de datos");
    objConverter.uploadH(0, "Control, Ultima Trama " + numTrama);
    objConverter.uploadH(0, "Mensaje Recibido");
    objConverter.btnEnviar.setEnabled(true);
    objConverter.btnResponder.setEnabled(false);
  }
  
  public void updateTramaRecibida(Trama tramaRecibida){
    String aux = "" + tramaRecibida.ACK + tramaRecibida.ENQ + tramaRecibida.CTR + tramaRecibida.DAT + tramaRecibida.PPT + tramaRecibida.LPT + tramaRecibida.NUM;
    objConverter.txtHeader.setText(String.valueOf(tramaRecibida.indicador));
    objConverter.txtATR2.setText(aux);
    objConverter.txtATR3.setText(tramaRecibida.info);
    objConverter.txtTrailer.setText((String.valueOf(tramaRecibida.indicador)));
  }
  public void updateRecep(Trama tm){
    objConverter.setRACK(Integer.toString(tm.ACK));
    objConverter.setRENQ(Integer.toString(tm.ENQ));
    objConverter.setRCTR(Integer.toString(tm.CTR));
    objConverter.setRPPT(Integer.toString(tm.PPT));
    objConverter.setRLPT(Integer.toString(tm.LPT));
    objConverter.setRNUM(Integer.toString(tm.NUM));
    objConverter.setRDAT(Integer.toString(tm.DAT));
    objConverter.setRIND(Integer.toString(tm.indicador));
    objConverter.setRINF(tm.info);

  }

  public ButtonHandler() {
  }
  public ButtonHandler(Converter inObjPRManager) {
    objConverter = inObjPRManager;
  }

} // End of class ButtonHandler

class Trama {
  int indicador, ACK, ENQ, CTR, DAT, PPT, LPT, NUM;
  String info;

  public Trama (int i, int ack, int enq, int ctr, int dat, int ppt, int lpt, int num, String info){
    indicador=i;
    ACK=ack;
    this.ENQ=enq;
    this.CTR = ctr;
    this.LPT=lpt;
    this.DAT=dat;
    this.NUM=num;
    this.PPT=ppt;
    this.info=info;
  }
  public boolean validate(){
    if (ACK>1 || ACK<0 ||ENQ>1 || ENQ<0 || CTR>1 || CTR<0 ||DAT>1 || DAT<0 || PPT>1 || PPT<0 ||LPT>1 || LPT<0){
      return false;
    }
    return true;
  }
  public boolean permissToT(){
    if (PPT == 1 && CTR==1){
      return true;
    }
    return false;
  }

  public boolean txData(){
    if (DAT == 1 && NUM != 0){
      return true;
    }
    return false;
  }

  public boolean lastTxData(){
    if (DAT == 1 && NUM != 0 && ENQ == 1){
      return true;
    }
    return false;
  }

  public void tramaRdyToRive(){
    ACK = 0;
    ENQ = 0;
    CTR = 1;
    DAT = 0;
    PPT = 0;
    LPT = 1;
    NUM = 0;
  }

  public void tramaRecibida(){
    ACK = 1;
    ENQ = 0;
    CTR = 1;
    DAT = 0;
    PPT = 0;
    LPT = 0;
    NUM = 0;
  }

  public boolean rdyToRecept(){
    if (LPT == 1 && CTR==1){
      return true;
    }
    return false;
  }

  public boolean recibida(){
    if (ACK == 1 && CTR==1){
      return true;
    }
    return false;
  }
}