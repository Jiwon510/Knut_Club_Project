package KNUT_CLUB.KNUT_CLUB.entitiy;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Notice {

    @Getter @Setter
    private int num;
    private String title;
    private String writer;
    private Date date;
    private String Content;
    private String file;
}
