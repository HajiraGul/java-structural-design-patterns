package decoratorpatterndemo;
public class Garland extends TreeDecorator 
{
    public Garland(ChristmasTree tree)
    {
        super(tree);
    }
    @Override
    public String decorate()
    {
       return tree.decorate();
       return decorateWithGarland(tree);
    }
   private String decorateWithGarland(ChristmasTree tree)
   {
        return "  TreeTopper ,";
   }
}
