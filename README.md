# ScrollLessRecyclerview
An better scroll widget for E-ink screen

When you make an app for E-ink screen device, the fps make animation feel so bad. You need remove all animation and be fast more.



ScrollLessRecyclerview support LinearLayout, GridLayout, StaggeredGridLayoutManager and support item  same size as the screen or overflow it

## Getting started

The first step is to include ScrollLessRecyclerView into your project, for example, as a Gradle compile dependency:
```groovy
dependencies {
    //...
    implementation 'fadeapp.widgets:scrollless-recyclerView:1.0.0'
    //...
}
```

And then, replease all recyclerview in your app

```diff
- <androidx.recyclerview.widget.RecyclerView
+ <fadeapp.widgets.ScrollLessRecyclerView

- import androidx.recyclerview.widget.RecyclerView;
+ import fadeapp.widgets.ScrollLessRecyclerView;
```



Enjoy it!