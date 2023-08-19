package conversorONE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JComboBox<?> opciones;
	private JButton convertir;
	private JButton salir;
	private JLabel lblNewLabel_1;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
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
	public Conversor() {
		setTitle("ConversorONE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor Divisas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(76, 59, 122, 14);
		contentPane.add(lblNewLabel);
		
		opciones = new JComboBox();
		opciones.setModel(new DefaultComboBoxModel(new String[] {"Colones a Dolares", "Dolares a Colones", "Colones a Euros", "Euros a Colones", "Colones a Libras", "Libras a Colones", "Colones a Yen", "Yen a Colones", "Colones a Won", "Won a Colones", "salir"}));
		opciones.setBounds(76, 101, 176, 22);
		contentPane.add(opciones);
		
		lblNewLabel_1 = new JLabel("Ingrese un monto");
		lblNewLabel_1.setBounds(76, 148, 176, 14);
		contentPane.add(lblNewLabel_1);
		
		valor = new JTextField();
		valor.setBounds(262, 145, 86, 20);
		contentPane.add(valor);
		valor.setColumns(10);
		
		convertir = new JButton("Convertir");
		convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor2 = valor.getText();
				double valorNum = Double.parseDouble(valor2);
				
				double dolar=547;
				double euro=588.21;
				double libra=681.63;
				double yen=0.27;
				double won=2.48;				
				double resultadoFinal=0;
				
				
				DecimalFormat formatear = new DecimalFormat("0.00");
				if(opciones.getSelectedIndex()==0) {
					resultadoFinal = (valorNum/dolar);
					resultado.setText("Resultado es: " + formatear.format(resultadoFinal));
				}
				else if(opciones.getSelectedIndex()==1) {
					resultadoFinal = (valorNum*dolar);
					resultado.setText("Resultado es: " + formatear.format(resultadoFinal));
				}
				else if(opciones.getSelectedIndex()==2) {
					resultadoFinal = (valorNum/euro);
					resultado.setText("Resultado es: " + formatear.format(resultadoFinal));
				}
				else if(opciones.getSelectedIndex()==3) {
					resultadoFinal = (valorNum*euro);
					resultado.setText("Resultado es: " + formatear.format(resultadoFinal));
				}
				else if(opciones.getSelectedIndex()==4) {
					resultadoFinal = (valorNum/libra);
					resultado.setText("Resultado es: " + formatear.format(resultadoFinal));
				}
				else if(opciones.getSelectedIndex()==5) {
					resultadoFinal = (valorNum*libra);
					resultado.setText("Resultado es: " + formatear.format(resultadoFinal));
				}
				else if(opciones.getSelectedIndex()==6) {
					resultadoFinal = (valorNum*yen);
					resultado.setText("Resultado es: " + formatear.format(resultadoFinal));
				}
				else if(opciones.getSelectedIndex()==7) {
					resultadoFinal = (valorNum/yen);
					resultado.setText("Resultado es: " + formatear.format(resultadoFinal));
				}
				else if(opciones.getSelectedIndex()==8) {
					resultadoFinal = (valorNum*won);
					resultado.setText("Resultado es: " + formatear.format(resultadoFinal));
				}
				else if(opciones.getSelectedIndex()==9) {
					resultadoFinal = (valorNum/won);
					resultado.setText("Resultado es: " + formatear.format(resultadoFinal));
				}
				
			}
	});
		convertir.setFont(new Font("Tahoma", Font.BOLD, 14));
		convertir.setBounds(81, 203, 117, 23);
		contentPane.add(convertir);
		
		salir = new JButton("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		salir.setFont(new Font("Tahoma", Font.BOLD, 14));
		salir.setBounds(190, 265, 89, 23);
		contentPane.add(salir);
		
		resultado = new JTextField();
		resultado.setText("0");
		resultado.setBounds(262, 206, 215, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
	}
	//hola
}
