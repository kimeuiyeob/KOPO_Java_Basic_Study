package kr.ac.kopo.ctc.kopo07.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo07.domain.WifiItem;

//data access object
public class WifiItemsDao {

//	CRUD
	public WifiItem create(WifiItem wifiItem) {
		return null;
	}

//	==============================================================================
	// 아이디 하나 찾아오기
	public WifiItem selectOne(int id) {
		WifiItem k7_wifiItem = selectOneFromDB(id);
		return k7_wifiItem;
	}

//	==============================================================================
//	// 전체 찾기
	public List<WifiItem> selectAll() {
		List<WifiItem> k7_wifiItems = new ArrayList<WifiItem>();
		k7_wifiItems = selectAllFromDB();
		return k7_wifiItems;
	}

//	==============================================================================
	// 아이디값으로 해당 데이터 지우기
	// 해당 아이디로만 된거 건너뛰고 읽어서 다시 쓰는 느낌으로..
//	public void delete(int id) {
//		File file = new File("C:/Users/euiyeob/Desktop/csvFile/imwifi.txt");
//		String readText;
//		BufferedReader br;
//		BufferedWriter bw;
//		try {
//			br = new BufferedReader(new FileReader(file));
//			FileWriter fw = new FileWriter(file);
//
//			if ((readText = br.readLine()) == null) {
//				System.out.println("empty file");
//			}
//			String[] itemArr;
//			int LineCnt = 0;
//
//			while ((readText = br.readLine()) != null && LineCnt <= 10000) {
//				itemArr = readText.split("\t");
//				if (id == Integer.valueOf(itemArr[0])) {
//					continue;
//				}
//				LineCnt++;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	==============================================================================
	// 아이디값으로 수정하기
	public WifiItem update(int id, WifiItem wifiItem) {
		return null;
	}

//	==============================================================================
	// 아이디 하나 읽기
	public WifiItem selectOneFromDB(int id) {

		File k7_file = new File("C:/Users/euiyeob/Desktop/csvFile/imwifi.txt");
		String k7_readText;
		BufferedReader k7_br;
		WifiItem k7_wifiItem = new WifiItem();
		try {
			k7_br = new BufferedReader(new FileReader(k7_file));
			if ((k7_readText = k7_br.readLine()) == null) {
				System.out.println("empty file");
			}
			String[] k7_itemArr;
			int LineCnt = 0;
			while ((k7_readText = k7_br.readLine()) != null && LineCnt <= 10000) {
				k7_itemArr = k7_readText.split("\t");
				if (id == Integer.valueOf(k7_itemArr[0])) {
					k7_wifiItem.setId(id);
					k7_wifiItem.setInstallation_Location_Name(k7_itemArr[1]);
					k7_wifiItem.setInstallation_Location_Details(k7_itemArr[2]);
					k7_wifiItem.setInstallation_City_Name(k7_itemArr[3]);
					k7_wifiItem.setInstallation_District_Name(k7_itemArr[4]);
					k7_wifiItem.setInstallation_Facility_Type(k7_itemArr[5]);
					k7_wifiItem.setService_Provider_Name(k7_itemArr[6]);
					k7_wifiItem.setWifi_Ssid(k7_itemArr[7]);
					k7_wifiItem.setDate_Of_Installation(k7_itemArr[8]);
					k7_wifiItem.setRoad_Name_Address(k7_itemArr[9]);
					k7_wifiItem.setLot_number_Address(k7_itemArr[10]);
					k7_wifiItem.setManagement_Agency_Name(k7_itemArr[11]);
					k7_wifiItem.setManagement_Agency_Phone_Number(k7_itemArr[12]);
					k7_wifiItem.setLatitude(Double.valueOf(k7_itemArr[13]));
					k7_wifiItem.setLongitude(Double.valueOf(k7_itemArr[14]));
					k7_wifiItem.setCreated(k7_itemArr[15]);
					LineCnt++;
				}
			}
		} catch (Exception k7_e) {
		}
		return k7_wifiItem;
	}
//	===============================================================================
	// 전체값 파일 읽기

	public List<WifiItem> selectAllFromDB() {
		File k7_file = new File("C:/Users/euiyeob/Desktop/csvFile/imwifi.txt");
		String k7_readText;
		BufferedReader k7_br;

		List<WifiItem> k7_wifiItems = new ArrayList<WifiItem>();
		try {
			k7_br = new BufferedReader(new FileReader(k7_file));
			if ((k7_readText = k7_br.readLine()) == null) {
				System.out.println("empty file");
			}
			String[] k7_itemArr;
			int k7_LineCnt = 0;

			while ((k7_readText = k7_br.readLine()) != null && k7_LineCnt <= 10000) {
				k7_itemArr = k7_readText.split("\t");
				WifiItem k7_wifiItem = new WifiItem();
				k7_wifiItem.setId(Integer.valueOf(k7_itemArr[0]));
				k7_wifiItem.setInstallation_Location_Name(k7_itemArr[1]);
				k7_wifiItem.setInstallation_Location_Details(k7_itemArr[2]);
				k7_wifiItem.setInstallation_City_Name(k7_itemArr[3]);
				k7_wifiItem.setInstallation_District_Name(k7_itemArr[4]);
				k7_wifiItem.setInstallation_Facility_Type(k7_itemArr[5]);
				k7_wifiItem.setService_Provider_Name(k7_itemArr[6]);
				k7_wifiItem.setWifi_Ssid(k7_itemArr[7]);
				k7_wifiItem.setDate_Of_Installation(k7_itemArr[8]);
				k7_wifiItem.setRoad_Name_Address(k7_itemArr[9]);
				k7_wifiItem.setLot_number_Address(k7_itemArr[10]);
				k7_wifiItem.setManagement_Agency_Name(k7_itemArr[11]);
				k7_wifiItem.setManagement_Agency_Phone_Number(k7_itemArr[12]);
				k7_wifiItem.setLatitude(Double.valueOf(k7_itemArr[13]));
				k7_wifiItem.setLongitude(Double.valueOf(k7_itemArr[14]));
				k7_wifiItem.setCreated(k7_itemArr[15]);

				k7_wifiItems.add(k7_wifiItem);
				k7_LineCnt++;
			}

		} catch (Exception k7_e) {
			k7_e.printStackTrace();
		}
		return k7_wifiItems;

	}
//	===============================================================================

}
