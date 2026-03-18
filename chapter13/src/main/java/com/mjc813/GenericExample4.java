package com.mjc813;

public class GenericExample4 {
        public static <T> Box2<T> boxing(T t) {
            Box2<T> box = new Box2<T>();
            box.set(t);
            return box;
    }
    public void ch08() {
            Box2<Integer> box1 = boxing(100);
            int intValue = box1.get();
            System.out.println(intValue);

            Box2<String> box2 = boxing("홍길동");
            String strValue = box2.get();
            System.out.println(strValue);
    }
}
