package com.springboard.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import com.springboard.dao.specs.DeviceDAO;
import com.springboard.entities.Device;

@Component
public class DeviceDAOImpl extends GenericDAOImpl<Device, Long> implements DeviceDAO {
	
	@Override
	public Device findByUniqueIdentifier(String uniqueIdentifier) {
		String hql = "SELECT device FROM Device AS device WHERE device.uniqueIdentifier = :uniqueIdentifier";
		Query query = getSession().createQuery(hql).setParameter("uniqueIdentifier", uniqueIdentifier);
		return findOne(query);
	}
	
	@Override
	public List<Device> findDevicesByType(String type) {
		String hql = "SELECT device FROM Device as device WHERE device.type = :type";
		Query query = getSession().createQuery(hql).setParameter("type", type);
		return findMany(query);
	}
	
}
