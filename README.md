# Compound Lottie ImageView

This is a simple compound view that can either show an image or an animation using the Lottie framework. This can be used in places where you want to be able to dynamically show one of the two options as well as giving you the option to load images easily from the web using Fresco.

## Usage

Include the following dependency to your `build.gradle` file:

```kotlin
dependencies {
    implementation "app.appsoluut:cliview:1.0.0"
}
```

You can create the view in the layout as normal; for example:

```xml
<app.appsoluut.android.cliv.CLIView
    android:id="@+id/cli_view"
    android:layout_width="128dp"
    android:layout_height="48dp" />
```

## Showcase

Want to be included? Create a topic in the [Show and Tell](https://github.com/appsoluut/CLIView/discussions/categories/show-and-tell) category on the discussions board.

## Credits

[Lottie](https://github/airbnb/lottie-android) is created and maintained by Airbnb, Inc.

[Fresco](https://github.com/facebook/fresco) is created and maintained by Facebook, Inc.

Kitten image placeholders are provided by the excellent [{placekitten}](https://placekitten.com).

Example Lottie animations are downloaded from [lottiefiles.com](https://lottiefiles.com):
* [52717-fire.json](https://lottiefiles.com/52717-fire) by [章_koala](https://lottiefiles.com/zhpeng)
* [52840-percentage-loader.json](https://lottiefiles.com/52840-percentage-loader) by [Munhui Jeong](https://lottiefiles.com/user/316563)
* [52971-download-button.json](https://lottiefiles.com/52971-download-button) by [Diogo de Freitas](https://lottiefiles.com/frts_diogo)
* [53122-success-burst-line.json](https://lottiefiles.com/53122-success-burst-line) by [Greg Saxton](http://www.gregsaxton.com/)
* [53152-loading-dots.json](https://lottiefiles.com/53152-loading-dots) by [Gabriele Malaspina](https://lottiefiles.com/gabriele)