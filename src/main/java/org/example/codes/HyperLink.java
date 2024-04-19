package org.example.codes;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class HyperLink
{
	public static void main(String[] args)  throws Exception
	
	{
	System.out.println("\t\t\t\t\tWelcome to Intuit Bookmarks");
	System.out.println("\t\t\t\t\t===========================\n \n");
	System.out.println("Please select an option to open webpage.\n\n\n");
	System.out.println("HR Connect \t Service-Now \t Workday Production \t ILN \t \t Dell Boomi \t OIM \t \tInsight");
	System.out.println("---------------------------------------------------------------------------------------------------------------");
	System.out.println("Press 1    \t Press 2     \t Press 3            \t Press 4    \t Press 5   \t Press 6\tPress 7");
	Scanner sc=new Scanner(System.in);
	int in=sc.nextInt();
	{
	if(in==1)
	{
	Desktop d=Desktop.getDesktop();
	d.browse(new URI("https://intuitwfc.my.salesforce.com/console"));
	}
	else if (in==2)
	{
		Desktop d=Desktop.getDesktop();
		d.browse(new URI("https://intuit.service-now.com/nav_to.do?uri=%2Fhome.do"));
	}
	else if (in==3)
	{
		Desktop d=Desktop.getDesktop();
		d.browse(new URI("https://www.myworkday.com/intuit/d/home.htmld"));
	}
	else if (in==4)
	{
		Desktop d=Desktop.getDesktop();
		d.browse(new URI("https://learning.intuit.com"));
	}
	else if (in==5)
	{
		Desktop d=Desktop.getDesktop();
		d.browse(new URI("https://platform.boomi.com/?#settings;accountId=intuit-3GOTUQ;type=user"));
	}
	else if (in==6)
	{
		Desktop d=Desktop.getDesktop();
		d.browse(new URI("https://eiamportal.intuit.com/IdMTools/Main/index.jsp"));
	}
	else if (in==7)
	{
		Desktop d=Desktop.getDesktop();
		d.browse(new URI("https://intuitcloud.sharepoint.com/Pages/home.aspx"));
	}
	else 
		System.out.println("Please select a valid input from the list.");
	sc.close();
	}
	}
}
