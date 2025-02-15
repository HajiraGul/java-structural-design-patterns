package decoratorpatterndemo;
public class BubbleLights extends TreeDecorator 
{
    public BubbleLights(ChristmasTree tree)
    {
        super(tree);
    }
    @Override
    public String decorate()
    {
       return tree.decorate();
       return decorateWithBubbleLights(tree);
    }
   private String decorateWithBubbleLights(ChristmasTree tree)
   {
        return "  TreeTopper ,";
   }
}

