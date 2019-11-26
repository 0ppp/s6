object Prg10
{
	def reverseString(ch:Char):Char=
	{
		if(ch.isLower)
			ch.toUpper;
		else
			ch.toLower;
	}


	def main(args:Array[String])
	{
		var ch=' ';
		var str=" ";
		
		println("Enter String:");
		str=Console.readLine();

		var str1=new StringBuilder(str);		
		println("Enter character:");
		ch=Console.readChar();	
				
		str1.deleteCharAt(str1.indexOf(ch.toString()));	
		var str3=str1.deleteCharAt(str1.lastIndexOf(ch.toString())).toString;
	
		var str4=str3.map(reverseString)
		println(str4);
			
	}
}

