package decoratorpatterndemo;
public class DecoratorPatternDemo 
{
    public static void main(String[] args) 
    {
        ChristmasTree Tree= new ChristmasTreeImpl();
        ChristmasTree TopperTree=new TreeTopper(new ChristmasTreeImpl());
        ChristmasTree TensilTree=new TreeTopper(new ChristmasTreeImpl());
        ChristmasTree GarlandTree=new TreeTopper(new ChristmasTreeImpl());
        ChristmasTree BubbleTree=new TreeTopper(new ChristmasTreeImpl());
        System.out.println("Christmas Tree is not decorated");
        Tree.decorate();
        System.out.println("Christmas Tree decoarated with Tree Topper");
        TopperTree.decorate();
        System.out.println("Christmas Tree decoarated with Tensil");
        TensilTree.decorate();
        System.out.println("Christmas Tree decoarated with Garland");
        GarlandTree.decorate();
        System.out.println("Christmas Tree decoarated with Bubble Lights");
        BubbleTree.decorate();
    }
}
