package com.mjc813;

import java.lang.reflect.Member;

@FunctionalInterface
public interface Creatable2 {
    public Member create(String id, String name);
}
