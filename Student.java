public class Student {
	private String name;
	private char gender;
	private Date birthDate;
	private Preference pref;
	private boolean matched;
	private int month;
	private int day;
	private int year;
	public int compatabilityScore;

	public Student (){
		name = "Adam";
		gender = 'M';
		matched = false;
		birthDate = new Date (month, day, year);
	}
	public Student(String name, char gender, Date birthDay, Preference pref) {
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDay;
		this.pref = pref;
		}
	public void setName(String name){
		this.name = name;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public void setbirthDay(Date birthDay){
		this.birthDate = birthDay;
	}
	public void setPreference(Preference pref){
		this.pref = pref;
	}
	public void setMatched(boolean matched){
	this.matched = matched;
	}
	public String getName() {
		return name;
	}
	public char getGender(){
		return gender;
	}
	public Date getbirthDay(){
		return birthDate;
	}
	public Preference getPref(){
		return pref;
	}
	public boolean getMatched(){
		return matched;
	}
	public int compare(Student st){
		if(gender != st.gender){
		return 0;
		}

		compatabilityScore = (40 - pref.compare(st.pref)) + (60-birthDate.compare(st.birthDate));

		if (compatabilityScore < 0){
			return 0;
			}
			else if (compatabilityScore > 100){
			return 100;
			}
		return compatabilityScore;
	}

}
