package com.mjc813.crud;

import com.mjc813.CRUD.CRUD;
import com.mjc813.CRUD.CrudClass;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCrud {
    @Test
    public void testCRUD() {
        CRUD<String> crudClass = new CrudClass<>();
        assertThat(crudClass).isNotNull();
        assertThat(crudClass.size()).isEqualTo(0);

        crudClass.add("test1");
        crudClass.add("test2");
        assertThat(crudClass.size()).isEqualTo(2);

        String remove1 = crudClass.remove(3);
        assertThat(crudClass.size()).isEqualTo(2);
        assertThat(remove1).isNull();

        String remove2 = crudClass.remove(0);
        assertThat(crudClass.size()).isEqualTo(1);
        assertThat(remove2).isEqualTo("test1");

        crudClass.add("test3");
        crudClass.add("test4");
        assertThat(crudClass.size()).isEqualTo(3);
        String str3 = crudClass.get(0);
        assertThat(str3).isEqualTo("test2");

        crudClass.set(0, "testtest");
        String str1 = crudClass.get(0);
        assertThat(str1).isEqualTo("testtest");
    }
}
