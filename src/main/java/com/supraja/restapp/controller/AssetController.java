package com.supraja.restapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supraja.restapp.model.Asset;
import com.supraja.restapp.serviceimpl.AssetServiceImpl;

@RestController
@RequestMapping("/asset")
@CrossOrigin("*")
public class AssetController {
	
	public AssetController(AssetServiceImpl service) {
		super();
		this.service = service;
	}

	AssetServiceImpl service;

	@PostMapping
	public String insertAsset(@RequestBody Asset asset) {
		String msg = "";
		try {
			service.addAsset(asset);
			msg = "Successfull";
		} catch (Exception e) {
			msg = "Failure";
		}

		return msg;
	}

	@GetMapping("{id}")
	public Asset getAssetbyId(@PathVariable("id") int id) {
		return service.getAsset(id);
	}

	@GetMapping("/all")
	public List<Asset> getAsset() {
		return service.getAllAsset();
	}

	@PutMapping
	public String updateAsset(@RequestBody Asset asset) {
		String msg = "";
		try {
			service.updateAsset(asset);
			msg = " Update Success";
		} catch (Exception e) {
			msg = "Failure update";
		}

		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteAsset(@PathVariable int id) {
		String msg = "";
		try {
			service.deleteAsset(id);
			msg = "Deletion Success";
		} catch (Exception e) {
			msg = " Deletion Failure";
		}

		return msg;
	}

	@GetMapping("/idlist")
	public List<Integer> getIDList() {
		return service.getAllId();
	}
}
