package chap11_interface.device;

public class SamsungTv implements ElectronicDevice {
	
	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Samsungtv 화면을 보여 줍니다.");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Samsungtv 소리를 켭니다.");
	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println(channel + " 번으로 Samsungtv 채널변경 합니다.");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Samsungtv 켭니다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Samsungtv 끕니다.");
	}

}
