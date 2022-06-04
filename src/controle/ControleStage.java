package controle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ControleStage extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JLabel stage = null;
	
	public ControleStage() {
		super();
		setLayout(null);
		
		this.setSize(800, 600);
		this.setVisible(true);

		add(getStage());
		
		
	}
	
	public JLabel getStage() {
		if (stage == null) {
			stage = new JLabel(new ImageIcon(getClass().getResource("Stage.gif")));
			stage.setSize(800, 600);
			
			
		}
		return stage;
	}
}
