package gradleProject.shop3.mapper;

import gradleProject.shop3.domain.User;
import gradleProject.shop3.dto.UserLoginDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-07T11:02:22+0900",
    comments = "version: 1.6.2, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.2.jar, environment: Java 17.0.14 (Eclipse Adoptium)"
)
@Component
public class UserLoginMapperImpl implements UserLoginMapper {

    @Override
    public UserLoginDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserLoginDto userLoginDto = new UserLoginDto();

        userLoginDto.setUserid( user.getUserid() );
        userLoginDto.setPassword( user.getPassword() );

        return userLoginDto;
    }

    @Override
    public User toEntity(UserLoginDto userLoginDto) {
        if ( userLoginDto == null ) {
            return null;
        }

        User user = new User();

        user.setUserid( userLoginDto.getUserid() );
        user.setPassword( userLoginDto.getPassword() );

        return user;
    }
}
