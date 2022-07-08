import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class MinNoOfMeetingRooms {
    class Job{
        int id;
        int startTime;
        int endTime;
        // boolean live;
        public Job(int id, int startTime, int endTime) {
            this.id = id;
            this.startTime = startTime;
            this.endTime = endTime;
            // live = false;
        }
        

    }
    public static int minNoOfMeetingRooms(ArrayList<Job> jobs) {
            
            ArrayList<Job> rooms = new ArrayList<>();
            Collections.sort(jobs,new Custom());
            for (Job job : jobs) {
                if(rooms.size() == 0){
                    rooms.add(job);
                }
                else{
                    boolean scheduled= false;
                    for (Job inJob : rooms) {
                        scheduled= false;
                       if(inJob.endTime < job.startTime){
                            rooms.remove(inJob);
                            rooms.add(job);
                            scheduled = true;
                            break;
                       } 
                    }
                    if(!scheduled){
                        rooms.add(job);
                    }
                }
                
            }
            return rooms.size();
        }
    static class Custom implements Comparator<Job>{

        @Override
        public int compare(MinNoOfMeetingRooms.Job o1, MinNoOfMeetingRooms.Job o2) {
            // TODO Auto-generated method stub
            return o1.startTime - o2.startTime;
        }

        
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Job> jobs = new ArrayList<>();
        MinNoOfMeetingRooms j = new MinNoOfMeetingRooms();
        for (int i = 0; i <4; i++) {
            System.out.println("enter the StartTime for job"+(i+1));
            int startTime =  sc.nextInt();
            
            System.out.println("enter the EndTime for job"+(i+1));
            int endTime =  sc.nextInt();
            jobs.add(j.new Job(i+1, startTime, endTime));
        }
        
       
        System.out.println(minNoOfMeetingRooms(jobs));
        sc.close();
    }
    
}
