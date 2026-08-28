// Task 2 - Smart Device Control System
// Demonstrates interfaces and multiple inheritance
// using interfaces.


// Wi-Fi capability
interface WiFiEnabled {

    void connectWiFi();
}


// Voice control capability
interface VoiceControlled {

    void respondToVoice(String command);
}


// Music player capability
interface MusicPlayer {

    void playMusic(String song);
}


// Video streaming capability
interface VideoStreaming {

    void streamVideo(String video);
}


// Temperature monitoring capability
interface TemperatureMonitor {

    void showTemperature();
}


// Smart TV
class SmartTV implements WiFiEnabled, VideoStreaming {

    @Override
    public void connectWiFi() {

        System.out.println("Smart TV connected to Wi-Fi.");
    }

    @Override
    public void streamVideo(String video) {

        System.out.println("Smart TV streaming: " + video);
    }
}


// Smart Speaker
class SmartSpeaker implements WiFiEnabled,
                              VoiceControlled,
                              MusicPlayer {

    @Override
    public void connectWiFi() {

        System.out.println("Smart Speaker connected to Wi-Fi.");
    }

    @Override
    public void respondToVoice(String command) {

        System.out.println("Smart Speaker received: " + command);
    }

    @Override
    public void playMusic(String song) {

        System.out.println("Smart Speaker playing: " + song);
    }
}


// Smart AC
class SmartAC implements WiFiEnabled,
                         VoiceControlled,
                         TemperatureMonitor {

    @Override
    public void connectWiFi() {

        System.out.println("Smart AC connected to Wi-Fi.");
    }

    @Override
    public void respondToVoice(String command) {

        System.out.println("Smart AC received: " + command);
    }

    @Override
    public void showTemperature() {

        System.out.println("Current temperature: 24°C");
    }
}


// Smart Camera
class SmartCamera implements WiFiEnabled,
                             VoiceControlled {

    @Override
    public void connectWiFi() {

        System.out.println("Smart Camera connected to Wi-Fi.");
    }

    @Override
    public void respondToVoice(String command) {

        System.out.println("Smart Camera received: " + command);
    }
}


// Smart Car
// Implements four interfaces.
// This demonstrates multiple inheritance through interfaces.
class SmartCar implements WiFiEnabled,
                          VoiceControlled,
                          MusicPlayer,
                          VideoStreaming {

    @Override
    public void connectWiFi() {

        System.out.println("Smart Car connected to Wi-Fi.");
    }

    @Override
    public void respondToVoice(String command) {

        System.out.println("Smart Car received: " + command);
    }

    @Override
    public void playMusic(String song) {

        System.out.println("Smart Car playing: " + song);
    }

    @Override
    public void streamVideo(String video) {

        System.out.println("Smart Car streaming: " + video);
    }
}


// Main class
public class Task2SmartDeviceControl {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("        SMART DEVICE CONTROL SYSTEM");
        System.out.println("==============================================");


        // Smart TV
        SmartTV tv = new SmartTV();

        System.out.println("\n--- Smart TV ---");

        tv.connectWiFi();
        tv.streamVideo("Educational Video");


        // Smart Speaker
        SmartSpeaker speaker = new SmartSpeaker();

        System.out.println("\n--- Smart Speaker ---");

        speaker.connectWiFi();
        speaker.respondToVoice("Play music");
        speaker.playMusic("Perfect");


        // Smart AC
        SmartAC ac = new SmartAC();

        System.out.println("\n--- Smart AC ---");

        ac.connectWiFi();
        ac.respondToVoice("Set temperature to 24");
        ac.showTemperature();


        // Smart Camera
        SmartCamera camera = new SmartCamera();

        System.out.println("\n--- Smart Camera ---");

        camera.connectWiFi();
        camera.respondToVoice("Start recording");


        // Smart Car
        SmartCar car = new SmartCar();

        System.out.println("\n--- Smart Car ---");

        car.connectWiFi();
        car.respondToVoice("Play my playlist");
        car.playMusic("Believer");
        car.streamVideo("News");


        System.out.println("\n==============================================");
        System.out.println("       All devices tested successfully");
        System.out.println("==============================================");
    }
}