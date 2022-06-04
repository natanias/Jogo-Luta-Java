package controle;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import visao.*;


public class GamePanel extends JFrame implements Runnable {

    private static final long serialVersionUID = 1L;
    
	Player1 player1; 
	Boolean keyRight = false, keyLeft = false, keyNum1 = false, keyNum2 = false, keyNum3 = false;
	
	Player2 player2;
    Boolean keyA = false, keyD = false, keyJ = false, keyK = false, keyL = false;
    
    public JProgressBar healthBarP1 = new JProgressBar();
	public JProgressBar healthBarP2 = new JProgressBar();
	int hp1 = 250, hp2 = 250;
    
    Thread t;
    Integer speed = 4;
    int x, y;
    Boolean collision = false;
    
	private JLabel stage = null;
    
    public GamePanel() {
        initComponents();
    }
    
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        
        //Evento de botão
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                formKeyPressed(evt);
               
            }
            public void keyReleased(KeyEvent evt) {
                formKeyReleased(evt);
                
            }
        });
        getContentPane().setLayout(null);

        pack();
    }
    
    public static void main(String[] args) {
    	Selecao selecao = new Selecao();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GamePanel g = new GamePanel();
                g.setSize(800, 600);
                g.setResizable(false);
                g.setVisible(true);
                g.setContentPane(selecao);
            }
        });
    }
    
    //Tecla Pressionada
    private void formKeyPressed(KeyEvent evt) {
        switch (evt.getKeyCode()) {
        
        	//Player 1
        	case KeyEvent.VK_A:
        		keyA = true;
        		break;
        	case KeyEvent.VK_D:
        		keyD = true;
        		break;
        	case KeyEvent.VK_J:
        		keyJ = true;
        		break;
        	case KeyEvent.VK_K:
        		keyK = true;
        		break;
        	case KeyEvent.VK_L:
        		keyL = true;
        		break;
            
       
        	//Player 2
            case KeyEvent.VK_RIGHT:
                keyRight = true;
                break;
            case KeyEvent.VK_LEFT:
                keyLeft = true;
                break;
            case KeyEvent.VK_NUMPAD1:
                keyNum1 = true;
                break;
            case KeyEvent.VK_NUMPAD2:
                keyNum2 = true;
                break;
            case KeyEvent.VK_NUMPAD3:
                keyNum3 = true;
                break;
                      
        }
    }

    //Tecla Liberada
    private void formKeyReleased(KeyEvent evt) {
        switch (evt.getKeyCode()) {
        
        	//Player 1
        	case KeyEvent.VK_A:
        		keyA = false;
        		break;
        	case KeyEvent.VK_D:
        		keyD = false;
        		break;
        	case KeyEvent.VK_J:
        		keyJ = false;
        		break;
        	case KeyEvent.VK_K:
        		keyK = false;
        		break;
        	case KeyEvent.VK_L:
        		keyL = false;
        		break;
        			
        	//Player 2
            case KeyEvent.VK_RIGHT:
                keyRight = false;
                break;
            case KeyEvent.VK_LEFT:
                keyLeft = false;
                break;
            case KeyEvent.VK_NUMPAD1:
                keyNum1 = false;
                break;
            case KeyEvent.VK_NUMPAD2:
                keyNum2 = false;
                break;
            case KeyEvent.VK_NUMPAD3:
                keyNum3 = false;
                break;
                
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
    	//Player 1
        player1 = new Player1();
        player1.setupP1();
        
        //Barra de HP Player 1
        healthBarP1.setBounds(30, 30, 300, 15);
        healthBarP1.setValue(hp1);
        healthBarP1.setMaximum(250);
        healthBarP1.setForeground(Color.green);
        this.add(healthBarP1);
        
        //Player 2
        player2 = new Player2();
        player2.setupP2();
        
        //Barra de HP Player 2
        healthBarP2.setBounds(450, 30, 300, 15);
        healthBarP2.setValue(hp2);
        healthBarP2.setMaximum(250);
        healthBarP2.setForeground(Color.green);
        this.add(healthBarP2);
        
        getContentPane().add(player1);
        getContentPane().add(player2);
        repaint();
        t = new Thread(this);
        t.start();
    }
	 
	
	public JLabel getStage() {
		if (stage == null) {
			stage = new JLabel(new ImageIcon(getClass().getResource("Stage.gif")));
			stage.setSize(800, 600);
		}
		return stage;
	}
    
    //Ações do P1
    public void updateGameP1() {
        if (keyA) {
            if (player1.x >= 0) {
                player1.setIconLeft1();
                player1.x -= speed;
            }
        }

        if (keyD) {
        	if (player1.x <= 706) {
                player1.setIconRight1();
                player1.x += speed;
            }
        }

        //Punch
        if (keyJ) {
            player1.setIconPunch1();
            collision();
            if(collision) {
            	if(keyNum3 == true) {//Bloqueio do P2 ativo
            		//Punch Damage with defense
            		hp2 -= 0.8;
            		healthBarP2.setValue(hp2);
            		if(hp2 <= 0) {
            			JOptionPane.showMessageDialog(null, "PLAYER 1 VENCE!!");
            			System.exit(1);
            		}
            	}
            	else {
            		//Punch Damage without defense
            		hp2 -= 1.5;
            		healthBarP2.setValue(hp2);
            		if(hp2 <= 0) {
            			JOptionPane.showMessageDialog(null, "PLAYER 1 VENCE!!");
            			System.exit(1);
            		}
            	}
            }
        }
        
        //Kick
        if (keyK) {
            player1.setIconKick1();
            collision();
            if(collision) {
            	if(keyNum3 == true) {//Bloqueio do P2 ativo
            		//Kick Damage with defense
            		hp2 -= 1.2;
            		healthBarP2.setValue(hp2);
            		if(hp2 <= 0) {
            			JOptionPane.showMessageDialog(null, "PLAYER 1 VENCE!!");
            			System.exit(1);
            		}
            	}
            	else {
            		//Kick Damage without defense
            		hp2 -= 2.1;
            		healthBarP2.setValue(hp2);
            		if(hp2 <= 0) {
            			JOptionPane.showMessageDialog(null, "PLAYER 1 VENCE!!");
            			System.exit(1);
            		}
            	}
            }
        }
        
        //Defense
        if (keyL) {
            player1.setIconDef1();
        }

        if(!(keyA||keyD||keyJ||keyK||keyL)){
            player1.setIconStopped1();
        }
        
        player1.move1();
    }
    
    //Ações do P2
    public void updateGameP2() {
        if (keyRight) {
            if (player2.x <= 706) {
                player2.setIconRight2();
                player2.x += speed;
            }
        }

        if (keyLeft) {
            if (player2.x >= 0) {
                player2.setIconLeft2();
                player2.x -= speed;
            }
        }

        //Punch
        if (keyNum1) {
            player2.setIconPunch2();
            collision();
            if(collision) {
            	if(keyL == true) {//Bloqueio do P1 ativo
            		//Punch Damage with defense
            		hp1 -= 0.8;
            		healthBarP1.setValue(hp1);
            		if(hp2 <= 0) {
            			JOptionPane.showMessageDialog(null, "PLAYER 2 VENCE!!");
            			System.exit(1);
            		}
            	}
            	else {
            		//Punch Damage without defense
            		hp1 -= 1.5;
            		healthBarP1.setValue(hp1);
            		if(hp2 <= 0) {
            			JOptionPane.showMessageDialog(null, "PLAYER 2 VENCE!!");
            			System.exit(1);
            		}
            	}
            }
        }
        
        //Kick
        if (keyNum2) {
            player2.setIconKick2();
            collision();
            if(collision) {
            	if(keyL == true) {//Bloqueio do P1 ativo
            		//Kick Damage with defense
            		hp1 -= 1.2;
            		healthBarP1.setValue(hp1);
            		if(hp2 <= 0) {
            			JOptionPane.showMessageDialog(null, "PLAYER 2 VENCE!!");
            			System.exit(1);
            			
            		}
            	}
            	else {
            		//Kick Damage without defense
            		hp1 -= 2.1;
            		healthBarP1.setValue(hp1);
            		if(hp2 <= 0) {
            			JOptionPane.showMessageDialog(null, "PLAYER 2 VENCE!!");
            			System.exit(1);
            		}
            	}
            } 
        }
        
        //Defense
        if (keyNum3) {
            player2.setIconDef2();
        }

        if(!(keyLeft||keyRight||keyNum1||keyNum2||keyNum3)){
            player2.setIconStopped2();
        }
        
        player2.move2();
    }
    
    
	//Verificar colisão
	public void collision() {
    	Rectangle rectangle1 = player1.getBounds();
    	Rectangle rectangle2 = player2.getBounds();
    	
    	if(rectangle1.intersects(rectangle2)) {
    		collision = true;
    	}
    	else
    		collision = false;
    }
   

    @Override
    public void run() {
        while (true) {
            try {
                updateGameP1();
                updateGameP2();  
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
