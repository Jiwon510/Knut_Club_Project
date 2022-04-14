package KNUT_CLUB.KNUT_CLUB.entitiy;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Write {

    @Getter @Setter
    private String title;
    private String writer;
    private String content;
    private Date date;
}
