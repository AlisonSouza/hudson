/**
 * Sonatype Hudson Professional (TM)
 * Copyright (C) 2010-2011 Sonatype, Inc. All rights reserved.
 * Includes the third-party code listed at http://www.sonatype.com/products/hudson/attributions/.
 * "Sonatype" and "Sonatype Hudson Professional" are trademarks of Sonatype, Inc.
 * "Hudson" is a trademark of Oracle, Inc.
 */
package com.sonatype.matrix.maven.plugin.ui.gwt.configure.workspace.internal;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.sonatype.matrix.maven.plugin.ui.gwt.configure.workspace.WorkspaceManagerPresenter;
import com.sonatype.matrix.maven.plugin.ui.gwt.configure.workspace.WorkspaceManagerView;
import com.sonatype.matrix.maven.plugin.ui.gwt.configure.workspace.WorkspaceView;

import javax.inject.Singleton;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Default implementation of {@link WorkspaceManagerView}.
 *
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 * @since 1.1
 */
@Singleton
public class WorkspaceManagerViewImpl
    extends ResizeComposite
    implements WorkspaceManagerView
{
    private final TabLayoutPanel tabPanel;

    private WorkspaceManagerPresenter presenter;

    public WorkspaceManagerViewImpl() {
        tabPanel = new TabLayoutPanel(2.0, Unit.EM);
        initWidget(tabPanel);
        ensureDebugId("workspace-manager-view");
    }

    @Override
    public void setPresenter(final WorkspaceManagerPresenter presenter) {
        this.presenter = checkNotNull(presenter);
    }

    @Override
    public void add(final WorkspaceView view) {
        tabPanel.add(view.asWidget(), view.getWorkspaceTitle());
    }
}
