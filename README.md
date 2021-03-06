Vaadin on Heroku
================

The goal of this project is to demonstrate how to build a [Vaadin](https://vaadin.com/home) application and deploy it on [Heroku](http://www.heroku.com).

It uses [Embed for Vaadin](https://vaadin.com/directory#addon/embed-for-vaadin) to configure and start an embedded [tomcat](http://tomcat.apache.org/)
configured to start Vaadin and store session in memcached.

What is heroku specific in there?
---------------------------------

* Procfile: Heroku is using [foreman](https://github.com/ddollar/foreman) to launch processes and the Procfile is the file that define the processes.
* maven-dependency-plugin configured in the pom of the server module to copy the dependencies.
* Launcher class that will configure the tomcat server based on env variables and launch it.
* DevLauncher class in test that you can call directly from your IDE to develop faster.
* Launchers use [vaadin-for-heroku](https://github.com/nhurion/vaadin-for-heroku) which is available through maven central.

Where tho go from here?
-----------------------

If you never used heroku before, install the [toolbelt](https://toolbelt.heroku.com/) and [create an account](http://heroku.com/signup).

Clone this repository

    git clone git@github.com:nhurion/hello-vaadin-heroku.git

Create the heroku stack that will receive the application

    heroku create --stack cedar

Heroku will create your app and give you it's url. You can change it later.

You'll also need to add the memcache add-on. In order to add it, you'll have to verify your credit card information.
As long as you use the free version of the add-on and you only use one dyno, you won't get charged.
If you do not want to give your credit card information, edit the server Launcher and remove the configuration of memcached.
You will only be able to use one dyno, and session will be lost when your dyno is restarted but you'll be able to try heroku.

To add memcache add-on oyu can go to the [heroku interface](https://addons.heroku.com/), or type the following command:

    heroku addons:add memcache

Then push the application like this :

    git push heroku master

And the application is up and running.


As an example, this application is deployed on heroku and accessible at http://hello-vaadin-heroku.herokuapp.com/


[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/nhurion/hello-vaadin-heroku/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

