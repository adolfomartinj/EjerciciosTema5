package es.studium.Ejercicios;

import java.awt.FlowLayout;

import java.awt.Frame;

import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;

import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;

import java.awt.List;

public class Ejercicio7 implements WindowListener, ItemListener

{

	Frame ventana = new Frame("Baloncesto");

// Creacióndeunalistacon 5 elementosvisibles y que no

// permitemultiselección

	List lisEquipos = new List(5, true);

	String[] Equipos =
	{ "Seleccione un equipo", "Real Madrid", "Barça",

			"Iberoestar Tenerife", "TD Systems Baskonia", "Hereda San Pablo Burgos",

			"Valencia Basket", "Club Joventut de Badalona", "Unicaja", "UCAM Murcia", "Baxi Manresa",
			"MoraBanc Andorra", "Herbalife Gran Canaria", "Monbus Obradoiro",

			"Movistar Estudiantes", "Casademont Zaragoza", "Urbas Fuenlabrada", "Coosur Real Betis",
			"RETAbet Bilbao Basket", "Acunsa Gipuzkoa Basket" };

	String[] ciudades =
	{ "No ha elegido ningún equipo", "Madrid", "Barcelona", "Tenerife", "Vitoria", "Burgos", "Valencia", "Badalona",
			"Málaga", "Murcia", "Manresa", "Andorra", "Gran Canaria", "Santiago de Compostela", "Madrid", "Zaragoza",
			"Fuenlabrada", "Sevilla", "Bilbao", "Guipuzcoa" };

	public Ejercicio7()

	{

		ventana.setLayout(new FlowLayout());

		for (String equipo : Equipos)

		{

			lisEquipos.add(equipo);

		}

		ventana.add(lisEquipos);

		ventana.addWindowListener(this);

		lisEquipos.addItemListener(this);

		ventana.setResizable(false);

		ventana.setLocationRelativeTo(null);

		ventana.setSize(250, 250);

		ventana.setVisible(true);

	}

	public static void main(String[] args)

	{

		new Ejercicio7();

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

	public void itemStateChanged(ItemEvent ie)

	{

// Sin multiselección

// String ciudad = new String();

// ciudad = ciudades[lisEquipos.getSelectedIndex()];

// System.out.println(ciudad);

// Conmultiselección

		int[] ciudadesElegidas = lisEquipos.getSelectedIndexes();

		for (int ciudadElegida : ciudadesElegidas)

		{

			System.out.println(ciudades[ciudadElegida]);

		}

	}

}