int x = 155;
int y = 251;
int birdYVelocity = 30;
int gravity = 1;
void setup (){
  size (501, 501);
}
void draw (){
  background(#19AEE3);
fill(#F3FC03);
stroke(0,0,0);

ellipse(x, y, 45, 45);
y += gravity;

}
void mousePressed(){
  

}
