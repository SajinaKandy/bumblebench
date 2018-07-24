/*******************************************************************************
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
*******************************************************************************/

package net.adoptopenjdk.bumblebench.examples;

import net.adoptopenjdk.bumblebench.core.MicroBench;

public final class NoOpLambdaBench extends MicroBench {

	static V_method mdispatch_noop = () -> { };

	static final int CALLS_PER_ITERATION = option("callsPerIteration", 20);

	protected long doBatch(long numIterations) throws InterruptedException {
		long numLoopIterations = numIterations / CALLS_PER_ITERATION;
		for (long i = 0; i < numLoopIterations; i+=CALLS_PER_ITERATION)
			{
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			mdispatch_noop.call();
			}
		return numLoopIterations * CALLS_PER_ITERATION;
	}

}

interface V_method {
	void call();
}
