package com.supraja.restapp.repository;

import java.util.List;



import com.supraja.restapp.model.Asset;


public interface AssetRepo  {
	
	public List<Integer> getIDList();
    
	void save(Asset asset);
	
	List<Asset> findAll();
	
	void deleteById(int aid);
	
	Asset findById(int aid);
}
