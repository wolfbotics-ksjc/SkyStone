package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


@TeleOp (name="Mechanum Teleop Test", group="TeleOp")
public class mecanumdriveopmode extends LinearOpMode{
    private DcMotor topleftmotor;
    private DcMotor toprightmotor;
    private DcMotor bottomleftmotor;
    private DcMotor bottomrightmotor;



    public void runOpMode() throws InterruptedException {

        topleftmotor = hardwareMap.dcMotor.get("topleftmotor");
        toprightmotor = hardwareMap.dcMotor.get("toprightmotor");
        bottomleftmotor = hardwareMap.dcMotor.get("bottomleftmotor");
        bottomrightmotor = hardwareMap.dcMotor.get("bottomrightotor");

        waitForStart();

        while (opModeIsActive())
        {
            topleftmotor.setPower(gamepad1.left_stick_y);
            toprightmotor.setPower(gamepad1.right_stick_y);
            bottomrightmotor.setPower(gamepad2.right_stick_y);
            bottomleftmotor.setPower(gamepad2.left_stick_y);


        }


    }
}
