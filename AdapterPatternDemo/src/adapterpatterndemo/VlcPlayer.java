/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatterndemo;

/**
 *
 * @author PMYLS
 */
public class VlcPlayer implements AdvancedMediaPlayer
{
    @Override
    public void playVlc(String fileName)
    {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
    @Override
    public void playMp4(String fileName)
    {
        
    }
    @Override
    public void play (String audioType, String fileName)
    {
        throw new UnsupportedOperationException("Not Supported");
    }
}
