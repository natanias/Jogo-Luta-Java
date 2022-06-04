package visao;
import javax.swing.*;
import java.awt.*;

public class Player1 extends JLabel{
	
    private static final long serialVersionUID = 1L;
    
	public int x = 100, y = 430;    
    ImageIcon walkL1;
    ImageIcon walkR1;
    
    ImageIcon stopped1;

    ImageIcon punch1;
    ImageIcon kick1;
    ImageIcon defense1;
 
    ImageIcon UltimaImg1 = null;

    String champ1 = Selecao.getChampP1();

    //
    public void setupP1(){
        setText("12");
        
        //Player 1 select Chunli 
        if(champ1 == "chun") {//Carrega Sprites da ChunliP1
        	walkR1 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("ChunliP1/chunli_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL1 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("ChunliP1/chunli_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            punch1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("ChunliP1/chunli_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("ChunliP1/chunli_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            defense1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("ChunliP1/chunli_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped1 = new ImageIcon( 
                    new ImageIcon(getClass()
                            .getResource("ChunliP1/chunli_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
        }
        
        //Player 1 select Sheeva
        else if(champ1 == "sheeva") {//Carrega Sprites da SheevaP1
        	walkR1 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("SheevaP1/sheeva_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL1 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("SheevaP1/sheeva_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            punch1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("SheevaP1/sheeva_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("SheevaP1/sheeva_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            defense1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("SheevaP1/sheeva_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped1 = new ImageIcon( 
                    new ImageIcon(getClass()
                            .getResource("SheevaP1/sheeva_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
        }
        
        //Player 1 select Akuma
        else if(champ1 == "akuma") { //Carrega Sprites do AkumaP1
        	walkR1 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("AkumaP1/akuma_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL1 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("AkumaP1/akuma_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            punch1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("AkumaP1/akuma_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("AkumaP1/akuma_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            defense1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("AkumaP1/akuma_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped1 = new ImageIcon( 
                    new ImageIcon(getClass()
                            .getResource("AkumaP1/akuma_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
        }
        
        //Player 1 select Cable -> Sprite walk com bug visual
        else if(champ1 == "cable") {//Carrega Sprites do CableP1
        	walkR1 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("CableP1/cable_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL1 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("CableP1/cable_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            punch1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("CableP1/cable_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("CableP1/cable_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            defense1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("CableP1/cable_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped1 = new ImageIcon( 
                    new ImageIcon(getClass()
                            .getResource("CableP1/cable_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
        }
        
        //Player 1 select Spider
        else if(champ1 == "spider") {//Carrega Sprites do SpiderP1
        	walkR1 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("SpiderP1/spider_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL1 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("SpiderP1/spider_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            //Sprites de punch e kick com animação lenta, aumentar velocidade do gif
            punch1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("SpiderP1/spider_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("SpiderP1/spider_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            //Sprite de defesa com bug visual, alterar tamanho ou substituir Sprite
            defense1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("SpiderP1/spider_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped1 = new ImageIcon( 
                    new ImageIcon(getClass()
                            .getResource("SpiderP1/spider_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
        }
        
        //Player 1 select Dr.Doom -> Revisar Sprites Dr.Doom
        else if(champ1 == "doom") {//Carrega Sprites do CableP1
        	walkR1 = new ImageIcon( //Anda pra direita
                    new ImageIcon(getClass()
                            .getResource("DoomP1/doom_walk.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            walkL1 = new ImageIcon( //Anda pra esquerda
                    new ImageIcon(getClass()
                            .getResource("DoomP1/doom_walkback.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            punch1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("DoomP1/doom_punch.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            kick1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("DoomP1/doom_kick.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            defense1 = new ImageIcon(
                    new ImageIcon(getClass()
                            .getResource("DoomP1/doom_defense.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
            
            stopped1 = new ImageIcon( 
                    new ImageIcon(getClass()
                            .getResource("DoomP1/doom_pd.gif"))
                            .getImage()
                            .getScaledInstance(88, 127, Image.SCALE_DEFAULT));
        }
        
        setBounds(x, y, 90, 127);

    }
    
    public void move1(){
        setBounds(x, y, 90, 127);
    }
    
    public void setIconRight1(){
        setIcon(walkR1);
        this.UltimaImg1 = walkR1;
    }
    
    public void setIconLeft1(){
        setIcon(walkL1);
        this.UltimaImg1 = walkL1;
    }

    public void setIconPunch1(){
        setIcon(punch1);
        this.UltimaImg1 = punch1;
    }
    
    public void setIconKick1(){
        setIcon(kick1);
        this.UltimaImg1 = kick1;
    }
    
    public void setIconDef1(){
        setIcon(defense1);
        this.UltimaImg1 = defense1;
    }
    
    public void setIconStopped1(){
        setIcon(stopped1);
    }
}
