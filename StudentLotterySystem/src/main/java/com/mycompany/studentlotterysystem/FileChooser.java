/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentlotterysystem;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author samkb
 */
public class FileChooser {
    
    public static File showFileChooser() {
        
        JFrame frame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);
        
        if (result == JFileChooser.APPROVE_OPTION) {
          return fileChooser.getSelectedFile();
        } 
        else {
          return null;
        }
        
    }
}
    
