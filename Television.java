// The purpose of this class is to model a television
// Valentina Franco 2/9/16
public class Television{
  // the television's brand name
  private final String MANUFACTURER;
  // the television's diagnal screen size
  private final int SCREEN_SIZE;
  // the power state of the television
  private boolean powerOn;
  // the station currently tuned to by the TV
  private int channel;
  // the TV's current loudness (0 means no sound)
  private int volume;

//This constructor allows the client to provide a manufacturer
// and screen size for the television instance being created.
  public Television(String brand, int size)
  {
    MANUFACTURER = brand;
    SCREEN_SIZE = size;
    powerOn = false;
    volume = 20;
    channel = 2;
    
  }


}
