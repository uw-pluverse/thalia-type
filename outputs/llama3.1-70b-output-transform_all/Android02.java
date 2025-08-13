Here are the necessary import statements:

import android.app.Activity;
import android.os.Bundle;
import android.view.View; 
No, wait. The setContentView method takes an integer parameter which is a layout resource reference. So we need to import R class from our package.

import GrouseScabsShelley.R;

So the final answer is:
import android.app.Activity;
import android.os.Bundle;
import GrouseScabsShelley.R;