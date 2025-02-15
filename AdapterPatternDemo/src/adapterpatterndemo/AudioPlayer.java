/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatterndemo;

/**
 *
 * @author PMYLS
 */
public class AudioPlayer implements MediaPlayer
{
    MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType, String fileName)
    {
        if(audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp3"))
        {
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else
        {
            System.out.println("Invalid media."+ audioType+" format not supported");
        }
    }
}
