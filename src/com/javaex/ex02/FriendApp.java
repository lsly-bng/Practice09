package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	List<Friend> fList = new ArrayList<Friend>();

		System.out.println("친구를 3명 등록해주세요.");

		for (int i = 0; i < 3; i++) {
			String[] input = sc.nextLine().split(" ");
			Friend f = new Friend (input[0],input[1], input[2]);
			fList.add(f);
		}
		for (Friend f:fList) {
			System.out.println(f.toString());
		}

		sc.close();
    	
    }

}
