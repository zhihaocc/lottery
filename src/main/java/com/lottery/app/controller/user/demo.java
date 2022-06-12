package com.lottery.app.controller.user;

import java.util.Random;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Random random = new Random();
        int a = 0;
        for (int i = 0; i < 1; i++) {
            a++;
            while (set.size() < 6) {
                int red = random.nextInt(33) + 1;
                set.add(red);
            }
            int blue = random.nextInt(16) + 1;
            String result = set.toString().replace("[", "").replace("]", " ") + blue;
//            System.out.println("双色球" + a + "：" + result);
            System.out.println("双色球 " + result);
            set.clear();
        }
//
//        public static void main(String[] args) {
//            TreeSet<Integer> set = new TreeSet<>();
//            TreeSet<Integer> set2 = new TreeSet<>();
//            Random random = new Random();
//            int a = 0;
//            for (int i = 0; i < 1; i++) {
//                a++;
//                while (set.size() < 5) {
//                    int red = random.nextInt(35) + 1;
//                    set.add(red);
//                }
//                while (set2.size() < 2) {
//                    int blue = random.nextInt(12) + 1;
//                    set2.add(blue);
//                }
//                String result = set.toString().replace("[", "").replace("]", " ")+" "+
//                        set2.toString().replace("[", "").replace("]", " ");
//                System.out.println("大乐透" + "：" + result);
//                set.clear();
//            }
    }
}
