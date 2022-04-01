package dz5Robot;

public class Robot implements IRobot, Comparable<Robot> {

	 private IHead head;
	    private IHand hand;
	    private ILeg leg;

	    public Robot(IHead head, IHand hand, ILeg leg) {
	        this.head = head;
	        this.hand = hand;
	        this.leg = leg;
	    }

	    public Robot(){}

	    public IHead getHead() {
	        return head;
	    }

	    public void setHead(IHead head) {
	        this.head = head;
	    }

	    public IHand getHand() {
	        return hand;
	    }

	    public void setHand(IHand hand) {
	        this.hand = hand;
	    }

	    public ILeg getLeg() {
	        return leg;
	    }

	    public void setLeg(ILeg leg) {
	        this.leg = leg;
	    }

	    public void action() {
	        head.speek();
	        hand.upHand();
	        leg.step();
	    }

	    /**
	     * Get the cost of a robot
	     * @return int
	     */
	    public int getPrice() {
	        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
	        return price;
	    }
	    
	    
	    

		@Override
		public String toString() {
			return "Robot [head=" + head + ", hand=" + hand + ", leg=" + leg + "]" + "price " + getPrice();
		}

		public int compareTo(Robot robot) {
			return robot.getPrice()-this.getPrice();
		}

		


	
}
