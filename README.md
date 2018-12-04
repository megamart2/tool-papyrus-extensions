# [![MegaM@Rt](images/megamart2-logo.gif)](https://megamart2-ecsel.eu/) MegaM@Rt project: Papyrus Extensions

This repository contains the code of number of plugins that extend the functionality of Papyrus for Aspect Oriented Modeling (AOM). It also contains an update site to install them.

## MegaM@Rt Extensions for Papyrus

- eu.megamart2.papyrus.profiles.aom: this extension adds a AspectJ profile that enables the modeling of AspectJ applications and aspects.

## Installation
The installation of the MegaM@Rt Extensions for Papyrus follows the standard Eclipse plugin installation precedure.

### Requirements
MegaM@Rt Extensions for Papyrus require the following software requirements:
- Git
- Eclipse 2018-09 Modeling (or above)
- Papyrus

Install Git, Eclipse 2018-09 Modeling, Papyrus before proceedding to install these Papyrus extensions. 

### Installation precedure
1. In a command line interface (CMI), pull the **MegaM@Rt Extensions for Papyrus Repository** to get the update site locally:
`git clone https://gitlab.atosresearch.eu/ari/megamart2-papyrus.git`
This will create a *megamart2-papyrus* folder into your local file system

2. In Eclipse, select the top-menu Help/Install New Software. In the Install Wizard, select the Add... button to create a new local repository. Give a name and select the Local... button. Browse your local file system to the Git repository created in previous step. Select the *megamart2-papyrus/Site/eu.megamart2.papyrus.extensions.site* folder


![MegaM@Rt Extensions for Papyrus installation step 2](images/megamart-papyrus-install_1.png)


3. In Install wizard, select the *MegaM@Rt Extension for Moka* feature, and click on next. Follow next steps, acepting the license and finish. Accept new popup windows that may appear to accept the installation. Restart Eclipse when prompted.

![MegaM@Rt Extensions for Papyrus installation step 3](images/megamart-papyrus-install_2.png)

## User Manual

## Modeling AspectJ in UML with AspectJ profile


Main contact: Jesús Gorroñogoitia <jesus.gorronogoitia@atos.net>

![Project funded by the European Union](images/european.union.logo.png)
