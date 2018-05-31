/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendemico.UI;

import calendemico.Data.Evento;
import calendemico.LogicBusiness.EventManager;
import com.toedter.calendar.JDayChooser;
import java.awt.Toolkit;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.*;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form diseño11
     */
    EventManager mainclass = new EventManager();
    static ArrayList<Evento> listadeeventos = new ArrayList(){};
    static DefaultTableModel model;
    
    
    
    
    public MainFrame() throws UnsupportedLookAndFeelException {
        setTitle("Calendémico");
        initComponents();
        setIcon();
        setExtendedState(MAXIMIZED_BOTH);
  
        
        
        Object[][] Eventos = mainclass.showEvents();
        DefaultTableModel model2 = new javax.swing.table.DefaultTableModel(Eventos,new String [] {"ID","Nombre", "Tipo de Evento", "Fecha", "Alarma"});
        model = model2;
        jTable2.setModel(model);
        jTable2.getTableHeader().setBackground(new Color(150,150,150));
        jTable2.getTableHeader().setFont(new Font("Dubai",1,14));
        

        
        
        jCalendar1.getDayChooser().setDayBordersVisible(false);
        jCalendar1.getDayChooser().getDayPanel().setBackground(new Color(250,250,250));
        
        jCalendar1.getMonthChooser().setFont(new Font("Dubai",1,14));
        jCalendar1.setBorder(new EmptyBorder(5,5,5,5));
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnHome = new javax.swing.JMenu();
        menuAddEvent = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btnAddEvent = new javax.swing.JMenuItem();
        menuEditEvent = new javax.swing.JMenu();
        btnEditEvent = new javax.swing.JMenuItem();
        menuRemoveEvent = new javax.swing.JMenu();
        btnDelete = new javax.swing.JMenuItem();
        menuArchiveEvent = new javax.swing.JMenu();
        btnArchive = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nombre", "Tipo de Evento", "Fecha", "Alarma"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo de Evento", "Fecha", "Alarma"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        jPanel3.add(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 55, 55));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 370));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 370));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(55, 55, 55));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(55, 55, 55));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(jPanel4, "card2");

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jLabel1.setBackground(new java.awt.Color(55, 55, 55));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calendémico");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(55, 55, 55));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lista de Eventos");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calendario");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 68));

        jSeparator1.setForeground(new java.awt.Color(55, 55, 55));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 11, -1, -1));

        jCalendar1.setBackground(new java.awt.Color(55, 55, 55));
        jCalendar1.setForeground(new java.awt.Color(153, 153, 153));
        jCalendar1.setDecorationBackgroundColor(new java.awt.Color(102, 102, 102));
        jCalendar1.setDoubleBuffered(false);
        jCalendar1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jCalendar1.setSundayForeground(new java.awt.Color(51, 0, 204));
        jCalendar1.setWeekdayForeground(new java.awt.Color(0, 51, 51));
        jPanel3.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 330, 330));

        jTable2.setBackground(new java.awt.Color(152, 150, 155));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Dubai", 1, 12));
        jTable2.setForeground(new java.awt.Color(100, 100, 100));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"EventoName", null, null, null},
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Tipo de Evento", "Fecha", "Alarma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.setRowHeight(90);
        jTable2.setSelectionBackground(new java.awt.Color(200, 205, 205));
        jScrollPane3.setViewportView(jTable2);

        jScrollPane3.createHorizontalScrollBar();
        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 930, 330));
        jPanel3.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, -59, 120, 50));

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(55, 55, 55));
        jMenuBar1.setForeground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/casa.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnHome);

        menuAddEvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/anadir.png"))); // NOI18N
        menuAddEvent.setText("Agregar Evento");
        menuAddEvent.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        menuAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddEventActionPerformed(evt);
            }
        });
        menuAddEvent.add(jSeparator2);

        btnAddEvent.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnAddEvent.setText("Agregar...");
        btnAddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEventActionPerformed(evt);
            }
        });
        menuAddEvent.add(btnAddEvent);

        jMenuBar1.add(menuAddEvent);

        menuEditEvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        menuEditEvent.setText("Editar Evento");
        menuEditEvent.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        btnEditEvent.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnEditEvent.setText("Editar...");
        btnEditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEventActionPerformed(evt);
            }
        });
        menuEditEvent.add(btnEditEvent);

        jMenuBar1.add(menuEditEvent);

        menuRemoveEvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/basura.png"))); // NOI18N
        menuRemoveEvent.setText("Eliminar Evento");
        menuRemoveEvent.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        btnDelete.setText("Eliminar...");
        btnDelete.setFont(new Font("Dubai",1,14));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        menuRemoveEvent.add(btnDelete);

        jMenuBar1.add(menuRemoveEvent);

        menuArchiveEvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/folder.png"))); // NOI18N
        menuArchiveEvent.setText("Archivar Evento");
        menuArchiveEvent.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        btnArchive.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnArchive.setText("Archivar...");
        btnDelete.setFont(new Font("Dubai",1,14));
        btnArchive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchiveActionPerformed(evt);
            }
        });
        menuArchiveEvent.add(btnArchive);

        jMenuBar1.add(menuArchiveEvent);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        EliminarEvento d;
        d = new EliminarEvento(this,true);
        d.setVisible(true);
        d.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                windowIsClosed(e);
            }
        });
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEventActionPerformed
        EditarEvento d;
        d = new EditarEvento(this,true);
        d.setVisible(true);
        d.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                windowIsClosed(e);
            }
        });
    }//GEN-LAST:event_btnEditEventActionPerformed

    private void menuAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddEventActionPerformed

    }//GEN-LAST:event_menuAddEventActionPerformed
    private void windowIsClosed(WindowEvent e){
    Object[][] Eventos = mainclass.showEvents();
    listadeeventos = EventManager.getListadeeventos();
    DefaultTableModel model2 = new javax.swing.table.DefaultTableModel(Eventos,new String [] {"ID","Nombre", "Tipo de Evento", "Fecha", "Alarma"});
    jTable2.setModel(model2);
    if(!listadeeventos.isEmpty()){
        Date d = listadeeventos.get(listadeeventos.size()-1).getEventDate();
        jCalendar1.setDate(d);
        
        }
    repaint();
    
    }
    private void btnAddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEventActionPerformed
        AgregarEvento d;
        try {
            d = new AgregarEvento(this,this.getTitle(),true,this.getGraphicsConfiguration());
            d.setVisible(true);
            d.addWindowListener(new WindowAdapter() {
                     @Override
                     public void windowClosed(WindowEvent e) {
                         windowIsClosed(e);
                    }
                });
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAddEventActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnArchiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchiveActionPerformed
        ArchivarEvento d;
        d = new ArchivarEvento(this,true);
        d.setVisible(true);
        d.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                windowIsClosed(e);
            }
        });
        
    }//GEN-LAST:event_btnArchiveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
        
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                try {
                     LookAndFeel at;
        try {
            at = new SyntheticaAluOxideLookAndFeel();
             UIManager.setLookAndFeel(at);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                    new MainFrame().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAddEvent;
    private javax.swing.JMenuItem btnArchive;
    private javax.swing.JMenuItem btnDelete;
    private javax.swing.JMenuItem btnEditEvent;
    private javax.swing.JMenu btnHome;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    private javax.swing.JMenu menuAddEvent;
    private javax.swing.JMenu menuArchiveEvent;
    private javax.swing.JMenu menuEditEvent;
    private javax.swing.JMenu menuRemoveEvent;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
