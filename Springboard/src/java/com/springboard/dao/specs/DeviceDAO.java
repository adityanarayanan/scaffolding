package com.springboard.dao.specs;

import java.util.List;

import com.springboard.entities.Device;

public interface DeviceDAO extends GenericDAO<Device, Long> {
	
	public Device findByUniqueIdentifier(String uniqueIdentifier);
	
	public List<Device> findDevicesByType(String type);
	
}
