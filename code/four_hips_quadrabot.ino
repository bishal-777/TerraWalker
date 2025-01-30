/*
This is a idea for Qudrabot robot that moves with only its hips.
Firstly individual components move then all the components move to go in the desired direction.
For any queries goodcapinqury@gmail.com
*/


#include<Servo.h>

Servo frh,flh,brh,blh;
char rot='S';
int del;
void setup() {
  
  Serial.begin(9600);
  pinMode(1,OUTPUT);
  del = 1000; //Set delay according to your own preference
  frh.attach(2);
  flh.attach(3);
  brh.attach(4);
  blh.attach(5);
}

void loop() {   
if(Serial.available())
   {
     rot = Serial.read();
     Serial.println(rot);
   }
   
   if(rot == 'F')
   {
     abhifwd();
   }else if (rot == 'R')
   {
     abhiright();
   }else if(rot == 'L')
   {
     abhileft();
   }
   else{
     abhiset();   
   }
}

void abhifwd()
{
frh.write(180);
delay(del);
brh.write(180);
delay(del);

flh.write(90);
delay(del); 
blh.write(0);
delay(del); 

flh.write(180);
blh.write(180);

frh.write(0);
brh.write(0);
delay(del);


}
void abhiright()
{
flh.write(90);
delay(del); 
blh.write(0);
delay(del); 

flh.write(180);
blh.write(180);
delay(del);
}
void abhileft()
{
frh.write(180);
delay(del);
brh.write(180);
delay(del);

frh.write(0);
brh.write(0);
delay(del);
}
void abhiset()
{        
  flh.write(150);
  delay(del); 
  frh.write(120);
  delay(del); 
  brh.write(90);
  delay(del); 
  blh.write(120);
  delay(del); 
}