/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatterndemo;

/**
 *
 * @author PMYLS
 */
public interface AdvancedMediaPlayer 
{
    public void play(String audioType, String fileName);
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
