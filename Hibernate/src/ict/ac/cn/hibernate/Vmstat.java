package ict.ac.cn.hibernate;

// Generated 2014-8-24 12:59:22 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vmstat generated by hbm2java
 */
@Entity
@Table(name = "vmstat", catalog = "bdtune")
public class Vmstat implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2000005125907541997L;
	private Long vmstatid;
	private String hostname;
	private Long pgin;
	private Long pgout;
	private Long pgfault;
	private Long pgmajfault;
	private Long time;

	public Vmstat() {
	}

	public Vmstat(String hostname) {
		this.hostname = hostname;
	}

	public Vmstat(String hostname, Long pgin, Long pgout, Long pgfault,
			Long pgmajfault, Long time) {
		this.hostname = hostname;
		this.pgin = pgin;
		this.pgout = pgout;
		this.pgfault = pgfault;
		this.pgmajfault = pgmajfault;
		this.time = time;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "vmstatid", unique = true, nullable = false)
	public Long getVmstatid() {
		return this.vmstatid;
	}

	public void setVmstatid(Long vmstatid) {
		this.vmstatid = vmstatid;
	}

	@Column(name = "hostname", nullable = false, length = 32)
	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	@Column(name = "pgin")
	public Long getPgin() {
		return this.pgin;
	}

	public void setPgin(Long pgin) {
		this.pgin = pgin;
	}

	@Column(name = "pgout")
	public Long getPgout() {
		return this.pgout;
	}

	public void setPgout(Long pgout) {
		this.pgout = pgout;
	}

	@Column(name = "pgfault")
	public Long getPgfault() {
		return this.pgfault;
	}

	public void setPgfault(Long pgfault) {
		this.pgfault = pgfault;
	}

	@Column(name = "pgmajfault")
	public Long getPgmajfault() {
		return this.pgmajfault;
	}

	public void setPgmajfault(Long pgmajfault) {
		this.pgmajfault = pgmajfault;
	}

	@Column(name = "time")
	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

}
