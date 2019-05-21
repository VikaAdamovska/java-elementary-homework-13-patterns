package org.hillel.patterns.prototype;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*1)- создать класс Address со свойствами String city, String street, int house
         - создать класс User, добавить в него свойсва String name, String lastName, double age, Address address;
         реализовать в классе User методы swallowCopy, deepCopy через конструкторы и интерфейс Clonable*/

        Address newAddress = new Address("Dnipro", "Gagarina", 16);
        User userFirst = new User("Ivan", "Ivanov", 55, newAddress);
        User userClone = userFirst.createShallowCopy();

        System.out.println(userFirst.getLastName() == userClone.getLastName());

        userFirst.getAddress().setCity("Kiev");
        System.out.println(userClone.getAddress().getCity());
        System.out.println(userClone.toString());

        Address adderessInLviv = new Address("Lviv", "Bogomaza", 103);
        User sourceUser = new User();
        sourceUser.setName("Sergey");
        sourceUser.setLastName("Beliy");
        sourceUser.setAge(20);
        sourceUser.setAddress(adderessInLviv);

        User cloneSourceUser = sourceUser.createDeepCopy();
        System.out.println(cloneSourceUser.toString());
        System.out.println(sourceUser.getLastName() == cloneSourceUser.getLastName());
        System.out.println(sourceUser.getAddress() == cloneSourceUser.getAddress());

        sourceUser.swallowCopyCloneable();

    }
}
