package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.OperatorConstants;




public class ArmSubsystem extends SubsystemBase {

    private final CANSparkMax arm1; 
    private final CANSparkMax arm2;
    private double speed; 
    public ArmSubsystem() {
        this.arm1 = new CANSparkMax(OperatorConstants.ARM_MOTOR_1_PORT, MotorType.kBrushless);
        this.arm2 = new CANSparkMax(OperatorConstants.ARM_MOTOR_2_PORT, MotorType.kBrushless);

    }

    public void setMotor1Speed(double speed) {
        this.arm1.set(speed);
    }

    public void setMotor2Speed(double speed) {
        this.arm2.set(speed);
    }

    public void setMotorSpeeds(double speed1, double speed2) {
        this.arm1.set(speed1);
        this.arm2.set(speed2);
    }


    
}