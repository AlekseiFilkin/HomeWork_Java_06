import java.util.Objects;

public class CatPlus {
    private String nickname;
    private String color;
    private int age;
    private final Sex sex;

    public CatPlus(String nickname, String color, int age, Sex sex) {

        this.nickname = nickname;
        this.color = color;
        setAge(age);
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <=25) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Не корректно указан возраст");
        }
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatPlus that = (CatPlus) o;
        return age == that.age && Objects.equals(nickname, that.nickname) && color.equals(that.color) && sex == that.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, color, age, sex);
    }

    @Override
    public String toString() {
        return "CatPlus:\n{" +
                "nickname='" + nickname + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}' + "\n";
    }
}