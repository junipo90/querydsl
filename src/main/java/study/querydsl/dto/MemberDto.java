package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {
    private String username;
    private int age;

    @QueryProjection //QueryProjection 으로 Dto 반환할 때 -> QMemberDto 만들어서 쓴다.
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
