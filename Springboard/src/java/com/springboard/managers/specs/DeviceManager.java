package com.springboard.managers.specs;

import java.util.List;

import com.springboard.entities.Device;

public interface DeviceManager {
	
	public Device findByUniqueIdentifier(String uniqueIdentifier);
	
	public List<Device> loadAllDevices();
	
	public List<Device> findByType(String type);
	
	public void saveNewDevice(Device device);
	
	public Device findDeviceById(Long id);
	
	public void deleteDevice(Device device);

}
