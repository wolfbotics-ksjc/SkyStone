package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@TeleOp

public class sampleTeloOpTest extends LinearOpMode {

    DcMotor TLeft;
    DcMotor BLeft;
    DcMotor TRight;
    DcMotor BRight;
    DcMotor RIntake;
    DcMotor LIntake;

    double drivePower = 0.7;

    @Override
    public void runOpMode() {
        TLeft = hardwareMap.dcMotor.get("top_left_wheel");
        TRight = hardwareMap.dcMotor.get("top_right_wheel");
        BLeft = hardwareMap.dcMotor.get("bottom_left_wheel");
        BRight = hardwareMap.dcMotor.get("bottom_right_wheel");

        TRight.setDirection(DcMotor.Direction.REVERSE);
        TLeft.setDirection(DcMotor.Direction.REVERSE);
        BLeft.setDirection(DcMotor.Direction.REVERSE);
        BRight.setDirection(DcMotor.Direction.REVERSE);

        RIntake.setDirection(DcMotor.Direction.FORWARD);
        LIntake.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            //what to do while robot is running


        }

    }



        /*
        TLeft = gamepad1.left_stick_y;
        TRight = gamepad1.right_stick_y;
        BLeft = gamepad1.left_stick_y;
        BRight = gamepad1.right_stick_y;

        RIntake = gamepad1.right_bumper;
        LIntake = gamepad1.left_bumper;
        */

}
