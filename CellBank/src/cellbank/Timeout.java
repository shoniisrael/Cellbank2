/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellbank;

import java.util.Timer;
import java.util.TimerTask;
 
public class Timeout {
    private int err1;
    private int hour = 0;
    private int minute = 0;
    private int second = 11;
    private Timer timer;
    private boolean isTimerRunning;
        bloqueo bloq=new bloqueo();
     public Timeout() {
        timer = new Timer();
    }
    
    public Timeout(int err1) {
        timer = new Timer();
        this.err1=err1;
        
    }
 
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            isTimerRunning = true;
            if(second > 0) {
                second--;
            } else {
                second = 59;
                if(minute > 0) minute--;
                else {
                    minute = 59;
                    if(hour > 0) hour--;
                    // si segundo = 0, minuto = 0 y hora = 0,
                    // cancelamos el timer
                    else {
                        isTimerRunning = false;
                        timer.cancel();
                        timer.purge();
                    }
                }
            }
           
            
            if(isTimerRunning)
                printTime(hour, minute, second);
                      
        }
    }; // fin timertask
 
    
    
    public void start (int timeout, int interval) {
        timer.schedule(task, timeout, interval);
    }
    
    
      private void printTime(int hour, int minute, int second) {
        String fullHour = "";
 
        fullHour += (hour > 9) ? ":" + hour : "0" + hour;
        fullHour += (minute > 9) ? ":" + minute : ":0" + minute;
        fullHour += (second > 9) ? ":" + second : ":0" + second;
 
        System.out.println(fullHour);
        
        
         if((hour==0)&&(minute==0)&&(second==0)){
             bloq.setVisible(false);
                          Login log=new Login(err1);
                          log.setVisible(true);
         }  else{
                       
                        bloq.setVisible(true);
                        bloq.setTime(fullHour);
                   
         }
         }
    
 
} // fin clase