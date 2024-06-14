package enums;

public enum Provider {
    HOAWEI("huawei"), ABANESHOP("abaneshop"), HAMIMCI("hamimci");

    private final String value;

    Provider(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
