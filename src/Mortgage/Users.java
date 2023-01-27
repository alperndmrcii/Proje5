package Mortgage;

public class Users {

  private String username;
  private String whichCondition;
  private String houseType;

  private int roomCount;
  private int downPayment;
  private int longTerm;

  private StatesTax statesTax;

    public Users(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        setUsername(username);
        setWhichCondition(whichCondition);
        setDownPayment(downPayment);
        setHouseType(houseType);
        setLongTerm(longTerm);
        setStatesTax(statesTax);
        setRoomCount(roomCount);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWhichCondition() {
        return whichCondition;
    }

    public void setWhichCondition(String whichCondition) {
        this.whichCondition = whichCondition;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(int downPayment) {
        this.downPayment = downPayment;
    }

    public int getLongTerm() {
        return longTerm;
    }

    public void setLongTerm(int longTerm) {
        this.longTerm = longTerm;
    }

    public StatesTax getStatesTax() {
        return statesTax;
    }

    public void setStatesTax(StatesTax statesTax) {
        this.statesTax = statesTax;
    }
}
/*

        User Class, HousePrices Class ının ebeveyn classidir.

        her bir User in almasi gereken attribute lar private olmalıdır ve su sekildedir:

        String olanlar -> username, whichCondtiton, houseType
        int olanlar -> roomCount, downPayment, longTerm

        ve son olarakta StatesTax cinsinden bir StatesTax olmalıdır:

        "private StatexTax statesTax;"


     /

    //--------------------------------------------------------------
    // -> Attributes
    //--------------------------------------------------------------




    /

        Bir constructor methodu oluşturup, tüm attribute lar constructorda gelmeli ve daha sonra sınıfın kendi attributelarına
    eşitlenmelidir.

     */

//--------------------------------------------------------------
// -> Constructor
//--------------------------------------------------------------






// Son olarak ise tüm attributelar icin sadece getter methodlar oluşmalıdır.

//--------------------------------------------------------------
// -> Methods
//--------------------------------------------------------------
