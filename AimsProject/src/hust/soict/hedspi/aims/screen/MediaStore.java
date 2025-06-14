package hust.soict.hedspi.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.LimitExceededException;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import hust.soict.hedspi.aims.Aims;
import hust.soict.hedspi.aims.exception.DuplicatedItemException;
import hust.soict.hedspi.aims.exception.PlayerException;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
 // Lê Quang Khải 20225638
public class MediaStore extends JPanel {
	private Media media;
	private StoreScreen storeScreen;
	public MediaStore(Media media, StoreScreen storeScreen) {
		this.media = media;
		this.storeScreen = storeScreen;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		JLabel cost = new JLabel(String.format("%.2f $", media.getCost()));
		cost.setAlignmentX(CENTER_ALIGNMENT);
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton btnAddToCart = new JButton("Add to cart");
		btnAddToCart.addActionListener(new ButtonListener());
		container.add(btnAddToCart);
		if (media instanceof Playable) {
			JButton btnPlay = new JButton("Play");
			btnPlay.addActionListener(new ButtonListener());
			container.add(btnPlay);
		}
		JButton btnDetails = new JButton("Details");
		btnDetails.addActionListener(new ButtonListener());
		container.add(btnDetails);
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String button = e.getActionCommand();
			switch (button) {
				//Lê Chí Dũng 20210216
			case "Add to cart":
				try {
					Aims.getCart().addMedia(media);
					JOptionPane.showMessageDialog(null,
							String.format("Added %s to cart.\nCurrent number of items in cart: %d", media.toString(),
									Aims.getCart().getItemsOrdered().size()));
				} catch (LimitExceededException | DuplicatedItemException e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
				break;
			case "Play":
				try {
					((Playable) media).play();
				} catch (PlayerException e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
				break;
			case "Details":
				new DetailScreen(media);
				break;
			}
		}
	}
}
