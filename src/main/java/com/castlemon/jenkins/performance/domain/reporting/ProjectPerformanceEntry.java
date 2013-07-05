package com.castlemon.jenkins.performance.domain.reporting;

import java.util.Date;

public class ProjectPerformanceEntry {

	private int buildNumber;

	private long elapsedTime;

	private Date runDate;

	private int passedSteps;

	private int failedSteps;

	private int skippedSteps;

	private boolean passedBuild;

	public long getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public Date getRunDate() {
		return runDate;
	}

	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}

	public int getPassedSteps() {
		return passedSteps;
	}

	public void setPassedSteps(int passedSteps) {
		this.passedSteps = passedSteps;
	}

	public int getFailedSteps() {
		return failedSteps;
	}

	public void setFailedSteps(int failedSteps) {
		this.failedSteps = failedSteps;
	}

	public int getSkippedSteps() {
		return skippedSteps;
	}

	public void setSkippedSteps(int skippedSteps) {
		this.skippedSteps = skippedSteps;
	}

	public boolean isPassedBuild() {
		return passedBuild;
	}

	public void setPassedBuild(boolean passedBuild) {
		this.passedBuild = passedBuild;
	}

	public int getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(int buildNumber) {
		this.buildNumber = buildNumber;
	}

}
