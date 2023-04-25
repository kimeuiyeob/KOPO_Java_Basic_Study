package kr.ac.kopo.ctc.kopo07.service;

import java.util.List;

import kr.ac.kopo.ctc.kopo07.domain.WifiItem;

public class WifiitemsService {

	// 위도 경도로 거리 계산
	public double getDistance(WifiItem k7_distance1, WifiItem k7_distance2) {

		double k7_mydistance1 = k7_distance1.getMyDistance1();
		double k7_mydistance2 = k7_distance1.getMyDistance2();
		double k7_target1 = k7_distance2.getLatitude();
		double k7_target2 = k7_distance2.getLongitude();
		double k7_distance = Math
				.sqrt(Math.pow(k7_target1 - k7_mydistance1, 2) + Math.pow(k7_target2 - k7_mydistance2, 2));
		return k7_distance;
	}

	// 현재 위치에서 가장 먼 거리
	public double getMaxDistance(List<Double> k7_distanceList) {
		double k7_MAX = Integer.MIN_VALUE;
		for (Double k7_distance : k7_distanceList) {
			k7_MAX = Math.max(k7_MAX, k7_distance);
		}
		return k7_MAX;
	}

	// 현재 위치에서 가장 가까운 거리
	public double getMinDistance(List<Double> k7_distanceList) {
		double k7_MIN = Integer.MAX_VALUE;
		for (Double k7_distance : k7_distanceList) {
			k7_MIN = Math.min(k7_MIN, k7_distance);
		}
		return k7_MIN;
	}

}
