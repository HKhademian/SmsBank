object Deps {
	object Build {
		const val android = "com.android.tools.build:gradle:${Versions.Build.android}"
		const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Build.kotlin}"
	}

	object Library {
		const val core_ktx = "androidx.core:core-ktx:${Versions.Library.core_ktx}"

		const val fragment = "androidx.fragment:fragment:${Versions.Library.fragment}"
		const val fragment_ktx = "androidx.fragment:fragment-ktx:${Versions.Library.fragment}"
		const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.Library.recyclerview}"

		const val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.Library.lifecycle}"
		const val lifecycle_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Library.lifecycle}"
		const val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.Library.lifecycle}"

		const val anko = "org.jetbrains.anko:anko:${Versions.Library.anko}"
		const val anko_commons = "org.jetbrains.anko:anko-commons:${Versions.Library.anko}"
		const val anko_sdk27 = "org.jetbrains.anko:anko-sdk27:${Versions.Library.anko}"
		const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Library.coroutines}"

		const val adad = "ir.adad:androidsdk:${Versions.Library.adad}"

		const val appbrain = "com.appbrain:appbrain-sdk:${Versions.Library.appbrain}"

		const val materialShowcaseView =
			"com.github.deano2390:MaterialShowcaseView:${Versions.Library.materialShowcaseView}"

		const val appCenterAnalytics = "com.microsoft.appcenter:appcenter-analytics:${Versions.Library.appCenter}"
		const val appCenterCrashes = "com.microsoft.appcenter:appcenter-crashes:${Versions.Library.appCenter}"
		const val appCenterPush = "com.microsoft.appcenter:appcenter-push:${Versions.Library.appCenter}"

		const val firebaseCore = "com.google.firebase:firebase-core:${Versions.Library.firebaseCore}"
		const val firebaseMessaging = "com.google.firebase:firebase-messaging:${Versions.Library.firebaseMessaging}"
		const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.Library.crashlytics}"

		const val pusheBase = "co.ronash.android:pushe-base:${Versions.Library.pusheBase}"
	}
}
