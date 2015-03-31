package helloworld;

/**
* helloworld/HelloWorldHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� helloworld.idl
* 2015��3��31�� ���ڶ� ����05ʱ50��30�� CST
*/

public final class HelloWorldHolder implements org.omg.CORBA.portable.Streamable
{
  public helloworld.HelloWorld value = null;

  public HelloWorldHolder ()
  {
  }

  public HelloWorldHolder (helloworld.HelloWorld initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = helloworld.HelloWorldHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    helloworld.HelloWorldHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return helloworld.HelloWorldHelper.type ();
  }

}
