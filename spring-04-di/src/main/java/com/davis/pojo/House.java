package com.davis.pojo;

public class House {
    private String name;
    private String houseAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", houseAddress='" + houseAddress + '\'' +
                '}';
    }
}
