package visao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controle.*;

public class Selecao extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private JButton play1;
	private JButton play2;
	private JButton play3;
	private JButton play4;
	private JButton play5;
	private JButton play6;
	private JButton fight;
	
	public static String champP1;
	public static String champP2;
	
	int click = 1;

	private JLabel fundo = null;
	

	public Selecao() {
		super();
		setLayout(null);
		
		this.setSize(800, 600);
		this.setVisible(true);

		add(getFundo());
		
		getPlay1().addActionListener(this);
		getPlay2().addActionListener(this);
		getPlay3().addActionListener(this);
		getPlay4().addActionListener(this);
		getPlay5().addActionListener(this);
		getPlay6().addActionListener(this);
		getFight().addActionListener(this);

	}

	public JLabel getFundo() {
		if (fundo == null) {
			fundo = new JLabel(new ImageIcon(getClass().getResource("Selecao.png")));
			fundo.setSize(800, 600);
			add(getPlay1());
			add(getPlay2());
			add(getPlay3());
			add(getPlay4());
			add(getPlay5());
			add(getPlay6());
			add(getFight());
		}
		return fundo;
	}

	public JButton getPlay1() {
		if (play1 == null) {
			play1 = new JButton(new ImageIcon(getClass().getResource("play1.gif")));
			play1.setBounds(40, 238, 98, 244);
		}
		return play1;
	}

	public JButton getPlay2() {
		if (play2 == null) {
			play2 = new JButton(new ImageIcon(getClass().getResource("play2.gif")));
			play2.setBounds(140, 238, 117, 244);
		}
		return play2;
	}

	public JButton getPlay3() {
		if (play3 == null) {
			play3 = new JButton(new ImageIcon(getClass().getResource("play3.gif")));
			play3.setBounds(259, 238, 120, 244);
		}
		return play3;
	}

	public JButton getPlay4() {
		if (play4 == null) {
			play4 = new JButton(new ImageIcon(getClass().getResource("play4.gif")));
			play4.setBounds(382, 238, 117, 244);
		}
		return play4;
	}

	public JButton getPlay5() {
		if (play5 == null) {
			play5 = new JButton(new ImageIcon(getClass().getResource("play5.gif")));
			play5.setBounds(500, 238, 129, 244);
		}
		return play5;
	}

	public JButton getPlay6() {
		if (play6 == null) {
			play6 = new JButton(new ImageIcon(getClass().getResource("play6.gif")));
			play6.setBounds(629, 238, 129, 244);
		}
		return play6;
	}

	public JButton getFight() {
		if (fight == null) {
			fight = new JButton(new ImageIcon(getClass().getResource("fight.png")));
			fight.setBounds(400, 155, 130, 60);
		}
		return fight;
	}
	
	public static String getChampP1() {
		return champP1;
	}

	public static String getChampP2() {
		return champP2;
	}


	public void actionPerformed(ActionEvent e) {
		//Seleção de personagem Player 1
		if (click == 1) {
			if (e.getSource() == getPlay1()) {
				champP1 = "chun";
				click = 2;
			} else if (e.getSource() == getPlay2()) {
				champP1 = "sheeva";
				click = 2;
			} else if (e.getSource() == getPlay3()) {
				champP1 = "akuma";
				click = 2;
			} else if (e.getSource() == getPlay4()) {
				champP1 = "cable";
				click = 2;
			} else if (e.getSource() == getPlay5()) {
				champP1 = "spider";
				click = 2;
			} else if (e.getSource() == getPlay6()) {
				champP1 = "doom";
				click = 2;
			}
			
		//Seleção de personagem Player 2	
		} else if (click == 2) {
			if (e.getSource() == getPlay1()) {
				champP2 = "chun";
				click = 3;
			} else if (e.getSource() == getPlay2()) {
				champP2 = "sheeva";
				click = 3;
			} else if (e.getSource() == getPlay3()) {
				champP2 = "akuma";
				click = 3;
			} else if (e.getSource() == getPlay4()) {
				champP2 = "cable";
				click = 3;
			} else if (e.getSource() == getPlay5()) {
				champP2 = "spider";
				click = 3;
			} else if (e.getSource() == getPlay6()) {
				champP2 = "doom";
				click = 3;
			}
			
		//Gambiarra pra "voltar" para o GamePanel
		} else if(click == 3) {
			if(e.getSource() == getFight()) {
				this.setVisible(false);
				GamePanel g = new GamePanel();
				g.setSize(800, 600);
                g.setResizable(false);
                g.setVisible(true);   
			} else
				JOptionPane.showMessageDialog(null, "Press the button FIGHT to start!!");
		}
	}

}
		
