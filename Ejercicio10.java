package es.studium.Ejercicios;

import java.awt.Button;

import java.awt.Dialog;

import java.awt.FlowLayout;

import java.awt.Frame;

import java.awt.GridLayout;

import java.awt.Label;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;

public class Ejercicio10 implements WindowListener, ActionListener

{

	Frame ventana = new Frame("3 en Raya");

	Button btnUno = new Button("");

	Button btnDos = new Button("");

	Button btnTres = new Button("");

	Button btnCuatro = new Button("");

	Button btnCinco = new Button("");

	Button btnSeis = new Button("");

	Button btnSiete = new Button("");

	Button btnOcho = new Button("");

	Button btnNueve = new Button("");

	Dialog dlgMensaje = new Dialog(ventana, "Mensaje", true);

	Label lblMensaje = new Label(" ");

	int turno = 0; // 0 --> O, 1 --> X

	int contador = 0;

	boolean fin = false;

	public Ejercicio10()

	{

		ventana.setLayout(new GridLayout(3, 3));

		ventana.addWindowListener(this);

		dlgMensaje.addWindowListener(this);

		btnUno.addActionListener(this);

		ventana.add(btnUno);

		btnDos.addActionListener(this);

		ventana.add(btnDos);

		btnTres.addActionListener(this);

		ventana.add(btnTres);

		btnCuatro.addActionListener(this);

		ventana.add(btnCuatro);

		btnCinco.addActionListener(this);

		ventana.add(btnCinco);

		btnSeis.addActionListener(this);

		ventana.add(btnSeis);

		btnSiete.addActionListener(this);

		ventana.add(btnSiete);

		btnOcho.addActionListener(this);

		ventana.add(btnOcho);

		btnNueve.addActionListener(this);

		ventana.add(btnNueve);

		ventana.setSize(350, 320);

		ventana.setLocationRelativeTo(null);

		ventana.setResizable(false);

		ventana.setVisible(true);

	}

	public static void main(String[] args)

	{

		new Ejercicio10();

	}

	@Override

	public void windowOpened(WindowEvent e)
	{
	}

	@Override

	public void windowClosing(WindowEvent e)

	{

		if (dlgMensaje.isActive())

		{

			dlgMensaje.setVisible(false);

// Reset paracomenzar a jugardenuevo

			reset();

		}

		else

		{

			System.exit(0);

		}

	}

	private void reset()

	{

// Ponerlosbotonesen "blanco"

		btnUno.setLabel("");

		btnDos.setLabel("");

		btnTres.setLabel("");

		btnCuatro.setLabel("");

		btnCinco.setLabel("");

		btnSeis.setLabel("");

		btnSiete.setLabel("");

		btnOcho.setLabel("");

		btnNueve.setLabel("");

// Contador a 0

		contador = 0;

// La variable fin

		fin = false;

// La variable turno

		turno = 0;

		btnUno.removeActionListener(this);

		btnDos.removeActionListener(this);

		btnTres.removeActionListener(this);

		btnCuatro.removeActionListener(this);

		btnCinco.removeActionListener(this);

		btnSeis.removeActionListener(this);

		btnSiete.removeActionListener(this);

		btnOcho.removeActionListener(this);

		btnNueve.removeActionListener(this);

// Añadirdenuevolos Listeners a losbotones

		btnUno.addActionListener(this);

		btnDos.addActionListener(this);

		btnTres.addActionListener(this);

		btnCuatro.addActionListener(this);

		btnCinco.addActionListener(this);

		btnSeis.addActionListener(this);

		btnSiete.addActionListener(this);

		btnOcho.addActionListener(this);

		btnNueve.addActionListener(this);

	}

	@Override

	public void windowClosed(WindowEvent e)
	{
	}

	@Override

	public void windowIconified(WindowEvent e)
	{
	}

	@Override

	public void windowDeiconified(WindowEvent e)
	{
	}

	@Override

	public void windowActivated(WindowEvent e)
	{
	}

	@Override

	public void windowDeactivated(WindowEvent e)
	{
	}

	@Override

	public void actionPerformed(ActionEvent evento)

	{

		if (btnUno.equals(evento.getSource()))

		{

			if (turno == 0)

			{

				btnUno.setLabel("O");

				turno = 1;

			}

			else // Estoyen el Turno 1

			{

				btnUno.setLabel("X");

				turno = 0;

			}

			btnUno.removeActionListener(this);

		}

		else if (btnDos.equals(evento.getSource()))

		{

			if (turno == 0)

			{

				btnDos.setLabel("O");

				turno = 1;

			}

			else

			{

				btnDos.setLabel("X");

				turno = 0;

			}

			btnDos.removeActionListener(this);

		}

		else if (btnTres.equals(evento.getSource()))

		{

			if (turno == 0)

			{

				btnTres.setLabel("O");

				turno = 1;

			}

			else

			{

				btnTres.setLabel("X");

				turno = 0;

			}

			btnTres.removeActionListener(this);

		}

		else if (btnCuatro.equals(evento.getSource()))

		{

			if (turno == 0)

			{

				btnCuatro.setLabel("O");

				turno = 1;

			}

			else

			{

				btnCuatro.setLabel("X");

				turno = 0;

			}

			btnCuatro.removeActionListener(this);

		}

		else if (btnCinco.equals(evento.getSource()))

		{

			if (turno == 0)

			{

				btnCinco.setLabel("O");

				turno = 1;

			}

			else

			{

				btnCinco.setLabel("X");

				turno = 0;

			}

			btnCinco.removeActionListener(this);

		}

		else if (btnSeis.equals(evento.getSource()))

		{

			if (turno == 0)

			{

				btnSeis.setLabel("O");

				turno = 1;

			}

			else

			{

				btnSeis.setLabel("X");

				turno = 0;

			}

			btnSeis.removeActionListener(this);

		}

		else if (btnSiete.equals(evento.getSource()))

		{

			if (turno == 0)

			{

				btnSiete.setLabel("O");

				turno = 1;

			}

			else

			{

				btnSiete.setLabel("X");

				turno = 0;

			}

			btnSiete.removeActionListener(this);

		}

		else if (btnOcho.equals(evento.getSource()))

		{

			if (turno == 0)

			{

				btnOcho.setLabel("O");

				turno = 1;

			}

			else

			{

				btnOcho.setLabel("X");

				turno = 0;

			}

			btnOcho.removeActionListener(this);

		}

		else if (btnNueve.equals(evento.getSource()))

		{

			if (turno == 0)

			{

				btnNueve.setLabel("O");

				turno = 1;

			}

			else

			{

				btnNueve.setLabel("X");

				turno = 0;

			}

			btnNueve.removeActionListener(this);

		}

		contador++;

// Comprobarsi hay 3 enraya

// Sicontador = 9, Empate

		comprobar();

	}

	private void comprobar()

	{

		if ((btnUno.getLabel() == btnDos.getLabel()) && (btnDos.getLabel() == btnTres.getLabel())
				&& (!btnUno.getLabel().equals(""))) // Fila 1

		{

			lblMensaje.setText("Ha ganado " + btnUno.getLabel());

			fin = true;

		}

		else if ((btnCuatro.getLabel() == btnCinco.getLabel()) && (btnCinco.getLabel() == btnSeis.getLabel())
				&& (!btnCuatro.getLabel().equals(""))) // Fila 2

		{

			lblMensaje.setText("Ha ganado " + btnCuatro.getLabel());

			fin = true;

		}

		else if ((btnSiete.getLabel() == btnOcho.getLabel()) && (btnOcho.getLabel() == btnNueve.getLabel())
				&& (!btnSiete.getLabel().equals(""))) // Fila 3

		{

			lblMensaje.setText("Ha ganado " + btnSiete.getLabel());

			fin = true;

		}

		else if ((btnUno.getLabel() == btnCuatro.getLabel()) && (btnCuatro.getLabel() == btnSiete.getLabel())
				&& (!btnUno.getLabel().equals(""))) // Columna 1

		{

			lblMensaje.setText("Ha ganado " + btnUno.getLabel());

			fin = true;

		}

		else if ((btnDos.getLabel() == btnCinco.getLabel()) && (btnCinco.getLabel() == btnOcho.getLabel())
				&& (!btnDos.getLabel().equals(""))) // Columna 2

		{

			lblMensaje.setText("Ha ganado " + btnDos.getLabel());

			fin = true;

		}

		else if ((btnTres.getLabel() == btnSeis.getLabel()) && (btnSeis.getLabel() == btnNueve.getLabel())
				&& (!btnTres.getLabel().equals(""))) // Columna 3

		{

			lblMensaje.setText("Ha ganado " + btnTres.getLabel());

			fin = true;

		}

		else if ((btnUno.getLabel() == btnCinco.getLabel()) && (btnCinco.getLabel() == btnNueve.getLabel())
				&& (!btnUno.getLabel().equals(""))) // Diagonal 1

		{

			lblMensaje.setText("Ha ganado " + btnUno.getLabel());

			fin = true;

		}

		else if ((btnTres.getLabel() == btnCinco.getLabel()) && (btnCinco.getLabel() == btnSiete.getLabel())
				&& (!btnTres.getLabel().equals(""))) // Diagonal 2

		{

			lblMensaje.setText("Ha ganado " + btnTres.getLabel());

			fin = true;

		}

		else if (contador == 9)

		{

			lblMensaje.setText("Empate");

			fin = true;

		}

		if (fin == true)

		{

			dlgMensaje.setLayout(new FlowLayout());

			dlgMensaje.addWindowListener(this);

			dlgMensaje.setSize(150, 100);

			dlgMensaje.setLocationRelativeTo(null);

			dlgMensaje.setResizable(false);

			dlgMensaje.add(lblMensaje);

			dlgMensaje.setVisible(true);

		}

	}

}