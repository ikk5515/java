public class SmartTv  implements Volume, Searchable{

    @Override
    public void search(String url) {
        System.out.println(url + "을(를) 검색합니다.");
    }

    @Override
    public void VolumeUp(int level) {
        System.out.println("스마트 TV 볼륨을 올립니다: " + level);
    }

    @Override
    public void VolumeDown(int level) {
        System.out.println("스마트 TV 볼륨을 내립니다: " + level);
    }
}
