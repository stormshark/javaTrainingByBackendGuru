package org.javaturk.ipj.ch02.odev1;

public class person {
    String name;
    String surname;
    String age;
    String gender;
    String tall;
    String weight;

    String printInfo() {
        return "Adı :" + name + ", Soyadı:" + surname + ", Yaş:" + age + ", Cinsiyet:" + gender + ", Boy:" + tall + ", Kilo:" + weight;
    }
}
