/**
 * Sonatype Hudson Professional (TM)
 * Copyright (C) 2010-2011 Sonatype, Inc. All rights reserved.
 * Includes the third-party code listed at http://www.sonatype.com/products/hudson/attributions/.
 * "Sonatype" and "Sonatype Hudson Professional" are trademarks of Sonatype, Inc.
 * "Hudson" is a trademark of Oracle, Inc.
 */
package com.sonatype.matrix.maven.plugin.ui.gwt.configure.builder.internal;

import com.google.gwt.user.client.ui.ResizeComposite;
import com.sonatype.matrix.maven.plugin.ui.gwt.configure.builder.MavenBuilderConfigurationPresenter;
import com.sonatype.matrix.maven.plugin.ui.gwt.configure.builder.MavenBuilderConfigurationView;

import javax.inject.Inject;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * ???
 *
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 * @since 1.1
 */
public class MavenBuilderConfigurationViewImpl
    extends ResizeComposite
    implements MavenBuilderConfigurationView
{
    private MavenBuilderConfigurationPresenter presenter;

    @Inject
    public MavenBuilderConfigurationViewImpl() {
        ensureDebugId("maven-builder-configuration-view");
        // TODO:
    }

    @Override
    public void setPresenter(final MavenBuilderConfigurationPresenter presenter) {
        this.presenter = checkNotNull(presenter);
    }
}
