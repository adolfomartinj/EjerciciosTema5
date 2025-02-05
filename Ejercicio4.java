package es.studium.Ejercicios;

import java.awt.BorderLayout;

import java.awt.Button;

import java.awt.Checkbox;

import java.awt.Frame;

import java.awt.Panel;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;

public class Ejercicio4 implements WindowListener, ActionListener

{

	Frame ventana = new Frame("Aficiones");

	Checkbox chkCorrer = new Checkbox("Correr");

	Checkbox chkNadar = new Checkbox("Nadar");

	Checkbox chkAndar = new Checkbox("Andar");

	Checkbox chkLeer = new Checkbox("Leer");

	Checkbox chkCine = new Checkbox("Ir al Cine");

	Checkbox chkBailar = new Checkbox("Bailar");

	Checkbox chkFutbol = new Checkbox("Fútbol");

	Checkbox chkTenis = new Checkbox("Tenis");

	Checkbox chkBaloncesto = new Checkbox("Baloncesto");

	Checkbox chkVela = new Checkbox("Deportes de Vela");

	Button btnComprobar = new Button("Comprobar");

	Panel panelAficiones = new Panel();

	Panel panelBoton = new Panel();

	String resultado = new String("");

	public Ejercicio4()

	{

		ventana.setLayout(new BorderLayout());

		panelAficiones.add(chkCorrer);

		panelAficiones.add(chkNadar);

		panelAficiones.add(chkAndar);

		panelAficiones.add(chkLeer);

		panelAficiones.add(chkCine);

		panelAficiones.add(chkBailar);

		panelAficiones.add(chkFutbol);

		panelAficiones.add(chkTenis);

		panelAficiones.add(chkBaloncesto);

		panelAficiones.add(chkVela);

		ventana.add("Center", panelAficiones);

		panelBoton.add(btnComprobar);

		ventana.add("South", panelBoton);

// Añadir el Listener albotón

		btnComprobar.addActionListener(this);

//Añadir el Listener a laventana

		ventana.addWindowListener(this);

		ventana.setLocationRelativeTo(null);

		ventana.setSize(350, 150);

		ventana.setVisible(true);

	}

	public static void main(String[] args)

	{

		new Ejercicio4();

	}

	public void windowActivated(WindowEvent we)
	{
	}

	public void windowClosed(WindowEvent we)
	{
	}

	public void windowClosing(WindowEvent we)

	{

		System.exit(0);

	}

	public void windowDeactivated(WindowEvent we)
	{
	}

	public void windowDeiconified(WindowEvent we)
	{
	}

	public void windowIconified(WindowEvent we)
	{
	}

	public void windowOpened(WindowEvent we)
	{
	}

	public void actionPerformed(ActionEvent evento)

	{

		if (evento.getSource().equals(btnComprobar))

		{

			resultado = "";

			if (chkCorrer.getState() == true)

			{

				resultado = resultado + "Correr\n";

			}

			if (chkNadar.getState()) // Igualque el anterior, máscompacto

			{

				resultado = resultado + "Nadar\n";

			}

			if (chkAndar.getState() == true)

			{

				resultado = resultado + "Andar\n";

			}

			if (chkLeer.getState() == true)

			{

				resultado = resultado + "Leer\n";

			}

			if (chkCine.getState() == true)

			{

				resultado = resultado + "Ir al Cine\n";

			}

			if (chkBailar.getState() == true)

			{

				resultado = resultado + "Bailar\n";

			}

			if (chkFutbol.getState() == true)

			{

				resultado = resultado + "Fútbol\n";

			}

			if (chkTenis.getState() == true)

			{

				resultado = resultado + "Tenis\n";

			}

			if (chkBaloncesto.getState() == true)

			{

				resultado = resultado + "Baloncesto\n";

			}

			if (chkVela.getState() == true)

			{

				resultado = resultado + "Deportes de vela\n";

			}

			System.out.println(resultado);

		}

	}

}