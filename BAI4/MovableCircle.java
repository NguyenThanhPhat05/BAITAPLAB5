package BAI4;

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        this.radius = scanner.nextInt();
        System.out.println("Nhập thông tin tâm:");
        center.nhap();
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MovablePoint getCenter() {
        return center;
    }
    public void setCenter(MovablePoint center) {
        this.center = center;
    }
    @Override
    public String toString() {
        return "Hình tròn tại " + center.toString() + ", bán kính=" + radius;
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
}

