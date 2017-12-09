package p6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Test2UI extends JPanel implements ActionListener {
	private Controller controller;
	private JLabel[][] labelArray;
	private JTextField[] leftColumn;
	private JTextField[] rightColumn;
	private JButton btnLeft = new JButton("Flytta vänster");
	private JButton btnRight = new JButton("Flytta Höger");

	public Test2UI() {
		// this.controller = controller;
		// controller.setUI(this);
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

		this.add(leftColumnPanel, BorderLayout.WEST);
		this.add(labelPanel);
		this.add(rightColumnPanel, BorderLayout.EAST);
		this.add(btnPanel, BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO: Write action management.
	}

	private void addLabelsToArray() {
		for (int row = 0; row < labelArray.length; row++) {
			for (int col = 0; col < labelArray[row].length; col++) {
				labelArray[row][col] = new JLabel("0", SwingConstants.CENTER);
			}
		}
	}

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

	private void addColumnsToPanel(JTextField[] column, JPanel panel) {
		for (int i = 0; i < column.length; i++) {
			panel.add(column[i]);
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("test");
		frame.setDefaultCloseOperation(3);
		frame.add(new Test2UI());
		frame.pack();
		frame.setVisible(true);
	}

}
