package gradleProject.shop3.mapper;

import gradleProject.shop3.domain.Comment;
import gradleProject.shop3.dto.board.CommentDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-07T11:02:22+0900",
    comments = "version: 1.6.2, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.2.jar, environment: Java 17.0.14 (Eclipse Adoptium)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public CommentDto toDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDto commentDto = new CommentDto();

        commentDto.setNum( comment.getNum() );
        commentDto.setSeq( comment.getSeq() );
        commentDto.setWriter( comment.getWriter() );
        commentDto.setPass( comment.getPass() );
        commentDto.setContent( comment.getContent() );
        commentDto.setRegdate( comment.getRegdate() );

        return commentDto;
    }

    @Override
    public Comment toEntity(CommentDto commentDto) {
        if ( commentDto == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setNum( commentDto.getNum() );
        comment.setSeq( commentDto.getSeq() );
        comment.setWriter( commentDto.getWriter() );
        comment.setPass( commentDto.getPass() );
        comment.setContent( commentDto.getContent() );
        comment.setRegdate( commentDto.getRegdate() );

        return comment;
    }
}
