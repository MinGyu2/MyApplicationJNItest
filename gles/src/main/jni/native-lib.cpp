#include <jni.h>
#include <string>
#include "add.h"
#include "minus.h"

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_gles_TestJni_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++ "+std::to_string(add(3,5))+" "+std::to_string(minus(13,3));
    return env->NewStringUTF(hello.c_str());
}