package decoratorpatterndemo;
public class Tinsel extends TreeDecorator
{
    public Tinsel(ChristmasTree tree)
    {
        super(tree);
    }
    @Override
    public String decorate()
    {
       return tree.decorate();
       return decorateWithTensil(tree);
    }
   private String decorateWithTensil(ChristmasTree tree)
   {
        return "  TreeTopper ,";
   }
}
