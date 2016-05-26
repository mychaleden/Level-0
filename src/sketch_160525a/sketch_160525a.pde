import ddf.minim.*;  
AudioSample sound;  
void setup() {
Minim minim = new Minim(this);
//sound = minim.loadSample("kitten-1.wav");  
size(550, 550);
  fill(187,85,017);
ellipse(200,200,200,200);
 fill(170,000,017);
ellipse(200,200,170,170); 
  fill(255,221,85);
ellipse(200,200,150,150);

}
void draw() {
  if(mousePressed){
PImage beef = loadImage("beef.gif");  
    image(beef, mouseX, mouseY);
//  sound.trigger();    
}

}

