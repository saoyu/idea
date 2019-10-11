package domain;

import lombok.Data;

@Data
public class Log {
    /**
     *
     */
    private int id;

    private String accIn;

    private String accOut;

    private double money;
}