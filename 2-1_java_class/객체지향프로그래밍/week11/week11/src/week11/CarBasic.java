package week11;

public class CarBasic {




    // 클래스의 각 필드를 private으로 선언해서 외부 접근을 제한한다.
    private String company;
    private String model;
    private String color;
    private int maxSpeed;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // 외부에서 값이 필요한 경우 값을 제공하기 위한 getter() 메소드 정의
}
