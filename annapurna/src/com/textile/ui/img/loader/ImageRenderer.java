/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.ui.img.loader;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author dipika.padhi
 */
public class ImageRenderer extends DefaultTableCellRenderer {
    JLabel lbl = new JLabel();

    IconResource iconResource = new IconResource();

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                  boolean hasFocus, int row, int column) {
        setHorizontalAlignment(SwingConstants.CENTER);
        //lbl.setSize(25, table.getRowHeight());
        if (column == table.getColumnCount() - 1)  {
            lbl.setIcon(iconResource.getEditIcon());
        } else if (column == table.getColumnCount() - 2) { 
            lbl.setIcon(iconResource.getDeleteIcon());
        }
        return lbl;
    }
  
  
  
}
