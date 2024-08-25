package com.naver.shopping.discount;

import com.naver.shopping.member.Member;

public interface DiscountPolicy {
    int Discount(Member member, int price);
}
