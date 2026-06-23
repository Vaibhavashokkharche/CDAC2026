package com.demo.model;

public abstract class Shape {
        private String color;

		public Shape() {
			super();
		}

		public Shape(String color) {
			super();
			this.color = color;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
       abstract public float calcArea();
       abstract public float calcPerimeter();
		@Override
		public String toString() {
			return "Shape [color=" + color + "]";
		}
        
}
