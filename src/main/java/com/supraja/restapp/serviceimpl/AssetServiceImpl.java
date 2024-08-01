package com.supraja.restapp.serviceimpl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.supraja.restapp.model.Asset;
import com.supraja.restapp.repository.AssetRepo;

import com.supraja.restapp.service.AssetService;

@Service

public class AssetServiceImpl implements AssetService {

	public AssetServiceImpl(AssetRepo repo) {
		super();
		this.repo = repo;
	}

	AssetRepo repo;

	@Override
	public String addAsset(Asset asset) {
		repo.save(asset);
		return "AddSuccess";
	}

	
	@Override
	public Asset getAsset(int id) {
		Asset asset = repo.findById(id);
		
			return asset;

	}

	@Override
	public List<Asset> getAllAsset() {
		return repo.findAll();
	}

	@Override
	public void updateAsset(Asset asset) {

		repo.save(asset);
	}

	@Override
	public void deleteAsset(int id) {
		repo.deleteById(id);
	}

	public List<Integer> getAllId() {
		return repo.getIDList();
	}
}
