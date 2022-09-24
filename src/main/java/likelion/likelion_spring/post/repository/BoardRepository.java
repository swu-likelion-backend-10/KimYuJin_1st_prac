package likelion.likelion_spring.post.repository;

import likelion.likelion_spring.post.damain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
