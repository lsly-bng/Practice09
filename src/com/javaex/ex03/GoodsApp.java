package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Goods> gList = new ArrayList<Goods>();

		System.out.println("상품을 입력해주세요. (종료 q)");

		while (true) {
			String input = sc.nextLine();

			if ("q".equals(input)) {
				System.out.println("[ 입력완료 ]");
				System.out.println("===================================");
				break;
			} else {
				String[] data = input.split(",");
				Goods g = new Goods(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
				gList.add(g);
			}
		}

		for (int i = 0; i < gList.size(); i++) {
			gList.get(i).showInfo();
		}

		int sum = 0;

		for (int i = 0; i < gList.size(); i++) {
			sum += gList.get(i).getCount();
		}
		System.out.println("모든 상품의 갯수는 " + sum + "개 입니다.");

		sc.close();
	}
}
