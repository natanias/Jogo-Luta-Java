package visao;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOver extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel p1Wins = null;
	private JLabel p2Wins = null;

	public GameOver() {
		super();
		setLayout(null);
		
		this.setSize(800, 600);
		this.setVisible(true);

	}

	public JLabel getP1Panel() {
		if (p1Wins == null) {
			p1Wins = new JLabel(new ImageIcon(getClass().getResource("p1Wins.png")));
			p1Wins.setSize(800, 600);
		}
		return p1Wins;
	}
	
	public JLabel getP2Panel() {
		if (p2Wins == null) {
			p2Wins = new JLabel(new ImageIcon(getClass().getResource("p2Wins.png")));
			p2Wins.setSize(800, 600);
		}
		return p2Wins;
	}
}
