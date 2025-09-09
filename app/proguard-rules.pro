# Keep Kotlin metadata so reflection works
-keep class kotlin.Metadata { *; }

# Keep all Android Activity, Fragment, and Service classes
-keep class * extends android.app.Activity { *; }
-keep class * extends android.app.Service { *; }
-keep class * extends android.app.Fragment { *; }
-keep class * extends androidx.fragment.app.Fragment { *; }

# Keep all ViewModels and data binding classes
-keep class * extends androidx.lifecycle.ViewModel { *; }
-keep class **BR {
    <fields>;
}

# Keep classes used in layout XMLs
-keepclassmembers class * {
    public <init>(android.content.Context);
    public <init>(android.content.Context, android.util.AttributeSet);
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

# Don’t warn about common libraries
-dontwarn kotlin.**
-dontwarn kotlinx.**
-dontwarn androidx.**

# Optimization settings
-dontoptimize
-dontobfuscate
