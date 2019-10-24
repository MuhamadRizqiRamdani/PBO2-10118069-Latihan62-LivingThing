/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan62.livingthing;

/**
 *
 * @author asus
 * Nama     : Muhamad Rizqi Ramdani
 * Kelas    : PBO2
 * Nim      : 10118069
 * Deskripsi Tugas : Living Thing
 */
public class Tester {
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Muhamad Rizqi Ramdani");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
}
