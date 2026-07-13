package com.korea.architecture.di;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
// final 필드를 매개변수로 받는 생성자를 Lombok이 자동 생성
public class Chef {

    // 생성자 주입
    private final Knife knife;
    private final Pan pan;
    private final Pot pot;
    private final Oven oven;

    public void cook() {
        System.out.println("요리를 시작합니다.");

        knife.cut();
        // 필요하면 아래도 사용할 수 있습니다.
        // pan.fry();
        // pot.boil();
        // oven.bake();
    }
}