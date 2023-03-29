package chap11_interface.device;

public class LgTv implements ElectronicDevice {
	
	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Lgtv 화면을 보여 줍니다.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Lgtv 소리를 켭니다.");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println(channel + " 번으로 Lgtv 채널변경 합니다..");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Lgtv 켭니다.");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Lgtv 끕니다.");

	}

}
