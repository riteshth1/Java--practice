class Time
{
    int hour;
    int minute;
    int second;
    Time(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    Time addTime(Time t4)
    {
        int s = t4.second+this.second;
        int s_rem = s / 60;
        int m = t4.minute + this.minute+s_rem;
        int m_rem = m / 60;
        int h = t4.hour + this.hour+m_rem;
        return new Time(h, m%60, s%60);
    }
    void display()
    {
        System.out.println("HH:MM:SS" + "--> "+ hour+" : "+minute+" : "+second);
    }
}

public class TimeMain {
    public static void main(String[] args) {
        Time t1 = new Time(2, 5, 9);
        Time t2 = new Time(6, 5, 3);
        // t1.display();
        // t2.display();
        Time t3 = t1.addTime(t2);
        t3.display();
    }
}
