package kr.ac.kopo.ctc.kopo07;

import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo07.dao.WifiItemsDao;
import kr.ac.kopo.ctc.kopo07.domain.WifiItem;
import kr.ac.kopo.ctc.kopo07.service.WifiitemsService;

public class WifiMain {

	public static void main(String[] args) {

		WifiitemsService k7_wifiItemsService = new WifiitemsService();
		WifiItemsDao k7_wifiItemsDao = new WifiItemsDao();

		// TXT파일 리스트에 담기
		List<WifiItem> k7_wifiItems;
		k7_wifiItems = k7_wifiItemsDao.selectAll();

		// 아이디 하나로 값 찾아오기
		WifiItem k7_findOneItem;
		k7_findOneItem = k7_wifiItemsDao.selectOne(5);
//		System.out.println(k7_findOneItem);

		// 아이디 하나로 값 지우기
//		wifiItemsDao.delete(10000);

//		==========================================================================

		// 내 현재 위치 설정
		WifiItem k7_me = new WifiItem();
		k7_me.setMyDistance1(37.3860521);
		k7_me.setMyDistance2(127.1214038);

		// 현재 위치에서 뺀 거리 담아줄 리스트
		List<Double> k7_distanceList = new ArrayList<>();
		for (WifiItem k7_target : k7_wifiItems) {
			double k7_distance = k7_wifiItemsService.getDistance(k7_me, k7_target);
			k7_distanceList.add(k7_distance);
		}

		double k7_MAX;
		double k7_MIN;

		// 가장 멀리,가까운 담아줄 객체
		WifiItem k7_far = null;
		WifiItem k7_close = null;

		// 가장 먼곳과 가까운곳 담기
		k7_MAX = k7_wifiItemsService.getMaxDistance(k7_distanceList);
		k7_MIN = k7_wifiItemsService.getMinDistance(k7_distanceList);

		int i = 0;
		// 객체 하나씩 반복해서 값을 출력
		for (WifiItem target : k7_wifiItems) {
			System.out.println("====================================================");
			System.out.print("주소 : " + target.getInstallation_City_Name());
			System.out.println(" " + target.getInstallation_District_Name());
			System.out.println("위도 : " + target.getLatitude());
			System.out.println("경도 : " + target.getLongitude());
			System.out.println("현재 지점과의 거리 : " + k7_distanceList.get(i));
			System.out.println("====================================================");
			// 가장 먼거리, 가까운 거리와 같다면 객체를 담아준다.
			if (k7_MAX == k7_distanceList.get(i)) {
				k7_far = target;
			}
			if (k7_MIN == k7_distanceList.get(i)) {
				k7_close = target;
			}
			i++;
		}

		// 출력
		System.out.println("제일 먼 거리 : " + k7_MAX);
		System.out.println("제일 가까운 거리 : " + k7_MIN);
		System.out.println("제일 먼 장소 : " + k7_far.getInstallation_City_Name() + " "
				+ k7_far.getInstallation_District_Name() + " " + k7_far.getRoad_Name_Address());
		System.out.println("제일 가까운 장소 : " + k7_close.getInstallation_City_Name() + " "
				+ k7_close.getInstallation_District_Name() + " " + k7_close.getRoad_Name_Address());
		System.out.println("====================================================");

	}
}
