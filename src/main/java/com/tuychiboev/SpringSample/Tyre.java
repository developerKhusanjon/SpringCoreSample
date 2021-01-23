package com.tuychiboev.SpringSample;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String style;

	public String getStyle() {
		return style;
	}

	public void setStyle(String brand) {
		this.style = brand;
	}
	
	public String toString() {
		return "Tyre";
		
	}
}
