package algorithms.graph_theory

import utils.Solution

/**
  * Created by Tom Lous on 18/12/16.
  * https://www.hackerrank.com/challenges/journey-to-the-moon
  *
  * The member states of the UN are planning to send  people to the Moon. But there is a problem. In line with their principles of global unity, they want to pair astronauts of  different countries.
  * *
  * There are  trained astronauts numbered from  to . But those in charge of the mission did not receive information about the citizenship of each astronaut. The only information they have is that some particular pairs of astronauts belong to the same country.
  * *
  * Your task is to compute in how many ways they can pick a pair of astronauts belonging to different countries. Assume that you are provided enough pairs to let you identify the groups of astronauts even though you might not know their country directly. For instance, if  are astronauts from the same country; it is sufficient to mention that  and  are pairs of astronauts from the same country without providing information about a third pair .
  * *
  * Input Format
  * *
  * The first line contains two integers,  and , separated by a single space.  lines follow. Each line contains integers separated by a single space  and  such that
  * *
  *
  * and  and  are astronauts from the same country.
  * *
  * Constraints
  * *
  * Output Format
  * *
  * An integer that denotes the number of permissible ways to choose a pair of astronauts.
  * *
  * Sample Input
  * *
  * 4 2
  * 0 1
  * 2 3
  * Sample Output
  * *
  * 4
  * Explanation
  * *
  * Persons numbered  and  belong to same country, and those numbered  and  belong to same country. So the UN can choose one person out of  &  and another person out of  & . So the number of ways of choosing a pair of astronauts is .
  */
object JourneyToTheMoon extends Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val nAstronauts = sc.nextInt()
    val nLines = sc.nextInt()
    val nodes = 0 until nAstronauts map (n => Node(n))

    val edges = new Array[Edge](nLines)

    for (e <- 0 until nLines) {
      edges(e) = Edge(nodes(sc.nextInt()), nodes(sc.nextInt()))
    }


    val graphs = Graph(edges.toList, nodes.toList)

    val sizes = graphs.map(_.size)



    //    println("\n")
    //    println(edges.mkString("\n"))
    //    println("\n")
    //    println(nodes.mkString("\n"))
    //    println("\n")
    //    println(graphs.mkString("\n"))
    //    println("\n")


    print(sizes.combinations(2).map(_.product).sum)

  }


  case class Graph(graphContexts: List[GraphContext]) {

    def append(graphContext: GraphContext) = {
      Graph(graphContext :: graphContexts)
    }

    def merge(graph: Graph) = {
      Graph(graph.graphContexts ++ graphContexts)
    }

    def contains(n: Node) = {
      graphContexts.foldLeft(false) {
        case (res, gc) => res || gc.node == n || gc.neighbors.contains(n)
      }
    }

    def size() = graphContexts.length

    override def toString = "[[\n" + graphContexts.mkString("\n") + "\n]]"
  }

  case class GraphContext(node: Node, neighbors: List[Node]) {

    def link(neighbor: Node) = {
      GraphContext(this.node, neighbor :: neighbors)
    }

    def linksTo(n: Node): Boolean = {
      neighbors.contains(n)
    }

    override def toString = node + " :{ " + neighbors.mkString(",") + " }"


  }

  case class Node(n: Int) {
    override def toString: String = "(" + n + ")"
  }

  case class Edge(n1: Node, n2: Node) {
    override def toString: String = n1 + " - " + n2
  }


  object Graph {
    def apply(edges: List[Edge], nodes: List[Node]): List[Graph] = {
      val nodeMap = nodes.map(n => n -> GraphContext(n, Nil)).toMap

      val connectedNodeMap = edges.foldLeft(nodeMap) {
        case (l, e) => {
          l + (e.n1 -> l(e.n1).link(e.n2)) + (e.n2 -> l(e.n2).link(e.n1))
        }
      }

      connectedNodeMap.foldLeft(List.empty[Graph]) {
        case (graphs, (node, graphContext)) => {
          val (matched, unmatched) = graphs.partition(_.contains(node))
          //          println("\n------\n")
          //          println("matched " + node + "\n")
          //          println(matched)
          //          println("\nunmatched\n")
          //          println(unmatched)
          val newGraph = matched.foldLeft(Graph(List(graphContext))) {
            case (g, gi) => g.merge(gi)
          }
          //          println("\nnewGraph\n")
          //          println(newGraph)
          //          println("\n------\n")

          newGraph :: unmatched
        }
      }
    }
  }


}

