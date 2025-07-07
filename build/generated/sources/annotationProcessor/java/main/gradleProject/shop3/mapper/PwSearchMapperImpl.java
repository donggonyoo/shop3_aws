package gradleProject.shop3.mapper;

import gradleProject.shop3.domain.User;
import gradleProject.shop3.dto.PwSearchDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-07T11:02:22+0900",
    comments = "version: 1.6.2, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.2.jar, environment: Java 17.0.14 (Eclipse Adoptium)"
)
@Component
public class PwSearchMapperImpl implements PwSearchMapper {

    @Override
    public User toEntiy(PwSearchDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setUserid( dto.getUserid() );
        user.setPhoneno( dto.getPhoneno() );
        user.setEmail( dto.getEmail() );

        return user;
    }

    @Override
    public PwSearchDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        PwSearchDto pwSearchDto = new PwSearchDto();

        pwSearchDto.setUserid( user.getUserid() );
        pwSearchDto.setEmail( user.getEmail() );
        pwSearchDto.setPhoneno( user.getPhoneno() );

        return pwSearchDto;
    }
}
