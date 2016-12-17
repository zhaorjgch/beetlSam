package main.java.ibeetl.com.sample;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;

/**
 * Hello world!
 *
 */
public class AppHelloWorld 
{
    public static void main( String[] args ) throws Exception
    {
        GroupTemplate gt = Util.getGroupTemplate();
        Template  template = gt.getTemplate("/helloWorld.txt");
        template.binding("name", "world");
        String str = template.render();
        System.out.println(str);
    }
}
