/**
 * Copyright 2014 Nicotina Estudio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package com.sct.descubriendoturuta.service;

import java.util.List;

import com.sct.descubriendoturuta.model.Foto;
import com.sct.descubriendoturuta.model.Ruta;
import com.sct.descubriendoturuta.model.Usuario;

public interface RutaService {

	public boolean guardarRuta(Usuario usuario, Ruta ruta);
	public List<Ruta> obtenerRutas(int usuarioId);
}