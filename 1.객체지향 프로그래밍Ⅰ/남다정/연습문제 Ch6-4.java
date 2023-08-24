public class Student{
    private String name;
    private int ban;
    private int no;
    private int kor;
    private int eng;
    private int math;

    public int getTotal(){
        return kor + eng + math;
    }

    public float getAverage(){
        return Math.round(getTotal() / 3f * 10) / 10.0f;
    }
}