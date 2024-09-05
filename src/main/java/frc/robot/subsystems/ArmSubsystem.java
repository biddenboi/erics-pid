package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkPIDController;
import com.revrobotics.CANSparkLowLevel.MotorType;
import frc.robot.Constants.ArmConstants;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
    public CANSparkMax pivotMotor;
    public static ArmSubsystem m_instance;
    RelativeEncoder pivotEncoder;
    SparkPIDController sparkController;

    public static ArmSubsystem getInstance() {
        if (m_instance == null) {
            m_instance = new ArmSubsystem();
        }
        return m_instance;
    }

    public ArmSubsystem() {
        pivotMotor = new CANSparkMax(ArmConstants.PIVOT_ID, MotorType.kBrushless);
        pivotEncoder = pivotMotor.getEncoder();
        sparkController = pivotMotor.getPIDController();
        pivotEncoder.setPosition(0);

        sparkController.setP(ArmConstants.P_GAIN);

        //figure out PID simulation (pid sim on github)
        //profilepid
    }
}
