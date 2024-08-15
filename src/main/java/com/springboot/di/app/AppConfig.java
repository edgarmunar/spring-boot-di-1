package com.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springboot.di.app.models.domine.ItemFactura;
import com.springboot.di.app.models.domine.Producto;
import com.springboot.di.app.models.service.IServicio;
import com.springboot.di.app.models.service.MiServicio;
import com.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	
	@Bean("MiServicioSimple")
	@Primary
	public IServicio registrarMiservicioSimple() {
		
		return new MiServicio();
	}
	
	@Bean("MiServicioComplejo")
	public IServicio registrarMiservicioComplejo() {
		
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFacturas")
	public List<ItemFactura> registrarItemsfacturas(){
		
		Producto producto1 = new Producto("Camara Sony",25000);
		Producto producto2 = new Producto("Portail HP",1556000);

		ItemFactura linea1 = new ItemFactura(producto1, 5);
		ItemFactura linea2 = new ItemFactura(producto2, 3);
		
		return Arrays.asList(linea1,linea2);		
	}
	
	@Bean("itemsFacturasOficina")
	@Primary
	public List<ItemFactura> registrarItemsfacturasOficina(){
		
		Producto producto1 = new Producto("Monitor LG",300000);
		Producto producto2 = new Producto("NoteBook ASUS",2350000);
		Producto producto3 = new Producto("Impresora HP",500000);
		Producto producto4 = new Producto("Escritorio oficina",800000);

		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 3);
		ItemFactura linea3 = new ItemFactura(producto3, 6);
		ItemFactura linea4 = new ItemFactura(producto4, 9);
		
		return Arrays.asList(linea1,linea2,linea3,linea4);		
	}
}