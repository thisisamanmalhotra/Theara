import javax.swing.*;
import java.awt.*;
class Window
{
    JFrame f;
    JTextArea cli;
    JTextArea face;
    JTextArea chat;
    JScrollPane scroll;

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

    void createChat()
    {
        chat = new JTextArea();
        chat.setBounds(10,10,317,680);
        Font f1 = chat.getFont();
        Font f2 = new Font(f1.getFontName(), f1.getStyle(), f1.getSize()+5);
        chat.setFont(f2);
        chat.setLineWrap(true);
        Color c = new Color(0,0,0);
        chat.setBackground(c);
        c = new Color(0,0,255);
        chat.setForeground(c);
        f.add(chat);
    }

    void createCli()
    {
        cli = new JTextArea();
        cli.setBounds(337,522,953,168);
        cli.setFont(new Font(Font.MONOSPACED, cli.getFont().getStyle(), 17));
        cli.setBackground(new Color(0,0,0));
        cli.setForeground(new Color(0,200,0));
        cli.setLineWrap(true);
        scroll = new JScrollPane (cli);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        f.add(cli);
        f.add(scroll);
    }

    void createFace()
    {
        face = new JTextArea();
        face.setBounds(337,10,953,502);
        Font f1 = face.getFont();
        Font f2 = new Font(f1.getFontName(), f1.getStyle(), f1.getSize()+5);
        face.setFont(f2);
        Color c = new Color(0,0,0);
        face.setBackground(c);
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