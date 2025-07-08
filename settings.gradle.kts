 enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
        gradlePluginPortal()
    }
}
Tom Renn	381cae1	2025-01-24 15:10:56 -0800	[diff] [blame]	1	load("@rules_java//java:defs.bzl", "java_binary")
Alon Albert	d30da70	2024-06-20 10:35:50 -0700	[diff] [blame]	2	load("//tools/base/bazel:bazel.bzl", "iml_module")
Paige Mcauliffe	230069b	2025-04-21 18:21:44 +0000	[diff] [blame]	3	load("//tools/base/bazel:maven.bzl", "maven_library")
4	load("//tools/base/common:version.bzl", "BASE_VERSION")
Alon Albert	d30da70	2024-06-20 10:35:50 -0700	[diff] [blame]	5	
6	# managed by go/iml_to_build
7	iml_module(
8	    name = "studio.android.sdktools.backup",
9	    srcs = ["src/main"],
10	    iml_files = ["android.sdktools.backup.iml"],
Esteban de la Canal	1fe44ed	2025-03-10 20:40:47 -0700	[diff] [blame]	11	    # do not sort: must match IML order
12	    test_deps = [
13	        "//tools/adt/idea/.idea/libraries:junit4",
14	        "//tools/adt/idea/.idea/libraries:jimfs",
15	        "//tools/adt/idea/.idea/libraries:truth",
16	    ],
Alon Albert	d30da70	2024-06-20 10:35:50 -0700	[diff] [blame]	17	    test_srcs = ["src/test"],
18	    visibility = ["//visibility:public"],
19	    # do not sort: must match IML order
20	    deps = [
21	        "@intellij//:intellij-sdk",
Esteban de la Canal	8ae6e0d	2025-03-03 13:43:06 -0800	[diff] [blame]	22	        "//tools/base/adblib:studio.android.sdktools.adblib",
Alon Albert	af4db9d	2025-06-05 08:49:53 -0700	[diff] [blame]	23	        "//tools/base/backup/bmgr-parser:studio.android.sdktools.backup.bmgr.parser",
Esteban de la Canal	8ae6e0d	2025-03-03 13:43:06 -0800	[diff] [blame]	24	        "//tools/base/common:studio.android.sdktools.common",
25	        "//tools/base/environment-services:studio.intellij.android.environment-services",
Alon Albert	d30da70	2024-06-20 10:35:50 -0700	[diff] [blame]	26	    ],
27	)
Alon Albert	79b2de9	2024-09-05 19:05:51 +0000	[diff] [blame]	28	
29	# managed by go/iml_to_build
30	iml_module(
31	    name = "studio.android.sdktools.backup.cli",
32	    srcs = ["src/cli"],
33	    iml_files = ["android.sdktools.backup.cli.iml"],
34	    visibility = ["//visibility:public"],
35	    # do not sort: must match IML order
36	    deps = [
37	        "@intellij//:intellij-sdk",
Esteban de la Canal	8ae6e0d	2025-03-03 13:43:06 -0800	[diff] [blame]	38	        "//tools/base/adblib-tools:studio.android.sdktools.adblib.tools",
39	        "//tools/base/adblib:studio.android.sdktools.adblib",
40	        "//tools/base/common:studio.android.sdktools.common",
41	        "//tools/base/environment-services:studio.intellij.android.environment-services",
42	        "//tools/base/backup:studio.android.sdktools.backup",
Alon Albert	79b2de9	2024-09-05 19:05:51 +0000	[diff] [blame]	43	    ],
44	)
45	
46	java_binary(
47	    name = "android_backup",
48	    main_class = "com.android.backup.cli.AndroidBackup",
49	    runtime_deps = [
50	        ":studio.android.sdktools.backup.cli",
51	    ],
52	)
53	
54	java_binary(
55	    name = "android_restore",
56	    main_class = "com.android.backup.cli.AndroidRestore",
57	    runtime_deps = [
58	        ":studio.android.sdktools.backup.cli",
59	    ],
60	)
Paige Mcauliffe	230069b	2025-04-21 18:21:44 +0000	[diff] [blame]	61	
62	maven_library(
63	    name = "backup-restore",
64	    srcs = glob([
65	        "src/main/**/*.java",
66	        "src/main/**/*.kt",
67	    ]),
68	    bundled_deps = [
69	        "//tools/base/environment-services:tools.environment-services",
70	    ],
71	    coordinates = "com.android.tools.backup:backup-restore",
72	    description = "Library to perform backup and restore operations",
73	    module_name = "backup-restore",
74	    version = BASE_VERSION,
75	    visibility = [
76	        "//tools/base/backup-test:__subpackages__",
77	    ],
78	    deps = [
79	        "//tools/base/adblib",
Alon Albert	af4db9d	2025-06-05 08:49:53 -0700	[diff] [blame]	80	        "//tools/base/backup/bmgr-parser",
Paige Mcauliffe	230069b	2025-04-21 18:21:44 +0000	[diff] [blame]	81	        "//tools/base/common:tools.common",
82	        "//tools/base/sdk-common:tools.sdk-common",
83	        "//tools/base/sdklib:tools.sdklib",
84	        "@maven//:org.jetbrains.kotlinx.kotlinx-coroutines-core",
85	    ],
86	)
Powered by Gitiles| Privacy| Terms
txt
json


rootProject.name = "IvyWallet"
include(":app")
include(":ci-actions:base")
include(":ci-actions:compose-stability")
include(":ci-actions:issue-assign")
include(":ci-actions:issue-create-comment")
include(":ci-actions:pr-description-check")
include(":screen:accounts")
include(":screen:attributions")
include(":screen:balance")
include(":screen:budgets")
include(":screen:categories")
include(":screen:contributors")
include(":screen:disclaimer")
include(":screen:edit-transaction")
include(":screen:exchange-rates")
include(":screen:features")
include(":screen:home")
include(":screen:import-data")
include(":screen:loans")
include(":screen:main")
include(":screen:onboarding")
include(":screen:piechart")
include(":screen:planned-payments")
include(":screen:releases")
include(":screen:reports")
include(":screen:search")
include(":screen:settings")
include(":screen:transactions")
include(":shared:base")
include(":shared:common-ui")
include(":shared:data:core")
include(":shared:data:core-testing")
include(":shared:data:model")
include(":shared:data:model-testing")
include(":shared:domain")
include(":shared:ui:core")
include(":shared:ui:navigation")
include(":shared:ui:testing")
include(":temp:legacy-code")
include(":temp:old-design")
include(":widget:add-transaction")
include(":widget:balance")
include(":widget:shared-base")
eshd