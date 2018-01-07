package p6;

/**
 * A GUI class that shows an array7x7 with integer values on JLabels.
 * And two columns on each side of the 7x7 squares that enables the user to input his/hers own values and shifting them left or right.
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Test2UI extends JPanel {

	private static final long serialVersionUID = 1L;
	private Controller controller;
	private JLabel[][] labelArray;
	private JTextField[] leftColumn;
	private JTextField[] rightColumn;
	private JButton btnLeft = new JButton("Flytta vänster");
	private JButton btnRight = new JButton("Flytta Höger");
	private ButtonListener bl;

	/**
	 * Constructor that initializes the panel, with all its components. The
	 * constructor also connects this instance to the given instance of the
	 * controller.
	 *
	 * @param controller
	 *            The controller that will control this instance.
	 */
	public Test2UI(Controller arrayController) {
		this.controller = arrayController;
		arrayController.setUI(this);
		bl = new ButtonListener();
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(600, 500));
		JPanel labelPanel = new JPanel(new GridLayout(7, 7, 2, 2));
		JPanel leftColumnPanel = new JPanel(new GridLayout(7, 1, 20, 2));
		JPanel rightColumnPanel = new JPanel(new GridLayout(7, 1, 20, 2));
		JPanel btnPanel = new JPanel(new GridLayout(1, 3, 20, 20));

		labelArray = new JLabel[7][7];
		leftColumn = new JTextField[7];
		rightColumn = new JTextField[7];
		btnPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		leftColumnPanel.setBorder(new EmptyBorder(0, 20, 0, 20));
		rightColumnPanel.setBorder(new EmptyBorder(0, 20, 0, 20));

		addLabelsToArray();
		addLabelsToPanel(labelPanel);
		addTftoColumns();
		addColumnsToPanel(leftColumn, leftColumnPanel);
		addColumnsToPanel(rightColumn, rightColumnPanel);

		btnPanel.add(btnLeft);
		btnPanel.add(btnRight);

		btnLeft.addActionListener(bl);
		btnRight.addActionListener(bl);

		this.add(leftColumnPanel, BorderLayout.WEST);
		this.add(labelPanel);
		this.add(rightColumnPanel, BorderLayout.EAST);
		this.add(btnPanel, BorderLayout.SOUTH);

		arrayController.updateView();

	}

	/**
	 * Adds a new JLabel to every index in the labelArray.
	 */
	private void addLabelsToArray() {
		for (int row = 0; row < labelArray.length; row++) {
			for (int col = 0; col < labelArray[row].length; col++) {
				labelArray[row][col] = new JLabel("0", SwingConstants.CENTER);
			}
		}
	}

	/**
	 * Adds and initializes the labels to the panel.
	 */
	private void addLabelsToPanel(JPanel jPanel) {
		for (JLabel[] label : labelArray) {
			for (JLabel element : label) {
				element.setOpaque(true);
				element.setBackground(java.awt.Color.GRAY);
				element.setPreferredSize(new Dimension(20, 20));
				jPanel.add(element);
			}
		}
	}

	/**
	 * Adds textfield to the left- and right column.
	 */
	private void addTftoColumns() {
		for (int i = 0; i < leftColumn.length; i++) {
			leftColumn[i] = new JTextField("0");
			leftColumn[i].setPreferredSize(new Dimension(50, 20));
			leftColumn[i].setHorizontalAlignment(SwingConstants.CENTER);
			rightColumn[i] = new JTextField("0");
			rightColumn[i].setPreferredSize(new Dimension(50, 20));
			rightColumn[i].setHorizontalAlignment(SwingConstants.CENTER);
		}

	}

	/**
	 * Adds the column in the parameter to the panel in the parameter.
	 *
	 * @param column
	 *            The JTextField column array.
	 * @param panel
	 *            The JPanel.
	 */
	private void addColumnsToPanel(JTextField[] column, JPanel panel) {
		for (int i = 0; i < column.length; i++) {
			panel.add(column[i]);
		}
	}

	/**
	 * Updates the view of the panel by shifting in the values from one of the
	 * columns and shifting out the values to the other column.
	 *
	 * @param boardArray
	 *            The 7x7 integer array.
	 * @param leftColumn
	 *            The left column integer array.
	 * @param rightColumn
	 *            The right column integer array.
	 */
	public void updateView(int[][] boardArray, int[] leftColumn, int[] rightColumn) {
		for (int i = 0; i < 7; i++) {
			this.leftColumn[i].setText(leftColumn[i] + "");
			this.rightColumn[i].setText(rightColumn[i] + "");
			for (int j = 0; j < 7; j++) {
				labelArray[i][j].setText(boardArray[i][j] + "");
			}
		}
	}

	/**
	 * A private inner class that manages the button listener.
	 */
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnLeft) {
				controller.shiftLeft();
			}

			if (e.getSource() == btnRight) {
				controller.shiftRight();
			}
		}
	}

	/**
	 * Returns the number in the left column.
	 *
	 * @param nbr
	 *            The element in the column
	 *
	 * @return The number presented on the JLabel
	 */
	public String getLeftColumnNbr(int nbr) {
		return this.leftColumn[nbr].getText();
	}

	/**
	 * Returns the number in the right column.
	 *
	 * @param nbr
	 *            The element in the column
	 *
	 * @return The number presented on the JLabel
	 */
	public String getRightColumnNbr(int nbr) {
		return this.rightColumn[nbr].getText();
	}
}