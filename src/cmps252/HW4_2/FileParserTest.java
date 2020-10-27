package cmps252.HW4_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.UnitTesting.Configuration;

public class FileParserTest {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	void firstNameOfFirstEntryCorrect() {
		assertEquals("Portia", customers.get(0).getFirstName());
	}

	@Test
	void lastNameOfFirstEntryCorrect() {
		assertEquals("Mcfann", customers.get(0).getLastName());
	}

	@Test
	void companyOfFirstEntryCorrect() {
		assertEquals("Beachcomber Realty", customers.get(0).getCompany());
	}

	@Test
	void addressOfFirstEntryCorrect() {
		assertEquals("4891 Pacific Hwy", customers.get(0).getAddress());
	}

	@Test
	void cityOfFirstEntryCorrect() {
		assertEquals("San Diego", customers.get(0).getCity());
	}

	@Test
	void countyOfFirstEntryCorrect() {
		assertEquals("San Diego", customers.get(0).getCounty());
	}

	@Test
	void stateOfFirstEntryCorrect() {
		assertEquals("CA", customers.get(0).getState());
	}

	@Test
	void ZIPOfFirstEntryCorrect() {
		assertEquals("92110", customers.get(0).getZIP());
	}

	@Test
	void phoneOfFirstEntryCorrect() {
		assertEquals("858-294-0682", customers.get(0).getPhone());
	}

	@Test
	void faxOfFirstEntryCorrect() {
		assertEquals("858-294-1695", customers.get(0).getFax());
	}

	@Test
	void emailOfFirstEntryCorrect() {
		assertEquals("portia@mcfann.com", customers.get(0).getEmail());
	}

	@Test
	void webOfFirstEntryCorrect() {
		assertEquals("http://www.portiamcfann.com", customers.get(0).getWeb());
	}
}
