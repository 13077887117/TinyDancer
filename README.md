# Tiny Dancer

A real time frames per second measuring library for Android that also shows a color coded metric.  This metric is based on percentage of time spent when you have dropped 2 or more frames.  If the application spends more than 5% in this state then the color turns yellow, when you have reached the 20% threshold the indicator turns red.

*“Perf Matters ”* - Random Guy at Meetup

![Tiny Dancer](https://raw.githubusercontent.com/brianPlummer/TinyDancer/master/assets/tinydancer2.png "Tiny Dancer")

## Getting started

In your `build.gradle`:

```gradle
 dependencies {
   debugCompile 'com.github.brianPlummer:tinydancer:0.0.2'
 }
```

In your `DebugApplication` class:

```java
public class DebugApplication extends Application {

  @Override public void onCreate() {
   TinyDancer.create()
             .show(this);
             
   //alternatively
   new TinyDancerBuilder()
      .redFlagPercentage(.1f) // set red indicator for 10%
      .startingGravity(Gravity.TOP)
      .startingXPosition(200)
      .startingYPosition(600)
      .show(this);
  }
}
```

**You're good to go!** Tiny Dancer will show a small draggable view overlay with FPS as well as a color indicator of when FPS drop.





See sample application that simulates excessive bind time

![Tiny Dancer Sample](https://raw.githubusercontent.com/brianPlummer/TinyDancer/master/assets/tinydancer1.gif "Tiny Dancer Sample")

