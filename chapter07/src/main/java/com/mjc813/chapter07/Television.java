package com.mjc813.chapter07;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Television {
    private double tvPanel;
    private int madeYear;

//	public int getMadeYear() {
//		return madeYear;
//	}
//
//	public void setMadeYear(int madeYear) {
//		this.madeYear = madeYear;
//	}
//
//	public double getTvPanel() {
//		return tvPanel;
//	}
//
//	public void setTvPanel(double tvPanel) {
//		this.tvPanel = tvPanel;
//	}

    public Television() {
        this.setTvPanel(0.0);
        this.setMadeYear(2001);
    }

//	public Television(double tvPanel, int madeYear) {
//		this.setTvPanel(tvPanel);
//		this.setMadeYear(madeYear);
//	}

    public String getInfo() {
        return String.format("Television(year=%s, panel=%-8.2f )\n", this.getMadeYear(), this.getTvPanel());
    }
}