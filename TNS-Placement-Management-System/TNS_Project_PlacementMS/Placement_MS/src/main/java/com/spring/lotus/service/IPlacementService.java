package com.spring.lotus.service;

import java.util.List;

import com.spring.lotus.entity.Placement;

public interface IPlacementService {

	List<Placement> getAllPlacements();
	Placement getPlacementById(Long id);
	void addPlacement(Placement p);
	void deletePlacement(Long id);
	void updatePlacement(Long id, Placement p);
}
