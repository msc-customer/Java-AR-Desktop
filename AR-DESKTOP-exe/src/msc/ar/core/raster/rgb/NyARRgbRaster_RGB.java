/* 
 * PROJECT: NyARToolkit
 * --------------------------------------------------------------------------------
 * This work is based on the original ARToolKit developed by
 *   Hirokazu Kato
 *   Mark Billinghurst
 *   HITLab, University of Washington, Seattle
 * http://www.hitl.washington.edu/artoolkit/
 *
 * The NyARToolkit is Java edition ARToolKit class library.
 * Copyright (C)2008-2009 Ryo Iizuka
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * For further information please contact.
 *	http://nyatla.jp/nyatoolkit/
 *	<airmail(at)ebony.plala.or.jp> or <nyatla(at)nyatla.jp>
 * 
 */
package msc.ar.core.raster.rgb;

import msc.ar.NyARException;
import msc.ar.core.raster.*;
import msc.ar.core.types.NyARBufferType;

public class NyARRgbRaster_RGB extends NyARRgbRaster
{
	public NyARRgbRaster_RGB(int i_width, int i_height,boolean i_is_alloc) throws NyARException
	{
		super(i_width,i_height,NyARBufferType.BYTE1D_R8G8B8_24,i_is_alloc);
	}

	public NyARRgbRaster_RGB(int i_width, int i_height) throws NyARException
	{
		super(i_width,i_height,NyARBufferType.BYTE1D_R8G8B8_24);
		return;
	}
}
