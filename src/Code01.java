import java.io.File;
import java.io.OutputStream;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

import java.lang.management.RuntimeMXBean;
import java.text.DecimalFormat;

public class Code01 {
	static DecimalFormat df = new DecimalFormat("###");
	public static void main(String[] args) {
		String  drive;
		double  totalSize, freeSize, useSize;  
		File[] roots=File.listRoots();
		for (File root : roots) {
			drive = root.getAbsolutePath();
			totalSize = root.getTotalSpace() / Math.pow(1024, 3);
			useSize = root.getUsableSpace() / Math.pow(1024, 3);
			freeSize = totalSize - useSize;
			System.out.println("\n�ϵ� ��ũ �̸� : " + drive + "\n");
			System.out.println("��ü ��ũ �뷮 : " + totalSize + " GB \n");
			System.out.println("��ũ ��� �뷮 : " + freeSize + " GB \n");
			System.out.println("��ũ ���� �뷮 : " + useSize + " GB \n");
			}
		
//		String data=getMemoryStatus();
//		Runtime rt=Runtime.getRuntime();
		
//		try {
//			Process pr=rt.exec("cmd /c start");
//			  OutputStream os = pr.getOutputStream();
////			   os.write("shutdown -s -f -t 90 \n\r".getBytes());
//			   os.write("dir -f -t 90 \n\r".getBytes());
//			   os.close();
//			   pr.waitFor();
//
//		} catch (Exception e) {
//			
//		}
		
//		============================�ý��� ����======================================================
//		OperatingSystemMXBean osBean = (com.sun.management.OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean();
//	    double load = 0 ;
//	    while(true){
//	      load = osBean.getSystemCpuLoad();
//	      try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
//	      if( load*100.0 > 0.0) break;
//	    }
//	    File f = new File("/");
//	    System.out.println("CPU ==============================");
//	    System.out.println("- Usage : "+  load*100.0 );
//	    System.out.println("- Usage Percent : "+  Math.round(load*100.0) + "%");
//	    System.out.println("- Idle  Percent : "+  (100 - Math.round(load*100.0)) + "%\n");
//	    System.out.println("HDD ==============================");
//	    System.out.println("- Total : " + Math.round( f.getTotalSpace()/(1024*1024) / 1000.0 ) + "(GB)");
//	    System.out.println("- Usage : " + Math.round( (f.getTotalSpace() - f.getUsableSpace())/(1024*1024)/ 1000.0) + "(GB)");
//	    System.out.println("- Idle  : " + Math.round( f.getUsableSpace()/(1024*1024) / 1000.0 ) + "(GB)");
//	    System.out.println("- Usage Percent : " + Math.round( Double.valueOf(f.getTotalSpace() - f.getUsableSpace())/ Double.valueOf(f.getTotalSpace()) * 100) + "%"   );
//	    System.out.println("- Idle  Percent : " + Math.round( Double.valueOf(f.getUsableSpace()) / Double.valueOf(f.getTotalSpace()) * 100) + "%\n" );
//	    System.out.println("Memory============================");
//	    System.out.println("- TotalPhysicalMemorySize: " + Math.round( osBean.getTotalPhysicalMemorySize() / (1024*1024) / 1000.0) + "(GB)"); 
//	    System.out.println("- FreePhysicalMemorySize: " + Math.round( osBean.getFreePhysicalMemorySize() / (1024*1024) / 1000.0) + "(GB)");
//	    System.out.println("- Usage Percent : " + Math.round( ( Double.valueOf(osBean.getTotalPhysicalMemorySize() - osBean.getFreePhysicalMemorySize() ) ) / Double.valueOf( osBean.getTotalPhysicalMemorySize() ) * 100) + "%");
//	    System.out.println("- Idle  Percent : " + Math.round( Double.valueOf(osBean.getFreePhysicalMemorySize()) / Double.valueOf( osBean.getTotalPhysicalMemorySize() ) * 100) + "%");
	    
	}
	public static String[] getDiskSpace() {
		File root = null;
		try {
			root = new File("/");
			String[] list = new String[2];
			list[0] = toMB(root.getTotalSpace()); 
			list[1] = toMB(root.getUsableSpace());
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
    
	public static String toMB(long size) {
		return String.valueOf((int) (size / (1024 * 1024)));
	}

	
	public static double getCPUProcess() {
		OperatingSystemMXBean osbean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();		
//		String cpuUsage = String.format("%.2f", osbean.getSystemCpuLoad() * 100);
		double data=osbean.getSystemCpuLoad();
//		String[] list = new String[2];
//		list[0] = cpuUsage;
		
		return data;
//		return null;
	}
	private static String getMemoryStatus() {
		OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
//		long totalMemory = osBean.getTotalPhysicalMemorySize() + osBean.getTotalSwapSpaceSize();
//		long freeMemory = osBean.getFreePhysicalMemorySize() + osBean.getFreeSwapSpaceSize();
		long totalMemory = osBean.getTotalPhysicalMemorySize();
		long totalSwapSpaceSize=osBean.getTotalSwapSpaceSize();
		long FreeSwapSpaceSize=osBean.getFreeSwapSpaceSize();
		long freeMemory = osBean.getFreePhysicalMemorySize();
		
		System.out.println("��Ż�޸�:"+totalMemory);
		System.out.println("�����޸�:"+freeMemory);
		System.out.println("��Ż����:"+totalSwapSpaceSize);
		System.out.println("��������:"+FreeSwapSpaceSize);
		double usage = ((totalMemory - freeMemory) / totalMemory) * 100;
		return df.format(usage);
	}

	//	�ý����� CPU ���� Ȯ��
	private String getCPUStatus() {
		OperatingSystemMXBean osbean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
		RuntimeMXBean runbean = (RuntimeMXBean) ManagementFactory.getRuntimeMXBean();

		long bfprocesstime = osbean.getProcessCpuTime();
		long bfuptime = runbean.getUptime();
		long ncpus = osbean.getAvailableProcessors();

		for (int i = 0; i < 1000000; ++i) {
			ncpus = osbean.getAvailableProcessors();
		}

		long afprocesstime = osbean.getProcessCpuTime();
		long afuptime = runbean.getUptime();

		float cal = (afprocesstime - bfprocesstime) / ((afuptime - bfuptime) * 10000f);

		float usage = 100 - Math.min(99f, cal) % 90 * 10;
		if (usage < 0)
			usage = 100;

		return df.format(usage);
	}
}
