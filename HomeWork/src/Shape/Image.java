/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author KARTOON
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INT105
 */
public class Image implements Resizeable {

    private int width, height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void enlage(double percent) {
        width += (int) (width * percent / 100);
        height += (int) (height * percent / 100);
    }

    @Override
    public void reduce(double percent) {
        width -= (int) (width * percent / 100);
        height -= (int) (height * percent / 100);
    }

    @Override
    public String toString() {
        return ">>Image<<" + "\nwidth = " + width + ", height = " + height ;
    }
    

}

