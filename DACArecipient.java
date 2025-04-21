/**
 * Represents one person receiving deferred action for childhood arrivals (DACA).
 * 
 * @author Blake Luna-Beltran
 *
 * @version 1.2
 **/


/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
+ toString() : String
+ equals(other : DACArecipient) : boolean
+ printCard() : void
+ jdnToDate(J : int) : String
-----------------------------------------
*/

public class DACArecipient
{

	/***** INSTANCE VARIABLES *****/
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;
	

  public String getSurname(){
		return this.surname;
	}
	public String getGivenName(){
		return this.givenName;
	}
	public String getUscisNumber(){
		return this.uscisNumber;
	}
	public String getCountryOfOrigin(){
		return this.countryOfOrigin;
	}
	public int getBirthday(){
		return this.birthday;
	}
	public int getValidFromDate(){
		return this.validFromDate;
	}
	public int getExpirationDate(){
		return this.expirationDate;
	}
	public char getSex(){
		return this.sex;
	}

	/***** MUTATORS *****/
	
	/*
	 * sets surname to parameter value of calling object
	 * 
	 * @param surname String representhing last name, assume it exists and is valid
	 */

	 public void setSurname(String surname){
		this.surname = surname;
	}
	/*
	 * sets given name to parameter value of calling object
	 * 
	 * @param givenName String representhing first name, assume it exists and is valid
	 */
	public void setGivenName(String givenName){
		this.givenName = givenName;
	}
	/*
	 * sets uscis # to parameter value of calling object
	 * 
	 * @param uscisNumber String representhing uscis #, assume it exists and is valid
	 */
	public void setUscisNumber(String uscisNumber){
		this.uscisNumber = uscisNumber;
	}
	/*
	 * sets country of origin to parameter value of calling object
	 * 
	 * @param countryOfOrigin String representhing country of origin, assume it exists and is valid
	 */
	public void setCountryOfOrigin(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}
	/*
	 * sets birthday to parameter value of calling object
	 * 
	 * @param birthday int representhing birthday, assume it exists and is valid
	 */
	public void setBirthday(int birthday){
		this.birthday = birthday;
	}
	/*
	 * sets valid date to parameter value of calling object
	 * 
	 * @param validFromDate int representhing valid date, assume it exists and is valid
	 */
	public void setValidFromDate(int validFromDate){
		this.validFromDate = validFromDate;
	}
	/*
	 * sets expiration date to parameter value of calling object
	 * 
	 * @param expirationDate int representhing expiration date, assume it exists and is valid
	 */
	public void setExpirationDate(int expirationDate){
		this.expirationDate = expirationDate;
	}
	/*
	 * sets sex to parameter value of calling object
	 * 
	 * @param sex char representhing sex, assume it exists and is valid
	 */
	public void setSex(char sex){
		this.sex = sex;
	}


  /**DESCRIPTION: Assigns parameters to corresponding instance variables of calling DACArecipient. */
	public void setAll(String surname, String givenName, String uscisNumber, 
  String countryOfOrigin, int birthday, int validFromDate, int expirationDate, 
  char sex)
	{
		this.surname = surname;
		this.givenName = givenName;
		this.uscisNumber = uscisNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
		this.validFromDate = validFromDate;
		this.expirationDate = expirationDate;
		this.sex = sex;
	}
	
  /**** CONSTRUCTORS ****/
 
  /*
   * Default constructor sets all instance variables 
   * to defaults from lab requirements
   */
  public DACArecipient()
  {
    setAll("Unknown","Unknown","Unknown",
    "Unknown",2415021,2415021,
    2415021,'X');
  }

    public DACArecipient(String surname, String givenName, String uscisNumber, 
    String countryOfOrigin, int birthday, int validFromDate, int expirationDate, 
    char sex)
    {
      setAll(surname, givenName, uscisNumber, countryOfOrigin, birthday,
       validFromDate, expirationDate, sex);
    }
	/***** OTHER REQUIRED METHODS *****/
  public String toString()
  {
    return "Surname: " + surname + ", Given Name: " + givenName + 
    ", USCIS Number: " + uscisNumber + ", Country of Origin: " + countryOfOrigin + 
    ", Birthday: " + birthday + ", Valid From Date: " + validFromDate +
    ",  Expiration Date: " + expirationDate + ", Sex: " + sex;
  }
}