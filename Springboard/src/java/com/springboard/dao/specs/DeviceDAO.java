package com.springboard.dao.specs;

import com.springboard.entities.Device;

public interface DeviceDAO extends GenericDAO<Device, Long> {
	
	public Device findByUniqueId(String uniqueId);
	
}
