package Week09;

interface Command {
    public void execute();
}

class NoCommand implements Command {
    public void execute() { }
}

class Light {
    public void on(){
        System.out.println("조명을 켭니다.");
    }
    public void off(){
        System.out.println("조명을 끕니다.");
    }
}

class Stereo {
    public void on() {
        System.out.println("오디오를 켭니다.");
    }

    public void setCD() {
        System.out.println("CD를 재생합니다.");
    }

    public void setVolume(int volume) {
        System.out.println("볼륨을 " + volume + "으로 지정합니다.");
    }
}

class GarageDoor {
    public void up() {
        System.out.println("차고문을 올립니다.");
    }
    public void down() {
        System.out.println("차고문을 내립니다.");
    }
    public void stop() {
        System.out.println("차고문을 멈춥니다.");
    }
    public void lightOn() {
        System.out.println("차고 전등을 켭니다.");
    }
    public void lightOff() {
        System.out.println("차고 전등을 끕니다.");
    }
}

class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}

class LightOnCommand implements Command { // Command 인터페이스를 구현하는 커맨드 클래스
    Light light;

    // 생성자에 이 커맨드 객체로 제어할 특정 조명의 정보가 전달됩니다.
    // 그 객체는 light 이라는 인스턴스 변수에 저장됩니다.
    // execute() 메소드가 호출되면 light 객체가 바로 그 요청의 리시버가 됩니다.
    public LightOnCommand(Light light) {
        this.light = light;
    }

    // execute() 메소드는 리시버 객체인 light 객체에 있는 on() 메소드를 호출합니다.
    @Override
    public void execute() {
        light.on();
    }
}

class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}

// 인보커
class SimpleRemoteControl {
    // 커맨드를 저장할 슬롯이 1개 있습니다.
    // 이 슬록으로 1개의 기기를 제어합니다.
    Command slot;

    public SimpleRemoteControl() {}

    // 슬롯을 가지고 제어할 명령을 설정하는 메소드입니다.
    // 리모컨 버튼의 기능을 바꾸고 싶다면 이 메소드로 얼마든지 바꿀 수 있습니다.
    public void setCommand(Command command) {
        slot = command;
    }

    // 버튼을 누르면 메소드가 호출됩니다.
    // 지금 슬롯에 연결된 커맨드 객체의 execute() 메소드만 호출하면 됩니다.
    public void buttonWasPressed() {
        slot.execute();
    }
}

// 리모컨
// 7개의 ON, OFF 명령을 처리합니다.
class RemoteControl {
    // 각 명령은 배열에 저장
    Command[] onCommands;
    Command[] offCommands;

    // 기본 생성자는 각 ON, OFF 배열의 인스턴스를 만들고 초기화합니다.
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    // setCommand() 메소드는 슬롯 번호와 그 슬롯에 저장할 ON, OFF 커맨드 객체를 인자로 전달받습니다.
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        // 각 커맨드 객체는 나중에 사용하기 편하게 onCommand와 offCommand 배열에 저장합니다.
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // 사용자가 ON, OFF 버튼을 누르면 리모컨 하드웨어에서 각 버튼에 대응하는 메소드를 호출합니다.
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ 리모컨 ------\ㅜ");
        for(int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "   " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
public class RemoteControlTest { // 클라이언트
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light(); // 리시버
        LightOnCommand lightOn = new LightOnCommand(light); // 커맨드 객체 생성, 리시버 전달

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn); // 커맨드 객체를 인보커에게 전달
        remote.buttonWasPressed(); // 버튼 실행 execute()

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
