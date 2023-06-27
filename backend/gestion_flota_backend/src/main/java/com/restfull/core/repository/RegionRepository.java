package com.restfull.core.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restfull.core.entities.Region;
import com.restfull.core.services.IRegionService;

import jakarta.transaction.Transactional;

@Repository
public class RegionRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	IRegionService regionService;
	
	@Transactional
	public Region crearRegion(Region newRegion) {
		Region region = newRegion;
		try {
			regionService.save(region);			
		} catch (Exception e) {
			region = null;
		}
		return newRegion;
	}


	public List<Region> getAllRegions() {
		String sql = "select id_region\r\n"
				+ "from region;";
		List<Region> regionList = new ArrayList<Region>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Region region = new Region();
			Long region_id = ((Number)row.get("id_region")).longValue();
			region.setIdRegion((int)region_id.intValue());
			regionList.add(region);
		});
		return regionList;
	}

	public List<Region> getRegionById(Long id) {
		String sql = "select id_region\r\n"
				+ "from region where id_region = "+id+" ;";
		List<Region> regionList = new ArrayList<Region>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		rows.forEach(row -> {
			Region region = new Region();
			Long region_id = ((Number)row.get("id_region")).longValue();
			region.setIdRegion((int)region_id.intValue());
			regionList.add(region);
		});
		return regionList;
	}


}
