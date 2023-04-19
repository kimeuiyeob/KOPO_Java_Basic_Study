package day05;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class 영수증출력3 {

	public static void main(String[] args) {

//		=======================================================================
		// ���ڿ� �迭 ������ ������ �ʱ�ȭ�Ѵ�.
		String[] kopo07_items = { "aaaa��������������Ȩ SAFE365 �ڵ�ũ��", "(G)LH��������ȭ�� 10", "��������E", "���� ���Ϸ� �� ��������",
				"����Ȩ SAFE �ڵ����", "��� �Ŷ��120g*5", "(��)����������", "���ѱ� ������� 156g", "GAP ������ 4-6��/", "�� ����� �ٳ���(��)",
				"����ũ ź�θ� �߰���", "(����)����߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ ����̿���500",
				"���� ���ִ¿���GT ��", "���������÷�10��", "��������(��)65g*6", "�ɶ�ý� ���� Ʈ��Ʈ", "Ǫ���� �̼��������", "���Ϸν���������500g",
				"CJ ����Ĩ 20G", "����ũ ����̿���500", "����� ���� ��ũƼ", "1+ ��޶� 10���� Ư��", "������ݺ�����ġ��ȹ" };

		// ������ �迭�� ����� ������ �ʱ�ȭ�Ѵ�.
		int[] kopo07_price = { 10000000, 6920, 59820, 3300, 5500, 3380, 6610, 2750, 10800, 4980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 20000000, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };

		// ������ �迭�� ����� ������ �ʱ�ȭ�Ѵ�.
		int[] kopo07_amount = { 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1 };

		// �Ҹ��� �迭�� ����� ������ �ʱ�ȭ�Ѵ�.
		boolean[] kopo07_tax = { false, false, false, false, true, false, true, false, true, false, false, false, false,
				false, false, false, true, false, false, false, false, false, false, false, false, true, false, true,
				false, false, false };

//		=======================================================================
//		���⼭ ������ ���ڿ��� �߶� ����Ʈ�� ����ѵ� �ڸ��� �����̴�.

		// �켱 �����۹迭���� ������ ���� ������ �� ���� ������ �����۰��� ������ �ݺ��� ������.
		for (int i = 0; i < kopo07_items.length; i++) {
			kopo07_items[i] += "                                "; // ��� �����۵��� ���ڰ����� 14byte���� ������������ ��ĭ�� ��û ä���ش�.
			int kopo07_getBytesCount = 0; // byte ������ ����� ������ �����ϳ��� �����Ѵ�.
			for (int j = 0; j < kopo07_items[i].length(); j++) { // �����۹迭 �ε��� �ϳ��� ���ڵ��� ������ �ݺ��Ѵ�.
				char changeText = kopo07_items[i].charAt(j); // ���� �ϳ��ϳ��� ������ char������ ��´�.

				kopo07_getBytesCount += String.valueOf(changeText).getBytes().length; // �� ���ڸ� byte�� �ɰ� ������ ������ ��´�.

				if (kopo07_getBytesCount == 13) { // ������ 13���� �Ʒ� if�� ������ ����.

					char checkText = kopo07_items[i].charAt(j + 1); // �Ǹ����� ���ڰ� ���ö� �ѱ��� ���ö��� ����Ͽ� �ѹ��� ������ �����.
					int checking = String.valueOf(checkText).getBytes().length; // �� ������ ��´�.

					if (checking == 1) { // ���� �ѱ��� �ƴ϶�� �׵ڿ� ���ڱ��� �����´�.
						kopo07_items[i] = kopo07_items[i].substring(0, j + 2);
					} else { // ���� �ڿ����� ���ڰ� �ѱ��̶�� " "���ڿ��� �߰��Ѵ�.
						kopo07_items[i] = kopo07_items[i].substring(0, j + 1) + " ";
					}
					// ���� ������ 14�� �������� �״�� ����ش�.
				} else if (kopo07_getBytesCount == 14) {
					kopo07_items[i] = kopo07_items[i].substring(0, j + 1);
				}
			}
		}

//		=======================================================================

		// ��¥ ������ ������ �پ��ؼ� ���� ��ü���� �����Ѵ�.
		LocalDateTime kopo07_now = LocalDateTime.now();
		String kopo07_formatedNow = kopo07_now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
		String kopo07_formatedNow2 = kopo07_now.format(DateTimeFormatter.ofPattern("MM��dd��"));
		String kopo07_formatedNow3 = kopo07_now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		String kopo07_formatedNow4 = kopo07_now.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

		// ��¥�� ������ ��찡 �־ Ķ���� ��ü�� �����´�.
		Calendar kopo07_currentDateTime = Calendar.getInstance();
		kopo07_currentDateTime.add(Calendar.HOUR, -2); // �����ð��� 2�ð������� �����ϰ� �; �̷����Ѵ�.
		SimpleDateFormat kopo07_format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String kopo07_formattedCurrentDateTime = kopo07_format1.format(kopo07_currentDateTime.getTime());

		// �ݾ� 3�ڸ� �ڿ�, �� �߰��ϱ� ���� ���� ��ü�� �����Ѵ�.
		DecimalFormat kopo07_df = new DecimalFormat("###,###,###,###,###");

//		=======================================================================

		System.out.printf("=========================================\n");
		System.out.printf("%s %29.29s\n", "emart", "�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%30.30s\n", "206-86-50913 ����");
		System.out.printf("%29.29s\n", "���� ������ ������� 552");
		System.out.printf("\n");
		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳�(�ż�7��)\n");
		System.out.printf("���Ϻ� �귣����� ����(���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
		System.out.printf("[%s]%s%18.18s\n", "�� ��", kopo07_formatedNow, "POS:0011-9861"); // �ð��� ����Ѵ�.
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  %s %15.15s %4.4s %5.5s\n", "��ǰ��", "�� ��", "����", "�� ��");
		System.out.printf("-----------------------------------------\n");

//		=======================================================================

		// �� ǰ�� ����
		int kopo07_totalAmount = kopo07_items.length;

		int kopo07_count = 1;

		double kopo07_taxFreeItems = 0; // ������ �鼼 ��ǰ ���� ����
		double kopo07_taxNotFreeItems = 0; // ������ ������ǰ ���� ����
		double kopo07_bugase = 0; // ������ �ΰ��� ���� ����
		double kopo07_TotalPrice = 0; // ������ �� �ݾ� ���� ����

		// ��꼭 �� ��ǰ���� �ݺ�����ϱ� ���� �� ������ŭ �ݺ� ������.
		for (int i = 0; i < kopo07_items.length; i++) {

			// ���⼭ false �� true�� ������ ���������� �޴� ��ǰ��� �ȹ޴� ��ǰ���� ������ ���� ���ǹ��� ����Ŵ�.
			if (kopo07_tax[i] == false) {
				// ����� ���������� ���� ��ǰ���� �̷��� ����Ѵ�.
				System.out.printf("%s %s%11.11s%3.3s%11.11s\n", " ", kopo07_items[i], kopo07_df.format(kopo07_price[i]),
						kopo07_df.format(kopo07_amount[i]), kopo07_df.format(kopo07_price[i] * kopo07_amount[i]));

//				=====================================================================================
				kopo07_TotalPrice += (kopo07_price[i] * kopo07_amount[i]); // �̰� ���� ��� �ؾߵǴ� ���ĵ��� �� �ݾ��̴�.
//				=====================================================================================
			}
			// ����� ���������� �޴� ��ǰ���̴�.
			if (kopo07_tax[i] == true) {
				System.out.printf("%s %s%11.11s%3.3s%11.11s\n", "*", kopo07_items[i], kopo07_df.format(kopo07_price[i]),
						kopo07_df.format(kopo07_amount[i]), kopo07_df.format(kopo07_price[i] * kopo07_amount[i]));

//				=====================================================================================
				kopo07_taxFreeItems += (kopo07_price[i] * kopo07_amount[i]); // �鼼��ǰ �ݾ��̴�.
//				=====================================================================================

			}

			// ���� ��ǰ�� 5���� ������ ---�� ����Ѵ�.
			if (kopo07_count % 5 == 0) {
				System.out.printf("-----------------------------------------\n");
			}
			kopo07_count++;
		}

		kopo07_bugase = (int) kopo07_TotalPrice / 11; // �ΰ��� ����Ѵ�.
		kopo07_taxNotFreeItems = kopo07_TotalPrice - (Math.ceil(kopo07_TotalPrice / 11)); // ������ǰ�� ��´�.

		System.out.printf("\n");
		System.out.printf("%22.22s %13.13s\n", "�� ǰ�� ����", kopo07_df.format(kopo07_totalAmount)); // ������ ����Ѵ�.
		System.out.printf("%23.23s %13.13s\n", "(*)�� ��  ǰ ��", kopo07_df.format(kopo07_taxFreeItems)); // �鼼ǰ���� ����Ѵ�.

		System.out.printf("%23.23s %13.13s\n", "�� ��  �� ǰ", kopo07_df.format(kopo07_taxNotFreeItems)); // ������ǰ�� ����Ѵ�.
		System.out.printf("%24.24s %13.13s\n", "��   ��   ��",
				kopo07_df.format(kopo07_TotalPrice - kopo07_taxNotFreeItems));// �ΰ����� ����Ѵ�.
		System.out.printf("%25.25s %13.13s\n", "��        ��", kopo07_df.format(kopo07_TotalPrice + kopo07_taxFreeItems));// �հ踦
																														// ����Ѵ�.
		System.out.printf("%s %23.23s\n", "�� �� �� �� �� ��", kopo07_df.format(kopo07_TotalPrice + kopo07_taxFreeItems));// �������ݾ���
																													// ����Ѵ�.

		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s %27.27s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%s    %11.11s %10.10s\n", "ī�����(IC)", "�Ͻú� /",
				kopo07_df.format(kopo07_TotalPrice + kopo07_taxFreeItems));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("           [�ż�������Ʈ ����]\n");
		System.out.printf("ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.\n");
		System.out.printf("%s %18.18s %7.7s\n", "��ȸ�߻�����Ʈ", "9350**9995", "164");
		System.out.printf("%s %17.17s %6.6s\n", "����(����)����Ʈ", "5,637(", "5,473)");
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   ���űݾױ��� ���������ð� �ڵ��ο�\n");
		System.out.printf("%s : %29.29s\n", "������ȣ", "27��****");
		System.out.printf("%s : %30.30s\n", "�����ð�", kopo07_formattedCurrentDateTime);
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s %24.24s\n", "ĳ��:084599 ��OO", "1150");
		System.out.printf("%14.14s%s\n", kopo07_formatedNow4, "/00119861/00164980/31");
		System.out.printf("-----------------------------------------\n");

	}

}
