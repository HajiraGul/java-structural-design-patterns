/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatterndemo;

/**
 *
 * @author PMYLS
 */
public class MediaAdapter implements MediaPlayer
{
    AdvancedMediaPlayer advancedMusicPlayer;
    public MediaAdapter(String audioType)
    {
        if(audioType.equalsIgnoreCase("vlc"))
        {
            advancedMusicPlayer=new VlcPlayer();
        }
        if(audioType.equalsIgnoreCase("mp4"))
        {
            advancedMusicPlayer=new Mp4Player();
        }
    }
    
    @Override
    public void play(String audioType, String filename)
    {
        if(audioType.equalsIgnoreCase("vlc"))
        {
            advancedMusicPlayer.playVlc(filename);
        }
        if(audioType.equalsIgnoreCase("mp4"))
        {
            advancedMusicPlayer.playMp4(filename);
        }
    }
}
