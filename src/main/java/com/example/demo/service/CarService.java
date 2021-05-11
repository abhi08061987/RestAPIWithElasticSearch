package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Car;

public interface CarService {

		List<String> BRANDS = List.of("Toyta","Maruti","Hundai");
		List<String> COLORS = List.of("Red","blue","green");
		List<String> TYPES = List.of("SEDAN","SUV","MPV");
		
		Car generateCar();
}
