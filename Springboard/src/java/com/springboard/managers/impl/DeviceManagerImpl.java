package com.springboard.managers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.springboard.dao.specs.DeviceDAO;
import com.springboard.entities.Device;
import com.springboard.managers.specs.DeviceManager;

public class DeviceManagerImpl implements DeviceManager {
	
	@Autowired
	private DeviceDAO deviceDAO;
	
	@Transactional
	public Device findByUniqueIdentifier(String uniqueIdentifier) {
		return deviceDAO.findByUniqueIdentifier(uniqueIdentifier);
	}
	
	@Transactional
	public List<Device> loadAllDevices() {
		return deviceDAO.findAll(Device.class);
	}
	
	@Transactional
	public List<Device> findByType(String type) {
		return deviceDAO.findDevicesByType(type);
	}
	
	@Transactional
	public void saveNewDevice(Device device) {
		deviceDAO.save(device);
	}
	
	@Transactional
	public Device findDeviceById(Long id) {
		return deviceDAO.findById(Device.class, id);
	}
	
	@Transactional
	public void deleteDevice(Device device) {
		deviceDAO.delete(device);
	}

}
