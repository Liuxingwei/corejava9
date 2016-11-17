/**
 * Created by match on 2016-11-17.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * 一个显示图片的程序
 */
public class ImageViewer
{
    public static void main (String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run ()
            {
                JFrame frame = new ImageViewerFrame();
                frame.setTitle("imageViewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

/**
 * 一个用于显示一张图片的带有标签的窗体
 */
class ImageViewerFrame extends JFrame
{
    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;
    public ImageViewerFrame ()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // 使用一个标签显示图片
        label = new JLabel();
        add(label);

        // 设置文件选择器
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // 设置菜单条
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);

        openItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent e)
            {
                int result = chooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    String name = chooser.getSelectedFile().getPath();
                    label.setIcon(new ImageIcon(name));
                }
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed (ActionEvent e)
            {
                System.exit(0);
            }
        });
    }
}