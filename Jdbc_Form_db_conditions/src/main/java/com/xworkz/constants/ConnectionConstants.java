package com.xworkz.constants;

public enum ConnectionConstants {
    URL("jdbc:mysql://localhost:3306/Form_db"), USERNAME("root"), PASSWORD("Shashank@2002");

    private String value;

    private ConnectionConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}