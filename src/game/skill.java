package game;

public class skill {

	private String _name;
	private String _effect;
	private int _skillPoint;
	private int _skillCode;

	private int _maxSkill;
	private int _presentSkill;

	public skill(String name, String effect, int skillPoint, int skillCode) {
		_name = name;
		_effect = effect;
		_skillPoint = skillPoint;
		_skillCode = skillCode;
		_maxSkill = 10;
		_presentSkill = 0;
	}

	public String getname() {
		return _name;
	}

	public String geteffect() {
		return _effect;
	}
	
	public void setname(String name, String effect, int skillCode) {
		_name = name;
		_effect = effect;
		_skillCode = skillCode;
	} /* 캐릭터 레벨 상승에 따른 새로운 스킬등록 */
	

	private boolean SkillLevelUp(int skillPoint) {

		if (!isSkillLevel())
			return false;

		_presentSkill += skillPoint;
		System.out.println("SkillLevel이 상승했습니다.");
		return true;
	}
	
	private boolean SkillLevelDown(int skillPoint) {

		if (!isSkillLevel())
			return false;

		_presentSkill = skillPoint;
		System.out.println("SkillLevel이 감소했습니다.");
		return true;
	}
	
	private boolean isSkillLevel() {
		if (_maxSkill - _presentSkill < 0) {
			System.out.println(" X : 더이상 SkillPoint를 높일 수 없습니다.");
			return false;
		}else if (_presentSkill < 0) {
			System.out.println("X : 더이상 SkillPoint를 내릴 수 없습니다.");
			return false;
		}
		return true;
	}
}
