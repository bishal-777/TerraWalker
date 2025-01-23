#include <Wire.h>
#include <Adafruit_PWMServoDriver.h>

Adafruit_PWMServoDriver pca9685 = Adafruit_PWMServoDriver();

#define SERVO_MIN 150
#define SERVO_MAX 600

#define FRONT_LEFT_H  0  
#define FRONT_LEFT_V  1  
#define FRONT_RIGHT_H 2
#define FRONT_RIGHT_V 3
#define BACK_LEFT_H   4
#define BACK_LEFT_V   5
#define BACK_RIGHT_H  6
#define BACK_RIGHT_V  7

char command;  // Stores Bluetooth command

void setup() {
    // Serial.begin(9600);     // Serial Monitor (PC)
    // Serial1.begin(9600);    // Bluetooth HC-05 (TX1/RX1)

    pca9685.begin();
    pca9685.setPWMFreq(50);
}

void moveServo(int channel, int angle) {
    int pulse = map(angle, 0, 180, SERVO_MIN, SERVO_MAX);
    pca9685.setPWM(channel, 0, pulse);
}

void moveLeg(int h_servo, int v_servo, int h_angle, int v_angle) {
    moveServo(v_servo, v_angle);  
    delay(300);
    moveServo(h_servo, h_angle);  
    delay(300);
    moveServo(v_servo, 90);       
    delay(300);
}

// Walking Forward
void walkForward() {
    moveLeg(FRONT_LEFT_H, FRONT_LEFT_V, 120, 45);
    moveLeg(BACK_RIGHT_H, BACK_RIGHT_V, 120, 45);
    moveLeg(FRONT_RIGHT_H, FRONT_RIGHT_V, 120, 45);
    moveLeg(BACK_LEFT_H, BACK_LEFT_V, 120, 45);
}

// Walking Backward
void walkBackward() {
    moveLeg(FRONT_LEFT_H, FRONT_LEFT_V, 60, 45);  // Move backward
    moveLeg(BACK_RIGHT_H, BACK_RIGHT_V, 60, 45);  // Move backward
    moveLeg(FRONT_RIGHT_H, FRONT_RIGHT_V, 60, 45);  // Move backward
    moveLeg(BACK_LEFT_H, BACK_LEFT_V, 60, 45);  // Move backward
}

// Turning Left
void turnLeft() {
    moveLeg(FRONT_LEFT_H, FRONT_LEFT_V, 60, 45);
    moveLeg(BACK_LEFT_H, BACK_LEFT_V, 60, 45);
    moveLeg(FRONT_RIGHT_H, FRONT_RIGHT_V, 120, 45);
    moveLeg(BACK_RIGHT_H, BACK_RIGHT_V, 120, 45);
}

// Turning Right
void turnRight() {
    moveLeg(FRONT_RIGHT_H, FRONT_RIGHT_V, 60, 45);
    moveLeg(BACK_RIGHT_H, BACK_RIGHT_V, 60, 45);
    moveLeg(FRONT_LEFT_H, FRONT_LEFT_V, 120, 45);
    moveLeg(BACK_LEFT_H, BACK_LEFT_V, 120, 45);
}

void loop() {
    // if (Serial1.available()) {  // Check if Bluetooth sends data
    //     command = Serial1.read();  
    //     Serial.println(command);

    //     if (command == 'F') {
            walkForward();
        //     delay(500)
        // // } else if (command == 'B') {
        //     walkBackward();  // Move backward
        // // } else if (command == 'L') {
        //     turnLeft();
        //     walkForward
        // // } else if (command == 'R') {
        //     turnRight();
        //     walkForward
    //     }
    // }
}
