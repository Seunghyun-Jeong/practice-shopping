package com.naver.shopping.member;

import com.naver.shopping.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberServiceTest {
    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    MemberService memberService = ac.getBean("memberService", MemberService.class);

    @Test
    void 회원가입테스트() {
        Member member = new Member(1L, "테스트", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }

    @Test
    void 회원가입테스트실패() {
        Member member1 = new Member(1L, "테스트1", Grade.VIP);
        Member member2 = new Member(2L, "테스트2", Grade.BASIC);

        Assertions.assertThat(member1).isEqualTo(member2);
    }
}
