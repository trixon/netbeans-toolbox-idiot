/* 
 * Copyright 2015 Patrik Karlsson.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.trixon.toolbox.asiot;

import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import se.trixon.almond.dictionary.Dict;
import se.trixon.almond.icon.Pict;
import se.trixon.toolbox.core.base.ToolTopComponent;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//se.trixon.toolbox.asiot//Asiot//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "AsiotTopComponent",
        persistenceType = TopComponent.PERSISTENCE_NEVER
)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
public final class AsiotTopComponent extends ToolTopComponent {

    private static final int ICON_SIZE = TOOLBAR_ICON_SIZE;
    private final AsiotController mController;

    public AsiotTopComponent() {
        mBundle = NbBundle.getBundle(AsiotTopComponent.class);
        mToolName = mBundle.getString("Tool-Name");
        initComponents();
        setName(mToolName);
        mController = new AsiotController(this);
        init();
    }

    private void init() {
        startButton.setIcon(Pict.Actions.ARROW_RIGHT.get(ICON_SIZE));
        startButton.setToolTipText(Dict.START.getString());

        addButton.setIcon(Pict.Actions.LIST_ADD.get(ICON_SIZE));
        editButton.setIcon(Pict.Actions.DOCUMENT_EDIT.get(ICON_SIZE));
        removeButton.setIcon(Pict.Actions.LIST_REMOVE.get(ICON_SIZE));
        removeAllButton.setIcon(Pict.Actions.EDIT_DELETE.get(ICON_SIZE));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        startButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        removeAllButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        tasksPanel = new se.trixon.toolbox.asiot.TasksPanel();
        previewPanel = new se.trixon.toolbox.asiot.PreviewPanel();

        setLayout(new java.awt.BorderLayout());

        toolBar.setFloatable(false);

        startButton.setFocusable(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        toolBar.add(startButton);
        toolBar.add(jSeparator1);

        addButton.setToolTipText(Dict.ADD.getString());
        addButton.setFocusable(false);
        addButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        toolBar.add(addButton);

        editButton.setToolTipText(Dict.EDIT.getString());
        editButton.setFocusable(false);
        editButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        toolBar.add(editButton);

        removeButton.setToolTipText(Dict.REMOVE.getString());
        removeButton.setFocusable(false);
        removeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        toolBar.add(removeButton);

        removeAllButton.setToolTipText(Dict.REMOVE_ALL.getString());
        removeAllButton.setFocusable(false);
        removeAllButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        removeAllButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        removeAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllButtonActionPerformed(evt);
            }
        });
        toolBar.add(removeAllButton);
        toolBar.add(filler1);

        add(toolBar, java.awt.BorderLayout.PAGE_START);
        add(tasksPanel, java.awt.BorderLayout.LINE_START);
        add(previewPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
    }//GEN-LAST:event_startButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        tasksPanel.addTask();
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        tasksPanel.editTask();
    }//GEN-LAST:event_editButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        tasksPanel.removeTask();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void removeAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllButtonActionPerformed
        tasksPanel.removeAllTasks();
    }//GEN-LAST:event_removeAllButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton editButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private se.trixon.toolbox.asiot.PreviewPanel previewPanel;
    private javax.swing.JButton removeAllButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton startButton;
    private se.trixon.toolbox.asiot.TasksPanel tasksPanel;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
    }

    @Override
    public void componentClosed() {
    }

    void writeProperties(java.util.Properties p) {
        p.setProperty("version", "1.0");
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
    }
}