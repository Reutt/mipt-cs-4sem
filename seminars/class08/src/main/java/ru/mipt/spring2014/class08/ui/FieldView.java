package ru.mipt.spring2014.class08.ui;

import java.awt.*;
import ru.mipt.spring2014.class08.FieldController;
import ru.mipt.spring2014.class08.field.Ball;
import ru.mipt.spring2014.class08.field.FieldModel;

/**
 *
 * @author Andrei
 */
public class FieldView extends javax.swing.JPanel
{
	private final FieldController backend;
	private final Rectangle viewBounds = new Rectangle ();

	/**
	 * Creates new form FieldView
	 */
	public FieldView ()
	{
		backend = new FieldController (this);
		updateViewBounds ();

		initComponents ();

		new Thread (backend).start ();
	}

	private void updateViewBounds ()
	{
		final int maxWidth = getWidth () - 1, maxHeight = getHeight () - 1;
		final FieldModel field = backend.getCurrentState ();
		if (field.getWidth () / maxWidth < field.getHeight () / maxHeight)
		{
			int optWidth = (int) Math.round (field.getWidth () * maxHeight / field.getHeight ());
			viewBounds.setFrame ((maxWidth - optWidth) / 2, 0, optWidth, maxHeight);
		} else
		{
			int optHeight = (int) Math.round (field.getHeight () * maxWidth / field.getWidth ());
			viewBounds.setFrame (0, (maxHeight - optHeight) / 2, maxWidth, optHeight);
		}
	}
	
	private int getXScreenCoord (FieldModel field, double x)
	{
		return (int) Math.round (viewBounds.getX () + x / field.getWidth () * viewBounds.getWidth ());
	}

	private int getYScreenCoord (FieldModel field, double y)
	{
		return (int) Math.round (viewBounds.getY () + viewBounds.getHeight () - y / field.getHeight () * viewBounds.getHeight ());
	}

	private double getXFieldCoord (FieldModel field, int x)
	{
		return (x - viewBounds.getX ()) * field.getWidth () / viewBounds.getWidth ();
	}

	private double getYFieldCoord (FieldModel field, int y)
	{
		return (viewBounds.getY () + viewBounds.getHeight () - y) * field.getHeight () / viewBounds.getHeight ();
	}

	private void drawBorder (Graphics2D graphics)
	{
		graphics.setColor (Color.BLACK);
		final BasicStroke dashed = new BasicStroke (
				1.0f,
				BasicStroke.CAP_BUTT,
				BasicStroke.JOIN_MITER,
				10.0f, new float[] {10.0f}, 0.0f);
		graphics.setStroke (dashed);

		graphics.drawRect (viewBounds.x - 1, viewBounds.y - 1, viewBounds.width + 2, viewBounds.height + 2);
	}

	private void drawFieldState (Graphics2D graphics, FieldModel field)
	{
		for (Ball ball : field.getBalls ())
		{
			graphics.setColor (ball.getColor ());
			int x = getXScreenCoord (field, ball.getX () - ball.getR ());
			int y = getYScreenCoord (field, ball.getY () + ball.getR ());
			int width = getXScreenCoord (field, ball.getX () + ball.getR ()) - x + 1;
			int height = getYScreenCoord (field, ball.getY () - ball.getR ()) - y + 1;
			graphics.fillOval (x, y, width, height);
		}
	}

	/**
	 * Paint panel content
	 */
	@Override
	public void paint (Graphics g)
	{
		final Graphics2D graphics = (Graphics2D) g;

		graphics.setBackground (Color.WHITE);
		graphics.clearRect (0, 0, getWidth (), getHeight ());

		graphics.setBackground (Color.LIGHT_GRAY);
		graphics.clearRect (viewBounds.x, viewBounds.y, viewBounds.width + 1, viewBounds.height + 1);

		drawBorder (graphics);
		
		drawFieldState (graphics, backend.getCurrentState ());
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                formMouseClicked(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentResized(java.awt.event.ComponentEvent evt)
            {
                formComponentResized(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

	private void formComponentResized (java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentResized
	{//GEN-HEADEREND:event_formComponentResized
		updateViewBounds ();
	}//GEN-LAST:event_formComponentResized

    private void formMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseClicked
    {//GEN-HEADEREND:event_formMouseClicked
		final FieldModel field = backend.getCurrentState ();
		final double x = getXFieldCoord (field, evt.getX ()), y = getYFieldCoord (field, evt.getY ());
		System.out.println ("Hit at (" + x + ", " + y + ")");
		final Ball ball = field.findBall (x, y);
		if (ball != null)
		{
			final Ball newBall = ball.copyBase ();
			newBall.setPosition (ball.getX (), ball.getY ());
			newBall.setVelocity (2 * (Math.random () - 0.5), 2 * (Math.random () - 0.5));
			backend.changeBall (newBall);
		}
    }//GEN-LAST:event_formMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
