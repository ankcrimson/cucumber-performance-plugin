cucumber-performance
====================

A plugin for the Jenkins continuous integration tool which allows for reporting over time of the performance of tests executed using the Cucumber-JVM framework.

<table>
<tr><th>Version</th><th>Release Date</th></tr>
<tr><td>2.0.1</td><td>13th July 2014</td></tr>
<tr><td>1.3.1</td><td>5th August 2013</td></tr>
<tr><td>1.2</td><td>31st July 2013</td></tr>
</table>

This plugin reports on the performance over time of testing jobs run by Jenkins containing tests using the Cucumber-JVM framework.

It works by parsing the relevant output files from Cucumber-JVM, aggregating the information and presenting it in a coherent and easy-to-understand format.

The main report is a graphical representation of the time taken by successful builds of that project, and from there it's possible to drill down into the features of that project, and onwards to scenarios and steps.

Any suggestions for future features will be most welcome - please use the issue reporting tool in GitHub to send me these. Bug reports are also welcome!

The code is contained in this GitHub repo (https://github.com/TrueDub/cucumber-performance), with the latest released version on the master branch, and a named branch for the latest version under development (currently V1.3). 

This project owes a lot to the excellent Cucumber-JVM reporting plugins developed by Kingsley Hendrickse and Masterthought, and available at https://github.com/masterthought

Many thanks to them for their hard work!

Jenkins build status for master branch
--------------------------------------

[![Build Status](https://buildhive.cloudbees.com/job/TrueDub/job/cucumber-performance/badge/icon)](https://buildhive.cloudbees.com/job/TrueDub/job/cucumber-performance/)

How to use this plugin
----------------------
<ol>
<li>Install it from the Jenkins plugin update screen, then re-start Jenkins.
<li>In the Post-Build Actions of the job that executes the Cucumber tests, add "Generate Cucumber performance reports" as an action.
<li>Optionally, update the following pieces of config (by clicking the Advanced button):
    <ul><li>The path relative to the workspace of the json reports generated by cucumber-jvm e.g. target/report - leave empty to let the plugin find them automagically.
    <li>The name of the file containing json reports generated by cucumber-jvm - leave empty to use the default name of cucumber.json
    <li>The number of items to display on the Sorted Reports screen - setting this to too high a number will cause performance issues.
    </ul>
</ol>

What you see
------------

The main report view is:

![Project View](/images/projectview.png)

The links on the Summary and the sections of the Pie Chart provide the ability to drill down into the Feature -> Scenario - > Step views, and the same level of information is presented, where appropriate.

The other form of information presented is the worst-performing one, indicating which features/scenarios/steps are consistently the worst performers.

![Project View](/images/sortedview.png)


Change History
--------------

This list starts with V2.0.1 only

<table>
<tr><th>Version</th><th>Change Detail</th></tr>
<tr><td>2.0.1</td><td>
<ul>
   <li>changed the plugin processing to separate data generation from report presentation
   <li>introduced use of Jackson to produce JSON outputs where necessary
   <li>persisted the plugin data using XStream
   <li>totally revamped the UI to make the plugin fit better into the Jenkins look & feel.
   <li>removed Velocity and other non-required libraries
</td></tr>
</table>

End