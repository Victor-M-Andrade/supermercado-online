/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author victo
 */
public class JanelaMenu extends javax.swing.JFrame {
    
    DecimalFormat deci = new DecimalFormat("0.00");

    /**
     * Creates new form JanelaMenu
     */
    public JanelaMenu() {
        initComponents();
        
        btnFinalizarCompra.setEnabled(false);

        
        /*Carnes*/
        txtPrecoPicanha.setVisible(false);
        txtPrecoLinguica.setVisible(false);
        txtPrecoAlcatra.setVisible(false);
        txtPrecoCarneMoida.setVisible(false);
        txtPrecoSalsisha.setVisible(false);
        txtPrecoFrango.setVisible(false);
        
        txtPicanha.setVisible(false);
        txtLinguica.setVisible(false);
        txtAlcatra.setVisible(false);
        txtCarneMoida.setVisible(false);
        txtSalsisha.setVisible(false);
        txtFrago.setVisible(false);
        
        btnPicanha.setVisible(false);
        btnLinguica.setVisible(false);
        btnAlcatra.setVisible(false);
        btnCarneMoida.setVisible(false);
        btnSalsisha.setVisible(false);
        btnFrango.setVisible(false);
        /******************************/
        
        
        /*Hortifruti*/
        txtPrecoAcafrao.setVisible(false);
        txtPrecoAlface.setVisible(false);
        txtPrecoMelancia.setVisible(false);
        txtPrecoCenoura.setVisible(false);
        txtPrecoBatata.setVisible(false);
        txtPrecoBanana.setVisible(false);
        
        txtAcafrao.setVisible(false);
        txtAlface.setVisible(false);
        txtMelancia.setVisible(false);
        txtCenoura.setVisible(false);
        txtBatata.setVisible(false);
        txtBanana.setVisible(false);
        
        btnAcafrao.setVisible(false);
        btnAlface.setVisible(false);
        btnMelancia.setVisible(false);
        btnCenoura.setVisible(false);
        btnBatata.setVisible(false);
        btnBanana.setVisible(false);
        /***********************************/
        
        
        /*Laticinios*/
        txtPrecoLeite.setVisible(false);
        txtPrecoQueijoMinas.setVisible(false);
        txtPrecoDoceDeLeite.setVisible(false);
        txtPrecoGorgonzola.setVisible(false);
        txtPrecoIorgute.setVisible(false);
        txtPrecoLeiteCondensado.setVisible(false);
        
        txtLeite.setVisible(false);
        txtQueijoMinas.setVisible(false);
        txtDoceDeLeite.setVisible(false);
        txtGorgonzola.setVisible(false);
        txtIorgute.setVisible(false);
        txtLeiteCondensado.setVisible(false);
        
        btnLeite.setVisible(false);
        btnQueijoMinas.setVisible(false);
        btnDoceDeLeite.setVisible(false);
        btnGorgonzola.setVisible(false);
        btnIorgute.setVisible(false);
        btnLeiteCondesado.setVisible(false);
        /***********************************/
        
        
        /*Bebidas*/
        txtPrecoCocaCola.setVisible(false);
        txtPrecoVinho.setVisible(false);
        txtPrecoSprite.setVisible(false);
        txtPrecoJackDaniels.setVisible(false);
        txtPrecoDolly.setVisible(false);
        txtPrecoGalaoDagua.setVisible(false);
        
        txtCocaCola.setVisible(false);
        txtVinho.setVisible(false);
        txtSprite.setVisible(false);
        txtJackDaniels.setVisible(false);
        txtDolly.setVisible(false);
        txtGalaoDagua.setVisible(false);
        
        btnCocaCola.setVisible(false);
        btnVinho.setVisible(false);
        btnSprite.setVisible(false);
        btnJackDaniels.setVisible(false);
        btnDolly.setVisible(false);
        btnGalaoDagua.setVisible(false);
        /***********************************/
        
        
        
        /*Higiene*/
        txtPrecoFioDental.setVisible(false);
        txtPrecoCremeDental.setVisible(false);
        txtPrecoPapelHigienico.setVisible(false);
        txtPrecoEscovaDeDente.setVisible(false);
        txtPrecoAbsorvente.setVisible(false);
        txtPrecoSabonete.setVisible(false);
        
        txtFioDental.setVisible(false);
        txtCremeDental.setVisible(false);
        txtPapelHigienico.setVisible(false);
        txtEscovaDeDente.setVisible(false);
        txtAbsorvente.setVisible(false);
        txtSabonete.setVisible(false);
        
        btnFioDental.setVisible(false);
        btnCremeDental.setVisible(false);
        btnPapelHigienico.setVisible(false);
        btnEscovaDeDente.setVisible(false);
        btnAbsorvente.setVisible(false);
        btnSabonete.setVisible(false);
        /******************************/
        
        
        
        /*Grãos*/
        txtPrecoArroz.setVisible(false);
        txtPrecoFeijao.setVisible(false);
        txtPrecoSoja.setVisible(false);
        txtPrecoMilho.setVisible(false);
        txtPrecoFarinha.setVisible(false);
        txtPrecoAmendoim.setVisible(false);
        
        txtArroz.setVisible(false);
        txtFeijao.setVisible(false);
        txtSoja.setVisible(false);
        txtMilho.setVisible(false);
        txtFarinha.setVisible(false);
        txtAmendoim.setVisible(false);
        
        btnArroz.setVisible(false);
        btnFeijao.setVisible(false);
        btnSoja.setVisible(false);
        btnMilho.setVisible(false);
        btnFarinha.setVisible(false);
        btnAmendoim.setVisible(false);
        /******************************/
        
        
        
        
        
        
        
        
        
        btnVoltar.setVisible(false);
        
        
        
        
        
        
        
    }
    
    private double somatorioCarrinho;

    public double getSomatorioCarrinho() {
        return somatorioCarrinho;
    }

    public void setSomatorioCarrinho(double somatorioCarrinho) {
        this.somatorioCarrinho = somatorioCarrinho;
    }
    




    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLaticinios = new javax.swing.JButton();
        btnCarnes = new javax.swing.JButton();
        btnHortifruti = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        btnHigiene = new javax.swing.JButton();
        btnGraos = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMenu = new javax.swing.JLabel();
        txtCarnes = new javax.swing.JLabel();
        txtHortifruti = new javax.swing.JLabel();
        txtLaticinios = new javax.swing.JLabel();
        txtBebidas = new javax.swing.JLabel();
        txtHigiene = new javax.swing.JLabel();
        txtGraos = new javax.swing.JLabel();
        txtPrecoPicanha = new javax.swing.JLabel();
        btnPicanha = new javax.swing.JButton();
        txtPicanha = new javax.swing.JLabel();
        txtPrecoLinguica = new javax.swing.JLabel();
        btnLinguica = new javax.swing.JButton();
        txtLinguica = new javax.swing.JLabel();
        txtPrecoAlcatra = new javax.swing.JLabel();
        btnAlcatra = new javax.swing.JButton();
        txtAlcatra = new javax.swing.JLabel();
        btnCarneMoida = new javax.swing.JButton();
        txtPrecoCarneMoida = new javax.swing.JLabel();
        txtCarneMoida = new javax.swing.JLabel();
        btnSalsisha = new javax.swing.JButton();
        txtPrecoSalsisha = new javax.swing.JLabel();
        txtSalsisha = new javax.swing.JLabel();
        txtFrago = new javax.swing.JLabel();
        btnFrango = new javax.swing.JButton();
        txtPrecoFrango = new javax.swing.JLabel();
        txtCarrinho = new javax.swing.JLabel();
        txtValorCarrinho = new javax.swing.JLabel();
        txtPrecoAcafrao = new javax.swing.JLabel();
        btnAcafrao = new javax.swing.JButton();
        txtAcafrao = new javax.swing.JLabel();
        txtPrecoAlface = new javax.swing.JLabel();
        btnAlface = new javax.swing.JButton();
        txtAlface = new javax.swing.JLabel();
        txtPrecoMelancia = new javax.swing.JLabel();
        btnMelancia = new javax.swing.JButton();
        txtMelancia = new javax.swing.JLabel();
        btnCenoura = new javax.swing.JButton();
        txtPrecoCenoura = new javax.swing.JLabel();
        txtCenoura = new javax.swing.JLabel();
        btnBatata = new javax.swing.JButton();
        txtPrecoBatata = new javax.swing.JLabel();
        txtBatata = new javax.swing.JLabel();
        btnBanana = new javax.swing.JButton();
        txtPrecoBanana = new javax.swing.JLabel();
        txtBanana = new javax.swing.JLabel();
        txtPrecoLeite = new javax.swing.JLabel();
        btnLeite = new javax.swing.JButton();
        txtLeite = new javax.swing.JLabel();
        txtPrecoQueijoMinas = new javax.swing.JLabel();
        btnQueijoMinas = new javax.swing.JButton();
        txtQueijoMinas = new javax.swing.JLabel();
        txtPrecoDoceDeLeite = new javax.swing.JLabel();
        btnDoceDeLeite = new javax.swing.JButton();
        txtDoceDeLeite = new javax.swing.JLabel();
        txtPrecoGorgonzola = new javax.swing.JLabel();
        btnGorgonzola = new javax.swing.JButton();
        txtGorgonzola = new javax.swing.JLabel();
        txtPrecoIorgute = new javax.swing.JLabel();
        btnLeiteCondesado = new javax.swing.JButton();
        txtPrecoLeiteCondensado = new javax.swing.JLabel();
        txtLeiteCondensado = new javax.swing.JLabel();
        btnIorgute = new javax.swing.JButton();
        txtIorgute = new javax.swing.JLabel();
        txtPrecoCocaCola = new javax.swing.JLabel();
        btnCocaCola = new javax.swing.JButton();
        txtCocaCola = new javax.swing.JLabel();
        txtPrecoVinho = new javax.swing.JLabel();
        btnVinho = new javax.swing.JButton();
        txtVinho = new javax.swing.JLabel();
        txtPrecoSprite = new javax.swing.JLabel();
        btnSprite = new javax.swing.JButton();
        txtSprite = new javax.swing.JLabel();
        txtPrecoJackDaniels = new javax.swing.JLabel();
        txtJackDaniels = new javax.swing.JLabel();
        btnJackDaniels = new javax.swing.JButton();
        txtPrecoDolly = new javax.swing.JLabel();
        btnDolly = new javax.swing.JButton();
        txtDolly = new javax.swing.JLabel();
        txtPrecoGalaoDagua = new javax.swing.JLabel();
        btnGalaoDagua = new javax.swing.JButton();
        txtGalaoDagua = new javax.swing.JLabel();
        txtPrecoFioDental = new javax.swing.JLabel();
        btnFioDental = new javax.swing.JButton();
        txtFioDental = new javax.swing.JLabel();
        txtPrecoCremeDental = new javax.swing.JLabel();
        btnCremeDental = new javax.swing.JButton();
        txtCremeDental = new javax.swing.JLabel();
        txtPrecoPapelHigienico = new javax.swing.JLabel();
        btnPapelHigienico = new javax.swing.JButton();
        txtPapelHigienico = new javax.swing.JLabel();
        btnEscovaDeDente = new javax.swing.JButton();
        txtPrecoEscovaDeDente = new javax.swing.JLabel();
        txtEscovaDeDente = new javax.swing.JLabel();
        txtPrecoAbsorvente = new javax.swing.JLabel();
        btnAbsorvente = new javax.swing.JButton();
        txtAbsorvente = new javax.swing.JLabel();
        txtPrecoSabonete = new javax.swing.JLabel();
        btnSabonete = new javax.swing.JButton();
        txtSabonete = new javax.swing.JLabel();
        txtPrecoArroz = new javax.swing.JLabel();
        btnArroz = new javax.swing.JButton();
        txtArroz = new javax.swing.JLabel();
        txtPrecoFeijao = new javax.swing.JLabel();
        btnFeijao = new javax.swing.JButton();
        txtFeijao = new javax.swing.JLabel();
        txtPrecoSoja = new javax.swing.JLabel();
        btnSoja = new javax.swing.JButton();
        txtSoja = new javax.swing.JLabel();
        txtPrecoMilho = new javax.swing.JLabel();
        btnMilho = new javax.swing.JButton();
        txtMilho = new javax.swing.JLabel();
        txtPrecoFarinha = new javax.swing.JLabel();
        btnFarinha = new javax.swing.JButton();
        txtFarinha = new javax.swing.JLabel();
        txtPrecoAmendoim = new javax.swing.JLabel();
        btnAmendoim = new javax.swing.JButton();
        txtAmendoim = new javax.swing.JLabel();
        btnFinalizarCompra = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do Cliente");
        setMinimumSize(new java.awt.Dimension(1142, 639));
        setResizable(false);
        getContentPane().setLayout(null);

        btnLaticinios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/laticinios.jpg"))); // NOI18N
        btnLaticinios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLaticinios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaticiniosActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaticinios);
        btnLaticinios.setBounds(890, 100, 184, 166);

        btnCarnes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/carnes.jpg"))); // NOI18N
        btnCarnes.setBorder(null);
        btnCarnes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarnes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCarnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarnesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarnes);
        btnCarnes.setBounds(400, 100, 184, 166);

        btnHortifruti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/hortifruti.jpg"))); // NOI18N
        btnHortifruti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHortifruti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHortifrutiActionPerformed(evt);
            }
        });
        getContentPane().add(btnHortifruti);
        btnHortifruti.setBounds(640, 100, 184, 166);

        btnBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/bebidas (1).jpg"))); // NOI18N
        btnBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBebidas);
        btnBebidas.setBounds(410, 360, 184, 166);

        btnHigiene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/higiene.jpg"))); // NOI18N
        btnHigiene.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHigiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHigieneActionPerformed(evt);
            }
        });
        getContentPane().add(btnHigiene);
        btnHigiene.setBounds(650, 360, 184, 166);

        btnGraos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/graos.jpg"))); // NOI18N
        btnGraos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGraos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraosActionPerformed(evt);
            }
        });
        getContentPane().add(btnGraos);
        btnGraos.setBounds(890, 360, 184, 166);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icon-supermercado.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(115, 172, 100, 100);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(90, 550, 150, 37);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("SUPERMERCADO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(71, 290, 202, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("VICWILL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(108, 337, 109, 29);

        txtMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtMenu.setText("MENU");
        getContentPane().add(txtMenu);
        txtMenu.setBounds(128, 125, 73, 29);

        txtCarnes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCarnes.setText("CARNES");
        getContentPane().add(txtCarnes);
        txtCarnes.setBounds(460, 270, 73, 22);

        txtHortifruti.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHortifruti.setText("HORTIFRUTI");
        getContentPane().add(txtHortifruti);
        txtHortifruti.setBounds(690, 270, 117, 22);

        txtLaticinios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLaticinios.setText("LATICÍNIOS");
        getContentPane().add(txtLaticinios);
        txtLaticinios.setBounds(940, 270, 111, 22);

        txtBebidas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBebidas.setText("BEBIDAS");
        getContentPane().add(txtBebidas);
        txtBebidas.setBounds(460, 530, 81, 22);

        txtHigiene.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHigiene.setText("HIGIENE");
        getContentPane().add(txtHigiene);
        txtHigiene.setBounds(700, 530, 81, 22);

        txtGraos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtGraos.setText("GRÃOS");
        getContentPane().add(txtGraos);
        txtGraos.setBounds(960, 530, 63, 22);

        txtPrecoPicanha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoPicanha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoPicanha.setText("R$ 35,00 Kg");
        txtPrecoPicanha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoPicanha);
        txtPrecoPicanha.setBounds(410, 80, 180, 20);

        btnPicanha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/picanha (1).jpg"))); // NOI18N
        btnPicanha.setBorder(null);
        btnPicanha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPicanha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPicanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPicanhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPicanha);
        btnPicanha.setBounds(400, 100, 184, 166);

        txtPicanha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPicanha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPicanha.setText("PICANHA");
        txtPicanha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtPicanha);
        txtPicanha.setBounds(410, 270, 180, 22);

        txtPrecoLinguica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoLinguica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoLinguica.setText("R$ 15,00 Kg");
        txtPrecoLinguica.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoLinguica);
        txtPrecoLinguica.setBounds(650, 80, 180, 20);

        btnLinguica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/linguiça.jpg"))); // NOI18N
        btnLinguica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLinguica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinguicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLinguica);
        btnLinguica.setBounds(650, 100, 184, 166);

        txtLinguica.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLinguica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLinguica.setText("LINGUIÇA");
        txtLinguica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtLinguica);
        txtLinguica.setBounds(640, 270, 190, 22);

        txtPrecoAlcatra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoAlcatra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoAlcatra.setText("R$ 38,00 Kg");
        txtPrecoAlcatra.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoAlcatra);
        txtPrecoAlcatra.setBounds(890, 80, 190, 22);

        btnAlcatra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/alcatra.jpg"))); // NOI18N
        btnAlcatra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlcatra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlcatraActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlcatra);
        btnAlcatra.setBounds(890, 100, 184, 166);

        txtAlcatra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAlcatra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAlcatra.setText("ALCATRA");
        txtAlcatra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtAlcatra);
        txtAlcatra.setBounds(890, 270, 180, 22);

        btnCarneMoida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/carne moida.jpg"))); // NOI18N
        btnCarneMoida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarneMoida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarneMoidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarneMoida);
        btnCarneMoida.setBounds(410, 360, 184, 166);

        txtPrecoCarneMoida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoCarneMoida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoCarneMoida.setText("R$ 20,00 Kg");
        txtPrecoCarneMoida.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoCarneMoida);
        txtPrecoCarneMoida.setBounds(410, 340, 180, 20);

        txtCarneMoida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCarneMoida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCarneMoida.setText("CARNE MOÍDA");
        txtCarneMoida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtCarneMoida);
        txtCarneMoida.setBounds(410, 530, 184, 22);

        btnSalsisha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/salsicha.jpg"))); // NOI18N
        btnSalsisha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalsisha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalsishaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalsisha);
        btnSalsisha.setBounds(660, 360, 184, 166);

        txtPrecoSalsisha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoSalsisha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoSalsisha.setText("R$ 13,00 Kg");
        txtPrecoSalsisha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoSalsisha);
        txtPrecoSalsisha.setBounds(660, 340, 180, 20);

        txtSalsisha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSalsisha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalsisha.setText("SALSISHA");
        txtSalsisha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtSalsisha);
        txtSalsisha.setBounds(660, 530, 180, 22);

        txtFrago.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFrago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFrago.setText("FRANGO");
        txtFrago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtFrago);
        txtFrago.setBounds(910, 530, 170, 22);

        btnFrango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/frango.jpeg"))); // NOI18N
        btnFrango.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFrango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrangoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFrango);
        btnFrango.setBounds(900, 360, 184, 166);

        txtPrecoFrango.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoFrango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoFrango.setText("R$ 18,00 Kg");
        txtPrecoFrango.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoFrango);
        txtPrecoFrango.setBounds(900, 340, 180, 20);

        txtCarrinho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCarrinho.setText("CARRINHO");
        getContentPane().add(txtCarrinho);
        txtCarrinho.setBounds(840, 10, 110, 40);

        txtValorCarrinho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtValorCarrinho.setText("R$0,00");
        getContentPane().add(txtValorCarrinho);
        txtValorCarrinho.setBounds(960, 10, 150, 40);

        txtPrecoAcafrao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoAcafrao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoAcafrao.setText("R$ 100,00 Kg");
        txtPrecoAcafrao.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoAcafrao);
        txtPrecoAcafrao.setBounds(410, 80, 180, 20);

        btnAcafrao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/açafrao.jpg"))); // NOI18N
        btnAcafrao.setBorder(null);
        btnAcafrao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcafrao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcafrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcafraoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcafrao);
        btnAcafrao.setBounds(400, 100, 184, 166);

        txtAcafrao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAcafrao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAcafrao.setText("AÇAFRÃO");
        txtAcafrao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtAcafrao);
        txtAcafrao.setBounds(410, 270, 180, 22);

        txtPrecoAlface.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoAlface.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoAlface.setText("R$ 1,50 Unid ");
        txtPrecoAlface.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoAlface);
        txtPrecoAlface.setBounds(650, 80, 180, 20);

        btnAlface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/alface.jpg"))); // NOI18N
        btnAlface.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlfaceActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlface);
        btnAlface.setBounds(650, 100, 184, 166);

        txtAlface.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAlface.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAlface.setText("ALFACE");
        txtAlface.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtAlface);
        txtAlface.setBounds(640, 270, 190, 22);

        txtPrecoMelancia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoMelancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoMelancia.setText("R$ 15,00 Unid");
        txtPrecoMelancia.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoMelancia);
        txtPrecoMelancia.setBounds(890, 80, 190, 22);

        btnMelancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/melancia.jpg"))); // NOI18N
        btnMelancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMelancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMelanciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMelancia);
        btnMelancia.setBounds(890, 100, 184, 166);

        txtMelancia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMelancia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMelancia.setText("MELÂNCIA");
        txtMelancia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtMelancia);
        txtMelancia.setBounds(890, 270, 180, 22);

        btnCenoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/beneficios-da-cenoura_14186_l.jpg"))); // NOI18N
        btnCenoura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCenoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCenouraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCenoura);
        btnCenoura.setBounds(410, 360, 184, 166);

        txtPrecoCenoura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoCenoura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoCenoura.setText("R$ 6,00 Kg");
        txtPrecoCenoura.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoCenoura);
        txtPrecoCenoura.setBounds(410, 340, 180, 20);

        txtCenoura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCenoura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCenoura.setText("CENOURA");
        txtCenoura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtCenoura);
        txtCenoura.setBounds(410, 530, 184, 22);

        btnBatata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/batata.jpg"))); // NOI18N
        btnBatata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBatata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatataActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatata);
        btnBatata.setBounds(660, 360, 184, 166);

        txtPrecoBatata.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoBatata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoBatata.setText("R$ 9,00 Kg");
        txtPrecoBatata.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoBatata);
        txtPrecoBatata.setBounds(660, 340, 180, 20);

        txtBatata.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBatata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBatata.setText("BATATA");
        txtBatata.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtBatata);
        txtBatata.setBounds(660, 530, 180, 22);

        btnBanana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/banana.jpg"))); // NOI18N
        btnBanana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBanana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBananaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBanana);
        btnBanana.setBounds(900, 360, 184, 166);

        txtPrecoBanana.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoBanana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoBanana.setText("R$ 10,00 Kg");
        txtPrecoBanana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoBanana);
        txtPrecoBanana.setBounds(900, 340, 180, 20);

        txtBanana.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBanana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBanana.setText("BANANA");
        txtBanana.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtBanana);
        txtBanana.setBounds(900, 530, 184, 22);

        txtPrecoLeite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoLeite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoLeite.setText("R$ 2,50 Unid");
        txtPrecoLeite.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoLeite);
        txtPrecoLeite.setBounds(410, 80, 180, 20);

        btnLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/leite.jpg"))); // NOI18N
        btnLeite.setBorder(null);
        btnLeite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeite);
        btnLeite.setBounds(400, 100, 184, 166);

        txtLeite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLeite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLeite.setText("LEITE");
        txtLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtLeite);
        txtLeite.setBounds(410, 270, 180, 22);

        txtPrecoQueijoMinas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoQueijoMinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoQueijoMinas.setText("R$ 15,00 Kg");
        txtPrecoQueijoMinas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoQueijoMinas);
        txtPrecoQueijoMinas.setBounds(650, 80, 180, 20);

        btnQueijoMinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/queijo_minas.png"))); // NOI18N
        btnQueijoMinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQueijoMinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueijoMinasActionPerformed(evt);
            }
        });
        getContentPane().add(btnQueijoMinas);
        btnQueijoMinas.setBounds(650, 100, 184, 166);

        txtQueijoMinas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtQueijoMinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtQueijoMinas.setText("QUEIJO MINAS");
        txtQueijoMinas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtQueijoMinas);
        txtQueijoMinas.setBounds(640, 270, 190, 22);

        txtPrecoDoceDeLeite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoDoceDeLeite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoDoceDeLeite.setText("R$ 3,50 Unid");
        txtPrecoDoceDeLeite.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoDoceDeLeite);
        txtPrecoDoceDeLeite.setBounds(890, 80, 190, 22);

        btnDoceDeLeite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/doce de leite.jpg"))); // NOI18N
        btnDoceDeLeite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoceDeLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoceDeLeiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDoceDeLeite);
        btnDoceDeLeite.setBounds(900, 100, 184, 166);

        txtDoceDeLeite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDoceDeLeite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDoceDeLeite.setText("DOCE DE LEITE");
        txtDoceDeLeite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtDoceDeLeite);
        txtDoceDeLeite.setBounds(890, 270, 180, 22);

        txtPrecoGorgonzola.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoGorgonzola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoGorgonzola.setText("R$ 30,00 Kg");
        txtPrecoGorgonzola.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoGorgonzola);
        txtPrecoGorgonzola.setBounds(410, 340, 180, 20);

        btnGorgonzola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/gorgonzola-600x338.jpg"))); // NOI18N
        btnGorgonzola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGorgonzola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGorgonzolaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGorgonzola);
        btnGorgonzola.setBounds(410, 360, 184, 166);

        txtGorgonzola.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtGorgonzola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGorgonzola.setText("GORGONZOLA");
        txtGorgonzola.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtGorgonzola);
        txtGorgonzola.setBounds(400, 530, 194, 22);

        txtPrecoIorgute.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoIorgute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoIorgute.setText("R$ 4,00 L");
        txtPrecoIorgute.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoIorgute);
        txtPrecoIorgute.setBounds(650, 340, 180, 20);

        btnLeiteCondesado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/leite-condensado.jpg"))); // NOI18N
        btnLeiteCondesado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLeiteCondesado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeiteCondesadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeiteCondesado);
        btnLeiteCondesado.setBounds(890, 360, 184, 166);

        txtPrecoLeiteCondensado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoLeiteCondensado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoLeiteCondensado.setText("R$ 5,00 Unid");
        txtPrecoLeiteCondensado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoLeiteCondensado);
        txtPrecoLeiteCondensado.setBounds(890, 340, 180, 20);

        txtLeiteCondensado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLeiteCondensado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLeiteCondensado.setText("LEITE CONDESADO");
        txtLeiteCondensado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtLeiteCondensado);
        txtLeiteCondensado.setBounds(890, 530, 180, 22);

        btnIorgute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/iorgute.png"))); // NOI18N
        btnIorgute.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIorgute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIorguteActionPerformed(evt);
            }
        });
        getContentPane().add(btnIorgute);
        btnIorgute.setBounds(650, 360, 184, 166);

        txtIorgute.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtIorgute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIorgute.setText("IORGUTE");
        txtIorgute.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtIorgute);
        txtIorgute.setBounds(650, 530, 180, 22);

        txtPrecoCocaCola.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoCocaCola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoCocaCola.setText("R$ 7,00 Unid");
        txtPrecoCocaCola.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoCocaCola);
        txtPrecoCocaCola.setBounds(410, 80, 180, 20);

        btnCocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/coca.jpg"))); // NOI18N
        btnCocaCola.setBorder(null);
        btnCocaCola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCocaCola.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocaColaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCocaCola);
        btnCocaCola.setBounds(400, 100, 184, 166);

        txtCocaCola.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCocaCola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCocaCola.setText("COCA-COLA");
        txtCocaCola.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtCocaCola);
        txtCocaCola.setBounds(410, 270, 180, 22);

        txtPrecoVinho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoVinho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoVinho.setText("R$ 25,00 Unid");
        txtPrecoVinho.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoVinho);
        txtPrecoVinho.setBounds(650, 80, 180, 20);

        btnVinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/vinho.jpg"))); // NOI18N
        btnVinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVinhoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVinho);
        btnVinho.setBounds(650, 100, 184, 166);

        txtVinho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtVinho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVinho.setText("VINHO");
        txtVinho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtVinho);
        txtVinho.setBounds(640, 270, 190, 22);

        txtPrecoSprite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoSprite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoSprite.setText("R$ 5,00 Unid");
        txtPrecoSprite.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoSprite);
        txtPrecoSprite.setBounds(890, 80, 190, 22);

        btnSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/sprite.jpg"))); // NOI18N
        btnSprite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpriteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSprite);
        btnSprite.setBounds(890, 100, 184, 166);

        txtSprite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSprite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSprite.setText("SPRITE");
        txtSprite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtSprite);
        txtSprite.setBounds(890, 270, 180, 22);

        txtPrecoJackDaniels.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoJackDaniels.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoJackDaniels.setText("R$ 160,00 Unid");
        txtPrecoJackDaniels.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoJackDaniels);
        txtPrecoJackDaniels.setBounds(410, 340, 180, 20);

        txtJackDaniels.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtJackDaniels.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtJackDaniels.setText("JACK DANIELS");
        txtJackDaniels.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtJackDaniels);
        txtJackDaniels.setBounds(400, 530, 220, 22);

        btnJackDaniels.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/jack.jpg"))); // NOI18N
        btnJackDaniels.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJackDaniels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJackDanielsActionPerformed(evt);
            }
        });
        getContentPane().add(btnJackDaniels);
        btnJackDaniels.setBounds(410, 360, 184, 166);

        txtPrecoDolly.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoDolly.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoDolly.setText("R$ 4,00");
        txtPrecoDolly.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoDolly);
        txtPrecoDolly.setBounds(660, 340, 180, 20);

        btnDolly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/dolly.jpg"))); // NOI18N
        btnDolly.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDolly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDollyActionPerformed(evt);
            }
        });
        getContentPane().add(btnDolly);
        btnDolly.setBounds(660, 360, 184, 166);

        txtDolly.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDolly.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDolly.setText("GUARANÁ DOLLY");
        txtDolly.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtDolly);
        txtDolly.setBounds(660, 530, 180, 22);

        txtPrecoGalaoDagua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoGalaoDagua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoGalaoDagua.setText("R$ 10,00 Unid");
        txtPrecoGalaoDagua.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoGalaoDagua);
        txtPrecoGalaoDagua.setBounds(900, 340, 180, 20);

        btnGalaoDagua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/galao.jpg"))); // NOI18N
        btnGalaoDagua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGalaoDagua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGalaoDaguaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGalaoDagua);
        btnGalaoDagua.setBounds(900, 360, 184, 166);

        txtGalaoDagua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtGalaoDagua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGalaoDagua.setText("GALÃO D'ÁGUA");
        txtGalaoDagua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtGalaoDagua);
        txtGalaoDagua.setBounds(900, 530, 180, 22);

        txtPrecoFioDental.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoFioDental.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoFioDental.setText("R$ 1,00 Unid");
        txtPrecoFioDental.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoFioDental);
        txtPrecoFioDental.setBounds(410, 80, 180, 20);

        btnFioDental.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/fio_dental.jpg"))); // NOI18N
        btnFioDental.setBorder(null);
        btnFioDental.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFioDental.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFioDental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFioDentalActionPerformed(evt);
            }
        });
        getContentPane().add(btnFioDental);
        btnFioDental.setBounds(400, 100, 184, 166);

        txtFioDental.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFioDental.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFioDental.setText("FIO DENTAL");
        txtFioDental.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtFioDental);
        txtFioDental.setBounds(410, 270, 180, 22);

        txtPrecoCremeDental.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoCremeDental.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoCremeDental.setText("R$ 2,00 Unid");
        txtPrecoCremeDental.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoCremeDental);
        txtPrecoCremeDental.setBounds(650, 80, 180, 20);

        btnCremeDental.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/creme dental.jpg"))); // NOI18N
        btnCremeDental.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCremeDental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCremeDentalActionPerformed(evt);
            }
        });
        getContentPane().add(btnCremeDental);
        btnCremeDental.setBounds(650, 100, 184, 166);

        txtCremeDental.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCremeDental.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCremeDental.setText("CREME DENTAL");
        txtCremeDental.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtCremeDental);
        txtCremeDental.setBounds(640, 270, 190, 22);

        txtPrecoPapelHigienico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoPapelHigienico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoPapelHigienico.setText("R$ 10,50 Pacote");
        txtPrecoPapelHigienico.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoPapelHigienico);
        txtPrecoPapelHigienico.setBounds(890, 80, 190, 22);

        btnPapelHigienico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/papel-higienico-mili-bianco-com-4-rolos-60-metros-cada-e4e.jpg"))); // NOI18N
        btnPapelHigienico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPapelHigienico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelHigienicoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPapelHigienico);
        btnPapelHigienico.setBounds(890, 100, 184, 166);

        txtPapelHigienico.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPapelHigienico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPapelHigienico.setText("PAPEL HIGIÊNICO");
        txtPapelHigienico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtPapelHigienico);
        txtPapelHigienico.setBounds(890, 270, 180, 22);

        btnEscovaDeDente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/escova.jpg"))); // NOI18N
        btnEscovaDeDente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEscovaDeDente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscovaDeDenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEscovaDeDente);
        btnEscovaDeDente.setBounds(410, 360, 184, 166);

        txtPrecoEscovaDeDente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoEscovaDeDente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoEscovaDeDente.setText("R$ 5,00 Unid");
        txtPrecoEscovaDeDente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoEscovaDeDente);
        txtPrecoEscovaDeDente.setBounds(410, 340, 180, 20);

        txtEscovaDeDente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEscovaDeDente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEscovaDeDente.setText("ESCOVA DE DENTE");
        txtEscovaDeDente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtEscovaDeDente);
        txtEscovaDeDente.setBounds(400, 530, 220, 22);

        txtPrecoAbsorvente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoAbsorvente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoAbsorvente.setText("R$ 17,00");
        txtPrecoAbsorvente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoAbsorvente);
        txtPrecoAbsorvente.setBounds(660, 340, 180, 20);

        btnAbsorvente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/absorvente.png"))); // NOI18N
        btnAbsorvente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbsorvente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsorventeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbsorvente);
        btnAbsorvente.setBounds(660, 360, 184, 166);

        txtAbsorvente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAbsorvente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAbsorvente.setText("ABSORVENTE");
        txtAbsorvente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtAbsorvente);
        txtAbsorvente.setBounds(660, 530, 180, 22);

        txtPrecoSabonete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoSabonete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoSabonete.setText("R$ 8,00");
        txtPrecoSabonete.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoSabonete);
        txtPrecoSabonete.setBounds(900, 340, 180, 20);

        btnSabonete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/sabonete.jpg"))); // NOI18N
        btnSabonete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSabonete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaboneteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSabonete);
        btnSabonete.setBounds(900, 360, 184, 166);

        txtSabonete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSabonete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSabonete.setText("SABONETE");
        txtSabonete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtSabonete);
        txtSabonete.setBounds(910, 530, 170, 22);

        txtPrecoArroz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoArroz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoArroz.setText("R$ 15,00 Unid");
        txtPrecoArroz.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoArroz);
        txtPrecoArroz.setBounds(410, 80, 180, 20);

        btnArroz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/arroz.jpg"))); // NOI18N
        btnArroz.setBorder(null);
        btnArroz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArroz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArroz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArrozActionPerformed(evt);
            }
        });
        getContentPane().add(btnArroz);
        btnArroz.setBounds(400, 100, 184, 166);

        txtArroz.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtArroz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtArroz.setText("ARROZ");
        txtArroz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtArroz);
        txtArroz.setBounds(410, 270, 180, 22);

        txtPrecoFeijao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoFeijao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoFeijao.setText("R$ 12,00 Unid");
        txtPrecoFeijao.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoFeijao);
        txtPrecoFeijao.setBounds(650, 80, 180, 20);

        btnFeijao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/feijao.jpg"))); // NOI18N
        btnFeijao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFeijao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeijaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFeijao);
        btnFeijao.setBounds(650, 100, 184, 166);

        txtFeijao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFeijao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFeijao.setText("FEIJÃO");
        txtFeijao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtFeijao);
        txtFeijao.setBounds(640, 270, 190, 22);

        txtPrecoSoja.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoSoja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoSoja.setText("R$ 7,00 Kg");
        txtPrecoSoja.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoSoja);
        txtPrecoSoja.setBounds(890, 80, 190, 22);

        btnSoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/soja.jpg"))); // NOI18N
        btnSoja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSojaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSoja);
        btnSoja.setBounds(890, 100, 184, 166);

        txtSoja.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSoja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSoja.setText("SOJA");
        txtSoja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtSoja);
        txtSoja.setBounds(890, 270, 180, 22);

        txtPrecoMilho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoMilho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoMilho.setText("R$ 10,00 Kg");
        txtPrecoMilho.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoMilho);
        txtPrecoMilho.setBounds(410, 340, 180, 20);

        btnMilho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/milho.jpg"))); // NOI18N
        btnMilho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMilho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMilhoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMilho);
        btnMilho.setBounds(410, 360, 184, 166);

        txtMilho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMilho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMilho.setText("MILHO");
        txtMilho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtMilho);
        txtMilho.setBounds(400, 530, 220, 22);

        txtPrecoFarinha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoFarinha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoFarinha.setText("R$ 5,00 Unid");
        txtPrecoFarinha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoFarinha);
        txtPrecoFarinha.setBounds(660, 340, 180, 20);

        btnFarinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/farinha.jpg"))); // NOI18N
        btnFarinha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFarinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarinhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFarinha);
        btnFarinha.setBounds(660, 360, 184, 166);

        txtFarinha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFarinha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFarinha.setText("FARINHA DE TRIGO");
        txtFarinha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtFarinha);
        txtFarinha.setBounds(660, 530, 180, 22);

        txtPrecoAmendoim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecoAmendoim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrecoAmendoim.setText("R$ 2,50 Unid");
        txtPrecoAmendoim.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtPrecoAmendoim);
        txtPrecoAmendoim.setBounds(900, 340, 180, 20);

        btnAmendoim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/amendoim.jpg"))); // NOI18N
        btnAmendoim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAmendoim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmendoimActionPerformed(evt);
            }
        });
        getContentPane().add(btnAmendoim);
        btnAmendoim.setBounds(900, 360, 184, 166);

        txtAmendoim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAmendoim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAmendoim.setText("AMENDOIM");
        txtAmendoim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtAmendoim);
        txtAmendoim.setBounds(910, 530, 170, 22);

        btnFinalizarCompra.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFinalizarCompra.setText("FINALIZAR COMPRA");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizarCompra);
        btnFinalizarCompra.setBounds(20, 420, 300, 80);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/fundo_azul (1).jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1150, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        /*Carnes*/
        txtPrecoPicanha.setVisible(false);
        txtPrecoLinguica.setVisible(false);
        txtPrecoAlcatra.setVisible(false);
        txtPrecoCarneMoida.setVisible(false);
        txtPrecoSalsisha.setVisible(false);
        txtPrecoFrango.setVisible(false);
        
        txtPicanha.setVisible(false);
        txtLinguica.setVisible(false);
        txtAlcatra.setVisible(false);
        txtCarneMoida.setVisible(false);
        txtSalsisha.setVisible(false);
        txtFrago.setVisible(false);
        
        btnPicanha.setVisible(false);
        btnLinguica.setVisible(false);
        btnAlcatra.setVisible(false);
        btnCarneMoida.setVisible(false);
        btnSalsisha.setVisible(false);
        btnFrango.setVisible(false);
        /******************************/
        
        
        /*Hortifruti*/
        txtPrecoAcafrao.setVisible(false);
        txtPrecoAlface.setVisible(false);
        txtPrecoMelancia.setVisible(false);
        txtPrecoCenoura.setVisible(false);
        txtPrecoBatata.setVisible(false);
        txtPrecoBanana.setVisible(false);
        
        txtAcafrao.setVisible(false);
        txtAlface.setVisible(false);
        txtMelancia.setVisible(false);
        txtCenoura.setVisible(false);
        txtBatata.setVisible(false);
        txtBanana.setVisible(false);
        
        btnAcafrao.setVisible(false);
        btnAlface.setVisible(false);
        btnMelancia.setVisible(false);
        btnCenoura.setVisible(false);
        btnBatata.setVisible(false);
        btnBanana.setVisible(false);
        /****************************/
        
        
        /*Laticinios*/
        txtPrecoLeite.setVisible(false);
        txtPrecoQueijoMinas.setVisible(false);
        txtPrecoDoceDeLeite.setVisible(false);
        txtPrecoGorgonzola.setVisible(false);
        txtPrecoIorgute.setVisible(false);
        txtPrecoLeiteCondensado.setVisible(false);
        
        txtLeite.setVisible(false);
        txtQueijoMinas.setVisible(false);
        txtDoceDeLeite.setVisible(false);
        txtGorgonzola.setVisible(false);
        txtIorgute.setVisible(false);
        txtLeiteCondensado.setVisible(false);
        
        btnLeite.setVisible(false);
        btnQueijoMinas.setVisible(false);
        btnDoceDeLeite.setVisible(false);
        btnGorgonzola.setVisible(false);
        btnIorgute.setVisible(false);
        btnLeiteCondesado.setVisible(false);
        /***********************************/
        
        
        /*Bebidas*/
        txtPrecoCocaCola.setVisible(false);
        txtPrecoVinho.setVisible(false);
        txtPrecoSprite.setVisible(false);
        txtPrecoJackDaniels.setVisible(false);
        txtPrecoDolly.setVisible(false);
        txtPrecoGalaoDagua.setVisible(false);
        
        txtCocaCola.setVisible(false);
        txtVinho.setVisible(false);
        txtSprite.setVisible(false);
        txtJackDaniels.setVisible(false);
        txtDolly.setVisible(false);
        txtGalaoDagua.setVisible(false);
        
        btnCocaCola.setVisible(false);
        btnVinho.setVisible(false);
        btnSprite.setVisible(false);
        btnJackDaniels.setVisible(false);
        btnDolly.setVisible(false);
        btnGalaoDagua.setVisible(false);
        /***********************************/
        
        
        /*Higiene*/
        txtPrecoFioDental.setVisible(false);
        txtPrecoCremeDental.setVisible(false);
        txtPrecoPapelHigienico.setVisible(false);
        txtPrecoEscovaDeDente.setVisible(false);
        txtPrecoAbsorvente.setVisible(false);
        txtPrecoSabonete.setVisible(false);
        
        txtFioDental.setVisible(false);
        txtCremeDental.setVisible(false);
        txtPapelHigienico.setVisible(false);
        txtEscovaDeDente.setVisible(false);
        txtAbsorvente.setVisible(false);
        txtSabonete.setVisible(false);
        
        btnFioDental.setVisible(false);
        btnCremeDental.setVisible(false);
        btnPapelHigienico.setVisible(false);
        btnEscovaDeDente.setVisible(false);
        btnAbsorvente.setVisible(false);
        btnSabonete.setVisible(false);
        /******************************/
        
        
        /*Grãos*/
        txtPrecoArroz.setVisible(false);
        txtPrecoFeijao.setVisible(false);
        txtPrecoSoja.setVisible(false);
        txtPrecoMilho.setVisible(false);
        txtPrecoFarinha.setVisible(false);
        txtPrecoAmendoim.setVisible(false);
        
        txtArroz.setVisible(false);
        txtFeijao.setVisible(false);
        txtSoja.setVisible(false);
        txtMilho.setVisible(false);
        txtFarinha.setVisible(false);
        txtAmendoim.setVisible(false);
        
        btnArroz.setVisible(false);
        btnFeijao.setVisible(false);
        btnSoja.setVisible(false);
        btnMilho.setVisible(false);
        btnFarinha.setVisible(false);
        btnAmendoim.setVisible(false);
        /******************************/
        
        
        
        
        
        btnVoltar.setVisible(false);
        
        
        
        txtCarnes.setVisible(true);
        txtHortifruti.setVisible(true);
        txtLaticinios.setVisible(true);
        txtBebidas.setVisible(true);
        txtHigiene.setVisible(true);
        txtGraos.setVisible(true);
        
        btnCarnes.setVisible(true);
        btnHortifruti.setVisible(true);
        btnLaticinios.setVisible(true);
        btnBebidas.setVisible(true);
        btnHigiene.setVisible(true);
        btnGraos.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
       
        txtPrecoCocaCola.setVisible(true);
        txtPrecoVinho.setVisible(true);
        txtPrecoSprite.setVisible(true);
        txtPrecoJackDaniels.setVisible(true);
        txtPrecoDolly.setVisible(true);
        txtPrecoGalaoDagua.setVisible(true);
        
        txtCocaCola.setVisible(true);
        txtVinho.setVisible(true);
        txtSprite.setVisible(true);
        txtJackDaniels.setVisible(true);
        txtDolly.setVisible(true);
        txtGalaoDagua.setVisible(true);
        
        btnCocaCola.setVisible(true);
        btnVinho.setVisible(true);
        btnSprite.setVisible(true);
        btnJackDaniels.setVisible(true);
        btnDolly.setVisible(true);
        btnGalaoDagua.setVisible(true);
        
        
        
        btnVoltar.setVisible(true);
        
        
        txtCarnes.setVisible(false);
        txtHortifruti.setVisible(false);
        txtLaticinios.setVisible(false);
        txtBebidas.setVisible(false);
        txtHigiene.setVisible(false);
        txtGraos.setVisible(false);
        
        btnCarnes.setVisible(false);
        btnHortifruti.setVisible(false);
        btnLaticinios.setVisible(false);
        btnBebidas.setVisible(false);
        btnHigiene.setVisible(false);
        btnGraos.setVisible(false);
        
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnCarnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarnesActionPerformed
        txtPrecoPicanha.setVisible(true);
        txtPrecoLinguica.setVisible(true);
        txtPrecoAlcatra.setVisible(true);
        txtPrecoCarneMoida.setVisible(true);
        txtPrecoSalsisha.setVisible(true);
        txtPrecoFrango.setVisible(true);
        
        txtPicanha.setVisible(true);
        txtLinguica.setVisible(true);
        txtAlcatra.setVisible(true);
        txtCarneMoida.setVisible(true);
        txtSalsisha.setVisible(true);
        txtFrago.setVisible(true);
        
        btnPicanha.setVisible(true);
        btnLinguica.setVisible(true);
        btnAlcatra.setVisible(true);
        btnCarneMoida.setVisible(true);
        btnSalsisha.setVisible(true);
        btnFrango.setVisible(true);
        
        btnVoltar.setVisible(true);
        
        
        txtCarnes.setVisible(false);
        txtHortifruti.setVisible(false);
        txtLaticinios.setVisible(false);
        txtBebidas.setVisible(false);
        txtHigiene.setVisible(false);
        txtGraos.setVisible(false);
        
        btnCarnes.setVisible(false);
        btnHortifruti.setVisible(false);
        btnLaticinios.setVisible(false);
        btnBebidas.setVisible(false);
        btnHigiene.setVisible(false);
        btnGraos.setVisible(false);
        
        
    }//GEN-LAST:event_btnCarnesActionPerformed

    private void btnHortifrutiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHortifrutiActionPerformed
        txtCarnes.setVisible(false);
        txtHortifruti.setVisible(false);
        txtLaticinios.setVisible(false);
        txtBebidas.setVisible(false);
        txtHigiene.setVisible(false);
        txtGraos.setVisible(false);
        
        btnCarnes.setVisible(false);
        btnHortifruti.setVisible(false);
        btnLaticinios.setVisible(false);
        btnBebidas.setVisible(false);
        btnHigiene.setVisible(false);
        btnGraos.setVisible(false);
        
        
        txtPrecoAcafrao.setVisible(true);
        txtPrecoAlface.setVisible(true);
        txtPrecoMelancia.setVisible(true);
        txtPrecoCenoura.setVisible(true);
        txtPrecoBatata.setVisible(true);
        txtPrecoBanana.setVisible(true);
        
        txtAcafrao.setVisible(true);
        txtAlface.setVisible(true);
        txtMelancia.setVisible(true);
        txtCenoura.setVisible(true);
        txtBatata.setVisible(true);
        txtBanana.setVisible(true);
        
        btnAcafrao.setVisible(true);
        btnAlface.setVisible(true);
        btnMelancia.setVisible(true);
        btnCenoura.setVisible(true);
        btnBatata.setVisible(true);
        btnBanana.setVisible(true);
        
        
        btnVoltar.setVisible(true);
    }//GEN-LAST:event_btnHortifrutiActionPerformed

    private void btnLaticiniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaticiniosActionPerformed
        
        txtPrecoLeite.setVisible(true);
        txtPrecoQueijoMinas.setVisible(true);
        txtPrecoDoceDeLeite.setVisible(true);
        txtPrecoGorgonzola.setVisible(true);
        txtPrecoIorgute.setVisible(true);
        txtPrecoLeiteCondensado.setVisible(true);
        
        txtLeite.setVisible(true);
        txtQueijoMinas.setVisible(true);
        txtDoceDeLeite.setVisible(true);
        txtGorgonzola.setVisible(true);
        txtIorgute.setVisible(true);
        txtLeiteCondensado.setVisible(true);
        
        btnLeite.setVisible(true);
        btnQueijoMinas.setVisible(true);
        btnDoceDeLeite.setVisible(true);
        btnGorgonzola.setVisible(true);
        btnIorgute.setVisible(true);
        btnLeiteCondesado.setVisible(true);
        
        
        
        txtCarnes.setVisible(false);
        txtHortifruti.setVisible(false);
        txtLaticinios.setVisible(false);
        txtBebidas.setVisible(false);
        txtHigiene.setVisible(false);
        txtGraos.setVisible(false);
        
        btnCarnes.setVisible(false);
        btnHortifruti.setVisible(false);
        btnLaticinios.setVisible(false);
        btnBebidas.setVisible(false);
        btnHigiene.setVisible(false);
        btnGraos.setVisible(false);
        
        
        
        
        btnVoltar.setVisible(true);
    }//GEN-LAST:event_btnLaticiniosActionPerformed

    private void btnHigieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHigieneActionPerformed
       
        txtPrecoFioDental.setVisible(true);
        txtPrecoCremeDental.setVisible(true);
        txtPrecoPapelHigienico.setVisible(true);
        txtPrecoEscovaDeDente.setVisible(true);
        txtPrecoAbsorvente.setVisible(true);
        txtPrecoSabonete.setVisible(true);
        
        txtFioDental.setVisible(true);
        txtCremeDental.setVisible(true);
        txtPapelHigienico.setVisible(true);
        txtEscovaDeDente.setVisible(true);
        txtAbsorvente.setVisible(true);
        txtSabonete.setVisible(true);
        
        btnFioDental.setVisible(true);
        btnCremeDental.setVisible(true);
        btnPapelHigienico.setVisible(true);
        btnEscovaDeDente.setVisible(true);
        btnAbsorvente.setVisible(true);
        btnSabonete.setVisible(true);
        
        
        
        txtCarnes.setVisible(false);
        txtHortifruti.setVisible(false);
        txtLaticinios.setVisible(false);
        txtBebidas.setVisible(false);
        txtHigiene.setVisible(false);
        txtGraos.setVisible(false);
        
        btnCarnes.setVisible(false);
        btnHortifruti.setVisible(false);
        btnLaticinios.setVisible(false);
        btnBebidas.setVisible(false);
        btnHigiene.setVisible(false);
        btnGraos.setVisible(false);
        
        
        
        
        btnVoltar.setVisible(true);
        
    }//GEN-LAST:event_btnHigieneActionPerformed

    private void btnGraosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraosActionPerformed
       
        txtPrecoArroz.setVisible(true);
        txtPrecoFeijao.setVisible(true);
        txtPrecoSoja.setVisible(true);
        txtPrecoMilho.setVisible(true);
        txtPrecoFarinha.setVisible(true);
        txtPrecoAmendoim.setVisible(true);
        
        txtArroz.setVisible(true);
        txtFeijao.setVisible(true);
        txtSoja.setVisible(true);
        txtMilho.setVisible(true);
        txtFarinha.setVisible(true);
        txtAmendoim.setVisible(true);
        
        btnArroz.setVisible(true);
        btnFeijao.setVisible(true);
        btnSoja.setVisible(true);
        btnMilho.setVisible(true);
        btnFarinha.setVisible(true);
        btnAmendoim.setVisible(true);
        
        
        
        txtCarnes.setVisible(false);
        txtHortifruti.setVisible(false);
        txtLaticinios.setVisible(false);
        txtBebidas.setVisible(false);
        txtHigiene.setVisible(false);
        txtGraos.setVisible(false);
        
        btnCarnes.setVisible(false);
        btnHortifruti.setVisible(false);
        btnLaticinios.setVisible(false);
        btnBebidas.setVisible(false);
        btnHigiene.setVisible(false);
        btnGraos.setVisible(false);
        
        
        
        
        btnVoltar.setVisible(true);
        
    }//GEN-LAST:event_btnGraosActionPerformed

    private void btnPicanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPicanhaActionPerformed
        //Exemplo de adição de produto no carrinho
        int resposta = JOptionPane.showConfirmDialog(this,
                "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Picanha adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 35;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        } 
    }//GEN-LAST:event_btnPicanhaActionPerformed

    private void btnCarneMoidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarneMoidaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Carne Moída adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 20;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnCarneMoidaActionPerformed

    private void btnLinguicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinguicaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Linguiça adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 15;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnLinguicaActionPerformed

    private void btnAlcatraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlcatraActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Alcatra adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 38;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnAlcatraActionPerformed

    private void btnSalsishaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalsishaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Salsisha adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 13;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnSalsishaActionPerformed

    private void btnFrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrangoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Frango adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 18;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnFrangoActionPerformed

    private void btnAcafraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcafraoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Açafrão adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 100;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnAcafraoActionPerformed

    private void btnCenouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCenouraActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Cenoura adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 6;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnCenouraActionPerformed

    private void btnAlfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlfaceActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Alface adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 1.5;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnAlfaceActionPerformed

    private void btnMelanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMelanciaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Melância  adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 15;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnMelanciaActionPerformed

    private void btnBatataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatataActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Batata adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 9;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnBatataActionPerformed

    private void btnBananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBananaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Banana adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 10;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnBananaActionPerformed

    private void btnLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeiteActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Leite adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 2.5;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnLeiteActionPerformed

    private void btnDoceDeLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoceDeLeiteActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Doce de leite adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 3.5;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnDoceDeLeiteActionPerformed

    private void btnGorgonzolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGorgonzolaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Queijo Gorgonzola adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 30;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnGorgonzolaActionPerformed

    private void btnQueijoMinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueijoMinasActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Queijo Minas adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 15;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnQueijoMinasActionPerformed

    private void btnIorguteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIorguteActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Iorgute adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 4;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnIorguteActionPerformed

    private void btnLeiteCondesadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeiteCondesadoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Leite Condensado adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 5;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
        
    }//GEN-LAST:event_btnLeiteCondesadoActionPerformed

    private void btnCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocaColaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Coca-Cola adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 7;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnCocaColaActionPerformed

    private void btnJackDanielsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJackDanielsActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Jack Daniels adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 160;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnJackDanielsActionPerformed

    private void btnVinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVinhoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Vinho adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 25;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnVinhoActionPerformed

    private void btnSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpriteActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Sprite adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 5;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnSpriteActionPerformed

    private void btnDollyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDollyActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Guaraná Dolly adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 4;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnDollyActionPerformed

    private void btnGalaoDaguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGalaoDaguaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Galão D'água adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 10;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnGalaoDaguaActionPerformed

    private void btnFioDentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFioDentalActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Fio Dental adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 1;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnFioDentalActionPerformed

    private void btnCremeDentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCremeDentalActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Creme Dental adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 2;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnCremeDentalActionPerformed

    private void btnEscovaDeDenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscovaDeDenteActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Escova de dente adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 5;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnEscovaDeDenteActionPerformed

    private void btnPapelHigienicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelHigienicoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Papel Higiênico adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 10.50;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnPapelHigienicoActionPerformed

    private void btnAbsorventeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsorventeActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Absorvente adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 17;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnAbsorventeActionPerformed

    private void btnSaboneteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaboneteActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Sabonete adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 8;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnSaboneteActionPerformed

    private void btnArrozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArrozActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Arroz adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 15;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnArrozActionPerformed

    private void btnFeijaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeijaoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Feijão adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 12;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnFeijaoActionPerformed

    private void btnMilhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMilhoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Milho adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 10;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnMilhoActionPerformed

    private void btnSojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSojaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Soja adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 7;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnSojaActionPerformed

    private void btnFarinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarinhaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Farinha de Trigo adicionada ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 5;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnFarinhaActionPerformed

    private void btnAmendoimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmendoimActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja adicionar o item ao carrinho?", "Cuidado!!!", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Amendoim adicionado ao carrinho", "Atenção", JOptionPane.WARNING_MESSAGE);
            btnFinalizarCompra.setEnabled(true);
            this.somatorioCarrinho = this.somatorioCarrinho + 2.5;
            txtValorCarrinho.setText("R$"+String.valueOf(deci.format(this.somatorioCarrinho)));
        }
    }//GEN-LAST:event_btnAmendoimActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        //Fizalização da compra
        int resposta = JOptionPane.showConfirmDialog(this, 
                "Deseja finalizar sua compra?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Preencha seus dados", "Atenção", JOptionPane.WARNING_MESSAGE);
            JanelaPreencherDados janelaPreencherDados = new JanelaPreencherDados();
            janelaPreencherDados.setVisible(true);
            this.dispose();;
        }
        
        
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbsorvente;
    private javax.swing.JButton btnAcafrao;
    private javax.swing.JButton btnAlcatra;
    private javax.swing.JButton btnAlface;
    private javax.swing.JButton btnAmendoim;
    private javax.swing.JButton btnArroz;
    private javax.swing.JButton btnBanana;
    private javax.swing.JButton btnBatata;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnCarneMoida;
    private javax.swing.JButton btnCarnes;
    private javax.swing.JButton btnCenoura;
    private javax.swing.JButton btnCocaCola;
    private javax.swing.JButton btnCremeDental;
    private javax.swing.JButton btnDoceDeLeite;
    private javax.swing.JButton btnDolly;
    private javax.swing.JButton btnEscovaDeDente;
    private javax.swing.JButton btnFarinha;
    private javax.swing.JButton btnFeijao;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnFioDental;
    private javax.swing.JButton btnFrango;
    private javax.swing.JButton btnGalaoDagua;
    private javax.swing.JButton btnGorgonzola;
    private javax.swing.JButton btnGraos;
    private javax.swing.JButton btnHigiene;
    private javax.swing.JButton btnHortifruti;
    private javax.swing.JButton btnIorgute;
    private javax.swing.JButton btnJackDaniels;
    private javax.swing.JButton btnLaticinios;
    private javax.swing.JButton btnLeite;
    private javax.swing.JButton btnLeiteCondesado;
    private javax.swing.JButton btnLinguica;
    private javax.swing.JButton btnMelancia;
    private javax.swing.JButton btnMilho;
    private javax.swing.JButton btnPapelHigienico;
    private javax.swing.JButton btnPicanha;
    private javax.swing.JButton btnQueijoMinas;
    private javax.swing.JButton btnSabonete;
    private javax.swing.JButton btnSalsisha;
    private javax.swing.JButton btnSoja;
    private javax.swing.JButton btnSprite;
    private javax.swing.JButton btnVinho;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel txtAbsorvente;
    private javax.swing.JLabel txtAcafrao;
    private javax.swing.JLabel txtAlcatra;
    private javax.swing.JLabel txtAlface;
    private javax.swing.JLabel txtAmendoim;
    private javax.swing.JLabel txtArroz;
    private javax.swing.JLabel txtBanana;
    private javax.swing.JLabel txtBatata;
    private javax.swing.JLabel txtBebidas;
    private javax.swing.JLabel txtCarneMoida;
    private javax.swing.JLabel txtCarnes;
    private javax.swing.JLabel txtCarrinho;
    private javax.swing.JLabel txtCenoura;
    private javax.swing.JLabel txtCocaCola;
    private javax.swing.JLabel txtCremeDental;
    private javax.swing.JLabel txtDoceDeLeite;
    private javax.swing.JLabel txtDolly;
    private javax.swing.JLabel txtEscovaDeDente;
    private javax.swing.JLabel txtFarinha;
    private javax.swing.JLabel txtFeijao;
    private javax.swing.JLabel txtFioDental;
    private javax.swing.JLabel txtFrago;
    private javax.swing.JLabel txtGalaoDagua;
    private javax.swing.JLabel txtGorgonzola;
    private javax.swing.JLabel txtGraos;
    private javax.swing.JLabel txtHigiene;
    private javax.swing.JLabel txtHortifruti;
    private javax.swing.JLabel txtIorgute;
    private javax.swing.JLabel txtJackDaniels;
    private javax.swing.JLabel txtLaticinios;
    private javax.swing.JLabel txtLeite;
    private javax.swing.JLabel txtLeiteCondensado;
    private javax.swing.JLabel txtLinguica;
    private javax.swing.JLabel txtMelancia;
    private javax.swing.JLabel txtMenu;
    private javax.swing.JLabel txtMilho;
    private javax.swing.JLabel txtPapelHigienico;
    private javax.swing.JLabel txtPicanha;
    private javax.swing.JLabel txtPrecoAbsorvente;
    private javax.swing.JLabel txtPrecoAcafrao;
    private javax.swing.JLabel txtPrecoAlcatra;
    private javax.swing.JLabel txtPrecoAlface;
    private javax.swing.JLabel txtPrecoAmendoim;
    private javax.swing.JLabel txtPrecoArroz;
    private javax.swing.JLabel txtPrecoBanana;
    private javax.swing.JLabel txtPrecoBatata;
    private javax.swing.JLabel txtPrecoCarneMoida;
    private javax.swing.JLabel txtPrecoCenoura;
    private javax.swing.JLabel txtPrecoCocaCola;
    private javax.swing.JLabel txtPrecoCremeDental;
    private javax.swing.JLabel txtPrecoDoceDeLeite;
    private javax.swing.JLabel txtPrecoDolly;
    private javax.swing.JLabel txtPrecoEscovaDeDente;
    private javax.swing.JLabel txtPrecoFarinha;
    private javax.swing.JLabel txtPrecoFeijao;
    private javax.swing.JLabel txtPrecoFioDental;
    private javax.swing.JLabel txtPrecoFrango;
    private javax.swing.JLabel txtPrecoGalaoDagua;
    private javax.swing.JLabel txtPrecoGorgonzola;
    private javax.swing.JLabel txtPrecoIorgute;
    private javax.swing.JLabel txtPrecoJackDaniels;
    private javax.swing.JLabel txtPrecoLeite;
    private javax.swing.JLabel txtPrecoLeiteCondensado;
    private javax.swing.JLabel txtPrecoLinguica;
    private javax.swing.JLabel txtPrecoMelancia;
    private javax.swing.JLabel txtPrecoMilho;
    private javax.swing.JLabel txtPrecoPapelHigienico;
    private javax.swing.JLabel txtPrecoPicanha;
    private javax.swing.JLabel txtPrecoQueijoMinas;
    private javax.swing.JLabel txtPrecoSabonete;
    private javax.swing.JLabel txtPrecoSalsisha;
    private javax.swing.JLabel txtPrecoSoja;
    private javax.swing.JLabel txtPrecoSprite;
    private javax.swing.JLabel txtPrecoVinho;
    private javax.swing.JLabel txtQueijoMinas;
    private javax.swing.JLabel txtSabonete;
    private javax.swing.JLabel txtSalsisha;
    private javax.swing.JLabel txtSoja;
    private javax.swing.JLabel txtSprite;
    private javax.swing.JLabel txtValorCarrinho;
    private javax.swing.JLabel txtVinho;
    // End of variables declaration//GEN-END:variables
}
