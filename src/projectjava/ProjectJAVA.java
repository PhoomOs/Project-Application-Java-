
package projectjava;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import static javax.swing.SpringLayout.SOUTH;
import net.glxn.qrgen.*;
import net.glxn.qrgen.image.ImageType;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class ProjectJAVA extends JFrame{
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButton1;
    
    private  JPanel main = new JPanel();
    private MainApp maints = new MainApp();
    private final JLabel welComeApp = new JLabel();
    private final JButton start = new JButton("Get Started !!");
    
    private final JPanel choice = new JPanel();
    private final JLabel choiceProduct = new JLabel("Choice Your Product!!");
    
    private nextMain c1 = new nextMain();
    private final JButton b1 = new JButton("Button 1");
    private final JButton b2 = new JButton("Button 2");
    
    
    public ProjectJAVA(){
        super("Comfort Management");
        setSize(780,380);
        setResizable(false);
        setLocationRelativeTo(null);
      
        mainFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    }
    public void mainFrame(){
      
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        
        main.setBackground(new Color(44, 62, 80));
        JPanel ts = new JPanel();
        ts.setPreferredSize(new Dimension(750,70));
        ts.setBackground(new Color(44, 62, 80));
        main.add(ts);

        jLabel1.setFont(new Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(Color.white);
   

        jLabel1.setText("Welcome to |");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(Color.green);
        jLabel2.setText(" Comfort Management Application");
        
        JPanel tss = new JPanel();
        tss.setPreferredSize(new Dimension(750,100));
        tss.setBackground(new Color(44, 62, 80));
        
        
        jButton1.setBackground(new java.awt.Color(44, 62, 80));
        jButton1.setFont(new Font("Tahoma", 0, 22)); // NOI18N
        jButton1.setIcon(new ImageIcon(getClass().getResource("/sound/start.png")));
        

        main.add(jLabel1);main.add(jLabel2);main.add(tss);main.add(jButton1);
        add(main);
        jButton1.addActionListener((ActionEvent event) -> {        
            
            File file = new File("E:\\NetBeansProjects\\EX\\ProjectJAVA\\src\\projectjava\\Click.wav");
                        Clip clip = null;
            try {
                clip = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(ProjectJAVA.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
            try {
                clip.open(AudioSystem.getAudioInputStream(file));
            
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(ProjectJAVA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ProjectJAVA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(ProjectJAVA.class.getName()).log(Level.SEVERE, null, ex);
            }
                        clip.start();
            
            try {
                Thread.sleep(clip.getMicrosecondPosition());
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectJAVA.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            add(c1);
            pack();
            remove(main);

        });
            
    }
    public void playAudio() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
		System.out.println("playing audio..");
		try {
                        File file = new File("E:\\NetBeansProjects\\EX\\ProjectJAVA\\src\\projectjava\\Click.wav");
                        Clip clip = AudioSystem.getClip();
                        
                        clip.open(AudioSystem.getAudioInputStream(file));
                        clip.start();
            
			Thread.sleep(clip.getMicrosecondLength());
                        
		} catch (Exception e) {
		}

	}
    
    public void sound(){
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;
        try{
        BGM = new AudioStream(new FileInputStream("E:\\NetBeansProjects\\EX\\ProjectJAVA\\src\\sound\\Click.wav"));
        MD = BGM.getData();
        loop = new ContinuousAudioDataStream(MD);
        }catch(IOException e){
            
        }
       
        MGP.start(loop);
    }
    
    
    public static void main(String[] args) {
        new ProjectJAVA().setVisible(true);;
        
    }
    
}
