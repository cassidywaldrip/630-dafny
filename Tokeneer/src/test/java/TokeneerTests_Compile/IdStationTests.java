// Class IdStationTests
// Dafny class IdStationTests compiled into Java
package TokeneerTests_Compile;

import Tokeneer_Compile.*;
import Utils_Compile.*;

@SuppressWarnings({"unchecked", "deprecation"})
public class IdStationTests {
  public IdStationTests() {
  }
  public static Tokeneer_Compile.IdStation fresh__IdStation() {
    return new Tokeneer_Compile.IdStation();
  }
  public static Tokeneer_Compile.Token mock__Token__OpenVersion0__NotIsValid() {
    Tokeneer_Compile.Token tokenMock = org.mockito.Mockito.mock(Tokeneer_Compile.Token.class);
    org.mockito.Mockito.when(tokenMock.fIsValid(org.mockito.Mockito.any(java.math.BigInteger.class))).thenReturn(false);
    org.mockito.Mockito.when(tokenMock.getClearanceLevel()).thenReturn(Tokeneer_Compile.ClearanceLevel.create_Confidential());
    return tokenMock;
  }
  public static Tokeneer_Compile.Token mock__Token__OpenVersion0__IsValid__NotHasClearance() {
    Tokeneer_Compile.Token tokenMock = org.mockito.Mockito.mock(Tokeneer_Compile.Token.class);
    org.mockito.Mockito.when(tokenMock.fIsValid(org.mockito.Mockito.any(java.math.BigInteger.class))).thenReturn(true);
    org.mockito.Mockito.when(tokenMock.getClearanceLevel()).thenReturn(Tokeneer_Compile.ClearanceLevel.create_Confidential());
    return tokenMock;
  }
  public static Tokeneer_Compile.Token mock__Token__OpenVersion0__IsValid__HasClearance() {
    Tokeneer_Compile.Token tokenMock = org.mockito.Mockito.mock(Tokeneer_Compile.Token.class);
    org.mockito.Mockito.when(tokenMock.fIsValid(org.mockito.Mockito.any(java.math.BigInteger.class))).thenReturn(true);
    org.mockito.Mockito.when(tokenMock.getClearanceLevel()).thenReturn(Tokeneer_Compile.ClearanceLevel.create_TopSecret());
    return tokenMock;
  }
  @org.junit.jupiter.api.Test
  public void test__OpenVersion0__NotIsValid()
  {
    Tokeneer_Compile.IdStation _83_idStation;
    Tokeneer_Compile.IdStation _out0;
    _out0 = IdStationTests.fresh__IdStation();
    _83_idStation = _out0;
    (_83_idStation).access = false;
    (_83_idStation).alarm = false;
    (_83_idStation).requiredClearanceLevel = Tokeneer_Compile.ClearanceLevel.create_Secret();
    Tokeneer_Compile.Token _84_token;
    Tokeneer_Compile.Token _out1;
    _out1 = IdStationTests.mock__Token__OpenVersion0__NotIsValid();
    _84_token = _out1;
    java.math.BigInteger _85_fingerprint = java.math.BigInteger.ZERO;
    boolean _86_old__t__isMatch;
    _86_old__t__isMatch = (_84_token).fIsValid(_85_fingerprint);
    boolean _87_isOpen;
    boolean _out2;
    _out2 = (_83_idStation).openVersion0(_84_token, _85_fingerprint);
    _87_isOpen = _out2;
    boolean _88_hasSecurityClearance;
    _88_hasSecurityClearance = (_83_idStation).hasSecurityClearance(_84_token);
    Utils_Compile.Assertions.<Boolean>assertEquals(dafny.TypeDescriptor.BOOLEAN, _83_idStation.access, (_86_old__t__isMatch) && (_88_hasSecurityClearance));
    Utils_Compile.Assertions.<Boolean>assertEquals(dafny.TypeDescriptor.BOOLEAN, _87_isOpen, _83_idStation.access);
    Utils_Compile.Assertions.<Boolean>assertFalse(dafny.TypeDescriptor.BOOLEAN, _87_isOpen);
  }
  @org.junit.jupiter.api.Test
  public void test__OpenVersion0__IsValid__NotHasClearance()
  {
    Tokeneer_Compile.IdStation _89_idStation;
    Tokeneer_Compile.IdStation _out3;
    _out3 = IdStationTests.fresh__IdStation();
    _89_idStation = _out3;
    (_89_idStation).access = false;
    (_89_idStation).alarm = false;
    (_89_idStation).requiredClearanceLevel = Tokeneer_Compile.ClearanceLevel.create_Secret();
    Tokeneer_Compile.Token _90_token;
    Tokeneer_Compile.Token _out4;
    _out4 = IdStationTests.mock__Token__OpenVersion0__IsValid__NotHasClearance();
    _90_token = _out4;
    java.math.BigInteger _91_fingerprint = java.math.BigInteger.ZERO;
    boolean _92_old__t__isMatch;
    _92_old__t__isMatch = (_90_token).fIsValid(_91_fingerprint);
    boolean _93_isOpen;
    boolean _out5;
    _out5 = (_89_idStation).openVersion0(_90_token, _91_fingerprint);
    _93_isOpen = _out5;
    boolean _94_hasSecurityClearance;
    _94_hasSecurityClearance = (_89_idStation).hasSecurityClearance(_90_token);
    Utils_Compile.Assertions.<Boolean>assertEquals(dafny.TypeDescriptor.BOOLEAN, _89_idStation.access, (_92_old__t__isMatch) && (_94_hasSecurityClearance));
    Utils_Compile.Assertions.<Boolean>assertEquals(dafny.TypeDescriptor.BOOLEAN, _93_isOpen, _89_idStation.access);
    Utils_Compile.Assertions.<Boolean>assertFalse(dafny.TypeDescriptor.BOOLEAN, _93_isOpen);
    System.out.print((dafny.DafnySequence.asString("isOpen == ")).verbatimString());
    System.out.print(String.valueOf(_93_isOpen));
  }
  @org.junit.jupiter.api.Test
  public void test__OpenVersion0__IsValid__HasClearance()
  {
    Tokeneer_Compile.IdStation _95_idStation;
    Tokeneer_Compile.IdStation _out6;
    _out6 = IdStationTests.fresh__IdStation();
    _95_idStation = _out6;
    (_95_idStation).access = false;
    (_95_idStation).alarm = false;
    (_95_idStation).requiredClearanceLevel = Tokeneer_Compile.ClearanceLevel.create_Secret();
    Tokeneer_Compile.Token _96_token;
    Tokeneer_Compile.Token _out7;
    _out7 = IdStationTests.mock__Token__OpenVersion0__IsValid__HasClearance();
    _96_token = _out7;
    java.math.BigInteger _97_fingerprint = java.math.BigInteger.ZERO;
    boolean _98_old__t__isMatch;
    _98_old__t__isMatch = (_96_token).fIsValid(_97_fingerprint);
    boolean _99_isOpen;
    boolean _out8;
    _out8 = (_95_idStation).openVersion0(_96_token, _97_fingerprint);
    _99_isOpen = _out8;
    boolean _100_hasSecurityClearance;
    _100_hasSecurityClearance = (_95_idStation).hasSecurityClearance(_96_token);
    Utils_Compile.Assertions.<Boolean>assertEquals(dafny.TypeDescriptor.BOOLEAN, _95_idStation.access, (_98_old__t__isMatch) && (_100_hasSecurityClearance));
    Utils_Compile.Assertions.<Boolean>assertEquals(dafny.TypeDescriptor.BOOLEAN, _99_isOpen, _95_idStation.access);
    Utils_Compile.Assertions.<Boolean>assertTrue(dafny.TypeDescriptor.BOOLEAN, _99_isOpen);
  }
  private static final dafny.TypeDescriptor<IdStationTests> _TYPE = dafny.TypeDescriptor.referenceWithInitializer(IdStationTests.class, () -> (IdStationTests) null);
  public static dafny.TypeDescriptor<IdStationTests> _typeDescriptor() {
    return (dafny.TypeDescriptor<IdStationTests>) (dafny.TypeDescriptor<?>) _TYPE;
  }
}
