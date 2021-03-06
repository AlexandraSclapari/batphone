package org.servalproject.system;


public abstract class NetworkConfiguration implements
		Comparable<NetworkConfiguration> {

	public abstract String getSSID();

	public abstract String getStatus();

	public abstract int getBars();

	@Override
	public boolean equals(Object o) {
		if (!o.getClass().equals(this.getClass()))
			return false;
		NetworkConfiguration other = (NetworkConfiguration) o;
		return this.getSSID().equals(other.getSSID());
	}

	@Override
	public int hashCode() {
		return getSSID().hashCode();
	}

	@Override
	public String toString() {
		return getSSID();
	}

	@Override
	public int compareTo(NetworkConfiguration o) {
		return getSSID().compareTo(o.getSSID());
	}
}