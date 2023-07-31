package busRev;

public class bus {

        private int busno;
        private boolean ac;
        private int capacity;
         
         bus(int no,boolean ac,int cap)
         {
        	 this.setBusno(no);
        	 this.setAc(ac);
        	 this.setCapacity(cap);
         }

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		public boolean isAc() {
			return ac;
		}

		public void setAc(boolean ac) {
			this.ac = ac;
		}

		public int getBusno() {
			return busno;
		}

		public void setBusno(int busno) {
			this.busno = busno;
		}
		public void displayBusInfo(){
			System.out.println("Bus.No: "+busno+"  AC:  "+ac+"  capacity  "+capacity);
			
		}
	}


