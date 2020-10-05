/*
 * Copyright (C) 2020 MyLibreLab
 * Based on MyOpenLab by Carmelo Salafia www.myopenlab.de
 * Copyright (C) 2004  Carmelo Salafia cswi@gmx.de
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package MyGraph;

import java.awt.BorderLayout;

/**
 * @author Carmelo
 */

public class FrameMain extends javax.swing.JFrame {

    public MyGraph graph;
    public Integer austoscaleInterval = Integer.valueOf(600);

    /**
     * Creates new form FrameMain
     */
    public FrameMain() {
        initComponents();

        graph = new MyGraph();

        getContentPane().add(graph, BorderLayout.CENTER);
    }

    public void setAutoScaleInterval(Integer Interval) {
        this.austoscaleInterval = Interval;
        graph.setbufferLen(this.austoscaleInterval);
    }

    public int getAutosCaleInterval() {
        return this.austoscaleInterval;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify
     * this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 395) / 2, (screenSize.height - 333) / 2, 395, 333);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt)// GEN-FIRST:event_formComponentResized
    {// GEN-HEADEREND:event_formComponentResized

    }// GEN-LAST:event_formComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
