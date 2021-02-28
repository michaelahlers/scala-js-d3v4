import d3v4.{Group, Index}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation._

/** @see [[https://github.com/d3/d3-transition]] */
@JSImport("d3-transition", JSImport.Namespace)
@js.native
object d3transition extends js.Object {

  /** @see [[https://github.com/d3/d3-transition#transition_delay]] */
  def delay(value: Double): Transition[dom.EventTarget] = js.native

  /** @see [[https://github.com/d3/d3-transition#transition_duration]] */
  def duration(value: Double): Transition[dom.EventTarget] = js.native

  /** @see [[https://github.com/d3/d3-transition#transition]] */
  def transition(): Transition[dom.EventTarget] = js.native

  /** @see [[https://github.com/d3/d3-transition#transition]] */
  def transition(name: String): Transition[dom.EventTarget] = js.native

  @js.native
  trait Transition[Datum] extends js.Object {

    type ValueFunction0[Return] = js.Function0[Return]
    type ValueFunction1[Return] = js.Function1[Datum, Return]
    type ValueFunction2[Return] = js.Function2[Datum, Index, Return]
    //type ValueFunction3[Return] = js.Function3[Datum, Index, Group, Return]

    type ListenerFunction0 = ValueFunction0[Unit]
    type ListenerFunction1 = ValueFunction1[Unit]
    type ListenerFunction2 = ValueFunction2[Unit]
    //type ListenerFunction3 = ValueFunction3[Unit]

    /** @see [[https://github.com/d3/d3-transition#transition_delay]] */
    def delay(value: Double): Transition[Datum] = js.native

    /** @see [[https://github.com/d3/d3-transition#transition_duration]] */
    def duration(value: Double): Transition[Datum] = js.native

    /** @see [[https://github.com/d3/d3-transition#transition_empty]] */
    def empty():Boolean = js.native

    /** @see [[https://github.com/d3/d3-transition#transition_on]] */
    def on(typenames: String, listener: ListenerFunction0): this.type = js.native

    /** @see [[https://github.com/d3/d3-transition#transition_on]] */
    def on(typenames: String, listener: ListenerFunction1): this.type = js.native

    /** @see [[https://github.com/d3/d3-transition#transition_on]] */
    def on(typenames: String, listener: ListenerFunction2): this.type = js.native

    /** @see [[https://github.com/d3/d3-transition#transition_nodes]] */
    def nodes(): js.Array[dom.EventTarget] = js.native

    /** @see [[https://github.com/d3/d3-transition#transition_node]] */
    def node(): dom.EventTarget = js.native

    /** @see [[https://github.com/d3/d3-transition#transition_size]] */
    def size(): Int = js.native

  }

}
