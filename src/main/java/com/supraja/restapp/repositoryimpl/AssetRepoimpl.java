package com.supraja.restapp.repositoryimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.supraja.restapp.model.Asset;
import com.supraja.restapp.repository.AssetRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
@Transactional
public class AssetRepoimpl implements AssetRepo {
	
	EntityManager entityManager;
	
    //constructor using fields
	public AssetRepoimpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Integer> getIDList() {
		String jpql="Select a.aid from Asset a";
		TypedQuery<Integer> query = entityManager.createQuery(jpql,Integer.class);
		return query.getResultList();
	}

	@Override
	public void save(Asset asset) {
		
		entityManager.merge(asset);
	}

	@Override
	public List<Asset> findAll() {
		String jpql="From Asset";
		TypedQuery<Asset> query = entityManager.createQuery(jpql,Asset.class);
		return query.getResultList();
	}

	@Override
	public void deleteById(int aid) {
		String jpql="delete from Asset where aid=" +aid;
		entityManager.createQuery(jpql).executeUpdate();
	}

	@Override
	public Asset findById(int aid) {
		return entityManager.find(Asset.class, aid);
	}

}
