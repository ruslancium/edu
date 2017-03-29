package by.epam.jmp.less031517.videoConference;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ruslan_Arifullin on 3/29/2017.
 */
public class Participant implements Runnable {

    private VideoConference conference;
    private String name;

    public Participant(VideoConference conference, String name) {
        this.conference=conference;
        this.name=name;
    }

    @Override
    public void run() {
        long duration=(long)(Math.random()*10);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        conference.arrive(name);
    }


}
