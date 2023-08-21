package Object;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public abstract class Audit {
    private LocalDateTime outDatetime;
    private LocalDateTime entryDatetime;
    private String status;
    private Long fee;
    private Long feeThreshold;

    public Audit() {
        this.status = "in";
    }

    public LocalDateTime getOutDatetime() {
        return outDatetime;
    }

    public void setOutDatetime(LocalDateTime outDatetime) {
        this.outDatetime = outDatetime;
    }

    public LocalDateTime getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(LocalDateTime entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

    public void updateStatus(){
        if(status == "in"){
            status = "out";
        } else {
            System.out.println("Status Sudah keluar");
        }
    }

    public Long getFeeThreshold() {
        return feeThreshold;
    }

    public void setFeeThreshold(Long feeThreshold) {
        this.feeThreshold = feeThreshold;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long calculateParkHour(){
        if(status != "out"){
            return ChronoUnit.HOURS.between(LocalDateTime.now(), entryDatetime);
        } else {
            return ChronoUnit.HOURS.between(outDatetime, entryDatetime);
        }
    }

    public Long calculateParkFee(){
        Long hours = calculateParkHour();
        Long total = hours * fee;
        return total >  feeThreshold ? feeThreshold : total;
    }
}
