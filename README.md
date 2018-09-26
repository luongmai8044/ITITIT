# MOWEDE
# Android Framework ITITIT

This repository contains an Android framework that implements MVP architecture in Kotlin using Dagger2, Room, RxJava, Retrofit2

# Architecture
![MVP Architecture](https://janishar.github.io/images/mvp-app-pics/mvp-interactor-arch.png)
<br>

# Project Structure
![Structure](https://janishar.github.io/images/mvp-app-pics/mvp-interactor-project-structure.png)
<br>

#### The framework has following packages:
1. **data**: It contains all the data accessing and manipulating components.
2. **di**: Dependency providing classes using Dagger2.
3. **ui**: View classes along with their corresponding Presenters.
4. **utils**: Utility classes.

#### Classes have been designed in such a way that it could be inherited and maximize the code reuse.

### Library:
1. RxJava2: https://github.com/amitshekhariitbhu/RxJava2-Android-Samples
2. Dagger2: https://github.com/google/dagger
3. Retrofit2: https://square.github.io/retrofit/
4. Room: https://developer.android.com/topic/libraries/architecture/room.html
5. Mockito: https://github.com/mockito/mockito
6. Mockito-Kotlin: https://github.com/nhaarman/mockito-kotlin
7. Moshi: https://github.com/square/moshi

### License
```
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
