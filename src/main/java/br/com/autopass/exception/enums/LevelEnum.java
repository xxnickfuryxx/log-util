package br.com.autopass.exception.enums;

public enum LevelEnum {

    CRITICAL(0, "CRITICAL"),
    ERROR(1, "ERROR"),
    WARN(2, "WARN"),
    INFO(3, "INFO"),
    DEBUG(4, "DEBUG");

    private Integer type;
    private String description;

    LevelEnum(int type, String description) {
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