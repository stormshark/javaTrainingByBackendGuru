package org.javaturk.ipj.ch02.odev1;

class personT {
    void main(String[] args) {

        person yeniKisi = new person();
        yeniKisi.name = "Yusuf Gökhan";
        yeniKisi.surname = "Yavuz";
        yeniKisi.age = "42";
        yeniKisi.gender = "Erkek";
        yeniKisi.tall = "185cm";
        yeniKisi.weight = "95kg";

        String donus = yeniKisi.printInfo();
        IO.println(donus);

    }
}


