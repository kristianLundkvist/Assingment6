package p6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Test1UIAlternativ extends JPanel {

	private final Dimension STANDARD_FIELD_DIMENSION = new Dimension(20, 20);
	private final int STANDARD_ARRAY_LENGTH = 7;
	private final int STANDARD_MARGIN = 2;
	private final JLabel COLUMN_NBR = new JLabel("Kolumn nummer");
	private final JLabel ROW_NBR = new JLabel("Rad nummer");

	// private JPanel uiContainer = new JPanel(); -- Jag tog bort denna panelen
	// helt, behövdes ej. / Tim

	private JPanel array7x7Panel = new JPanel(
			new GridLayout(STANDARD_ARRAY_LENGTH, STANDARD_ARRAY_LENGTH, STANDARD_MARGIN, STANDARD_MARGIN));
	private JPanel leftColumnPanel = new JPanel(
			new GridLayout(STANDARD_ARRAY_LENGTH, 1, STANDARD_MARGIN, STANDARD_MARGIN));
	private JPanel bottomRowPanel = new JPanel(new GridLayout(1, STANDARD_ARRAY_LENGTH));
	private JPanel controlPanel = new JPanel(); // Ändrat till Null layout
												// istället.
	// private JPanel columnControlPanel = new JPanel(); // -- Tog bort helt,
	// använder endast controlPanel till alla knappar

	private JPanel arrayContainer = new JPanel(new BorderLayout());

	private JLabel[][] labelArray = new JLabel[STANDARD_ARRAY_LENGTH][STANDARD_ARRAY_LENGTH];

	private JButton btnReadRow = new JButton("Läs rad");
	private JButton btnWriteRow = new JButton("Skriv rad");
	private JButton btnReadColumn = new JButton("Läs kolumn");
	private JButton btnWriteColumn = new JButton("Skriv kolumn");
	private JTextField columnTextFieldControl = new JTextField();
	private JTextField rowTextFieldControl = new JTextField();

	private JTextField[] columnTextField = new JTextField[STANDARD_ARRAY_LENGTH];
	private JTextField[] rowTextField = new JTextField[STANDARD_ARRAY_LENGTH];
	private ArrayControllerAlternativ controller;
	private BtnListener btnListener;

	public Test1UIAlternativ(ArrayControllerAlternativ controller) {
		this.controller = controller;
		btnListener = new BtnListener();
		setLayout(new BorderLayout());
		initializeArray7x7();
		initializeTextFieldArray();

		labelArrayManager();

		textFieldArrayArranger(columnTextField, leftColumnPanel);
		textFieldArrayArranger(rowTextField, bottomRowPanel);

		array7x7Panel.setPreferredSize(new Dimension(300, 300));
		arrayContainer.add(array7x7Panel, BorderLayout.CENTER);
		leftColumnPanel.setPreferredSize(new Dimension(50, 300));
		arrayContainer.add(leftColumnPanel, BorderLayout.WEST);
		bottomRowPanel.setPreferredSize(new Dimension(300, 50));
		bottomRowPanel.setBorder(BorderFactory.createEmptyBorder(0, 49, 0, 0));
		arrayContainer.add(bottomRowPanel, BorderLayout.SOUTH);

		// Detta är nytt.
		// Ställer in controlPanel till null layout och placerar in alla
		// komponenter manuellt.
		controlPanel.setLayout(null);
		controlPanel.setPreferredSize(new Dimension(230, 300));
		ROW_NBR.setBounds(40, 10, 80, 20);
		controlPanel.add(ROW_NBR);
		rowTextFieldControl.setBounds(150, 10, 40, 20);
		controlPanel.add(rowTextFieldControl);
		btnReadRow.setBounds(50, 40, 120, 30);
		controlPanel.add(btnReadRow);
		btnWriteRow.setBounds(50, 80, 120, 30);
		controlPanel.add(btnWriteRow);
		COLUMN_NBR.setBounds(30, 160, 110, 20);
		controlPanel.add(COLUMN_NBR);
		columnTextFieldControl.setBounds(150, 160, 40, 20);
		controlPanel.add(columnTextFieldControl);
		btnReadColumn.setBounds(50, 190, 120, 30);
		controlPanel.add(btnReadColumn);
		btnWriteColumn.setBounds(50, 230, 120, 30);
		controlPanel.add(btnWriteColumn);

		btnReadRow.addActionListener(btnListener);
		btnWriteRow.addActionListener(btnListener);
		btnReadColumn.addActionListener(btnListener);
		btnWriteColumn.addActionListener(btnListener);

		// uiContainer.setLayout(new BorderLayout()); Onödigt
		// uiContainer.add(arrayContainer); Onödigt
		// uiContainer.add(rowControlPanel);

		// Lägger huvudpanelen i mitten och controlPanel till höger.
		add(arrayContainer, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.EAST);

		// Dubbelkoppla UI:n med controllern
		controller.setUI(this);
		controller.updateView();
	}

	/**
	 * Method adds textfield arrays.
	 * 
	 * @param textArray
	 * @param panel
	 */
	public void textFieldArrayArranger(JTextField[] textArray, JPanel panel) {
		for (int i = 0; i < STANDARD_ARRAY_LENGTH; i++) {
			textArray[i].setMinimumSize(STANDARD_FIELD_DIMENSION);
			panel.add(textArray[i]);
		}
	}

	/**
	 * Method adds label array.
	 */
	public void labelArrayManager() {
		for (int i = 0; i < STANDARD_ARRAY_LENGTH; i++) {
			for (int j = 0; j < STANDARD_ARRAY_LENGTH; j++) {
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
		for (int i = 0; i < labelArray.length; i++) {
			for (int j = 0; j < labelArray[i].length; j++) {
				labelArray[i][j] = new JLabel("0", SwingConstants.CENTER);
			}
		}
	}

	/**
	 * Initializes textfield array. Sets textfields to 0.
	 */
	public void initializeTextFieldArray() {
		for (int i = 0; i < STANDARD_ARRAY_LENGTH; i++) {
			columnTextField[i] = new JTextField("0");
			rowTextField[i] = new JTextField("0");
			columnTextField[i].setHorizontalAlignment(SwingConstants.CENTER);
			rowTextField[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
	}

	// -----------------------------------------------------------------------------------------------------------
	// Allt under detta streck är nytt / Tim
	// -----------------------------------------------------------------------------------------------------------

	// Uppdaterar alla JLabels och JTextFields så de stämmer överens med de inkomna
	// arrayerna.
	public void updateView(int[][] boxArray, int[] row, int[] column) {
		for (int i = 0; i < STANDARD_ARRAY_LENGTH; i++) {
			columnTextField[i].setText(column[i] + "");
			rowTextField[i].setText(row[i] + "");
			for (int j = 0; j < STANDARD_ARRAY_LENGTH; j++) {
				labelArray[i][j].setText(boxArray[i][j] + "");
			}
		}
	}

	// Returnerar en specifik siffra från labelArray. Alltså siffran som står på
	// en av de JLables som utgör labelArray.
	public int getlblArrayElement(int row, int column) {
		int res = 0;
		try {
			res = Integer.parseInt(labelArray[row][column].getText());
		} catch (NumberFormatException e) {
			System.out.println("Fel");
		}
		return res;
	}

	// Returnerar det som för tillfället står i "rowTextFieldControl".
	public int getRowTextFieldControl() {
		return Integer.parseInt(rowTextFieldControl.getText());
	}

	// Returnerar det som för tillfället står i "columnTextFieldControl".
	public int getColumnTextFieldControl() {
		return Integer.parseInt(columnTextFieldControl.getText());
	}

	// Returnerar det som för tillfället står i "columnTextField", lagrat i en
	// Array7
	public Array7 getColumnTextFieldArray() {
		Array7 array = new Array7();
		for (int i = 0; i < STANDARD_ARRAY_LENGTH; i++) {
			int nbr = Integer.parseInt(columnTextField[i].getText());
			array.setElement(i, nbr);
		}

		return array;
	}

	// Returnerar det som för tillfället står i "rowTextField", lagrat i en
	// Array7
	public Array7 getRowTextFieldArray() {
		Array7 array = new Array7();
		for (int i = 0; i < STANDARD_ARRAY_LENGTH; i++) {
			int nbr = Integer.parseInt(rowTextField[i].getText());
			array.setElement(i, nbr);
		}

		return array;
	}

	/*
	 * Lyssnar på knapparna i panelen och hittar på olika hyss vid tryckningar på
	 * dem.
	 */
	private class BtnListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnReadRow) {
				int row = getRowTextFieldControl() - 1;
				if (row >= 0 && row < STANDARD_ARRAY_LENGTH)
					controller.readRow(row);

			} else if (e.getSource() == btnWriteRow) {
				int row = getRowTextFieldControl() - 1;
				if (row >= 0 && row < STANDARD_ARRAY_LENGTH)
					controller.writeRow(row, getRowTextFieldArray());

			} else if (e.getSource() == btnReadColumn) {
				int column = getColumnTextFieldControl() - 1;
				if (column >= 0 && column < STANDARD_ARRAY_LENGTH)
					controller.readColumn(column);

			} else if (e.getSource() == btnWriteColumn) {
				int column = getColumnTextFieldControl() - 1;
				if (column >= 0 && column < STANDARD_ARRAY_LENGTH)
					controller.writeColumn(column, getColumnTextFieldArray());
			}
		}

	}

	// Testmetod
	public static void main(String[] args) {

		int[][] n = new int[7][7];
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = i;
			}
		}
		Array7x7 array = new Array7x7(n);
		Array7 row = new Array7();
		Array7 column = new Array7();
		ArrayControllerAlternativ controller = new ArrayControllerAlternativ(array, row, column);
		Test1UIAlternativ UI = new Test1UIAlternativ(controller);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(3);
		frame.add(UI);
		frame.pack();
		frame.setLocation(400, 200);
		frame.setVisible(true);
	}
}
