/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaoDien;

import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author AD
 */
public class XuLyHinhAnh {

    /**
     * @param args the command line arguments
     */
    public  Image resize(Image originalImage, int targetWidth, int targetHeight){
            Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
            return resultingImage;

    }
    public  byte[]toByteImage(Image img, String type) throws IOException{
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bimage.createGraphics();
        g.drawImage(img, 0, 0, null);
        g.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bimage, type, baos);
        byte[] imageInByte = baos.toByteArray();

        return imageInByte;
    }
    public  Image createImageFromByteArray(byte[] data, String type) throws IOException{
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        BufferedImage bimage2 = ImageIO.read(bis);

        Image img = bimage2.getScaledInstance(bimage2.getWidth(), bimage2.getHeight(), Image.SCALE_SMOOTH);
        return  img;
    }
public  Image iconToImage(Icon icon) {
   if (icon instanceof ImageIcon) {
      return ((ImageIcon)icon).getImage();
   } 
   else {
      int w = icon.getIconWidth();
      int h = icon.getIconHeight();
      GraphicsEnvironment ge = 
        GraphicsEnvironment.getLocalGraphicsEnvironment();
      GraphicsDevice gd = ge.getDefaultScreenDevice();
      GraphicsConfiguration gc = gd.getDefaultConfiguration();
      BufferedImage image = gc.createCompatibleImage(w, h);
      Graphics2D g = image.createGraphics();
      icon.paintIcon(null, g, 0, 0);
      g.dispose();
      return image;
   }
 }

}
