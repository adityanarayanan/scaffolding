package com.springboard.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.springboard.dao.specs.DeviceDAO;
import com.springboard.entities.Device;

public class DeviceDAOImpl extends GenericDAOImpl<Device, Long> implements DeviceDAO {
	
	@Override
	public Device findByUniqueId(String uniqueId) {
		String hql = "SELECT device FROM Device AS device WHERE device.uniqueId = :uniqueId";
		Query query = getSession().createQuery(hql).setParameter("uniqueId", uniqueId);
		return findOne(query);
	}
	
	@Override
	public List<Device> findDevicesByType(String type) {
		String hql = "SELECT device FROM Device as device WHERE device.type = :type";
		Query query = getSession().createQuery(hql).setParameter("type", type);
		return findMany(query);
	}
	
}
