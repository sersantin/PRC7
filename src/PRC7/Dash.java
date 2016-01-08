/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// VER JAVA LISTENER

package PRC7;

import Calculos.Calculos;
import PRC7.Componentes.MedidorAF;
import PRC7.Componentes.MedidorLLuvia;
import PRC7.Componentes.MedidorSOL;
import PRC7.Componentes.TermometroMax;
import PRC7.Componentes.TermometroMin;
import PRC7.Observable.GraphicData;
import PRC7.Observable.MonthData;
import PRC7.Observable.PlaceData;
import PRC7.Observable.TypeData;
import PRC7.Observable.YearData;
import PRC7.Observer.MonthDisplay;
import PRC7.Observer.PlaceDisplay;
import PRC7.Observer.TypeDisplay;
import PRC7.Observer.YearDisplay;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author Sergio
 */
public class Dash extends javax.swing.JFrame implements Observer{
    
    Dataset dataset = new Dataset("oxford");

//    Graphics gr;
    
    
//Observable
    PlaceData placedata = new PlaceData();
    YearData yeardata = new YearData();
    MonthData monthdata = new MonthData();
    TypeData typedata = new TypeData();
    GraphicData graphdata = new GraphicData();
    
//Observer
    PlaceDisplay placedisp = new PlaceDisplay();
    YearDisplay yeardisp = new YearDisplay();
    MonthDisplay monthdisp = new MonthDisplay();
    TypeDisplay typedisp = new TypeDisplay();

    
// Componentes

    TermometroMax tmax_g = new TermometroMax(dataset,this);
    TermometroMin tmin_g = new TermometroMin(dataset,this);
    MedidorLLuvia rain_g = new MedidorLLuvia(this);
    MedidorSOL sun_g = new MedidorSOL(this);
    MedidorAF af_g = new MedidorAF(this);


    public PlaceData getPlacedata() {
        return placedata;
    }

    public YearData getYeardata() {
        return yeardata;
    }

    public MonthData getMonthdata() {
        return monthdata;
    }

    public TypeData getTypedata() {
        return typedata;
    }

    public GraphicData getGraphdata() {
        return graphdata;
    }
    
    
    public Dataset getDataset() {
        return dataset;
    }


    public JComboBox getPlace() {
        return Place;
    }

    public JComboBox getYear() {
        return Year;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    
    
    /**
     * Creates new form Dash
     */
    public Dash() {
        initComponents();
       
        //Ocultamos Componentes
        /*jLabel2.setVisible(false);
        jLabel11.setVisible(false);
        jLabel3.setVisible(false);
        jComboBox1.setVisible(false);
        Year.setVisible(false);
        MonthRaise.setVisible(false);
        MonthGrowth.setVisible(false);*/
        
        dataset.crear_dataset(Place.getSelectedItem().toString());
        
//Creamos los Observers
        placedata.addObserver(placedisp);
        yeardata.addObserver(yeardisp);
        monthdata.addObserver(monthdisp);
        typedata.addObserver(typedisp);
        graphdata.addObserver(this);
        
        // Obtengo la resolucion de pantalla
        Dimension res_pantalla = Toolkit.getDefaultToolkit().getScreenSize();
         //Obtengo las dimensiones de la ventana
        Dimension res_ventana = this.getSize();
        
        //Asigno la posicion central de la pantalla a la ventana
        this.setLocation(
            (res_pantalla.width - res_ventana.width) / 2,
            (res_pantalla.height - res_ventana.height) / 2);
        

    }

      public int get_m(int n)
    {
        int retorno = -1;
        for (int i = 0; i < dataset.getYear().size();i++)
        {
            if(n == dataset.getYear().get(i))
            {
                retorno = i;
                break;
            }
        }
        return retorno;
    }
      
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        Place = new javax.swing.JComboBox();
        Year = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tmax_v = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tmin_v = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        af_v = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rain_v = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sun_v = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CrearData1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        MonthRaise = new javax.swing.JButton();
        MonthGrowth = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Place.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aberporth", "armagh", "ballypatrick", "bradford", "braemar", "camborne", "cambridge", "cardiff", "chivenor", "cwmystwyth", "dunstaffnage", "durham", "eastbourne", "eskdalemuir", "heathrow", "hurn", "lerwick", "leuchars", "lowestoft", "manston", "nairn", "newton", "oxford", "paisley", "rossonwye", "ringway", "shawbury", "sheffield", "southampton", "stornoway", "suttonbonington", "tiree", "valley", "waddington", "whitby", "wickairport", "yeovilton" }));
        Place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceActionPerformed(evt);
            }
        });

        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("Lugar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("Año");

        tmax_v.setText("---");

        jLabel5.setText("Temperatura Max:");

        jLabel6.setText("Temperatura Min:");

        tmin_v.setText("---");

        jLabel7.setText("Dias de Heladas:");

        af_v.setText("---");

        jLabel8.setText("Lluvia Recogida:");

        rain_v.setText("---");

        jLabel9.setText("Dias de Sol:");

        sun_v.setText("---");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Media anual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(af_v, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tmin_v, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tmax_v, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(rain_v)
                            .addComponent(sun_v))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tmax_v))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tmin_v))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(af_v))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rain_v))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sun_v))
                .addContainerGap())
        );

        CrearData1.setText("Obtener Estadísticas");
        CrearData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearData1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_umbrella_png494.png"))); // NOI18N
        jLabel10.setText("UK Weather");

        MonthRaise.setText("<--");
        MonthRaise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthRaiseActionPerformed(evt);
            }
        });

        MonthGrowth.setText("-->");
        MonthGrowth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthGrowthActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel11.setText("Mes");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CrearData1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Place, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE)
                                    .addComponent(Year, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MonthRaise)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MonthGrowth))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)))
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MonthRaise)
                                .addComponent(MonthGrowth)))
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CrearData1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceActionPerformed
        // TODO add your handling code here:
        
        placedata.setdata((String)Place.getSelectedItem());
        dataset.crear_dataset(""+placedata.getdata());
        //System.out.println("ANTES DE BORRAR: "+Year.getItemCount());
        //Year.removeAllItems();
        
        /*for (int i = 0; i < Year.getItemCount()-1;i++)
        {
            Year.remove(i);
        }
        System.out.println("DESPUES DE BORRAR: "+Year.getItemCount());*/
        for (int i = 0; i < dataset.year.size();i+=12)
        {
            Year.addItem(dataset.year.get(i));
        }
        //System.out.println("DESPUES DE INSERTAR: "+Year.getItemCount());
        
        /*Year.setVisible(true);
        jLabel2.setVisible(true);*/
        
    }//GEN-LAST:event_PlaceActionPerformed

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    private void CrearData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearData1ActionPerformed
        // TODO add your handling code here:
        Calculos c = new Calculos();
        float f ;
        //tmax_v.setText("----");
        
        f = (float) (Math.floor(c.get_mediaF(dataset.tmax) * 100) / 100);
        tmax_v.setText(""+f);
        f = (float) (Math.floor(c.get_mediaF(dataset.tmin) * 100) / 100);
        tmin_v.setText(""+f);
        f = (float) (Math.floor(c.get_mediaI(dataset.afdays) * 100) / 100);
        af_v.setText(""+f);
        f = (float) (Math.floor(c.get_mediaF(dataset.rain) * 100) / 100);
        rain_v.setText(""+f);
        f = (float) (Math.floor(c.get_mediaF(dataset.sun)/24 * 100) / 100);
        sun_v.setText(""+f);
        //jPanel1.repaint();
        jPanel1.updateUI();
        
        
    }//GEN-LAST:event_CrearData1ActionPerformed

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
        yeardata.setYeardata(Integer.parseInt(Year.getSelectedItem().toString()));
        
        int n;
        int ini;
//        typedata.setdata(jComboBox1.getSelectedIndex());
        //System.out.println("COMBO: "+typedata.getdata());
       
        n = Integer.parseInt(getYear().getSelectedItem().toString());
        ini = this.get_m(n);
        tmax_g.pintar(jPanel2,ini);
        tmin_g.pintar(jPanel3,ini);
        rain_g.pintar(jPanel4,ini);
        sun_g.pintar(jPanel5, ini);
        af_g.pintar(jPanel6,ini);
        
        /*jComboBox1.setVisible(true);
        jLabel3.setVisible(true);*/
        
       
    }//GEN-LAST:event_YearActionPerformed

    private void MonthRaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthRaiseActionPerformed
        // TODO add your handling code here:
        if(monthdata.getdata() > 1)
        {
            int tmp = monthdata.getdata()-1;
            monthdata.setdata(tmp);
                        
            int n = Integer.parseInt(getYear().getSelectedItem().toString());
            int ini = this.get_m(n);
            
            graphdata.setTmax(dataset.getTmax().get(ini+monthdata.getdata()));
            graphdata.setTmin(dataset.getTmin().get(ini+monthdata.getdata()));
            graphdata.setLluvia(dataset.getRain().get(ini+monthdata.getdata()));
            graphdata.setHSoleadas(dataset.getRain().get(ini+monthdata.getdata()));
            graphdata.setDiasHeladas(dataset.getAfdays().get(ini+monthdata.getdata()));
            
            /*if(typedata.getdata() == 0){
                graphdata.setTmax(dataset.getTmax().get(ini+monthdata.getdata()));
              //System.out.println("COMBO: "+typedata.getdata());
            }else if(typedata.getdata() == 1){
                    graphdata.setTmin(dataset.getTmin().get(ini+monthdata.getdata()));
                } else if(typedata.getdata() == 3){
                        graphdata.setLluvia(dataset.getRain().get(ini+monthdata.getdata()));
                    }*/
                
                    
            }
            
    }//GEN-LAST:event_MonthRaiseActionPerformed

    private void MonthGrowthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthGrowthActionPerformed
        // TODO add your handling code here:
        if(monthdata.getdata() < 12)
        {
            int tmp = monthdata.getdata()+1;
            monthdata.setdata(tmp);
                        
            int n = Integer.parseInt(getYear().getSelectedItem().toString());
            int ini = this.get_m(n);
            graphdata.setTmax(dataset.getTmax().get(ini+monthdata.getdata()));
            graphdata.setTmin(dataset.getTmin().get(ini+monthdata.getdata()));
            graphdata.setLluvia(dataset.getRain().get(ini+monthdata.getdata()));
            graphdata.setHSoleadas(dataset.getRain().get(ini+monthdata.getdata()));
            
            /*if(typedata.getdata() == 0){
                graphdata.setTmax(dataset.getTmax().get(ini+monthdata.getdata()));
              //System.out.println("COMBO: "+typedata.getdata());
            }else if(typedata.getdata() == 1){
                    graphdata.setTmin(dataset.getTmin().get(ini+monthdata.getdata()));
                } else if(typedata.getdata() == 3){
                        graphdata.setLluvia(dataset.getRain().get(ini+monthdata.getdata()));
                    }
            */
        }
    }//GEN-LAST:event_MonthGrowthActionPerformed

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
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearData1;
    private javax.swing.JButton MonthGrowth;
    private javax.swing.JButton MonthRaise;
    private javax.swing.JComboBox Place;
    private javax.swing.JComboBox Year;
    private javax.swing.JLabel af_v;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel rain_v;
    private javax.swing.JLabel sun_v;
    private javax.swing.JLabel tmax_v;
    private javax.swing.JLabel tmin_v;
    // End of variables declaration//GEN-END:variables

    
     
    @Override
    public void update(Observable o, Object arg) {
        //System.out.println("hemos cabiado el año");
        //LLAMAMOS A PINTAR
        graphdata = (GraphicData)o;
        int n = Integer.parseInt(getYear().getSelectedItem().toString());
        int ini = this.get_m(n);
        
        tmax_g.pintar(jPanel2,ini+monthdata.getdata());
        tmin_g.pintar(jPanel3,ini+monthdata.getdata());
        rain_g.pintar(jPanel4,ini+monthdata.getdata());
        sun_g.pintar(jPanel5, ini+monthdata.getdata());
        af_g.pintar(jPanel6,ini+monthdata.getdata());
        
        /*if(typedata.getdata() == 0){
            tmax_g.pintar(jPanel2,ini+monthdata.getdata());
          //System.out.println("COMBO: "+typedata.getdata())
        }else if(typedata.getdata() == 1){
            tmin_g.pintar(jPanel2,ini+monthdata.getdata());
            //System.out.println("COMBO: "+typedata.getdata());
        }*/
    }
}
