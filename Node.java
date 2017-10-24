public class Node {
	protected int f=0;
	protected int g=0;
	protected int h=0;
	int x;
	int y;
	protected boolean open=true;
	protected Node parent; 
	
	public Node(){
		f=h+g;
	}
	
	public void seth(int h){
		this.h=h;
		f=h+g;
	}
	public void setx(int x){
		this.x=x;
	}
	public void sety(int y){
		this.y=y;
	}
	public void setg(int g){
		this.g=g;
		f=h+g;
	}
	
	public void setParent(Node parent){
		this.parent=parent;
	}
	
	public boolean isOpen(){
		return open;
	}
	
	public int getf(){
		return f;
	}
	public int getg(){
		return g;
	}
	public int geth(){
		return h;
	}
	public void setClosed(){
		open=false;
	}
	public void setOpen(){
		open=true;
	}
}