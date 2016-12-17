package main.java.ibeetl.com.sample;



import org.beetl.core.Context;
import org.beetl.core.Format;
import org.beetl.core.Function;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;

/**
 * Hello world!
 *
 */
public class AppRegisterFunction 
{
    public static void main( String[] args ) throws Exception
    {
        GroupTemplate gt = Util.getGroupTemplate();
        gt.registerFunction("myTest", new Function(){

			public Object call(Object[] paras, Context ctx) {
				return "call myTest";
			}
        	
        });
        
        gt.registerFormat("myFormat", new Format(){

			public Object format(Object data, String pattern) {
				String input = (String)data;
				return input+"...";
			}
        	
        });
        
        Template  template = gt.getTemplate("/registerFunction.txt");
        String str = template.render();
        System.out.println(str);
    }
}
