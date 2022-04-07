// Class IdStation
// Dafny class IdStation compiled into Java
package Tokeneer_Compile;


@SuppressWarnings({"unchecked", "deprecation"})
public class IdStation {
  public IdStation() {
    this.alarm = false;
    this.access = false;
    this.requiredClearanceLevel = ClearanceLevel.Default();
  }
  public boolean alarm;
  public boolean access;
  public ClearanceLevel requiredClearanceLevel;
  public void idStation(ClearanceLevel requiredClearanceLevel)
  {
    (this).alarm = false;
    (this).access = false;
    (this).requiredClearanceLevel = requiredClearanceLevel;
  }
  public boolean hasSecurityClearance(Token t) {
    return (((((t).getClearanceLevel()).is_Confidential()) && ((this.requiredClearanceLevel).is_Confidential())) || ((((t).getClearanceLevel()).is_Secret()) && (((this.requiredClearanceLevel).is_Confidential()) || ((this.requiredClearanceLevel).is_Secret())))) || ((((t).getClearanceLevel()).is_TopSecret()) && ((((this.requiredClearanceLevel).is_Confidential()) || ((this.requiredClearanceLevel).is_Secret())) || ((this.requiredClearanceLevel).is_TopSecret())));
  }
  public boolean openVersion0(Token t, java.math.BigInteger fingerprint)
  {
    boolean access = false;
    boolean _80_isValid;
    _80_isValid = (t).fIsValid(fingerprint);
    boolean _81_hasSecurityClearance;
    _81_hasSecurityClearance = (this).hasSecurityClearance(t);
    (this).access = (_80_isValid) && (_81_hasSecurityClearance);
    access = this.access;
    return access;
  }
  public boolean openVersion1(Token t, java.math.BigInteger fingerprint)
  {
    boolean access = false;
    boolean _82_isValid;
    _82_isValid = (t).fIsValid(fingerprint);
    if (_82_isValid) {
      if ((this).hasSecurityClearance(t)) {
        (this).access = (t).fIsValid(fingerprint);
      }
    }
    access = this.access;
    return access;
  }
  private static final dafny.TypeDescriptor<IdStation> _TYPE = dafny.TypeDescriptor.referenceWithInitializer(IdStation.class, () -> (IdStation) null);
  public static dafny.TypeDescriptor<IdStation> _typeDescriptor() {
    return (dafny.TypeDescriptor<IdStation>) (dafny.TypeDescriptor<?>) _TYPE;
  }
}
