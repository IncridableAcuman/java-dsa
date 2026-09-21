    package com.web.java_dsa.javalearn.oop.firstLevel;

    public class Rectangle {
        private int width;
        private int height;

        public Rectangle(int width,int height){
            this.width=width;
            this.height=height;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int getArea(){
            return width * height;
        }
        public int getPerimeter(){
            return 2 * ( width + height );
        }
        public boolean isSquare(){
            return width == height;
        }

        public static void main(String[] args) {
            //4. Rectangle
            //
            //Rectangle klassini yarating.
            //
            //width
            //height
            //
            //Metodlar:
            //
            //getArea()
            //getPerimeter()
            //isSquare()
        }
    }
