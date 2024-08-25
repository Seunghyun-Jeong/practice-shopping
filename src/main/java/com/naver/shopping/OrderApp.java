package com.naver.shopping;

import com.naver.shopping.member.Grade;
import com.naver.shopping.member.Member;
import com.naver.shopping.member.MemberService;
import com.naver.shopping.member.MemberServiceImpl;
import com.naver.shopping.order.Order;
import com.naver.shopping.order.OrderService;
import com.naver.shopping.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        long memberId = 1L;
        Member member = new Member(memberId, "테스트1", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "USB", 24000);
        System.out.println("order = " + order);
    }
}
