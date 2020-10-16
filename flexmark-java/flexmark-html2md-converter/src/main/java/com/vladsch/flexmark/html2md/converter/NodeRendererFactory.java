package com.vladsch.flexmark.html2md.converter;

import com.vladsch.flexmark.html.renderer.NodeRenderer;
import com.vladsch.flexmark.util.data.DataHolder;

import java.util.function.Function;

/**
 * Factory for instantiating new node renderers when rendering is done.
 */
public interface NodeRendererFactory extends Function<DataHolder, NodeRenderer> {
    /**
     * Create a new node renderer for the specified rendering context.
     *
     * @param options the context for rendering (normally passed on to the node renderer)
     * @return a node renderer
     */
    NodeRenderer apply(DataHolder options);
}
