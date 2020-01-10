/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//imports
package frc.robot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.FirePiston;
import frc.robot.commands.ReturnPiston;
import frc.robot.subsystems.Piston;
//imports

public class RobotContainer {

//subsystems
private final Piston piston = new Piston();
//subsystems

//commands
private final FirePiston firePiston = new FirePiston(piston);
private final ReturnPiston returnPiston = new ReturnPiston(piston);
//commands


public Joystick xbox = new Joystick(0);
public Button aButton = new JoystickButton(xbox, 1);
public Button yButton = new JoystickButton(xbox, 4);


  public RobotContainer() {

    configureButtonBindings();
  }



  private void configureButtonBindings() {

      aButton.whenPressed(firePiston);
      yButton.whenPressed(returnPiston);



  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonom
    Command command = null;
  
    return command;
  }
}