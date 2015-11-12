

public class StringMethods 
{
	public static void main(String [] args)
	{
		String copy = "copy";
		String copyCapital = "COPY";
		String cat = "cat";
		String cats = "cat";
		String ca = "ca";
		String space = " space  ";
		
		System.out.println("The Strings are: \ncopy: \"copy\"\ncopyCapital: \"COPY\"\ncat: \"cat\"\ncats: \"cat\"\nca: \"ca\"\nspace: \" space  \"");
		System.out.println("charAt at position 4 of copy: " +copy.charAt(3));
		System.out.println("copy.concat(cat): " + copy.concat(cat));
		System.out.println("copy.equals(cat): " + copy.equals(cat));
		System.out.println("copy.equalsIgnoreCase(copyCapital): " + copy.equalsIgnoreCase(copyCapital));
		System.out.println("cat.indexOf(ca): " + cat.indexOf(ca));
		System.out.println("cat.lastIndexOf(ca): " + cat.lastIndexOf(ca));
		System.out.println("copyCaptial.toLowerCase(): " + copyCapital.toLowerCase());
		System.out.println("copy.toUpperCase(): " + copy.toUpperCase());
		System.out.println("cat.replace(OldChar,newChar): " + cat.replace('t','r'));
		System.out.println("copy.substring(1): " + copy.substring(1));
		System.out.println("copy.substring(1,2): " + copy.substring(1,2));
		System.out.println("space.trim(): \"" + space.trim() + "\" ");
		
	}
}
