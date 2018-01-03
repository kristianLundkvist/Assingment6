package p6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Test1UI extends JPanel {

	private static final long serialVersionUID = 6391566115349859301L;
	private final Dimension STANDARD_FIELD_DIMENSION = new Dimension(20, 20);
	private final int STANDARD_ARRAY_LENGTH = 7;
	private final int STANDARD_MARGIN = 2;
	private final JLabel COLUMN_NBR = new JLabel("Kolumn nummer");
	private final JLabel ROW_NBR = new JLabel("Rad nummer");
	private JPanel array7x7Panel = new JPanel(
			new GridLayout(STANDARD_ARRAY_LENGTH, STANDARD_ARRAY_LENGTH, STANDARD_MARGIN, STANDARD_MARGIN));
	private JPanel leftColumnPanel = new JPanel(
			new GridLayout(STANDARD_ARRAY_LENGTH, 1, STANDARD_MARGIN, STANDARD_MARGIN));
	private JPanel bottomRowPanel = new JPanel(new GridLayout(1, STANDARD_ARRAY_LENGTH));
	private JPanel controlPanel = new JPanel();
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
	private ArrayController controller;
	private BtnListener btnListener;

	/**
	 * Constructor that initializes the panel, with all its components. The
	 * constructor also connects this instance to the given instance of the
	 * controller.
	 *
	 * @param controller
	 *            The controller that will control this instance.
	 */
	public Test1UI(ArrayController controller) {
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

		add(arrayContainer, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.EAST);

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

	/**
	 * Updates all the information presented in the window to the information stored
	 * in the given arrays.
	 *
	 * @param boxArray
	 *            The array to set the information in the labelArray in the window.
	 * @param row
	 *            The array to set the information in the rowTextField in the
	 *            window.
	 * @param column
	 *            The array to set the information in the columnTextField in the
	 *            window.
	 */
	public void updateView(int[][] boxArray, int[] row, int[] column) {
		for (int i = 0; i < STANDARD_ARRAY_LENGTH; i++) {
			columnTextField[i].setText(column[i] + "");
			rowTextField[i].setText(row[i] + "");
			for (int j = 0; j < STANDARD_ARRAY_LENGTH; j++) {
				labelArray[i][j].setText(boxArray[i][j] + "");
			}
		}
	}

	/**
	 * Returns the number presented on the chosen JLabel in the labelArray in the
	 * window.
	 *
	 * @param row
	 *            The row in the labelArray
	 * @param column
	 *            The column in the labelArray
	 * @return The number presented on the JLabel
	 */
	public int getlblArrayElement(int row, int column) {
		int res = 0;
		try {
			res = Integer.parseInt(labelArray[row][column].getText());
		} catch (NumberFormatException e) {
			System.out.println("Fel");
		}
		return res;
	}

	/**
	 * @return The number in the rowTextFieldControl.
	 */
	public int getRowTextFieldControl() {
		return Integer.parseInt(rowTextFieldControl.getText());
	}

	/**
	 * @return The number in the columnTextFieldControl.
	 */
	public int getColumnTextFieldControl() {
		return Integer.parseInt(columnTextFieldControl.getText());
	}

	/**
	 * @return The numbers in the columnTextFieldArray, stored in an {@code Array7}
	 *         object.
	 */
	public Array7 getColumnTextFieldArray() {
		Array7 array = new Array7();
		for (int i = 0; i < STANDARD_ARRAY_LENGTH; i++) {
			int nbr = Integer.parseInt(columnTextField[i].getText());
			array.setElement(i, nbr);
		}

		return array;
	}

	/**
	 * @return The numbers in the rowTextFieldArray, stored in an {@code Array7}.
	 */
	public Array7 getRowTextFieldArray() {
		Array7 array = new Array7();
		for (int i = 0; i < STANDARD_ARRAY_LENGTH; i++) {
			int nbr = Integer.parseInt(rowTextField[i].getText());
			array.setElement(i, nbr);
		}

		return array;
	}

	/**
	 * Class that implements the interface ActionListener. This class can listen to
	 * the buttons from the {@code Test1UIAlternativ} and call on different methods
	 * in the controller class based on which button has been pushed.
	 *
	 * @author Tim Normark
	 */
	private class BtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnReadRow) {
				controller.readRow();

			} else if (e.getSource() == btnWriteRow) {
				controller.writeRow();

			} else if (e.getSource() == btnReadColumn) {
				controller.readColumn();

			} else if (e.getSource() == btnWriteColumn) {
				controller.writeColumn();
			}
		}

	}
}
