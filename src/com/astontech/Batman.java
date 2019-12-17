//package com.astontech;
//
//public class Batman {
//
//    public static void main(String args[]) {
//        int W = 5; // width of the building.
//        int H = 8; // height of the building.
//        int N = 40; // maximum number of turns before game over.
//        int X0 = 0;
//        int Y0 = 0;
//
//        Y0 = H/2;
//        X0 = W/2;
//
//
//        // game loop
//        while (true) {
////            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
//
//            // Write an action using System.out.println()
//            // To debug: System.err.println("Debug messages...");
//
//
//            // the location of the next window Batman should jump to.
//
//
//
//            if (bombDir.contains("D")) {
//                if(Y0 / 2 != 0){
//                    if (Y0 + (Y0/2) <= H) {
//                        Y0 = Y0 + (Y0/2);
//                    }
//                }else{
//                    Y0 += 1;
//                }
//            }
//            if (bombDir.contains("U")) {
//                if(Y0 / 2 !=0){
//                    if (Y0 - (Y0/2) >= 0) {
//                        Y0 = Y0 - (Y0/2);
//                    }
//                }else{
//                    Y0 -= 1;
//                }
//
//            }
//            if (bombDir.contains("L")) {
//                if(X0 / 2 !=0){
//                    if (X0 - (X0/2) >= 0) {
//                        X0 = X0 - (X0/2);
//                    }
//                }else{
//                    X0 -= 1;
//                }
//            }
//            if (bombDir.contains("R")) {
//                if(X0 / 2 !=0){
//                    if (X0 + (X0/2) >= W) {
//                        X0 = X0 + (X0/2);
//                    }
//                }else{
//                    X0 += 1;
//                }
//            }
//
//
//            System.out.println(X0 + " " + Y0);
//        }
//    }
//}
