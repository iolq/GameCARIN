
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@RestController
public class DemoApplication {
	private BufferedImage img;
	private int AntiBodyCost=2500;
	private int AntiBodyCostP=2500;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

		return String.format("App %s",name);
	}

	@GetMapping("/app")
	public String app(@RequestParam(value = "name", defaultValue = "Data") String name) {

		return String.format("App %s!   Cost %s / %s", name,AntiBodyCostP,AntiBodyCost);
	}

	public void Run(){
		ImportImg();

	}

	private void ImportImg() {
		InputStream stream = getClass().getResourceAsStream("/img/thump.jpg");
		try {
			img = ImageIO.read(stream);
		} catch (IOException e) {
		}
	}
}
            