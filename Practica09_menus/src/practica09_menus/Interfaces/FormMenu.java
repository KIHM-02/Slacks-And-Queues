package practica09_menus.Interfaces;

import javax.swing.JOptionPane;
import practica09_menus.Lista;

public class FormMenu extends javax.swing.JFrame 
{
    Lista pila = new Lista();
    Lista cola = new Lista();
    
    public FormMenu() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btnMostrarPila = new javax.swing.JButton();
        btnMostrarCola = new javax.swing.JButton();
        btnMostrarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDatos = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnPush = new javax.swing.JMenuItem();
        btnPop = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        btnImprimirPila = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnEncolar = new javax.swing.JMenuItem();
        btnDesencolar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btnImprimirCola = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnExit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMostrarPila.setText("Mostrar Pila");
        btnMostrarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPilaActionPerformed(evt);
            }
        });

        btnMostrarCola.setText("Mostrar Cola");
        btnMostrarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarColaActionPerformed(evt);
            }
        });

        btnMostrarTodo.setText("Mostrar todo");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        txaDatos.setColumns(20);
        txaDatos.setRows(5);
        jScrollPane1.setViewportView(txaDatos);

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jMenu1.setText("Pilas");

        btnPush.setText("Push");
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        jMenu1.add(btnPush);

        btnPop.setText("Pop");
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        jMenu1.add(btnPop);
        jMenu1.add(jSeparator1);

        btnImprimirPila.setText("Imprimir");
        btnImprimirPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPilaActionPerformed(evt);
            }
        });
        jMenu1.add(btnImprimirPila);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Colas");

        btnEncolar.setText("Encolar");
        btnEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarActionPerformed(evt);
            }
        });
        jMenu2.add(btnEncolar);

        btnDesencolar.setText("Desencolar");
        btnDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarActionPerformed(evt);
            }
        });
        jMenu2.add(btnDesencolar);
        jMenu2.add(jSeparator2);

        btnImprimirCola.setText("Imprimir");
        btnImprimirCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirColaActionPerformed(evt);
            }
        });
        jMenu2.add(btnImprimirCola);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");

        btnExit.setText("Cerrar sistema");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jMenu3.add(btnExit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMostrarPila)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarCola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrarTodo)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarPila)
                    .addComponent(btnMostrarCola)
                    .addComponent(btnMostrarTodo))
                .addGap(8, 8, 8)
                .addComponent(btnClear)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        agregarDato("Pila", pila);
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnImprimirPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPilaActionPerformed
        mostrarDatos("pila", pila);
    }//GEN-LAST:event_btnImprimirPilaActionPerformed

    private void btnMostrarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPilaActionPerformed
        mostrarDatos("pila", pila);
    }//GEN-LAST:event_btnMostrarPilaActionPerformed

    private void btnEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarActionPerformed
        agregarDato("Cola", cola);
    }//GEN-LAST:event_btnEncolarActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        pila.pop();
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnImprimirColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirColaActionPerformed
        mostrarDatos("cola", cola);
    }//GEN-LAST:event_btnImprimirColaActionPerformed

    private void btnMostrarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarColaActionPerformed
        mostrarDatos("cola", cola);
    }//GEN-LAST:event_btnMostrarColaActionPerformed

    private void btnDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarActionPerformed
        cola.desencolar();
    }//GEN-LAST:event_btnDesencolarActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        txaDatos.setText("Datos de Pila: ");
        mostrarDatos("pila", pila);
        
        txaDatos.append("Datos de Cola: ");
        mostrarDatos("cola", cola);
        
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txaDatos.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    public void mostrarDatos(String tipo, Lista lista)
    {
        String datos = "";
        
        datos = lista.displayData();
        
        if(datos.contains("vacia"))
        {
            datos += tipo;
            JOptionPane.showMessageDialog(null, datos, "Lista vacia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(null, datos);
        txaDatos.append(datos+"\n");
    }
    
    public void agregarDato(String tipo, Lista lista)
    {
        int dato;
        
        try 
        {
            dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un elemento a la "+tipo));
            lista.push(dato);
            txaDatos.setText(String.valueOf(dato));
            
        } catch (Exception e) {}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JMenuItem btnDesencolar;
    private javax.swing.JMenuItem btnEncolar;
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenuItem btnImprimirCola;
    private javax.swing.JMenuItem btnImprimirPila;
    private javax.swing.JButton btnMostrarCola;
    private javax.swing.JButton btnMostrarPila;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JMenuItem btnPop;
    private javax.swing.JMenuItem btnPush;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextArea txaDatos;
    // End of variables declaration//GEN-END:variables
}
