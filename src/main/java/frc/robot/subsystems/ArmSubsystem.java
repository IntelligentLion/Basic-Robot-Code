package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;




public class ArmSubsystem extends SubsystemBase {

    private final CANSparkMax arm; 
    private double speed; 
    public ArmSubsystem() {
        this.arm = new CANSparkMax(Constants.ARM_MOTOR_1_PORT, MotorType.kBrushless);
        this.arm = new CANSparkMax(Constants.ARM_MOTOR_2_PORT, MotorType.kBrushless);

    }

    MotorSpeed = 0.5;
    public void frc.robot.subsystems.setMotorSpeed(ARM_MOTOR_1_PORT) = (MotorSpeed)
    public void setMotorSpeed(ARM_MOTOR_2_PORT) = Math.sin(MotorSpeed)/2



    
}