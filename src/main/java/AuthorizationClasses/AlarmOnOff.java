package AuthorizationClasses;

public class AlarmOnOff {
    public static Boolean on(boolean alarmStatus){
        if(alarmStatus==false) return alarmStatus=true;
        else{return alarmStatus=true;}
    }
    public static Boolean off(boolean alarmStatus){
        if(alarmStatus==true) return alarmStatus=false;
        else{return alarmStatus=false;}
    }
}
