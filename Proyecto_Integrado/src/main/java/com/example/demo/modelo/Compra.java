package com.example.demo.modelo;

import java.util.List;

public class Compra {

	private int id;
	private Cliente cliente;
	private int idPago;
	private String fecha;
	private double total;
	private String estado;
	
	private List<Carrito> detallecompras;
	
}
