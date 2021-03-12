Feature: UIModel

Background: Studio project is open
Given project "StudioAuto" get open
When UIModel "CommonVM.vm" get open
 

Scenario: Button-Single Control ID Verification
Then enter the button id for the button control
Then save and preview the UI Model


Scenario: Text Control ID Verification
Then search text control and enter the text id for the textinput control
Then save and preview the UI Model


#@Runthis
#Scenario: Excel Verification
#Given getdata from excel



    

