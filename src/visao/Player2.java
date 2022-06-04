package visao;
import javax.swing.*;
import java.awt.*;

public class Player2 extends JLabel{
	
    private static final long serialVersionUID = 1L;
    
	public int x = 600, y = 430;    
    ImageIcon walkL2;
    ImageIcon walkR2;
    
    ImageIcon stopped2;

    ImageIcon punch2;
    ImageIcon kick2;
    ImageIcon defense2;
 
    ImageIcon UltimaImg2 = null;
    
    String champ2 = Selecao.getChampP2();

    public void setupP2(){
        setText("12");
        //Player 2 select Chunli
        if(champ2 == "chun") {
        	 walkR2 = new ImageIcon( //Anda pra direita
                     new ImageIcon(getClass()
                             .getResource("ChunliP2/chunli_walkback.gif"))
                             .getImage()
                             .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
             
             walkL2 = new ImageIcon( //Anda pra esquerda
                     new ImageIcon(getClass()
                             .getResource("ChunliP2/chunli_walk.gif"))
                             .getImage()
                             .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
             
             punch2 = new ImageIcon(//Punch
                     new ImageIcon(getClass()
                             .getResource("ChunliP2/chunli_punch.gif"))
                             .getImage()
                             .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
             
             kick2 = new ImageIcon(//Kick
                     new ImageIcon(getClass()
                             .getResource("ChunliP2/chunli_kick.gif"))
                             .getImage()
                             .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
             
             defense2 = new ImageIcon(//Defense
                     new ImageIcon(getClass()
                             .getResource("ChunliP2/chunli_defense.gif"))
                             .getImage()
                             .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
             
             stopped2 = new ImageIcon(//Stopped
                     new ImageIcon(getClass()
                             .getResource("ChunliP2/chunli_pd.gif"))
                             .getImage()
                             .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
        }
        
        //Player 2 select Sheeva
        else if(champ2 == "sheeva") {
       	 walkR2 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("SheevaP2/sheeva_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL2 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("SheevaP2/sheeva_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            punch2 = new ImageIcon(//Punch
                    new ImageIcon(getClass()
                            .getResource("SheevaP2/sheeva_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick2 = new ImageIcon(//Kick
                    new ImageIcon(getClass()
                            .getResource("SheevaP2/sheeva_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            defense2 = new ImageIcon(//Defense
                    new ImageIcon(getClass()
                            .getResource("SheevaP2/sheeva_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped2 = new ImageIcon(//Stopped
                    new ImageIcon(getClass()
                            .getResource("SheevaP2/sheeva_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
       }
       
        //Player 2 select Akuma
        else if(champ2 == "akuma") {
       	 walkR2 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("AkumaP2/akuma_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL2 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("AkumaP2/akuma_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            punch2 = new ImageIcon(//Punch
                    new ImageIcon(getClass()
                            .getResource("AkumaP2/akuma_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick2 = new ImageIcon(//Kick
                    new ImageIcon(getClass()
                            .getResource("AkumaP2/akuma_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            defense2 = new ImageIcon(//Defense
                    new ImageIcon(getClass()
                            .getResource("AkumaP2/akuma_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped2 = new ImageIcon(//Stopped
                    new ImageIcon(getClass()
                            .getResource("AkumaP2/akuma_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
       }
        
        
        //Player 2 select Cable
        else if(champ2 == "cable") {
       	 walkR2 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("CableP2/cable_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL2 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("CableP2/cable_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            punch2 = new ImageIcon(//Punch
                    new ImageIcon(getClass()
                            .getResource("CableP2/cable_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick2 = new ImageIcon(//Kick
                    new ImageIcon(getClass()
                            .getResource("CableP2/cable_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            defense2 = new ImageIcon(//Defense
                    new ImageIcon(getClass()
                            .getResource("CableP2/cable_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped2 = new ImageIcon(//Stopped
                    new ImageIcon(getClass()
                            .getResource("CableP2/cable_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
       }
        
       
        //Player 2 select Spider
        else if(champ2 == "spider") {
       	 walkR2 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("SpiderP2/spider_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL2 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("SpiderP2/spider_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            punch2 = new ImageIcon(//Punch
                    new ImageIcon(getClass()
                            .getResource("SpiderP2/spider_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick2 = new ImageIcon(//Kick
                    new ImageIcon(getClass()
                            .getResource("SpiderP2/spider_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            defense2 = new ImageIcon(//Defense
                    new ImageIcon(getClass()
                            .getResource("SpiderP2/spider_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped2 = new ImageIcon(//Stopped
                    new ImageIcon(getClass()
                            .getResource("SpiderP2/spider_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
       }
        
        
        //Player 2 select Dr.Doom
        else if(champ2 == "doom") {
       	 walkR2 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("DoomP2/doom_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL2 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("DoomP2/doom_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            punch2 = new ImageIcon(//Punch
                    new ImageIcon(getClass()
                            .getResource("DoomP2/doom_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick2 = new ImageIcon(//Kick
                    new ImageIcon(getClass()
                            .getResource("DoomP2/doom_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            defense2 = new ImageIcon(//Defense
                    new ImageIcon(getClass()
                            .getResource("DoomP2/doom_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped2 = new ImageIcon(//Stopped
                    new ImageIcon(getClass()
                            .getResource("DoomP2/doom_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
       }
        
        setBounds(x, y, 90, 127);

    }
    
    public void move2(){
        setBounds(x, y, 90, 127);
    }
    
    public void setIconRight2(){
        setIcon(walkR2);
        this.UltimaImg2 = walkR2;
    }
    
    public void setIconLeft2(){
        setIcon(walkL2);
        this.UltimaImg2 = walkL2;
    }

    public void setIconPunch2(){
        setIcon(punch2);
        this.UltimaImg2 = punch2;
    }
    
    public void setIconKick2(){
        setIcon(kick2);
        this.UltimaImg2 = kick2;
    }
    
    public void setIconDef2(){
        setIcon(defense2);
        this.UltimaImg2 = defense2;
    }

    public void setIconStopped2(){
        setIcon(stopped2);
    }
}
