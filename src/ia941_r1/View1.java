/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia941_r1;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import ws3dproxy.CommandExecException;
import ws3dproxy.WS3DProxy;
import ws3dproxy.model.Creature;
import ws3dproxy.model.World;
import ws3dproxy.model.WorldPoint;
import java.util.concurrent.ThreadLocalRandom;
import ws3dproxy.model.Bag;
import ws3dproxy.model.Thing;

/**
 *
 * @author miguel.marques
 */
public class View1 extends javax.swing.JFrame {

    /**
     * Creates new form View1
     */
    public View1() {
        
        initComponents();
        timerStatus.scheduleAtFixedRate(task, 1000, 1000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbDificuldade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txRobo = new javax.swing.JTextArea();
        bSair = new javax.swing.JButton();
        bHorario = new javax.swing.JButton();
        bAntihorario = new javax.swing.JButton();
        bFrente = new javax.swing.JButton();
        bRe = new javax.swing.JButton();
        bParar = new javax.swing.JButton();
        bCaptura = new javax.swing.JButton();
        cbObjetos = new javax.swing.JComboBox<>();
        bEsconde = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txBolsa = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txStatus = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lBolsa = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IA941_R1");

        cbDificuldade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fácil", "Médio", "Difícil" }));

        jLabel1.setText("Dificuldade do mundo:");

        jButton1.setText("Gerar mundo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txRobo.setEditable(false);
        txRobo.setColumns(20);
        txRobo.setLineWrap(true);
        txRobo.setRows(5);
        jScrollPane1.setViewportView(txRobo);

        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        bHorario.setText("Sentido Horário");
        bHorario.setEnabled(false);
        bHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHorarioActionPerformed(evt);
            }
        });

        bAntihorario.setText("Sentido Anti-horário");
        bAntihorario.setEnabled(false);
        bAntihorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAntihorarioActionPerformed(evt);
            }
        });

        bFrente.setText("Para Frente");
        bFrente.setEnabled(false);
        bFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFrenteActionPerformed(evt);
            }
        });

        bRe.setText("Marcha Ré");
        bRe.setEnabled(false);
        bRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReActionPerformed(evt);
            }
        });

        bParar.setText("Parar");
        bParar.setEnabled(false);
        bParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPararActionPerformed(evt);
            }
        });

        bCaptura.setText("Capturar objeto");
        bCaptura.setEnabled(false);
        bCaptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCapturaActionPerformed(evt);
            }
        });

        cbObjetos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Objetos a vista" }));
        cbObjetos.setEnabled(false);
        cbObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbObjetosActionPerformed(evt);
            }
        });

        bEsconde.setText("Esconder objeto");
        bEsconde.setEnabled(false);
        bEsconde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEscondeActionPerformed(evt);
            }
        });

        txBolsa.setEditable(false);
        txBolsa.setColumns(20);
        txBolsa.setRows(5);
        txBolsa.setText("<Bolsa vazia!>");
        jScrollPane2.setViewportView(txBolsa);

        jLabel2.setText("Mensagens:");

        jLabel3.setText("Conteúdo da bolsa:");

        jLabel4.setText("Status do robô:");

        jLabel5.setText("Movimentação do robô:");

        txStatus.setEditable(false);
        txStatus.setColumns(20);
        txStatus.setRows(5);
        txStatus.setText("<Robô inexistente>");
        jScrollPane4.setViewportView(txStatus);

        jLabel6.setText("Objetos visíveis:");

        jButton2.setText("Comer");

        lBolsa.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<Bolsa vazia!>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lBolsa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lBolsa);

        jButton3.setText("Trocar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(112, 112, 112)
                                    .addComponent(bFrente))
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bHorario)
                                            .addGap(18, 18, 18)
                                            .addComponent(bParar)
                                            .addGap(18, 18, 18)
                                            .addComponent(bAntihorario))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(110, 110, 110)
                                            .addComponent(bRe, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bSair))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bCaptura)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bEsconde)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbObjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bCaptura)
                            .addComponent(bEsconde)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bFrente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAntihorario)
                            .addComponent(bHorario)
                            .addComponent(bParar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRe))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(bSair)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //classes
//<editor-fold defaultstate="collapsed" desc="exemplo struct">
    /* class Employee {
       private String name;
       private int code;

   // constructor
   public Employee(String name, int code) {
      this.name = name;
      this.code = code;
   }

       // getter
       public String getName() { return name; }
       public int getCode() { return code; }
       // setter

       public void setName(String name) { this.name = name; }
       public void setCode(int code) { this.code = code; }
    }
    
    Employee[] arr = new Employee[100];  // new stands for create an array object
    arr[0] = new Employee("Peter", 100); // new stands for create an employee object
    arr[1] = new Employee("Mary", 90);
    */
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="exemplo timer">
    /*
    Timer t = new Timer();
    t.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("Hi!");

            }
        }, 400);
    */
    //</editor-fold>
    
    Timer timerStatus = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run()
        {
            AtualizaStatus();
            if(ExisteRobo && PrecisaAtualizarVisao) 
            {
                AtualizaVisao();
                PrecisaAtualizarVisao = false;
            }
        }
    };
    class Obstaculo
    {
        private int Cor;
        private int X1;
        private int Y1;
        private int X2;
        private int Y2;
        
        //construtor
        public Obstaculo(int Cor, int X1, int Y1, int X2, int Y2)
        {
            this.Cor = Cor;
            this.X1 = X1;
            this.Y1 = Y1;
            this.X2 = X2;
            this.Y2 = Y2;
        }
        
        //getter
        public int getCor() { return Cor; }
        public int getX1() { return X1; }
        public int getY1() { return Y1; }
        public int getX2() { return X2; }
        public int getY2() { return Y2; }
        
        //setter
        public void setCor( int Cor) { this.Cor = Cor; }
        public void setX1(int X1) { this.X1 = X1; }
        public void setY1(int Y1) { this.Y1 = Y1;}
        public void setX2(int X2) { this.X2 = X2;}
        public void setY2(int Y2) { this.Y2 = Y2;}
                
    }
    
    class ItemBolsa
    {
        private String Nome;
        private String Descricao;
        
        //construtor
        public ItemBolsa(String nome, String descricao)
        {
            this.Nome = nome;
            this.Descricao = descricao;
            
        }
        //getter
        public String getNome() {return Nome;}
        public String getDescricao() {return Descricao;}
        //setter
        public void setNome(String Nome) {this.Nome = Nome;}
        public void setDescricao(String Descricao) {this.Descricao = Descricao;}
    }
    //constantes
    int tamanhoBrick = 100;
    int Xmax = 800;
    int Ymax = 600;
    String[] TipoComida = {"perecível", "não perecível"};
    String[] CorObstaculo = {"vermelho", "verde", "azul", "amarelo", "magenta", "branco"};
    String[] CorJoia = {"vermelha", "verde", "azul", "amarela", "magenta", "branca"};
    String[] TipoObjeto = {" ", "obstáculo", "comida", "jóia", "ponto de troca", "gaiola"};
    DecimalFormat formatoNumero = new DecimalFormat("#.00");
    
    //Variaveis globais
    WS3DProxy proxy = new WS3DProxy();
    World mundo = World.getInstance();
    Obstaculo[] Obstaculos = new Obstaculo[3];
    Creature criatura;
    boolean ExisteRobo = false;
    boolean PrecisaAtualizarVisao = false;
    List<Thing> CoisasVisiveis;
    List<String> Bolsa = new ArrayList<String>();
    //funcoes auxiliares
    private void AtualizaStatus()
    {
        if(ExisteRobo)
        {
            criatura.updateState();
            txStatus.setText("Posicao: " + formatoNumero.format(criatura.getPosition().getX()) + ", " + formatoNumero.format(criatura.getPosition().getY()) + "\n");
            txStatus.append("Pitch: " + formatoNumero.format(criatura.getAttributes().getPitch())+ "\n");
            txStatus.append("Velocidade: " + criatura.getSpeed()+ "\n");
            txStatus.append("Combustível: " + criatura.getAttributes().getFuel() + "\n");
            txStatus.append("Endorfina: " + formatoNumero.format(criatura.getAttributes().getEndorphine())+ "\n");
            txStatus.append("Score: " + criatura.getAttributes().getScore()+ "\n");
            txStatus.append("Serotonina: " + criatura.getAttributes().getSerotonin()+ "\n");
        }
    }
    
    private void AtualizaVisao()
    {
        criatura.updateState();
        cbObjetos.setEnabled(true);
        cbObjetos.removeAllItems();
        CoisasVisiveis = criatura.getThingsInVision();
        if(CoisasVisiveis.isEmpty())
        {
            //txRobo.append("Nenhum objeto à vista! Será que eu fiquei cego???\n");
            cbObjetos.addItem("Nada à vista!");
            bCaptura.setEnabled(false);
            bEsconde.setEnabled(false);
        }
        else
        {
            //txRobo.append("Coisas à vista:\n");
            
            CoisasVisiveis.forEach((coisa) -> {
                String nome = retornaObjeto(coisa.getCategory());
                String descricao = nome + " "+coisa.getAttributes().getColor() +" em " + coisa.getX1() + ", "+ coisa.getX2();
                cbObjetos.addItem(descricao);
                //txRobo.append( descricao +"\n");
            });
            
            bCaptura.setEnabled(true);
            bEsconde.setEnabled(true);
        }
    }
    
    private void AtualizaBolsa()
    {
        criatura.updateBag();
        
        lBolsa.removeAll();
        for(String item : Bolsa)
        {
            lBolsa.
        }
        
        if(criatura.getBag().getTotalNumberCrystals()>0 || criatura.getBag().getTotalNumberFood() > 0){ txBolsa.setText(""); }
        
        if(criatura.getBag().getTotalNumberFood()> 0) //tem comida na bolsa
        {
            if(criatura.getBag().getNumberNPFood() > 0) { txBolsa.append(criatura.getBag().getNumberNPFood() + "x comida não-perecível\n"); }
            if(criatura.getBag().getNumberPFood() > 0) { txBolsa.append(criatura.getBag().getNumberPFood() + "x comida perecível\n"); }
        }
        if(criatura.getBag().getTotalNumberCrystals() >0) //tem joia na bolsa
        {
            if(criatura.getBag().getNumberCrystalPerType("Red") > 0) {txBolsa.append(criatura.getBag().getNumberCrystalPerType("Red") + "x jóias vermelhas\n");}
            if(criatura.getBag().getNumberCrystalPerType("Green") > 0) {txBolsa.append(criatura.getBag().getNumberCrystalPerType("Green") + "x jóias verdes\n");}
            if(criatura.getBag().getNumberCrystalPerType("Blue") > 0) {txBolsa.append(criatura.getBag().getNumberCrystalPerType("Blue") + "x jóias azuis\n");}
            if(criatura.getBag().getNumberCrystalPerType("Yellow") > 0) {txBolsa.append(criatura.getBag().getNumberCrystalPerType("Yellow") + "x jóias amarelas\n");}
            if(criatura.getBag().getNumberCrystalPerType("Magenta") > 0) {txBolsa.append(criatura.getBag().getNumberCrystalPerType("Magenta") + "x jóias magenta\n");}
            if(criatura.getBag().getNumberCrystalPerType("White") > 0) {txBolsa.append(criatura.getBag().getNumberCrystalPerType("White") + "x jóias brancas\n");}
        }
    }
    
    private String retornaObjeto(int classe)
    {
        if(classe<6) //brick, joia, delivery spot, gaiola
        {
            return(TipoObjeto[classe]);
        }
        if(classe==21)
        {
            return("comida perecível");
        }
        if(classe==22)
        {
            return("comda não perecível");
        }
         
        return("invalido");
    }
    
    //private String retornaDescricao()
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
try {   
     mundo.reset();
     int dificuldade = cbDificuldade.getSelectedIndex();
     int randomX;
     int randomY;
     
     //criacao do mundo a partir do indice da dificuldade do combobox
     //criacao dos obstaculos
     for(int i =0; i<= dificuldade; i++)
     {
         randomX = ThreadLocalRandom.current().nextInt(0, Xmax);
         randomY = ThreadLocalRandom.current().nextInt(0, Ymax);
         int randomColor = ThreadLocalRandom.current().nextInt(0, CorObstaculo.length);
         World.createBrick(randomColor, randomX, randomY, randomX+tamanhoBrick, randomY+tamanhoBrick);
         Obstaculos[i] = new Obstaculo(randomColor, randomX, randomY, randomX+tamanhoBrick, randomY+tamanhoBrick);
         txRobo.append("Obstáculo " + CorObstaculo[randomColor] + " criado em: " + randomX + ", " + randomY+ "\n");
     }
     
     //ciacao das comidas
     for(int i=0;i<5-dificuldade;i++)
     {
         randomX = ThreadLocalRandom.current().nextInt(0, Xmax);
         randomY = ThreadLocalRandom.current().nextInt(0, Ymax);
         int randomTipo = ThreadLocalRandom.current().nextInt(0, TipoComida.length);
         World.createFood(randomTipo, randomX, randomY);
         txRobo.append("Comida " + TipoComida[randomTipo] + " criado em: " + randomX + ", " + randomY+ "\n");
         
     }
     
    //ciacao das joias
     for(int i=0;i<5-dificuldade;i++)
     {
         randomX = ThreadLocalRandom.current().nextInt(0, Xmax);
         randomY = ThreadLocalRandom.current().nextInt(0, Ymax);
         int randomTipo = ThreadLocalRandom.current().nextInt(0, CorJoia.length);
         World.createJewel(randomTipo, randomX, randomY);
         txRobo.append("Jóia " + CorJoia[randomTipo] + " criado em: " + randomX + ", " + randomY+ "\n");
     }
     
     //criacao de gaiola
     randomX = ThreadLocalRandom.current().nextInt(0, Xmax);
     randomY = ThreadLocalRandom.current().nextInt(0, Ymax);
     World.createCage(randomX, randomY);
     txRobo.append("Gaiola criada em: " + randomX + ", " + randomY+"\n");
     
     //criacao do delivery spot
     randomX = ThreadLocalRandom.current().nextInt(0, Xmax);
     randomY = ThreadLocalRandom.current().nextInt(0, Ymax);
     World.createDeliverySpot(randomX, randomY);
     txRobo.append("Ponto de troca criado em: " + randomX + ", " + randomY+"\n");
     
     //criacao do robo
     randomX = ThreadLocalRandom.current().nextInt(0, Xmax);
     randomY = ThreadLocalRandom.current().nextInt(0, Ymax);
     criatura = proxy.createCreature(randomX, randomY, 0);
     txRobo.append("Robo criado em: " + randomX + ", " + randomY + "\n");
     criatura.start();
     ExisteRobo = true;
     
     //atualizacao dos status
     txBolsa.setEnabled(true);
     txStatus.setEnabled(true);
     
     //AtualizaStatus();
     
     bFrente.setEnabled(true);
     bRe.setEnabled(true);
     bHorario.setEnabled(true);
     bAntihorario.setEnabled(true);
     bParar.setEnabled(true);
     //bVisao.setEnabled(true);
     AtualizaVisao();
     //WorldPoint position = c.getPosition();
     //double pitch = c.getPitch();
     //double fuel = c.getFuel();
     //c.moveto(1, 250, 210);
    } catch (CommandExecException e) {
     System.out.println("Erro capturado");
    }
    }//GEN-LAST:event_jButton1ActionPerformed
    
            
    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSairActionPerformed

    private void bFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFrenteActionPerformed
        try
        {
            criatura.start();
            criatura.move(1, 1, 0);
        }
        catch (CommandExecException e ){ txRobo.append("Erro ao tentar movimentar robo\n"); }
                
    }//GEN-LAST:event_bFrenteActionPerformed

    private void bReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReActionPerformed
        try
        {
            criatura.start();
            criatura.move(-1, -1, 0);
        }
        catch (CommandExecException e ){ txRobo.append("Erro ao tentar movimentar robo\n"); }
    }//GEN-LAST:event_bReActionPerformed

    private void bHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHorarioActionPerformed
        try
        {
            criatura.start();
            criatura.rotate(1);
        }
        catch (CommandExecException e ){ txRobo.append("Erro ao tentar movimentar robo\n"); }
    }//GEN-LAST:event_bHorarioActionPerformed

    private void bAntihorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAntihorarioActionPerformed
        try
        {
            criatura.start();
            criatura.rotate(-1);
        }
        catch (CommandExecException e ){ txRobo.append("Erro ao tentar movimentar robo\n"); }
    }//GEN-LAST:event_bAntihorarioActionPerformed

    private void bPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPararActionPerformed
       try
        {
            criatura.stop();
            PrecisaAtualizarVisao = true;
        }
        catch (CommandExecException e ){ txRobo.append("Erro ao tentar movimentar robo\n"); }
    }//GEN-LAST:event_bPararActionPerformed

    private void bEscondeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEscondeActionPerformed
        if(!CoisasVisiveis.isEmpty())
        {
            Thing coisa = CoisasVisiveis.get(cbObjetos.getSelectedIndex());
            int categoria = coisa.getAttributes().getCategory();
            if(categoria != 1 && categoria != 4 && categoria != 5)
            {
                try{ 
                    criatura.hideIt(coisa.getName());
                    //AtualizaVisao();
                    //AtualizaBolsa();
                    PrecisaAtualizarVisao = true;
                }
                catch (CommandExecException e) { txRobo.append("Erro ao tentar esconder objeto!\n"); }
            }
            else {txRobo.append("Não é possível esconder esse tipo de objeto!\n");}
        }
        else
        {
            txRobo.append("Não há o que esconder!\n");
        }
    }//GEN-LAST:event_bEscondeActionPerformed

    private void cbObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbObjetosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbObjetosActionPerformed

    private void bCapturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCapturaActionPerformed
        if(!CoisasVisiveis.isEmpty())
        {
            Thing coisa = CoisasVisiveis.get(cbObjetos.getSelectedIndex());
            int categoria = coisa.getAttributes().getCategory();
            if(categoria != 1 && categoria != 4 && categoria != 5)
            {
                try{ 
                    //boolean add = Bolsa.add(coisa);
                    criatura.putInSack(coisa.getName());
                    ItemBolsa coisaNaBolsa = new ItemBolsa(coisa.getName(), coisa.getName());
                    Bolsa.add(coisa.getName());
                    for(int i=0; i<1000;i++) {}
                    AtualizaBolsa();
                    //AtualizaVisao();
                    PrecisaAtualizarVisao = true;
                }
                catch (CommandExecException e) { txRobo.append("Erro ao tentar capturar objeto!\n"); }
            }
            else {txRobo.append("Não é possível capturar esse tipo de objeto!\n");}
        }
        else
        {
            txRobo.append("Não há o que capturar!\n");
            
        }
        //AtualizaVisao();
    }//GEN-LAST:event_bCapturaActionPerformed

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
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAntihorario;
    private javax.swing.JButton bCaptura;
    private javax.swing.JButton bEsconde;
    private javax.swing.JButton bFrente;
    private javax.swing.JButton bHorario;
    private javax.swing.JButton bParar;
    private javax.swing.JButton bRe;
    private javax.swing.JButton bSair;
    private javax.swing.JComboBox<String> cbDificuldade;
    private javax.swing.JComboBox<String> cbObjetos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lBolsa;
    private javax.swing.JTextArea txBolsa;
    private javax.swing.JTextArea txRobo;
    private javax.swing.JTextArea txStatus;
    // End of variables declaration//GEN-END:variables
}
