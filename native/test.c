#include <jni.h>

JNIEXPORT jint JNICALL Java_hello_HelloNative_integerTest(JNIEnv *env, jobject obj) {
    return 5;
}
