
package javaapplication8;

public class Time {
    int hour,minute,second;
    Time(int h,int m,int s)
    {
        hour=h;
        minute=m;
        second=s;
    }
    public Time add(Time t)
    {
    int s=this.second+t.second;
    int m=this.minute+t.minute;
    int h=this.hour+t.hour;
    if(s>=60)
    {
        m+=s/60;
        s=s%60;
        
    }
    if(m>=60)
    {
        h+=m/60;
        m=m%60;
    }
    return new Time(h,m,s);
    }
    public void display()
    {
        System.out.println(hour+" hrs "+minute+" mins "+second+" secs ");
    }
    
}
