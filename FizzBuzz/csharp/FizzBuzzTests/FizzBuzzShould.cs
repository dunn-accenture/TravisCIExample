using System;
using Xunit;
using FizzBuzzLib;

namespace FizzBuzzTests
{
    public class FizzBuzzShould
    {
        [Fact]
        public void VerifyTestsAreWiredUpCorrectly()
        {
            var fb = new FizzBuzz();
            Assert.NotNull(fb);
        }
        [Fact]
        public void Return1for1()
        {
            var fb = new FizzBuzz();
            Assert.Equal("1", fb.process(1));
        }
    }
}
