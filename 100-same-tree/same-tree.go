
func isSameTree(p *TreeNode, q *TreeNode) bool {
    return helper(p, q)
}

func helper(node1 *TreeNode, node2 *TreeNode) bool{
    if node1 == nil && node2 == nil{
        return true
    }
    if node1 == nil || node2 == nil{
        return false
    }

    if node1.Val != node2.Val{
        return false
    }
    return helper(node1.Left, node2.Left) && helper(node1.Right, node2.Right)
}