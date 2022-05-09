package common;           // �⺻ ��Ű�� �̿��� ��Ű��(�Ծ� 1��)

public class Person {
    private String name;  // private ��� ����(�Ծ� 2��)
    private int age;      // private ��� ����(�Ծ� 2��)

    public Person() {}    // �⺻ ������(�Ծ� 3��)
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // public ����/���� �޼����(�Ծ� 4��, 5��)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}