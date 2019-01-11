package br.com.autopass.exception.model;

public class Log {

    private String _id;
    private Integer idComponent;
    private String component;
    private Integer idLevel;
    private String level;
    private String context;
    private String log;

    public Log(Integer idComponent,
               String component,
               Integer idLevel,
               String level,
               String context,
               String log){

        this.idComponent = idComponent;
        this.component = component;
        this.idLevel = idLevel;
        this.level = level;
        this.context = context;
        this.log = log;

    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getIdComponent() {
        return idComponent;
    }

    public void setIdComponent(Integer idComponent) {
        this.idComponent = idComponent;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public Integer getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(Integer idLevel) {
        this.idLevel = idLevel;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

}
