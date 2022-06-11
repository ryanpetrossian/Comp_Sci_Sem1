import javafx.scene.canvas.Canvas;
import javafx.scene.effect.DropShadow;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class GraphCanvas extends Canvas {

        Expr func;  
        Font helveticabold = Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 28);
        DropShadow shadow = new DropShadow();

        GraphCanvas(Expr firstFunction) {
            super(800,800);  
            func = firstFunction;
            draw();  
        }

        public void setFunction(Expr exp) {
            func = exp;
            draw();
        }

        public void clearFunction() {
            func = null;
            draw();
        }


        public void draw() {
            GraphicsContext g = getGraphicsContext2D();
            g.setFill(Color.WHITE);
            g.fillRect(0,0,getWidth(),getHeight());
            
            if (func == null) {
                g.setFill( Color.RED );
                g.setFont(helveticabold);
                g.setEffect(shadow);
                g.fillText("Not a Valid Function", 260, 400);
            }
            else {
                g.setFill( Color.BLUEVIOLET);
                g.setFont(helveticabold);
                shadow.setOffsetX(1.2);
                shadow.setOffsetY(1.2);
                shadow.setSpread(0);
                shadow.setRadius(0);
                g.setEffect(shadow);
                g.fillText("y = " + func, 15, 30);
                drawAxes(g);
                drawFunction(g);
                drawGrid(g);
            }
        }


        void drawAxes(GraphicsContext g) {
            double width = getWidth();
            double height = getHeight();
            g.setStroke(Color.BLACK);
            g.setLineWidth(3);
            g.setEffect(null);
            g.strokeLine(5, height/2, width-5, height/2);
            g.strokeLine(width/2, 5, width/2, height-5);
        }
        
        void drawGrid(GraphicsContext g) {
        	double width = getWidth();
            double height = getHeight();
            g.setStroke(Color.GRAY);
            g.setLineWidth(0.5);
            g.setEffect(null);
            	// All horizontal graph lines
            g.strokeLine(5, (height/2)-80, width-5, (height/2)-80);
            g.strokeLine(5, (height/2)-160, width-5, (height/2)-160);
            g.strokeLine(5, (height/2)-240, width-5, (height/2)-240);
            g.strokeLine(5, (height/2)-320, width-5, (height/2)-320);
            g.strokeLine(5, (height/2)-400, width-5, (height/2)-400);
            g.strokeLine(5, (height/2)+80, width-5, (height/2)+80);
            g.strokeLine(5, (height/2)+160, width-5, (height/2)+160);
            g.strokeLine(5, (height/2)+240, width-5, (height/2)+240);
            g.strokeLine(5, (height/2)+320, width-5, (height/2)+320);
            g.strokeLine(5, (height/2)+400, width-5, (height/2)+400);
            	// All vertical graph lines
            g.strokeLine((width/2)-80, 5, (width/2)-80, height-5);
            g.strokeLine((width/2)-160, 5, (width/2)-160, height-5);
            g.strokeLine((width/2)-240, 5, (width/2)-240, height-5);
            g.strokeLine((width/2)-320, 5, (width/2)-320, height-5);
            g.strokeLine((width/2)-400, 5, (width/2)-400, height-5);
            g.strokeLine((width/2)+80, 5, (width/2)+80, height-5);
            g.strokeLine((width/2)+160, 5, (width/2)+160, height-5);
            g.strokeLine((width/2)+240, 5, (width/2)+240, height-5);
            g.strokeLine((width/2)+320, 5, (width/2)+320, height-5);
            g.strokeLine((width/2)+400, 5, (width/2)+400, height-5);
        }


        void drawFunction(GraphicsContext g) {
            double x, y;          
            double prevx, prevy;
            double dx;
            dx  = 10.0 / 300;

            g.setStroke(Color.RED);
            g.setLineWidth(2);

            x = -5;
            y = func.value(x);

            for (int i = 1; i <= 300; i++) {

                prevx = x;          
                prevy = y;

                x += dx;            

                y = func.value(x);

                if ( (! Double.isNaN(y)) && (! Double.isNaN(prevy)) ) {
                    putLine(g, prevx, prevy, x, y);
                }

            }

        }


        void putLine(GraphicsContext g, double x1, double y1, 
                double x2, double y2) {
            if (Math.abs(y1) > 10000 || Math.abs(y2) > 10000) {
                return;
            }

            double a1, b1;   
            double a2, b2;   

            double width = getWidth();     
            double height = getHeight();   

            a1 = (int)( (x1 + 5) / 10 * width );
            b1 = (int)( (5 - y1) / 10 * height );
            a2 = (int)( (x2 + 5) / 10 * width );
            b2 = (int)( (5 - y2) / 10 * height );

            g.strokeLine(a1,b1,a2,b2);
            
        } 

    } 
