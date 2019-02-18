import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Window
{
    JFrame f;
    JLabel cli;
    JLabel face;
    JLabel chat;
    JScrollPane scroll;

    KeyListener k;

    Window()
    {
        f = new JFrame("Theara");
        f.setSize(1300,730);
        f.setLayout(null);
        f.setResizable(false);
        createChat();
        createFace();
        createCli();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void createCli()
    {
        cli = new JLabel("kjsgvjeklbgvjle");
        cli.setBounds(337,522,953,168);
        cli.setFont(new Font(Font.MONOSPACED, cli.getFont().getStyle(), 17));
        cli.setOpaque(true);
        cli.setBackground(new Color(0,0,0));
        cli.setForeground(new Color(0,200,0));
        //cli.setLineWrap(true);

        scroll = new JScrollPane (cli);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        k = new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent key)
            {
                System.out.println("Key typed code=" + key.getKeyCode() + ", char=" + key.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent key)
            {
                System.out.println("Key pressed code=" + key.getKeyCode() + ", char=" + key.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent key)
            {
                System.out.println("Key released code=" + key.getKeyCode() + ", char=" + key.getKeyChar());
            }
        };


        f.addKeyListener(k);
        f.add(cli);
        f.add(scroll);
    }

    void createChat()
    {
        chat = new JLabel("jlvkhrkl");
        chat.setBounds(10,10,317,680);
        Font f1 = chat.getFont();
        Font f2 = new Font(f1.getFontName(), f1.getStyle(), f1.getSize()+5);
        chat.setFont(f2);
        chat.setOpaque(true);
        chat.setBackground(new Color(0,0,0));
        chat.setForeground(new Color(0,0,255));
        f.add(chat);
    }

    void createFace()
    {
        face = new JLabel();
        face.setBounds(337,10,953,502);
        Font f1 = face.getFont();
        Font f2 = new Font(f1.getFontName(), f1.getStyle(), f1.getSize()+5);
        face.setFont(f2);
        face.setOpaque(true);
        face.setBackground(new Color(0,0,0));
        f.add(face);
    }
}


class Main
{
    public static void main(String[] args)
    {
        new Window();
    }
}