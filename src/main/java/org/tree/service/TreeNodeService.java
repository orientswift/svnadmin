package org.tree.service;

import java.util.List;
import java.util.Map;

import org.tree.entity.Tree;
import org.tree.entity.TreeNode;

/**
 * 树节点服务层接口
 *
 * @author <a href="mailto:yuanhuiwu@gmail.com">Huiwu Yuan</a>
 * @since 3.0.2
 */
public interface TreeNodeService {

    /**
     * 获取树节点的html
     *
     * @param tree       树
     * @param parameters 参数
     * @return 树节点的html
     */
    StringBuffer getHTML (Tree tree, Map<String, Object> parameters);

    /**
     * 得到树节点
     *
     * @param parent
     * @param parameters
     * @return
     */
    List<TreeNode> getTreeNodes (Tree parent, Map<String, Object> parameters);

}
