package org.javaturk.ipj.ch02.odev2;

public class IkisiBirArada {
    void main  (String[] args) {
        person yeniKisi = new person();
        yeniKisi.name = "Yusuf Gökhan";
        yeniKisi.surname = "Yavuz";
        yeniKisi.age = "42";
        yeniKisi.gender = "Erkek";
        yeniKisi.tall = "185cm";
        yeniKisi.weight = "95kg";

        String donus = yeniKisi.printInfo();
        System.out.println(donus);

    }
}

class person {
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
