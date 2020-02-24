package com.training.cts;

public class Student implements Comparable<Student>{
		int number;
		String name;
		int id;
		Student(int number,String name,int id){
			this.number = number;
			this.name = name;
			this.id = id;
		}
		
		
		public String toString() {
			return "[number=" + number + ", name=" + name + " id= " + id +"]";
		}

		
		public int compareTo(Student o) {
			return o.number - this.number;
		}
	}
