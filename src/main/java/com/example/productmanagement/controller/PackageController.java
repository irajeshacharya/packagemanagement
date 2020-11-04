package com.example.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.productmanagement.document.PackagePOJO;
import com.example.productmanagement.document.Product;
import com.example.productmanagement.request.PackageRequest;
import com.example.productmanagement.request.ProductRequest;
import com.example.productmanagement.service.PackageService;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
@RestController
@RequestMapping(value = "api/v1/packages")
public class PackageController {
	@Autowired
	PackageService packageService;

	@PostMapping
	@ResponseBody
	public PackagePOJO createPackage(@RequestBody PackageRequest request) {
		return packageService.createPackage(request);
	}

	@GetMapping(value = "/{id}")
	@ResponseBody
	public PackagePOJO getPackage(@PathVariable("id") Integer id) {
		return packageService.getPackage(id);
	}

	@GetMapping
	@ResponseBody
	public List<PackagePOJO> getAllPackage() {
		return packageService.getAllPackage();
	}

	@PutMapping(value = "/{id}")
	@ResponseBody
	public PackagePOJO updatePackage(@PathVariable("id") Integer id, @RequestBody PackageRequest request) {
		return packageService.updatePackage(id, request);
	}

	@DeleteMapping(value = "/{id}")
	@ResponseBody
	public PackagePOJO deletePackage(@PathVariable("id") Integer id) {
		return packageService.deletePackage(id);
	}
}
