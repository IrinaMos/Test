package ru.job4j.calculator;

import ru.job4j.Calculate;

public class Calculator {

	private double result;

		public void add (double first, double second){
			this.result = first + second;
		}

		public void subtract ( double first1, double second1){
			this.result = first1 - second1;
		}

		public void div ( double first2, double second2){
			this.result = first2 / second2;
		}

		public void multiple ( double first3, double second3){
			this.result = first3 * second3;
		}

		public double getResult() {
			return this.result;
		}

	}