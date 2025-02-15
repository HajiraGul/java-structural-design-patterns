package decoratorpatterndemo;
public class TreeTopper extends TreeDecorator
{
    public TreeTopper(ChristmasTree tree)
    {
        super(tree);
    }
    @Override
    public String decorate()
    {
       
       return tree.decorate();
       return decorateWithTreeTopper(tree);
    }
   private String decorateWithTreeTopper(ChristmasTree tree)
   {
        return "  TreeTopper ,";
   }
}
