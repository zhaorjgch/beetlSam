package main.java.ibeetl.com.sample;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;

/**
 * Hello world!
 *
 */
public class AppExpression 
{
    public static void main( String[] args ) throws Exception
    {
        GroupTemplate gt = Util.getGroupTemplate();
        Template  template = gt.getTemplate("/expression.txt");
        String str = template.render();
        System.out.println(str);
    }
}
