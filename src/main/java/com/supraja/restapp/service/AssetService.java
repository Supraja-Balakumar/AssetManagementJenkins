package com.supraja.restapp.service;

import java.util.List;

import com.supraja.restapp.model.Asset;

public interface AssetService {
	public String addAsset(Asset asset);

	public Asset getAsset(int id);

	public List<Asset> getAllAsset();

	public void updateAsset(Asset asset);

	public void deleteAsset(int id);

}
