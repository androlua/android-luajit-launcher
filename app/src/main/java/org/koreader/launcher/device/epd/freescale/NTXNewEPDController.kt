/* Tested on Tolino Vision2/Shine3 and a Nook Glowlight 3. */

package org.koreader.launcher.device.epd.freescale

import org.koreader.launcher.interfaces.EPDInterface

class NTXNewEPDController : NTXEPDController(), EPDInterface {
    override fun resume() {}
    override fun pause() {}
    override fun setEpdMode(targetView: android.view.View,
                            mode: Int, delay: Long,
                            x: Int, y: Int, width: Int, height: Int, epdMode: String?)
    {
        requestEpdMode(targetView, mode, delay, x, y, width, height)
    }
}
