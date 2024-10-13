package homework9_1;

public enum Action {
    EAT(1, "to feed animal"),
    SAY(2, "the animal will say something"),
    FLY(3, "the animal will fly"),
    WALK(4, "the animal will walk"),
    SWIM(5, "the animal will swim"),
    DISPLAY_INFO(6, "to display the info about animal"),
    EXIT(7, "to exit");

    private final int code;
    private final String description;

    Action(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static Action valueOf(int code) throws IllegalInputException {
        Action[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].code == code)
                return values[i];
        }

        throw new IllegalInputException("Code was incorrect, please select correct code");
    }
}
