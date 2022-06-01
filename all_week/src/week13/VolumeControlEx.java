public class VolumeControlEx {
    public static void main(String[] args) {
        Volume vol = new Volume() {
            @Override
            public void VolumeUp(int level) {
                System.out.println("익명 개체 볼륨을 올립니다: " + level);
            }

            @Override
            public void VolumeDown(int level) {
                System.out.println("익명 개체 볼륨을 내립니다: " + level);
            }
        };
        vol.VolumeUp(5);
        vol.VolumeDown(2);
    }
}
