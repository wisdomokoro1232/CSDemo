package JavaDocs.CollectionsAPI;


class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String phone;

    Person (String name,int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person b) {
        if (age > b.age) {
            return 1;
        } else if (age < b.age) {
            return -1;
        } else {
            return 0;
        }
    }
}

