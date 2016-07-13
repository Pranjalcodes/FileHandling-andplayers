import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class OPENRENAME extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					OPENRENAME frame = new OPENRENAME();
					frame.setVisible(true);
			}

	/**
	 * Create the frame.
	 */
	public OPENRENAME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnRenameTheFile = new JButton("Rename the file");
		btnRenameTheFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				int result = fileChooser.showOpenDialog(getParent());
				if (result == JFileChooser.APPROVE_OPTION) {
				    File selectedFile = fileChooser.getSelectedFile();
				    //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
				String fname=selectedFile.getName();
				JOptionPane.showMessageDialog(null, "Now insert the file name in  the text box", fname, result);
				String val=textField.getText();
				//fname.renameTo(new File("xyz.txt"));
				}
			
			}
		});
		btnRenameTheFile.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRenameTheFile.setBounds(236, 471, 183, 23);
		contentPane.add(btnRenameTheFile);
		
		JFileChooser JFileChooser = new JFileChooser();
		JFileChooser.setBounds(0, 0, 582, 397);
		contentPane.add(JFileChooser);
		
		textField = new JTextField();
		textField.setBounds(236, 440, 183, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTypeHereThe = new JLabel("Type here the new Name");
		lblTypeHereThe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTypeHereThe.setBounds(236, 408, 181, 14);
		contentPane.add(lblTypeHereThe);
	}
}
