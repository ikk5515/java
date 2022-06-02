public class DataBox {
    private String data;


    // 데이터를 읽는 소비자를 위한 메소드
    public synchronized String getData() {
        if (this.data == null) {                // 데이터가 없으면 아직 만들어 지기 전이니까 wait();
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        String returnVaule = data;              // 있으면 returnValue에 저장해두고 출력해준다
        System.out.println("ConsumerThread가 읽은 데이터: " +returnVaule);
        data = null;                            // 읽었기 때문에 data를 초기화 시켜줌
        notify();                               // 소비자가 데이터를 읽었기 때문에 notify메소드를 호출해서 생산자가 만들어 줄 수 있도록 깨워준다
        return returnVaule;
    }

    public synchronized void SetData(String data) {
        if (this.data != null) {                // data가 있으면 소비자가 아니니까 쓰면 안되니 wait메소드 호출 
            try{
                wait();
            } catch (InterruptedException e) {}
        }
        this.data = data;                       // 없으면 data에 data값을 넣어준다.
        System.out.println("ProducerThread가 생성한 데이터: " +data);
        notify();                               // 그리고 데이터를 넣으면 소비자가 읽어야 하기 떄문에 getData 메소드를 깨워준다.
    }
    
}
