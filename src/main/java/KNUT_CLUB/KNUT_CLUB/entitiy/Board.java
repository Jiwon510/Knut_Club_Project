package KNUT_CLUB.KNUT_CLUB.entitiy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter @Setter @ToString
public class Board {

    private int num;
    private String title;
    private String writer;
    private Date date;
    private String Content;
    private String file;
    private int likey;
}
