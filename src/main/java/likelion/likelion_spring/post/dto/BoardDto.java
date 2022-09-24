package likelion.likelion_spring.post.dto;

import likelion.likelion_spring.post.damain.Board;
import lombok.Builder;

import java.time.LocalDate;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class BoardDto {
    private Long id;
    private String title;
    private String contents;
    private LocalDateTime createTime;
    private LocalDateTime modifiedTime;

    public Board toEntry() {
        Board build = Board.builder()
                .id(id)
                .title(title)
                .contents(contents)
                .build();
        return build;
    }
        @Builder
        public BoardDto(Long id, String title, String contents, LocalDateTime createdTime, LocalDateTime modifiedTime){
            this.id=id;
            this.title=title;
            this.contents=contents;
            this.createTime=createTime;
            this.modifiedTime=modifiedTime;
        }
    }

