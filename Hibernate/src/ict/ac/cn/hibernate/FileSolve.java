package ict.ac.cn.hibernate;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileSolve {
	public static Snmp DelSnmp(String str,String wenjianname)
	{
		String[] s = str.split(" ");
		Snmp sn = new Snmp();
		sn.setTime(Long.parseLong(s[0]));sn.setActiveConn(Long.parseLong(s[1]));
		sn.setPassiveConn(Long.parseLong(s[2]));
		sn.setRbytes(Long.parseLong(s[3]));sn.setRpackets(Long.parseLong(s[4]));
		sn.setRerrs(Long.parseLong(s[5]));sn.setRdrop(Long.parseLong(s[6]));
		sn.setSbytes(Long.parseLong(s[7]));
		sn.setSpackets(Long.parseLong(s[8]));sn.setSerrs(Long.parseLong(s[9]));
		sn.setSdrop(Long.parseLong(s[10]));
		sn.setHostname(wenjianname);
		return sn;
		//snmp.save(sn);
		//涓�敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熺獤鎾呮嫹閿熸枻鎷峰彇閿熸枻鎷峰噯閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鎹峰尅鎷�
	}
	public static Vmstat DelVmstat(String str,String wenjianname)
	{
		String[] s = str.split(" ");
		Vmstat vm = new Vmstat();
		vm.setTime(Long.parseLong(s[0]));vm.setPgin(Long.parseLong(s[1]));
		vm.setPgout(Long.parseLong(s[2]));vm.setPgfault(Long.parseLong(s[3]));
		vm.setPgmajfault(Long.parseLong(s[4]));vm.setHostname(wenjianname);
		return vm;
		//涓�敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熺獤鎾呮嫹閿熸枻鎷峰彇閿熸枻鎷峰噯閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鎹峰尅鎷�
		
	}
	public static Meminfo  DelMeninfo(String str,String wenjianname)
	{
		String[] s = str.split(" ");
		Meminfo me = new Meminfo();
		me.setTime(Long.parseLong(s[0]));me.setMemTotal(Long.parseLong(s[1]));
		me.setFree(Long.parseLong(s[2]));me.setBuffers(Long.parseLong(s[3]));
		me.setCached(Long.parseLong(s[3]));me.setSwapCached(Long.parseLong(s[4]));
		me.setActive(Long.parseLong(s[5]));me.setInactive(Long.parseLong(s[6]));
		me.setSwapTotal(Long.parseLong(s[7]));me.setSwapFree(Long.parseLong(s[8]));
		me.setHostname(wenjianname);
		return me;//System.out.println(1);
		//涓�敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熺獤鎾呮嫹閿熸枻鎷峰彇閿熸枻鎷峰噯閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鎹峰尅鎷�
	}
	public static Cpuinfo DelCpuinfo(String str,String wenjianname)
	{
		String[] s = str.split(" ");
		Cpuinfo cp = new Cpuinfo();
		cp.setTime(Long.parseLong(s[0]));cp.setUsr(Long.parseLong(s[1]));
		cp.setNice(Long.parseLong(s[2]));cp.setSys(Long.parseLong(s[3]));
		cp.setIdle(Long.parseLong(s[4]));cp.setIowait(Long.parseLong(s[5]));
		cp.setIrq(Long.parseLong(s[6]));cp.setSoftirq(Long.parseLong(s[7]));
		cp.setIntr(Long.parseLong(s[8]));cp.setCtx(Long.parseLong(s[9]));
		cp.setProcs(Long.parseLong(s[10]));cp.setRunning(Long.parseLong(s[11]));
		cp.setBlocked(Long.parseLong(s[12]));cp.setHostname(wenjianname);
		return cp;

	}
	
	public static Perf DelKperf(String str,String wenjianname)
	{
		String[] s = str.split(" ");
		Perf kp = new Perf();
		kp.setTime(Long.parseLong(s[0]));kp.setCyclesU(Long.parseLong(s[1]));
		kp.setCyclesK(Long.parseLong(s[2]));
		kp.setInsU(Long.parseLong(s[3]));
		kp.setInsK(Long.parseLong(s[4]));kp.setBranchU(Long.parseLong(s[5]));
		kp.setBranchK(Long.parseLong(s[6]));kp.setLoadU(Long.parseLong(s[7]));
		kp.setLoadK(Long.parseLong(s[8]));kp.setStoreU(Long.parseLong(s[9]));
		kp.setStoreK(Long.parseLong(s[10]));kp.setSsePSi(Long.parseLong(s[11]));
		kp.setSseSSi(Long.parseLong(s[12]));kp.setSsePD(Long.parseLong(s[13]));
		kp.setSseSD(Long.parseLong(s[14]));kp.setFp(Long.parseLong(s[15]));
		kp.setL2CacheMissU(Long.parseLong(s[16]));
		kp.setL2CacheMissK(Long.parseLong(s[17]));kp.setL2HitU(Long.parseLong(s[18]));
		kp.setL2HitK(Long.parseLong(s[19]));kp.setL1dMissU(Long.parseLong(s[20]));
		kp.setL1dMissK(Long.parseLong(s[21]));kp.setL1dHitU(Long.parseLong(s[22]));
		kp.setL1dHitK(Long.parseLong(s[23]));kp.setL1iHitU(Long.parseLong(s[24]));
		kp.setL1iHitK(Long.parseLong(s[25]));kp.setL1iMissU(Long.parseLong(s[26]));
		kp.setL1iMissK(Long.parseLong(s[27]));kp.setItlbMissU(Long.parseLong(s[28]));
		kp.setItlbMissK(Long.parseLong(s[29]));kp.setDtlbMissU(Long.parseLong(s[30]));
		kp.setDtlbMissK(Long.parseLong(s[31]));kp.setL3MissU(Long.parseLong(s[32]));
		kp.setL3MissK(Long.parseLong(s[33]));kp.setL3HitU(Long.parseLong(s[34]));
		kp.setL3HitK(Long.parseLong(s[35]));kp.setInsDecodeU(Long.parseLong(s[36]));
		kp.setInsDecodeK(Long.parseLong(s[37]));kp.setL1iCycleeStallU(Long.parseLong(s[38]));
		kp.setL1iCycleeStallK(Long.parseLong(s[39]));kp.setResourceStallU(Long.parseLong(s[40]));
		kp.setResourceStallK(Long.parseLong(s[41]));kp.setRatStallU(Long.parseLong(s[42]));
		kp.setRatStallK(Long.parseLong(s[43]));kp.setHostname(wenjianname);
		return kp;
	}
	
	public static Disk Deldisk(String str,String wenjianname)
	{
		String[] s = str.split(" ");
		Disk kp = new Disk();
		kp.setTimestamp(Long.parseLong(s[0]));
		kp.setDiskRead(Long.parseLong(s[1]));
		kp.setDiskReadMerged(Long.parseLong(s[2]));kp.setDiskReadSectors(Long.parseLong(s[3]));
		kp.setDiskReadTime(Long.parseLong(s[4]));kp.setDiskWrite(Long.parseLong(s[5]));
		kp.setDiskWriteMerged(Long.parseLong(s[6]));kp.setDiskWriteSectors(Long.parseLong(s[7]));
		kp.setDiskWriteTime(Long.parseLong(s[8]));kp.setProgressIo(Long.parseLong(s[9]));
		kp.setIoTime(Long.parseLong(s[10]));kp.setIoTimeWeighted(Long.parseLong(s[11]));
		kp.setHostname(wenjianname);
		return kp;
	}
	public static void perfsave(List<Perf> l)
	{
		PerfHome p = new PerfHome();
		for(Perf pf :l)
		{
			p.save(pf);
		}
	}
	public static void disksave(List<Disk> l)
	{
		DiskHome p = new DiskHome();
		for(Disk pf :l)
		{
			p.save(pf);
		}
	}
	public static void cpusave(List<Cpuinfo> l)
	{
		CpuinfoHome  p = new CpuinfoHome();
		for(Cpuinfo pf :l)
		{
			p.save(pf);
		}
		
	}
	public static void mesave(List<Meminfo> l)
	{
		MeminfoHome  p = new MeminfoHome();
		for(Meminfo pf :l)
		{
			p.save(pf);
		}
	}
	public static void snmpsave(List<Snmp> l)
	{
		SnmpHome  p = new SnmpHome();
		for(Snmp pf :l)
		{
			p.save(pf);
		}
	}
	public static void vmstatsave(List<Vmstat> l)
	{
		VmstatHome  p = new VmstatHome();
		for(Vmstat pf :l)
		{
			p.save(pf);
		}
	}
	public static void DelString(String str,int hangshu,String wenjianname)
	{	
		int hang =1;
		String[] str1 = str.split("\n");//閿熸枻鎷峰彇閿熸枻鎷蜂竴閿熸枻鎷�
		String[] str2 = str1[0].split("\t");//绗竴琛�		
		int  i = 1;
		if(str2[1].equals("usr"))
		{
			List<Cpuinfo> cpuinfolist = new ArrayList<Cpuinfo>();
			List<Meminfo> meminfolist = new ArrayList<Meminfo>();
			List<Snmp> snmplist= new ArrayList<Snmp>();
			List<Vmstat> vmstatlist = new ArrayList<Vmstat>();
			List<Disk> dk = new ArrayList<Disk>();
			
			//閿熸枻鎷稰roc閿熶茎纭锋嫹  閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓绲歱uinfo,snmp,vmstat,meminfo閿熸枻鎷烽敓鏂ゆ嫹
			while(hang!=hangshu){//閿熸枻鎷烽敓鐭伋浼欐嫹姊伴敓鏂ゆ嫹閿熻緝锟�				
				String[] str3 = str1[hang].split("\t");//姣忎竴閿熷彨纰夋嫹閿熸枻鎷锋伅閿熻闈╂嫹閿熸枻鎷�
				String Cpuinfostr=str3[0];
				String Meminfo=str3[0];
				String Snmp=str3[0];
				String vmstat=str3[0];
				String Disk=str3[0];
				
				while(i<=12){//閿熸枻鎷峰彇cpu鍓�2閿熸枻鎷烽敓鏂ゆ嫹閿熻緝锟�					Cpuinfostr += " " + str3[i];		
					Cpuinfostr += " " + str3[i];
					i++;
				}
				
				//System.out.println(Cpuinfostr);
				cpuinfolist.add(DelCpuinfo(Cpuinfostr,wenjianname));
				while(i>12 && i<=21){//閿熸枻鎷峰彇cpu鍓�2閿熸枻鎷烽敓鏂ゆ嫹閿熻緝锟�					Meminfo += " " + str3[i];
					Meminfo += " " + str3[i];
					i++;
					
				}
				meminfolist.add(DelMeninfo(Meminfo,wenjianname));
				while(i>21 && i<=25){//閿熸枻鎷峰彇cpu鍓�2閿熸枻鎷烽敓鏂ゆ嫹閿熻緝锟�					vmstat += " " + str3[i];
					vmstat += " " + str3[i];
					i++;
					
				}
				vmstatlist.add(DelVmstat(vmstat,wenjianname));
				while(i>25 && i<=35){//閿熸枻鎷峰彇cpu鍓�2閿熸枻鎷烽敓鏂ゆ嫹閿熻緝锟�					Snmp += " " + str3[i];
					Snmp += " " + str3[i];
					i++;
					
				}
				snmplist.add(DelSnmp(Snmp,wenjianname));
				while(i>35&&i<=46)
				{
					Disk += " " + str3[i];
					i++;
				}
				dk.add(Deldisk(Disk, wenjianname));
				hang++;i=1;
			}
			cpusave(cpuinfolist);
			mesave(meminfolist);
			vmstatsave(vmstatlist);
			snmpsave(snmplist);
			disksave(dk);
			
		}
		
		else
		{
			List<Perf> pf = new ArrayList<Perf>();
			//閿熸枻鎷穔perf閿熶茎纭锋嫹  閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹
			while(hang!=hangshu){//閿熸枻鎷烽敓鐭伋浼欐嫹姊伴敓鏂ゆ嫹閿熻緝锟�				
				String[] str3 = str1[hang].split("\t");//姣忎竴閿熷彨纰夋嫹閿熸枻鎷锋伅閿熻闈╂嫹閿熸枻鎷�
				String Kperf=str3[0];
				while(i<str3.length)
				{
					Kperf += " " + str3[i];
					i++;
				}
				//DelKperf(Kperf,wenjianname);
			pf.add(DelKperf(Kperf, wenjianname));
				hang++;i=1;
			}
			perfsave(pf);
		}
	}
	

 public static void main(String[] args) {
	  FileInputStream fis = null;
	  InputStreamReader isr = null;
	  BufferedReader br = null; 
	  try {
	   String str = "";
	   String str1 = "";
	   int i = 0;
	   String lujing  = args[0];
      //String lujing = "/home/gaoqi/hw001.perf";
	   //System.out.println(lujing);
	   int one = lujing.lastIndexOf("/");
	   String wenjianname = "/default-rack/"+lujing.substring((one+1),lujing.length());
	   fis = new FileInputStream(lujing);// FileInputStream
	   // 閿熸枻鎷烽敓渚ョ》鎷风郴缁熼敓鍙鎷锋煇閿熸枻鎷烽敓渚ョ》鎷烽敓鍙紮鎷峰彇閿熻鏂ゆ嫹
	   isr = new InputStreamReader(fis);// InputStreamReader 閿熸枻鎷烽敓琛楁枻鎷烽敓鏂ゆ嫹閫氶敓鏂ゆ嫹閿熻鍑ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷烽敓鏂ゆ嫹,
	   br = new BufferedReader(isr);
	   while ((str = br.readLine()) != null) {
		   i++;
	    str1 += str + "\n";
	   }
	   //System.out.println(str1);
	   DelString(str1,i,wenjianname);

	  } catch (FileNotFoundException e) {
	   System.out.println("閿熸彮璇ф嫹閿熸枻鎷锋寚閿熸枻鎷烽敓渚ョ》鎷�");

	  } catch (IOException e) {
	   System.out.println("閿熸枻鎷峰彇閿熶茎纭锋嫹澶遍敓鏂ゆ嫹");

	  } finally {
	   try {
	     br.close();
	     isr.close();
	     fis.close();
	    // 閿熸埅闂鎷锋椂閿熸枻鎷烽敓鏂ゆ嫹鍐掗敓鏂ゆ嫹閿熸枻鎷风兢閿熷壙绛规嫹閿熸埅鎲嬫嫹閿熸枻鎷风絺顎旈敓鏂ゆ嫹瑁欎箛閿熸枻鎷烽敓鏂ゆ嫹閿熸枻鎷疯閿熺氮,閿熷姭鐧告嫹n,閿熸枻鎷烽敓鏂ゆ嫹m
	   } catch (IOException e) {
	    e.printStackTrace(); 
	   }
	  }

	 
 }
}