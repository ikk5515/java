// 메소드 오버로딩 조건에 return 타입은 상과 없다.

public class Area {
    double areaCal (double radius) {     // 원의 면적
        return 3.14 * radius * radius;
    }
    int areaCal(int width) {            // 정사각형 면적
        return width * width;
    }
    int areaCal(int width, int height) {     // 직사각형 면적
        return width * height;
    }
}
