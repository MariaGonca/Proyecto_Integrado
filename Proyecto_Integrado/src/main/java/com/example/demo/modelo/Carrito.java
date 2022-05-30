package com.example.demo.modelo;

import java.util.List;

public class Carrito {

	private List<Producto> item;

	public List<Producto> getItem() {
		return item;
	}

	public void setItem(List<Producto> item) {
		this.item = item;
	}

	public Carrito(List<Producto> item) {
		super();
		this.item = item;
	}


	public Carrito() {
		
	}
}
