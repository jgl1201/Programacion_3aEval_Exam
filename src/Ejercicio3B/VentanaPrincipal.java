package Ejercicio3B;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame implements ActionListener {
	private Container contenedor;
	private JLabel cantidad, fin;
	private JTextField campoCantidad;
	private JButton aEuros, aLibras;

	public double euroALibra(double cantidad) {
		return cantidad * 0.86d;
	}

	public double libraAEuro(double cantidad) {
		return cantidad * 1.1627d;
	}

	public VentanaPrincipal() {
		inicio();
		setTitle("Conversion");
		setSize(400, 210);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);

		cantidad = new JLabel();
		cantidad.setText("Cantidad: ");
		cantidad.setBounds(20, 20, 135, 23);

		campoCantidad = new JTextField();
		campoCantidad.setBounds(100, 20, 135, 23);

		aEuros = new JButton();
		aEuros.setText("A EUROS");
		aEuros.setBounds(10, 50, 135, 23);
		aEuros.addActionListener(this);

		aLibras = new JButton();
		aLibras.setText("A LIBRAS");
		aLibras.setBounds(160, 50, 135, 23);
		aLibras.addActionListener(this);

		fin = new JLabel();
		fin.setText("Final:");
		fin.setBounds(20, 100, 135, 23);
		;

		contenedor.add(cantidad);
		contenedor.add(campoCantidad);
		contenedor.add(aLibras);
		contenedor.add(aEuros);
		contenedor.add(fin);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double cantidadF = 0;
		boolean error = false;
		
		try {
			if (e.getSource() == aEuros) {
				cantidadF = Double.parseDouble(campoCantidad.getText());
				fin.setText(String.format("%f", libraAEuro(cantidadF)));
			} else if (e.getSource() == aLibras) {
				cantidadF = Double.parseDouble(campoCantidad.getText());
				fin.setText(String.format("%f", euroALibra(cantidadF)));
			} else
				fin.setText("Cantidad no valida");
		} catch (Exception ex) {
			error = true;
		} finally {
			if (error) JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
