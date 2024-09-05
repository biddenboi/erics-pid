// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static class ArmConstants {
    public static final int kPIVOT_ID = 25;
    public static final double kP_GAIN = 1;
    public static final double kPIVOT_GEAR_RATIO = 1.0;

    //Crescendo MotorController
    public static final double kPOSITION_CONVERSION_FACTOR = kPIVOT_GEAR_RATIO * 2 * Math.PI;
    public static final double kVELOCITY_CONVERSION_FACTOR = kPOSITION_CONVERSION_FACTOR / 60; 
    //[Q] we multiply velocity by max rpm and we need to figure out how many in seconds + what does it do
  }
}
