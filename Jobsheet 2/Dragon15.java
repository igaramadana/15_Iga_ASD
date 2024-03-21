public class Dragon15 {
    int x, y, width, height;
    
    void moveLeft(){
        x -= 1;
        System.out.println("x: "+x+" y: "+y);
        if(x < 0 || x > width){
            detectCollision();
        }
    }
    void moveRight(){
        x += 1;
        System.out.println("x: "+x+" y: "+y);
        if(x < 0 || x > width){
            detectCollision();
        }
    }
    void moveUp(){
        y -= 1;
        System.out.println("x: "+x+" y: "+y);
        if(y < 0 || y > height){
            detectCollision();
        }
    }
    void moveDown(){
        y += 1;
        System.out.println("x: "+x+" y: "+y);
        if(y < 0 || y > height){
            detectCollision();
        }
    }
    void detectCollision(){
        System.out.println("Game Over");
    }
}
