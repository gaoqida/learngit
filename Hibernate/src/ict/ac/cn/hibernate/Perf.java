package ict.ac.cn.hibernate;

// Generated 2014-8-24 12:59:22 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Perf generated by hbm2java
 */
@Entity
@Table(name = "perf", catalog = "bdtune")
public class Perf implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7703004286005658453L;
	private Long perfid;
	private String hostname;
	private Long cyclesU;
	private Long cyclesK;
	private Long insU;
	private Long insK;
	private Long branchU;
	private Long branchK;
	private Long loadU;
	private Long loadK;
	private Long storeU;
	private Long storeK;
	private Long ssePSi;
	private Long sseSSi;
	private Long ssePD;
	private Long sseSD;
	private Long fp;
	private Long l2CacheMissU;
	private Long l2CacheMissK;
	private Long l2HitU;
	private Long l2HitK;
	private Long l1dMissU;
	private Long l1dMissK;
	private Long l1dHitU;
	private Long l1dHitK;
	private Long l1iHitU;
	private Long l1iHitK;
	private Long l1iMissU;
	private Long l1iMissK;
	private Long itlbMissU;
	private Long itlbMissK;
	private Long dtlbMissU;
	private Long dtlbMissK;
	private Long l3MissU;
	private Long l3MissK;
	private Long l3HitU;
	private Long l3HitK;
	private Long insDecodeU;
	private Long insDecodeK;
	private Long l1iCycleeStallU;
	private Long l1iCycleeStallK;
	private Long resourceStallU;
	private Long resourceStallK;
	private Long ratStallU;
	private Long ratStallK;
	private Long time;

	public Perf() {
	}

	public Perf(String hostname, Long cyclesU, Long cyclesK, Long insU,
			Long insK, Long branchU, Long branchK, Long loadU, Long loadK,
			Long storeU, Long storeK, Long ssePSi, Long sseSSi, Long ssePD,
			Long sseSD, Long fp, Long l2CacheMissU, Long l2CacheMissK,
			Long l2HitU, Long l2HitK, Long l1dMissU, Long l1dMissK,
			Long l1dHitU, Long l1dHitK, Long l1iHitU, Long l1iHitK,
			Long l1iMissU, Long l1iMissK, Long itlbMissU, Long itlbMissK,
			Long dtlbMissU, Long dtlbMissK, Long l3MissU, Long l3MissK,
			Long l3HitU, Long l3HitK, Long insDecodeU, Long insDecodeK,
			Long l1iCycleeStallU, Long l1iCycleeStallK, Long resourceStallU,
			Long resourceStallK, Long ratStallU, Long ratStallK, Long time) {
		this.hostname = hostname;
		this.cyclesU = cyclesU;
		this.cyclesK = cyclesK;
		this.insU = insU;
		this.insK = insK;
		this.branchU = branchU;
		this.branchK = branchK;
		this.loadU = loadU;
		this.loadK = loadK;
		this.storeU = storeU;
		this.storeK = storeK;
		this.ssePSi = ssePSi;
		this.sseSSi = sseSSi;
		this.ssePD = ssePD;
		this.sseSD = sseSD;
		this.fp = fp;
		this.l2CacheMissU = l2CacheMissU;
		this.l2CacheMissK = l2CacheMissK;
		this.l2HitU = l2HitU;
		this.l2HitK = l2HitK;
		this.l1dMissU = l1dMissU;
		this.l1dMissK = l1dMissK;
		this.l1dHitU = l1dHitU;
		this.l1dHitK = l1dHitK;
		this.l1iHitU = l1iHitU;
		this.l1iHitK = l1iHitK;
		this.l1iMissU = l1iMissU;
		this.l1iMissK = l1iMissK;
		this.itlbMissU = itlbMissU;
		this.itlbMissK = itlbMissK;
		this.dtlbMissU = dtlbMissU;
		this.dtlbMissK = dtlbMissK;
		this.l3MissU = l3MissU;
		this.l3MissK = l3MissK;
		this.l3HitU = l3HitU;
		this.l3HitK = l3HitK;
		this.insDecodeU = insDecodeU;
		this.insDecodeK = insDecodeK;
		this.l1iCycleeStallU = l1iCycleeStallU;
		this.l1iCycleeStallK = l1iCycleeStallK;
		this.resourceStallU = resourceStallU;
		this.resourceStallK = resourceStallK;
		this.ratStallU = ratStallU;
		this.ratStallK = ratStallK;
		this.time = time;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "perfid", unique = true, nullable = false)
	public Long getPerfid() {
		return this.perfid;
	}

	public void setPerfid(Long perfid) {
		this.perfid = perfid;
	}

	@Column(name = "hostname", length = 32)
	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	@Column(name = "cycles_u")
	public Long getCyclesU() {
		return this.cyclesU;
	}

	public void setCyclesU(Long cyclesU) {
		this.cyclesU = cyclesU;
	}

	@Column(name = "cycles_k")
	public Long getCyclesK() {
		return this.cyclesK;
	}

	public void setCyclesK(Long cyclesK) {
		this.cyclesK = cyclesK;
	}

	@Column(name = "ins_u")
	public Long getInsU() {
		return this.insU;
	}

	public void setInsU(Long insU) {
		this.insU = insU;
	}

	@Column(name = "ins_k")
	public Long getInsK() {
		return this.insK;
	}

	public void setInsK(Long insK) {
		this.insK = insK;
	}

	@Column(name = "branch_u")
	public Long getBranchU() {
		return this.branchU;
	}

	public void setBranchU(Long branchU) {
		this.branchU = branchU;
	}

	@Column(name = "branch_k")
	public Long getBranchK() {
		return this.branchK;
	}

	public void setBranchK(Long branchK) {
		this.branchK = branchK;
	}

	@Column(name = "load_u")
	public Long getLoadU() {
		return this.loadU;
	}

	public void setLoadU(Long loadU) {
		this.loadU = loadU;
	}

	@Column(name = "load_k")
	public Long getLoadK() {
		return this.loadK;
	}

	public void setLoadK(Long loadK) {
		this.loadK = loadK;
	}

	@Column(name = "store_u")
	public Long getStoreU() {
		return this.storeU;
	}

	public void setStoreU(Long storeU) {
		this.storeU = storeU;
	}

	@Column(name = "store_k")
	public Long getStoreK() {
		return this.storeK;
	}

	public void setStoreK(Long storeK) {
		this.storeK = storeK;
	}

	@Column(name = "sse_p_si")
	public Long getSsePSi() {
		return this.ssePSi;
	}

	public void setSsePSi(Long ssePSi) {
		this.ssePSi = ssePSi;
	}

	@Column(name = "sse_s_si")
	public Long getSseSSi() {
		return this.sseSSi;
	}

	public void setSseSSi(Long sseSSi) {
		this.sseSSi = sseSSi;
	}

	@Column(name = "sse_p_d")
	public Long getSsePD() {
		return this.ssePD;
	}

	public void setSsePD(Long ssePD) {
		this.ssePD = ssePD;
	}

	@Column(name = "sse_s_d")
	public Long getSseSD() {
		return this.sseSD;
	}

	public void setSseSD(Long sseSD) {
		this.sseSD = sseSD;
	}

	@Column(name = "fp")
	public Long getFp() {
		return this.fp;
	}

	public void setFp(Long fp) {
		this.fp = fp;
	}

	@Column(name = "l2_cache_miss_u")
	public Long getL2CacheMissU() {
		return this.l2CacheMissU;
	}

	public void setL2CacheMissU(Long l2CacheMissU) {
		this.l2CacheMissU = l2CacheMissU;
	}

	@Column(name = "l2_cache_miss_k")
	public Long getL2CacheMissK() {
		return this.l2CacheMissK;
	}

	public void setL2CacheMissK(Long l2CacheMissK) {
		this.l2CacheMissK = l2CacheMissK;
	}

	@Column(name = "l2_hit_u")
	public Long getL2HitU() {
		return this.l2HitU;
	}

	public void setL2HitU(Long l2HitU) {
		this.l2HitU = l2HitU;
	}

	@Column(name = "l2_hit_k")
	public Long getL2HitK() {
		return this.l2HitK;
	}

	public void setL2HitK(Long l2HitK) {
		this.l2HitK = l2HitK;
	}

	@Column(name = "l1d_miss_u")
	public Long getL1dMissU() {
		return this.l1dMissU;
	}

	public void setL1dMissU(Long l1dMissU) {
		this.l1dMissU = l1dMissU;
	}

	@Column(name = "l1d_miss_k")
	public Long getL1dMissK() {
		return this.l1dMissK;
	}

	public void setL1dMissK(Long l1dMissK) {
		this.l1dMissK = l1dMissK;
	}

	@Column(name = "l1d_hit_u")
	public Long getL1dHitU() {
		return this.l1dHitU;
	}

	public void setL1dHitU(Long l1dHitU) {
		this.l1dHitU = l1dHitU;
	}

	@Column(name = "l1d_hit_k")
	public Long getL1dHitK() {
		return this.l1dHitK;
	}

	public void setL1dHitK(Long l1dHitK) {
		this.l1dHitK = l1dHitK;
	}

	@Column(name = "l1i_hit_u")
	public Long getL1iHitU() {
		return this.l1iHitU;
	}

	public void setL1iHitU(Long l1iHitU) {
		this.l1iHitU = l1iHitU;
	}

	@Column(name = "l1i_hit_k")
	public Long getL1iHitK() {
		return this.l1iHitK;
	}

	public void setL1iHitK(Long l1iHitK) {
		this.l1iHitK = l1iHitK;
	}

	@Column(name = "l1i_miss_u")
	public Long getL1iMissU() {
		return this.l1iMissU;
	}

	public void setL1iMissU(Long l1iMissU) {
		this.l1iMissU = l1iMissU;
	}

	@Column(name = "l1i_miss_k")
	public Long getL1iMissK() {
		return this.l1iMissK;
	}

	public void setL1iMissK(Long l1iMissK) {
		this.l1iMissK = l1iMissK;
	}

	@Column(name = "itlb_miss_u")
	public Long getItlbMissU() {
		return this.itlbMissU;
	}

	public void setItlbMissU(Long itlbMissU) {
		this.itlbMissU = itlbMissU;
	}

	@Column(name = "itlb_miss_k")
	public Long getItlbMissK() {
		return this.itlbMissK;
	}

	public void setItlbMissK(Long itlbMissK) {
		this.itlbMissK = itlbMissK;
	}

	@Column(name = "dtlb_miss_u")
	public Long getDtlbMissU() {
		return this.dtlbMissU;
	}

	public void setDtlbMissU(Long dtlbMissU) {
		this.dtlbMissU = dtlbMissU;
	}

	@Column(name = "dtlb_miss_k")
	public Long getDtlbMissK() {
		return this.dtlbMissK;
	}

	public void setDtlbMissK(Long dtlbMissK) {
		this.dtlbMissK = dtlbMissK;
	}

	@Column(name = "l3_miss_u")
	public Long getL3MissU() {
		return this.l3MissU;
	}

	public void setL3MissU(Long l3MissU) {
		this.l3MissU = l3MissU;
	}

	@Column(name = "l3_miss_k")
	public Long getL3MissK() {
		return this.l3MissK;
	}

	public void setL3MissK(Long l3MissK) {
		this.l3MissK = l3MissK;
	}

	@Column(name = "l3_hit_u")
	public Long getL3HitU() {
		return this.l3HitU;
	}

	public void setL3HitU(Long l3HitU) {
		this.l3HitU = l3HitU;
	}

	@Column(name = "l3_hit_k")
	public Long getL3HitK() {
		return this.l3HitK;
	}

	public void setL3HitK(Long l3HitK) {
		this.l3HitK = l3HitK;
	}

	@Column(name = "ins_decode_u")
	public Long getInsDecodeU() {
		return this.insDecodeU;
	}

	public void setInsDecodeU(Long insDecodeU) {
		this.insDecodeU = insDecodeU;
	}

	@Column(name = "ins_decode_k")
	public Long getInsDecodeK() {
		return this.insDecodeK;
	}

	public void setInsDecodeK(Long insDecodeK) {
		this.insDecodeK = insDecodeK;
	}

	@Column(name = "l1i_cyclee_stall_u")
	public Long getL1iCycleeStallU() {
		return this.l1iCycleeStallU;
	}

	public void setL1iCycleeStallU(Long l1iCycleeStallU) {
		this.l1iCycleeStallU = l1iCycleeStallU;
	}

	@Column(name = "l1i_cyclee_stall_k")
	public Long getL1iCycleeStallK() {
		return this.l1iCycleeStallK;
	}

	public void setL1iCycleeStallK(Long l1iCycleeStallK) {
		this.l1iCycleeStallK = l1iCycleeStallK;
	}

	@Column(name = "resource_stall_u")
	public Long getResourceStallU() {
		return this.resourceStallU;
	}

	public void setResourceStallU(Long resourceStallU) {
		this.resourceStallU = resourceStallU;
	}

	@Column(name = "resource_stall_k")
	public Long getResourceStallK() {
		return this.resourceStallK;
	}

	public void setResourceStallK(Long resourceStallK) {
		this.resourceStallK = resourceStallK;
	}

	@Column(name = "rat_stall_u")
	public Long getRatStallU() {
		return this.ratStallU;
	}

	public void setRatStallU(Long ratStallU) {
		this.ratStallU = ratStallU;
	}

	@Column(name = "rat_stall_k")
	public Long getRatStallK() {
		return this.ratStallK;
	}

	public void setRatStallK(Long ratStallK) {
		this.ratStallK = ratStallK;
	}

	@Column(name = "time")
	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

}