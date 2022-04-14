package KNUT_CLUB.KNUT_CLUB.entitiy;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Comment {

    @Getter @Setter
    private int num;
    private String writer;
    private Date date;
    private String content;
}
