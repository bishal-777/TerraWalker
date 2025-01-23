#include <Wire.h>
#include <Adafruit_PWMServoDriver.h>

// Create an instance of the PCA9685 driver
Adafruit_PWMServoDriver pwm = Adafruit_PWMServoDriver(0x40); // Default I2C address

// Servo configuration
#define SERVOMIN 150 // Minimum pulse length count (adjust as needed)
#define SERVOMAX 600 // Maximum pulse length count (adjust as needed)

// Define servo channels for each leg
#define FRONT_LEFT_HIP 5
#define FRONT_LEFT_KNEE 1
#define FRONT_RIGHT_HIP 4
#define FRONT_RIGHT_KNEE 0
#define BACK_LEFT_HIP 7
#define BACK_LEFT_KNEE 3
#define BACK_RIGHT_HIP 6
#define BACK_RIGHT_KNEE 2

void setup() {

    // Serial.begin(9600);     // Serial Monitor (PC)
    // Serial1.begin(9600);    // Bluetooth HC-05 (TX1/RX1)
  Serial.begin(9600);
  Serial.println("Starting Quadpod Robot...");
 f06fc1f (push)

  pwm.begin();            // Initialize PCA9685
  pwm.setPWMFreq(50);     // Set frequency to 50 Hz for servos

  // Initialize all servos to their default positions
  setServoAngle(FRONT_LEFT_HIP, 90);
  setServoAngle(FRONT_LEFT_KNEE, 90);
  setServoAngle(FRONT_RIGHT_HIP, 90);
  setServoAngle(FRONT_RIGHT_KNEE, 90);
  setServoAngle(BACK_LEFT_HIP, 90);
  setServoAngle(BACK_LEFT_KNEE, 90);
  setServoAngle(BACK_RIGHT_HIP, 90);
  setServoAngle(BACK_RIGHT_KNEE, 90);
 // Allow servos to stabilize
}

// Function to set servo angle
void setServoAngle(uint8_t servoChannel, uint16_t angle) {
  uint16_t pulseLength = map(angle, 0, 180, SERVOMIN, SERVOMAX);
  pwm.setPWM(servoChannel, 0, pulseLength);
}

// Simple walking sequence
void walkForward() {
  // Step 1: Lift front-left and back-right legs
  setServoAngle(FRONT_LEFT_KNEE, 60);  // Lift
  setServoAngle(BACK_RIGHT_KNEE, 60);  // Lift
  delay(300);

  // Step 2: Move lifted legs forward
  setServoAngle(FRONT_LEFT_HIP, 120); // Forward
  setServoAngle(BACK_RIGHT_HIP, 60);  // Forward
  delay(300);

  // Step 3: Lower lifted legs
  setServoAngle(FRONT_LEFT_KNEE, 90); // Lower
  setServoAngle(BACK_RIGHT_KNEE, 90); // Lower
  delay(300);

  // Step 4: Lift front-right and back-left legs
  setServoAngle(FRONT_RIGHT_KNEE, 60); // Lift
  setServoAngle(BACK_LEFT_KNEE, 60);   // Lift
  delay(300);

  // Step 5: Move lifted legs forward
  setServoAngle(FRONT_RIGHT_HIP, 120); // Forward
  setServoAngle(BACK_LEFT_HIP, 60);    // Forward
  delay(300);

  // Step 6: Lower lifted legs
  setServoAngle(FRONT_RIGHT_KNEE, 90); // Lower
  setServoAngle(BACK_LEFT_KNEE, 90);   // Lower
  delay(300);

  // Step 7: Reset hip positions to neutral
  setServoAngle(FRONT_LEFT_HIP, 90);
  setServoAngle(BACK_RIGHT_HIP, 90);
  setServoAngle(FRONT_RIGHT_HIP, 90);
  setServoAngle(BACK_LEFT_HIP, 90);
  delay(300);
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

  //walkForward(); // Call the walking sequence repeatedly
  manufwd();

}

void manufwd()
{
  setServoAngle(BACK_RIGHT_KNEE,60);
  setServoAngle(BACK_LEFT_KNEE,60);
  delay(500);
  setServoAngle(BACK_RIGHT_KNEE,150);
  setServoAngle(BACK_LEFT_KNEE,150);
  delay(500);
  /*
  setServoAngle(FRONT_LEFT_KNEE,150);
  setServoAngle(FRONT_LEFT_HIP,60);
  setServoAngle(FRONT_LEFT_KNEE,90);
  setServoAngle(BACK_RIGHT_KNEE,150);
  setServoAngle(BACK_RIGHT_HIP,150);
  setServoAngle(BACK_RIGHT_KNEE,90);
  setServoAngle(FRONT_RIGHT_KNEE,150);
  setServoAngle(FRONT_RIGHT_HIP,150);
  setServoAngle(FRONT_RIGHT_KNEE,90);
  setServoAngle(BACK_LEFT_KNEE,150);
  setServoAngle(BACK_LEFT_HIP,150);
  setServoAngle(BACK_LEFT_KNEE,90);
*/
}
