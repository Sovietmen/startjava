public class Variable {
	public static void main (String[] args){
	boolean dx12 = false;
	short ram = 8;
	int cores = 4;
	long hddGb = 1000;
	float avrgCoreTemp = 45.7f;
	double procFrequency = 3.4;
	char ch = 'a';

	System.out.println("RAM = " + ram);
	System.out.println("Numbers of cores = " + cores);
	System.out.println("Total HDD Space (Gb) = " + hddGb);
	System.out.println("Average processor temp = " + avrgCoreTemp);
	System.out.println("Processor frequency = " + procFrequency);
	System.out.println("Direct X installed = " + dx12);
	System.out.println("char = " + ch);
	}
}