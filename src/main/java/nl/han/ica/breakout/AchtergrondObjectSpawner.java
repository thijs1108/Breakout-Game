package nl.han.ica.breakout;

import java.util.Random;

import nl.han.ica.OOPDProcessingEngineHAN.Alarm.Alarm;
import nl.han.ica.OOPDProcessingEngineHAN.Alarm.IAlarmListener;
import nl.han.ica.OOPDProcessingEngineHAN.Sound.Sound;
import nl.han.ica.waterworld.Bubble;
import nl.han.ica.waterworld.WaterWorld;

public class AchtergrondObjectSpawner implements IAlarmListener {
	private double achtergrondObjectPerSecond;
    private Random random;
    private BreakoutWorld world;
    
    public AchtergrondObjectSpawner(BreakoutWorld world,double achtergrondObjectPerSecond) {
        this.achtergrondObjectPerSecond=achtergrondObjectPerSecond;
        this.world=world;
        random=new Random();
        startAlarm();
    }

    private void startAlarm() {
        Alarm alarm=new Alarm("New AchtergrondObject",1/achtergrondObjectPerSecond);
        alarm.addTarget(this);
        alarm.start();
    }

    @Override
    public void triggerAlarm(String alarmName) {
    	AchtergrondObject a;
    	if(random.nextInt(3)==1){
    		a = new Rocket(world);
    	}
    	else{
    		a = new Ufo(world);
    	}
    	a.setSpeed();
        world.addGameObject(a, random.nextInt(world.getWidth()), world.getHeight());
        startAlarm();
    }
}
