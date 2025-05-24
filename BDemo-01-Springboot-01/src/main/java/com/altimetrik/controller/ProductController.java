package com.altimetrik.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.entity.Product;

@RestController
public class ProductController {

	ArrayList<Product> productList = new ArrayList<>();

	public ProductController() {
		productList.add(new Product(1, "Nokiya", 40000, "Good"));
		productList.add(new Product(2, "Google", 30000, "Best"));
		productList.add(new Product(3, "Samsung", 20000, "Good"));
		productList.add(new Product(4, "Motorola", 10000, "Okay"));
		System.out.println("Information Added");
	}

	@GetMapping("getAllProduct")
	public List<Product> getAllProduct() {
		return productList;
	}

	@GetMapping("getProductById/{id}")
	public Product getAllProduct(@PathVariable int id) {
		for (Product pro : productList) {
			if (pro.getProductId() == id) {
				return pro;
			}
		}
		return null;
	}

	@GetMapping("getProductByName/{name}")
	public Product getProductByName(@PathVariable String name) {
		for (Product pro : productList) {
			if (pro.getProductName().equalsIgnoreCase(name)) {
				return pro;
			}
		}
		return null;
	}

	@DeleteMapping("deleteProductById/{id}")
	public String deleteProductById(@PathVariable int id) {
		Iterator<Product> i = productList.iterator();
		while (i.hasNext()) {
			Product pro = i.next();
			if (pro.getProductId() == id) {
				i.remove();
				return "Product with ID " + id + " is deleted";
			}
		}
		return "Product with ID " + id + " is not found";
	}

	@DeleteMapping("deleteAllProducts")
	public String deleteAllProducts() {
		productList.removeAll(productList);
		return "All Products are deleted";
	}

	@GetMapping("getProductByPriceRange/{min}/{max}")
	public Product getProductByPriceRange(@PathVariable int min, @PathVariable int max) {
		for (Product pro : productList) {
			if (pro.getProductPrice() > min && pro.getProductPrice() < max) {
				return pro;
			}
		}
		return null;
	}

	@PutMapping("updateProduct/{id}")
	public String updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
		for (Product p : productList) {
			if (p.getProductId() == id) {
				p.setProductName(updatedProduct.getProductName());
				p.setProductPrice(updatedProduct.getProductPrice());
				p.setProductDesc(updatedProduct.getProductDesc());
				return "Product updated successfully";
			}
		}
		return "Product not found";
	}
}
