/*
 * Copyright 2026 FRCSoftware
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */
package first.robot;

import org.wpilib.framework.OpModeRobot;
import com.revrobotics.spark.SparkMax;

/**
 * The methods in this class are called automatically as described in the OpModeRobot documentation.
 * OpMode classes anywhere in the package (or sub-packages) where this class is located are
 * automatically registered to display in the Driver Station. If you change the name of this class
 * or the package after creating this project, you must also update the Main.java file in the
 * project.
 */
public class Robot extends OpModeRobot {

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  private final SparkMax leftLeader = new SparkMax(CANPort.CAN_S0, 0, MotorType.kBrushless);
  private final SparkMax leftFollower = new SparkMax(CANPort.CAN_S0, 1, MotorType.kBrushless);
  private final SparkMax rightLeader = new SparkMax(CANPort.CAN_S0, 2, MotorType.kBrushless);
  private final SparkMax rightFoller = new SparkMax(CANPort.CAN_S0, 3, MotorType.kBrushless);
  
  public Robot() {
    SparkMaxConfig leftConfig = new SparkMaxConfig();
    leftConfig.inverted(true);
    leftLeader.configure(leftConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    leftFollower.configure(leftConfig., ResetMode
  }
  @Override
  public void simulationPeriodic() {}
}
