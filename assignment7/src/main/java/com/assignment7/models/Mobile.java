package com.assignment7.models;

public class Mobile {
  private Camera camera;
  private Screen screen;
  private Speaker speaker;
public Camera getCamera() {
	return camera;
}
public void setCamera(Camera camera) {
	this.camera = camera;
}
public Screen getScreen() {
	return screen;
}
public void setScreen(Screen screen) {
	this.screen = screen;
}
public Speaker getSpeaker() {
	return speaker;
}
public void setSpeaker(Speaker speaker) {
	this.speaker = speaker;
}
@Override
public String toString() {
	return "Mobile [camera=" + camera.toString() + ", screen=" + screen.toString() + ", speaker=" + speaker.toString() + "]";
}
  


  
	
	
}
