/*
 * Distributed as part of c3p0 v.0.9.1-pre12
 *
 * Copyright (C) 2005 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 2.1, as 
 * published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; see the file LICENSE.  If not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 */


package com.mchange.v2.c3p0.management;

import java.sql.SQLException;
import java.util.Set;

public interface C3P0RegistryManagerMBean
{
    public String[] getAllIdentityTokens();
    public Set getAllIdentityTokenized();
    public Set getAllPooledDataSources();

    public int getAllIdentityTokenCount();
    public int getAllIdentityTokenizedCount();
    public int getAllPooledDataSourcesCount();

    public String[] getAllIdentityTokenizedStringified();
    public String[] getAllPooledDataSourcesStringified();

    public int getNumPooledDataSources() throws SQLException;
    public int getNumPoolsAllDataSources() throws SQLException;
    
    public String getC3p0Version();
}