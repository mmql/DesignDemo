package com.example.designdemo.prototype;

import java.util.Hashtable;

// 创建一个类，获取相关实体类，并把它们存储在一个 Hashtable 中。
public class PersonCache {

    private static Hashtable<String, Person> personMap = new Hashtable<String, Person>();

    public static Person getPerson(String personId) {
        Person cachedPerson = personMap.get(personId);
        return (Person) cachedPerson.clone();
    }

    /**
     * personMap.put(personKey, person);
     */
    public static void loadCache() {
        Student student = new Student();
        student.setId("1");
        personMap.put(student.getId(), student);

        Teacher teacher = new Teacher();
        teacher.setId("2");
        personMap.put(teacher.getId(), teacher);

    }
}
