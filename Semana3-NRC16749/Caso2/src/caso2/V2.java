package caso2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class V2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtnum;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V2 frame = new V2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Ingrese nùmero");
			lblNewLabel.setBounds(20, 23, 133, 14);
			contentPane.add(lblNewLabel);
		}
		{
			txtnum = new JTextField();
			txtnum.setBounds(144, 20, 86, 20);
			contentPane.add(txtnum);
			txtnum.setColumns(10);
		}
		{
			btnNewButton = new JButton("Celcius a fahrenheit");
			btnNewButton.setBounds(187, 51, 214, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Kilometros a millas");
			btnNewButton_1.setBounds(187, 85, 214, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("segundos a minutos y segundos");
			btnNewButton_2.setBounds(187, 119, 214, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 214, 391, 146);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}

}
