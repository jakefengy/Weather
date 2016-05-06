package com.xm.weather.test


open class Animal(name: String) {

    var AnimalName = "";

    init {
        this.AnimalName = name;
        AnimalPrint(name);
    }

    fun AnimalPrint(msg: String) {
        System.out.println("Animal.AnimalName=" + msg);
    }


}