/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatterndemo;

/**
 *
 * @author PMYLS
 */
public class Mp4Player implements AdvancedMediaPlayer
{
    @Override
    public void playVlc(String fileName)
    {
        
    }
    @Override
    public void playMp4(String fileName)
    {
        System.out.println("Playing mp4 file. Name: " + fileName);
    } 
    @Override
    public void play(String audioPlayer, String fileName)
    {
        throw new UnsupportedOperationException("Not Supported");
    }
}
