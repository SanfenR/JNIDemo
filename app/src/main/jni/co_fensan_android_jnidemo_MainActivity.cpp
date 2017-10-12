#include "co_fensan_android_jnidemo_MainActivity.h"

JNIEXPORT jstring JNICALL
Java_co_fensan_android_jnidemo_MainActivity_sayHelloByJNI(JNIEnv *env, jobject instance) {
        return env->NewStringUTF("hello jni!");
}
