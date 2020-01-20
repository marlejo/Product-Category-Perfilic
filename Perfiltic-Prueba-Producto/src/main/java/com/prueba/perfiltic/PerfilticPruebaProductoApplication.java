package com.prueba.perfiltic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prueba.perfiltic.util.CurrencyApi;

@SpringBootApplication
public class PerfilticPruebaProductoApplication {
	
	private static CurrencyApi currencyApi = new CurrencyApi();

	public static void main(String[] args) {
		currencyApi.sendLiveRequest();
		SpringApplication.run(PerfilticPruebaProductoApplication.class, args);
	}

}
