package com.drn.drn_mng.jpa.dao;

import com.drn.drn_mng.dto.StatusDrn;

public record StatusDrnList(double longitutde, double latitude) {
	
	public StatusDrnList(statusDrone st) {
		this(st.longitude,st.latitude);
	}
	//public StatusDrnList() {
	//}
}
