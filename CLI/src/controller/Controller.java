package controller;

public interface Controller {

	public void display(String string);
	public void display(String[] strings);
	public void mazeDisplay(String name);
	public void generate(String name ,int x , int y , int z);
	public void displayCrossSectionByX(int index,String name);
	public void displayCrossSectionByY(int index,String name);
	public void displayCrossSectionByZ(int index,String name);
	public void save(String name, String fileName);
	public void load(String fileName, String name);
	public void size(String name);
	public void fileSize(String fileName);
	public void solve(String name, String algorithm);
	public void displaySolution(String name);
	public void exit();
	
}
