package main.java.ibeetl.com.sample;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;

/**
 * Hello world!
 *
 */
public class AppLayout 
{
    public static void main( String[] args ) throws Exception
    {
        GroupTemplate gt = Util.getGroupTemplate();
        Template  template = gt.getTemplate("/layout.txt");
        template.binding("user", Util.oneUser());
        String str = template.render();
        System.out.println(str);
    }
}
