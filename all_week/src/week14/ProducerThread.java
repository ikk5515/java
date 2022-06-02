public class ProducerThread extends Thread{
    private DataBox dataBox;

    public ProducerThread(DataBox databBox) {
        this.dataBox = databBox;                // 공유 객체를 필드에 저장
    }

    @Override
    public void run() {
        for (int i=1; i<=3; i++) {
            String data = "Data-" + i;
            dataBox.SetData(data);              // 새로운 데이터를 저장
        }
    }
    
}
