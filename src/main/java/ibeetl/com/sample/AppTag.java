package main.java.ibeetl.com.sample;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;

/**
 * Hello world!
 *
 */
public class AppTag 
{
    public static void main( String[] args ) throws Exception
    {
        GroupTemplate gt = Util.getGroupTemplate();
        Template  template = gt.getTemplate("/tag.txt");
        template.binding("input", 3);
        String str = template.render();
        System.out.println(str);
    }
}
