package in.bushansirgur.springboot.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.bushansirgur.springboot.entity.Laptop;
import in.bushansirgur.springboot.repos.LaptopRepository;

@RestController
public class LaptopController {
	
	@Autowired
	LaptopRepository lRepo;
	
	@GetMapping("/laptops/name")
	public ResponseEntity<List<Laptop>> getLaptopsByName (@RequestParam String name) {
		return new ResponseEntity<List<Laptop>>(lRepo.findByName(name), HttpStatus.OK);
	}
	
	@GetMapping("/laptops/brand")
	public ResponseEntity<List<Laptop>> getLaptopsByBrand (@RequestParam String brand) {
		return new ResponseEntity<List<Laptop>>(lRepo.findByBrand(brand), HttpStatus.OK);
	}
	
	@GetMapping("/laptops/price")
	public ResponseEntity<List<Laptop>> getLaptopsByPrice (@RequestParam BigDecimal price) {
		return new ResponseEntity<List<Laptop>>(lRepo.findByPrice(price), HttpStatus.OK);
	}
	
}
















