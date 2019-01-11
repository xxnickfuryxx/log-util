package br.com.autopass.exception.enums;

public enum ComponentEnum {
    BLUETOOTH(1, "BLUETOOTH"),
    WIFI(2, "WIFI"),
    USB(3, "USB"),
    TOUCHSCREEN(4, "TOUCHSCREEN"),
    APPLICATION(5, "APPLICATION"),
    SERVER(6, "SERVER");

    private Integer type;
    private String description;

    ComponentEnum(Integer type, String description){
        this.type = type;
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
