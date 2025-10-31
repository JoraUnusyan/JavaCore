package FullLessons.lesson8.InHeritor5;

public class Box {

        private double width;
        private double height;
        private double depth;

        Box(Box obj){
            width = obj.width;
            height = obj.height;
            depth = obj.depth;
        }

        Box(double width, double height, double depth){
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        Box(){
            width = -1;
            height = -1;
            depth = -1;
        }

        Box(double len) {
            width=height=depth=len;
        }

        double volume(){
            return width*height*depth;
        }

    }


