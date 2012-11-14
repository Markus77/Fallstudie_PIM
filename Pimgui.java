import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javax.swing.JTextField;



public class Pimgui extends JFrame {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private JFrame frame;
		private JButton startSuche;
		
		private JTextField suchbegriff;
		
		private String name;
		private String vorname;
		private String wohnort;
		private String telefon;
		private String email;
		private JTextField tname;
		private JComponent tvorname;
		private JComponent tstrasse;
		private JTextField twohnort;
		private JTextField temail;
		private JComponent ttelefon;


		public Pimgui() {

			createGui();

		}

		private void createGui() {

			frame = new JFrame("PIM");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			createMenuBar();

			java.awt.Container contentPane = frame.getContentPane();

			contentPane.add(BorderLayout.NORTH, getinputPanel());
			contentPane.add(BorderLayout.CENTER, getinputPanel2());
			contentPane.add(BorderLayout.SOUTH, getActionPanel() );

			frame.setForeground(Color.RED);
			frame.setBounds(170, 50, 800, 500); // Postion und Grösse
			frame.setVisible(true);
		}

		private JPanel getinputPanel() {

			JLabel[] messageLabel = new JLabel[8];
			

			JPanel inputPanel = new JPanel();
			inputPanel.setBackground(Color.white);

			inputPanel.setLayout(new GridBagLayout());
			
			
			
			messageLabel[0] = new JLabel("Suche");
			suchbegriff = new JTextField(15);
			suchbegriff.setToolTipText("Geben Sie einen Suchbegriff ein.");
			suchbegriff.setInputVerifier(new InputVerifier() {
				public boolean verify(JComponent input) {
					String str = ((JTextField) input).getText();
					if (str == null || str.equals("") || str == ("[a-z A-Z-]*")) {
						return false; 
					}
					return str.matches("[a-z A-Z-]*"); 
														
				}
			});
			
	

			
		
			messageLabel[1] = new JLabel("Wähle Suchparameter");
			
					
			
			
			JPanel panelversandart = new JPanel();
			panelversandart.setBackground(Color.white);

			JRadioButton sucheName = new JRadioButton(name);
			sucheName.setToolTipText("Für Namensuche");
			sucheName.setSelected(true);
		
			sucheName.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			messageLabel[2] = new JLabel("Name");
			
			JRadioButton sucheVorname = new JRadioButton(vorname);
			sucheVorname.setToolTipText("Für Suche nach Vorname");
			sucheVorname.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
						
			messageLabel[3] = new JLabel("Vorname");
		
					
			
			JRadioButton sucheStrasse = new JRadioButton(telefon);
			sucheStrasse.setToolTipText("Für Strassen-Suche");
			sucheStrasse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			}
			});

			
			startSuche = new JButton("Suche starten");
			startSuche.setBackground(null);
			startSuche.setBorder(null);
			startSuche.setBorderPainted(false);
			startSuche.setPreferredSize(new Dimension(50, 27));
			startSuche.setBackground(Color.gray);
			startSuche.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
			
			
			
			messageLabel[4] = new JLabel("Strasse");
			
			JRadioButton sucheWohnort = new JRadioButton(wohnort);
			sucheWohnort.setToolTipText("Für Wohnortsuche");
			sucheWohnort.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				}
			});

			messageLabel[5] = new JLabel("Wohnort");
			
					
			
			JRadioButton sucheTelefon = new JRadioButton(telefon);
			sucheTelefon.setToolTipText("Für Telefonnummer-Suche");
			sucheTelefon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});

			messageLabel[6] = new JLabel("Telefon");
			
			JRadioButton sucheEmail = new JRadioButton(email);
			sucheEmail.setToolTipText("Für Email-Suche");
			sucheEmail.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});

			messageLabel[7] = new JLabel("Email");
			
		

			addItem(inputPanel, messageLabel[0],  0, 2, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, suchbegriff,      2, 2, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, messageLabel[1], 16, 2, 2, 1, GridBagConstraints.WEST);			
	
			addItem(inputPanel, sucheName      , 14, 4, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, messageLabel[2], 16, 4, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, sucheVorname   , 18, 4, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, messageLabel[3], 20, 4, 2, 1, GridBagConstraints.WEST);
			
			addItem(inputPanel, startSuche     ,  2, 6, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, sucheStrasse   , 14, 6, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, messageLabel[4], 16, 6, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, sucheWohnort   , 18, 6, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, messageLabel[5], 20, 6, 2, 1, GridBagConstraints.WEST);
			
			addItem(inputPanel, sucheTelefon   , 14, 8, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, messageLabel[6], 16, 8, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, sucheEmail     , 18, 8, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel, messageLabel[7], 20, 8, 2, 1, GridBagConstraints.WEST);
			

		

			return inputPanel;
		}

		

		private JPanel getinputPanel2() {

			JLabel[] messageLabel = new JLabel[7];
			JPanel inputPanel2 = new JPanel();
			inputPanel2.setBackground(Color.white);
			inputPanel2.setLayout(new GridBagLayout());

			messageLabel[0] = new JLabel("Name");
			messageLabel[1] = new JLabel("Vorname");
			addItem(inputPanel2, messageLabel[0], 0, 0, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel2, messageLabel[1], 2, 0, 2, 1, GridBagConstraints.WEST);
			
			tname = new JTextField(15);
			tname.setToolTipText("Geben Sie Ihren Namen ein.");
			tname.setInputVerifier(new InputVerifier() {
				public boolean verify(JComponent input) {
					String str = ((JTextField) input).getText();
					if (str == null || str.equals("") || str == ("[a-z A-Z-]*")) {
						return false; // Leere Zeichenfolgen werden auch
										// aktzeptiert...
					}
					return str.matches("[a-z A-Z-]*"); // Nur Buchstaben a-z oder
														// A-Z
				}
			});
			tvorname = new JTextField(15);
			tvorname.setToolTipText("Geben Sie Ihren Namen ein.");
			tvorname.setInputVerifier(new InputVerifier() {
				public boolean verify(JComponent input) {
					String str = ((JTextField) input).getText();
					if (str == null || str.equals("") || str == ("[a-z A-Z-]*")) {
						return false; // Leere Zeichenfolgen werden auch
										// aktzeptiert...
					}
					return str.matches("[a-z A-Z-]*"); // Nur Buchstaben a-z oder
														// A-Z
				}
			});
			addItem(inputPanel2, tname   , 0, 2, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel2, tvorname, 2, 2, 2, 1, GridBagConstraints.WEST); 
			
			messageLabel[2] = new JLabel("Strasse");
			messageLabel[3] = new JLabel("Wohnort");
			addItem(inputPanel2, messageLabel[2], 0, 4, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel2, messageLabel[3], 2, 4, 2, 1, GridBagConstraints.WEST);
			
			tstrasse = new JTextField(15);
			tstrasse.setToolTipText("Geben Sie Ihre Strasse ein.");
			tstrasse.setInputVerifier(new InputVerifier() {
				public boolean verify(JComponent input) {
					String str = ((JTextField) input).getText();
					if (str == null || str.equals("") || str == ("[a-z A-Z-]*")) {
						return false; // Leere Zeichenfolgen werden auch
										// aktzeptiert...
					}
					return str.matches("[a-z A-Z-]*"); // Nur Buchstaben a-z oder
														// A-Z
				}
			});
			twohnort = new JTextField(15);
			twohnort.setToolTipText("Geben Sie Ihren Wohnort ein.");
			twohnort.setInputVerifier(new InputVerifier() {
				public boolean verify(JComponent input) {
					String str = ((JTextField) input).getText();
					if (str == null || str.equals("") || str == ("[a-z A-Z-]*")) {
						return false; // Leere Zeichenfolgen werden auch
										// aktzeptiert...
					}
					return str.matches("[a-z A-Z-]*"); // Nur Buchstaben a-z oder
														// A-Z
				}
			});
			addItem(inputPanel2, tstrasse   , 0, 6, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel2, twohnort, 2, 6, 2, 1, GridBagConstraints.WEST); 
			
			messageLabel[4] = new JLabel("Telefon");
			messageLabel[5] = new JLabel("Email");
			addItem(inputPanel2, messageLabel[4], 0, 8, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel2, messageLabel[5], 2, 8, 2, 1, GridBagConstraints.WEST);
			
			ttelefon = new JTextField(15);
			ttelefon.setToolTipText("Geben Sie Ihre Telefonnummer ein.");
			ttelefon.setInputVerifier(new InputVerifier() {
				public boolean verify(JComponent input) {
					String str = ((JTextField) input).getText();
					if (str == null || str.equals("") || str == ("[a-z A-Z-]*")) {
						return false; // Leere Zeichenfolgen werden auch
										// aktzeptiert...
					}
					return str.matches("[a-z A-Z-]*"); // Nur Buchstaben a-z oder
														// A-Z
				}
			});
			temail = new JTextField(15);
			temail.setToolTipText("Geben Sie Ihre Emailadresse ein.");
			temail.setInputVerifier(new InputVerifier() {
				public boolean verify(JComponent input) {
					String str = ((JTextField) input).getText();
					if (str == null || str.equals("") || str == ("[a-z A-Z-]*")) {
						return false; // Leere Zeichenfolgen werden auch
										// aktzeptiert...
					}
					return str.matches("[a-z A-Z-]*"); // Nur Buchstaben a-z oder
														// A-Z
				}
			});
			addItem(inputPanel2, ttelefon   , 0, 10, 2, 1, GridBagConstraints.WEST);
			addItem(inputPanel2, temail, 2, 10, 2, 1, GridBagConstraints.WEST); 

			
			
			return inputPanel2;
		}
			
			
		public void getVersandart() {

		}

		// Panel mit verschiedenen Button wie Neu, Löschen, Speichern Verwerfen
		private JPanel getActionPanel() {
			JPanel actionPanel = new JPanel();
			actionPanel.setBackground(Color.white);
			JButton löscheAdresse = new JButton("Adresse löschen");
			löscheAdresse.setBackground(Color.white);
			JButton neueAdresse = new JButton("Neue Adresse");
			neueAdresse.setBackground(Color.white);
			JButton verwerfen = new JButton("Verwerfen");
			verwerfen.setBackground(Color.white);
			JButton speichern = new JButton("Speichern");
			speichern.setBackground(Color.white);

			actionPanel.add(löscheAdresse);
			actionPanel.add(neueAdresse);
			
			// Funktion inkl. Button für Verwerfen
			actionPanel.add(verwerfen);
			verwerfen.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					tname.setText("");
					
					twohnort.setText("");
				
					temail.setText("");

				}
			});

			// Funktion inkl. Button für Senden
			actionPanel.add(speichern);

			
				
				

			return actionPanel;

		}

		// Zur Anordnung der Felder und Buttons
				private void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) {

					GridBagConstraints gbc = new GridBagConstraints();

					gbc.gridx = x;
					gbc.gridy = y;
					gbc.gridwidth = width; // wie weit sind die Dialogelemente
					gbc.gridheight = height; // wie hoch sind die Dialogemente
					gbc.weightx = 0.0;
					gbc.weighty = 0.0;
					gbc.insets = new Insets(0, 0, 5, 5); // Abstand: ,horizontal, vertikal,
					gbc.anchor = align;
					gbc.fill = GridBagConstraints.HORIZONTAL;
					p.add(c, gbc);
					
				}
		
		// Gestaltung der Menüpunkte
		private void createMenuBar() {
			JMenuBar menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
			menuBar.setBackground(Color.white);
			JMenu dateiMenu = new JMenu("Datei");
			JMenuItem schliessenItem = new JMenuItem("Schliessen");
			schliessenItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int response = JOptionPane.showConfirmDialog(null, "Wollen Sie das Programm beenden?", "Beenden",
							JOptionPane.YES_NO_OPTION);
					if (response == 0) {
						System.exit(0);
					}
				}
			});
			
			JMenu menuMenu = new JMenu("Menu");
			JMenu kontaktMenu = new JMenu("Kontakte");
			JMenu mailMenu = new JMenu("Mail");
			JMenu taskMenu = new JMenu("Task");
			
			
			dateiMenu.add(schliessenItem);
			menuBar.add(dateiMenu);
			menuBar.add(menuMenu);
			menuBar.add(kontaktMenu);
			menuBar.add(mailMenu);
			menuBar.add(taskMenu);
		}

	}


