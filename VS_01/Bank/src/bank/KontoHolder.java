package bank;

/**
* bank/KontoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from bank.idl
* Mittwoch, 26. März 2014 15:55 Uhr MEZ
*/

public final class KontoHolder implements org.omg.CORBA.portable.Streamable
{
  public bank.Konto value = null;

  public KontoHolder ()
  {
  }

  public KontoHolder (bank.Konto initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = bank.KontoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    bank.KontoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return bank.KontoHelper.type ();
  }

}