package p6;

import java.awt.*;
import javax.swing.*;

public class Test1UI extends JPanel {
	
	private final Dimension STANDARD_FIELD_DIMENSION= new Dimension(20,20);
	private final int STANDARD_ARRAY_LENGTH = 7;
	private final int STANDARD_MARGIN = 2;
	private final JLabel COLUMN_NBR = new JLabel("Kolumn nummer");
	private final JLabel ROW_NBR = new JLabel("Rad nummer");
	
	private JPanel uiContainer = new JPanel();
	private JPanel array7x7Panel = new JPanel(new GridLayout(STANDARD_ARRAY_LENGTH,STANDARD_ARRAY_LENGTH,STANDARD_MARGIN, STANDARD_MARGIN));
	private JPanel leftColumnPanel = new JPanel(new GridLayout(STANDARD_ARRAY_LENGTH, 1 , STANDARD_MARGIN, STANDARD_MARGIN));
	private JPanel bottomRowPanel = new JPanel(new GridLayout(1,STANDARD_ARRAY_LENGTH));
	private JPanel rowControlPanel = new JPanel(new GridBagLayout());
	private JPanel columnControlPanel = new JPanel(new GridBagLayout());
	private JPanel controlContainer = new JPanel(new GridLayout(2,1));
	private JPanel arrayContainer = new JPanel(new BorderLayout());
	
	private JLabel[][] labelArray = new JLabel[STANDARD_ARRAY_LENGTH][STANDARD_ARRAY_LENGTH];

	private JButton btnReadRow = new JButton("Läs rad");
	private JButton btnWriteRow = new JButton("Skriv rad");
	private JButton btnReadColumn = new JButton("Läs kolumn");
	private JButton btnWriteColumn = new JButton("Skriv kolumn");
	private JTextField columnTextFieldControl = new JTextField();
	private JTextField rowTextFieldControl = new JTextField();
	
	private JTextField[] columnTextField = new JTextField[STANDARD_ARRAY_LENGTH];
	private JTextField[] rowTextField = new JTextField [STANDARD_ARRAY_LENGTH];
	private Controller controller;
	
	
	public Test1UI() {
	//	this.controller = controller;
		setLayout(new BorderLayout());
		initializeArray7x7();
		initializeTextFieldArray();
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(STANDARD_MARGIN,STANDARD_MARGIN,STANDARD_MARGIN,STANDARD_MARGIN);
		
		labelArrayManager();
		
		textFieldArrayArranger(columnTextField, leftColumnPanel);
		textFieldArrayArranger(rowTextField, bottomRowPanel);
		
		array7x7Panel.setPreferredSize(new Dimension(300,300));
		arrayContainer.add(array7x7Panel, BorderLayout.CENTER);
		leftColumnPanel.setPreferredSize(new Dimension(50,300));
		arrayContainer.add(leftColumnPanel, BorderLayout.WEST);
		bottomRowPanel.setPreferredSize(new Dimension(300,50));
		bottomRowPanel.setBorder(BorderFactory.createEmptyBorder(0,49, 0, 0));
		arrayContainer.add(bottomRowPanel, BorderLayout.SOUTH);
		
		// rowControlPanel.add(ROW_NBR);
		// rowControlPanel.add(rowTextFieldControl);
		
		uiContainer.setLayout(new BorderLayout());
		uiContainer.add(arrayContainer);
		//uiContainer.add(rowControlPanel);
		
		add(uiContainer);
		
	}

	/**
	 * Method adds textfield arrays.
	 * @param textArray
	 * @param panel
	 */
	public void textFieldArrayArranger(JTextField[] textArray, JPanel panel) {
		for (int i = 0; i< STANDARD_ARRAY_LENGTH; i++) {
			textArray[i].setMinimumSize(STANDARD_FIELD_DIMENSION);
			panel.add(textArray[i]);	
		}
	}

	/**
	 * Method adds label array.
	 */
	public void labelArrayManager() {
		for(int i=0; i < STANDARD_ARRAY_LENGTH; i++) {
			for (int j=0; j < STANDARD_ARRAY_LENGTH; j++ ) {
				labelArray[i][j].setBackground(java.awt.Color.GRAY);
				labelArray[i][j].setOpaque(true);
				labelArray[i][j].setMinimumSize(STANDARD_FIELD_DIMENSION);
				array7x7Panel.add(labelArray[i][j]);
			}
		}
	}
	
	
	/**
	 * Method initializes 7x7 array.
	 */
	public void initializeArray7x7() {
		for(int i = 0; i < labelArray.length; i++ ) {
			for(int j = 0; j < labelArray[i].length; j++) {
				labelArray[i][j] = new JLabel("0", SwingConstants.CENTER);
			}
		}
	}
	
	/**
	 * Initializes textfield array.
	 * Sets textfields to 0.
	 */
	public void initializeTextFieldArray() {
		for(int i=0; i < STANDARD_ARRAY_LENGTH; i++) {
			columnTextField[i] = new JTextField("0");
			rowTextField[i] = new JTextField("0");
			columnTextField[i].setHorizontalAlignment(SwingConstants.CENTER);
			rowTextField[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
	}
	
	public static void main(String[] args) {
		Test1UI UI = new Test1UI();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(3);
		frame.add(UI);
		frame.pack();
		frame.setVisible(true);
	}
}
