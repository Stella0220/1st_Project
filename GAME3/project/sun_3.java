package project;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Main.title;
import jaco.mp3.player.MP3Player;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.FontFormatException;
import java.io.IOException;

public class sun_3 extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JLabel lblNewLabel_1;
    Font pixelMplus;
    JButton btnNewButton_2;
	private JButton btnNewButton;
	private JButton btnNewButton_3;
	int cnt = 0;
	
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    sun_3 frame = new sun_3(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public sun_3(String name) {
    	
    	Dimension frameSize = getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getSize().width) / 2 - 500;
        int y = (screenSize.height - getSize().height) / 2 - 352;
        //setBounds(x,y,1000,705);
    	
    	try {
			pixelMplus=Font.createFont(Font.TRUETYPE_FONT, new File("./DungGeunMo.ttf")).deriveFont(25f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("./DungGeunMo.ttf")));
		}
		catch(IOException | FontFormatException e) {
			
		}
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(x, y, 1000, 705);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 182, 193));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 40));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBounds(241, 402, 496, 56);
        contentPane.add(textField);
        textField.setColumns(10);

        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 40));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(241, 505, 496, 56);
        lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton_2 = new JButton("CHECK");
        btnNewButton_2.setBorder(null);
        btnNewButton_2.setBackground(Color.WHITE);
        btnNewButton_2.setFont(pixelMplus);
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                checkAnswer();
            }
        });
        btnNewButton_2.setBounds(835, 404, 97, 56);
        contentPane.add(btnNewButton_2);
        
        btnNewButton = new JButton("NEXT");
        btnNewButton.setBorder(null);
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (btnNewButton.isEnabled() || cnt == 2) {
                    setVisible(false);
                    new moon_4(null).setVisible(true);
                }
        		
        	}
        });
        btnNewButton.setFont(pixelMplus);
        btnNewButton.setBounds(399, 600, 199, 56);
        btnNewButton.setEnabled(false);  // NEXT ��ư �ʱ� ��Ȱ��ȭ
        contentPane.add(btnNewButton);
        
        btnNewButton_3 = new JButton("READ");
        btnNewButton_3.setBorder(null);
        btnNewButton_3.setBackground(Color.WHITE);
        btnNewButton_3.setFont(pixelMplus);
        btnNewButton_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if (btnNewButton.isEnabled()) {
        			File f2 = new File("./music/sun.mp3");
            		MP3Player mp3 = new MP3Player(f2);
            		mp3.play();
                }
        	}
        });
        btnNewButton_3.setBounds(835, 505, 97, 56);
        btnNewButton_3.setEnabled(false);
        contentPane.add(btnNewButton_3);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(sun_3.class.getResource("/project_picture/sun-159392_640 (1).png")));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(230, 10, 524, 331);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon(sun_3.class.getResource("/project_picture/whiteboard-303145_640 (1).png")));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(0, -92, 984, 666);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hanby\\Downloads\\boy-34619_640 (1).png"));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 402, 242, 254);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_4 = new JLabel("Q.3");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 50));
        lblNewLabel_4.setBounds(0, 0, 171, 134);
        contentPane.add(lblNewLabel_4);
        
        JButton EXIT = new JButton("EXIT");
        EXIT.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		setVisible(false);
                new title(name).setVisible(true);
        	}
        });
        EXIT.setBackground(Color.WHITE);
        EXIT.setBorder(null);
        EXIT.setBounds(875, 589, 97, 47);
        EXIT.setFont(pixelMplus);
        contentPane.add(EXIT);
    }

    private void checkAnswer() {
        String inword = textField.getText(); // ����ڰ� �Է��� �ܾ�
        inword = inword.toLowerCase();
        String dbword = getWordFromDB(); // �����ͺ��̽����� ��ȸ�� �ܾ�
        String sentence = getSentenceFromDB(inword); // �����ͺ��̽����� ��ȸ�� ����
        
        if (dbword != null && inword.equals(dbword)) { // �ܾ ��ġ�ϴ� ���
            lblNewLabel_1.setVisible(true);
            lblNewLabel_1.setText(sentence); // ���� ���
            btnNewButton.setEnabled(true);  // NEXT ��ư Ȱ��ȭ
            btnNewButton_3.setEnabled(true);
        } else { // �ܾ ��ġ���� �ʴ� ���
            lblNewLabel_1.setText("Wrong Answer!");
            textField.setText(""); // �Է� �ʵ� �ʱ�ȭ
            btnNewButton.setEnabled(false);  // NEXT ��ư ��Ȱ��ȭ
            btnNewButton_3.setEnabled(false); 
            cnt = cnt + 1;
        }
        if(cnt >= 2) {
        	btnNewButton.setEnabled(true);
        	textField.setText("sun");
        }
    }

    
    private String getWordFromDB() {
        String dbword = null;
        Connection con1 = null;
        try {
            // Oracle JDBC ����̹� �ε�
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // �����ͺ��̽� ���� ����
            con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");


            String sql = "SELECT words FROM test1 WHERE words = ?";
            PreparedStatement preparedStatement = con1.prepareStatement(sql);
            

            preparedStatement.setString(1, "sun");
            
            // ���� ���� �� ��� ó��
            ResultSet result = preparedStatement.executeQuery();

            // ��� ���� ó��
            if (result.next()) {
                dbword = result.getString("words"); // ù ��° ���� words �� �� ��������
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // �׻� �����ͺ��̽� ���� �ݱ�
            if (con1 != null) {
                try {
                    con1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return dbword;
    }


    private String getSentenceFromDB(String word) {
        String sentence = null;
        Connection con1 = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

            String sql = "select sentence from test1 where words = ?";
            PreparedStatement preparedStatement = con1.prepareStatement(sql);
            preparedStatement.setString(1, word);
            ResultSet result = preparedStatement.executeQuery();

            if (result.next()) {
                sentence = result.getString("sentence"); // �����ͺ��̽����� ��ȸ�� ����
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con1 != null) {
                try {
                    con1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return sentence;
    }
}