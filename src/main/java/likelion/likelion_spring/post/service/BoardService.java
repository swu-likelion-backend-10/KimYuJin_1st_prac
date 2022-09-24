package likelion.likelion_spring.post.service;

import likelion.likelion_spring.post.repository.BoardRepository;
import likelion.likelion_spring.post.dto.BoardDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository){
        this.boardRepository=boardRepository;
    }

    @Transactional
    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntry()).getId();
    }
}
