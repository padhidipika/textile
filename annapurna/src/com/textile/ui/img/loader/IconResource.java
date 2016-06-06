/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.textile.ui.img.loader;

import javax.swing.ImageIcon;

/**
 *
 * @author dipika.padhi
 */
public class IconResource {
    
    private final String IMAGE_HOME = "/images/";
    
    private final String EDIT_ICON   = IMAGE_HOME + "edit-icon.png";
    private final String DELETE_ICON = IMAGE_HOME + "delete-icon.png";
    private final String ENABLE_ICON = IMAGE_HOME + "enable-icon.png";
    private final String DISABL_ICON = IMAGE_HOME + "disable-icon.png";
   
    public ImageIcon getEditIcon() {
        java.net.URL imgURL = getClass().getResource(EDIT_ICON);
        if (imgURL != null) {
            return new ImageIcon(imgURL, "edit");
        } else {
            System.err.println("Couldn't find edit icon : " + EDIT_ICON);
            return null;
        }
    }  
    public ImageIcon getDeleteIcon() {
        java.net.URL imgURL = getClass().getResource(DELETE_ICON);
        if (imgURL != null) {
            return new ImageIcon(imgURL, "delete");
        } else {
            System.err.println("Couldn't find delete icon : " + DELETE_ICON);
            return null;
        }
    }  
    
    public ImageIcon getEnableIcon() {
        java.net.URL imgURL = getClass().getResource(ENABLE_ICON);
        if (imgURL != null) {
            return new ImageIcon(imgURL, "enable");
        } else {
            System.err.println("Couldn't find enable icon: " + ENABLE_ICON);
            return null;
        }
    }  
    public ImageIcon getDisableIcon() {
        java.net.URL imgURL = getClass().getResource(DISABL_ICON);
        if (imgURL != null) {
            return new ImageIcon(imgURL, "disable");
        } else {
            System.err.println("Couldn't find disable icon: " + DISABL_ICON);
            return null;
        }
    } 
    
}
