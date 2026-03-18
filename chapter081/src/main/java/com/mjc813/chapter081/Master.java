package com.mjc813.chapter081;

import lombok.*;

@Getter
@Setter

public class Master {
        private String name;

        public Master(String name) {
            this.name = name;
        }
        public void visit(Object animal) {
            System.out.println(name + "이 동물을 면회합니다.");
    }
}
