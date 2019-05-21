package org.hillel.patterns.prototype;

public class User implements ICloneUser {

    private String name;
    private String lastName;
    private double age;
    private Address address;

    public User() {
    }

    public User(String name, String lastName, double age, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User createShallowCopy() {
        return new User(this.name, this.lastName, this.age, this.address);
    }

    @Override
    public User swallowCopyCloneable() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public User createDeepCopy() {
        Address addressCopy = new Address();
        addressCopy.setCity(this.address.getCity());
        addressCopy.setStreet(this.address.getStreet());
        addressCopy.setHouse(this.address.getHouse());

        return new User(new String(this.name), new String(this.lastName), this.age, addressCopy);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
