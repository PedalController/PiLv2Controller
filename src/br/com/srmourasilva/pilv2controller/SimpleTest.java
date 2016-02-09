package br.com.srmourasilva.pilv2controller;

import java.util.List;

import br.com.srmourasilva.lv2library.Lv2Library;
import br.com.srmourasilva.lv2library.Lv2Plugin;
import br.com.srmourasilva.modhostbinding.Host;

public class SimpleTest {
	public static void main(String[] args) {
		new SimpleTest();
	}

	public SimpleTest() {
		// initializatation
		System.out.println("Initialize jack mannualy");
		System.out.println("Initialize mod-host mannualy");
		
		System.out.println("Connectiong in host");
		Host modHost = new Host();
		
		System.out.println("Scanning plugins");
		Lv2Library myPlugins = Lv2Library.getInstance();
		
		System.out.println("Getting plugins");
		List<Lv2Plugin> plugins = myPlugins.getPlugins();
		
		Lv2Plugin plugin0 = plugins.get(0);
		Lv2Plugin plugin1 = plugins.get(1);
		
		System.out.println("Connecting plugins");
		modHost.add(plugin0);
		modHost.add(plugin1);
		
		modHost.connectInputIn(plugin0);
		modHost.connect(plugin0, plugin1);
		modHost.connectOnOutput(plugin1);
	}
}
