package com.xm.weather.test


class Person(name: String, age: Int) : Animal(name) {

    var name = "";
    var age = 0;

    init {
        this.name = name;
        this.age = age;
        print(name);
        print(name, age);
    }

    fun print(msg: String, age: Int = 10) {
        System.out.println("Person.name=$msg, Person.age=$age");
    }

}