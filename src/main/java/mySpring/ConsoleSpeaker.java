package mySpring;

import lombok.Builder;

@Builder
public class ConsoleSpeaker implements Speaker {




    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
