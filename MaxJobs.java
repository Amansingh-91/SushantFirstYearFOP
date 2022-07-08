import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class MaxJobs {
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
    public static ArrayList<Job> maxMeeting(ArrayList<Job> jobs){
        ArrayList<Job> registered = new ArrayList<>();
        Collections.sort(jobs,new Custom());
        Job temp = null;
        for (Job job : jobs) {
            if(temp == null){
                registered.add(job);
                temp =  job;
            }
            else if(temp.endTime < job.startTime){
                temp = job;
                registered.add(job);
            }
        }
        return registered;
    }
    public static ArrayList<Job> maxMeeting(ArrayList<Job> jobs, int numberOfMeetingRooms){
        ArrayList<Job> registered = new ArrayList<>();
        Collections.sort(jobs,new Custom());
        Job temp[] = new Job[numberOfMeetingRooms] ;
        for (Job job : jobs) {
           for (int i = 0; i < temp.length; i++) {
                if(temp[i] == null){
                    registered.add(job);
                    temp[i] =  job;
                    break;
                }
                else if(temp[i].endTime < job.startTime){
                    temp[i] = job;
                    registered.add(job);
                    break;
                }
           }
        }
        return registered;
    }
    static class Custom implements Comparator<MaxJobs.Job>{

        @Override
        public int compare(MaxJobs.Job o1, MaxJobs.Job o2) {
            // TODO Auto-generated method stub
            return o1.endTime - o2.endTime;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Job> jobs = new ArrayList<>();
        MaxJobs j = new MaxJobs();
        for (int i = 0; i <5; i++) {
            System.out.println("enter the StartTime for job"+(i+1));
            int startTime =  sc.nextInt();
            
            System.out.println("enter the EndTime for job"+(i+1));
            int endTime =  sc.nextInt();
            jobs.add(j.new Job(i+1, startTime, endTime));
        }
        
        ArrayList<Job> newJobs = maxMeeting(jobs);
        for (Job job :newJobs ) {
            System.out.println("job"+ job.id);
            
        }
        System.out.println(newJobs.size());
        sc.close();
    }
    
    
}
