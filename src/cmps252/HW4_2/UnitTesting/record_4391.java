package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("3")
class Record_4391 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4391: FirstName is Bruno")
	void FirstNameOfRecord4391() {
		assertEquals("Bruno", customers.get(4390).getFirstName());
	}

	@Test
	@DisplayName("Record 4391: LastName is Hisle")
	void LastNameOfRecord4391() {
		assertEquals("Hisle", customers.get(4390).getLastName());
	}

	@Test
	@DisplayName("Record 4391: Company is Randall Randall & Stevens")
	void CompanyOfRecord4391() {
		assertEquals("Randall Randall & Stevens", customers.get(4390).getCompany());
	}

	@Test
	@DisplayName("Record 4391: Address is 3891 Ramblewood Dr")
	void AddressOfRecord4391() {
		assertEquals("3891 Ramblewood Dr", customers.get(4390).getAddress());
	}

	@Test
	@DisplayName("Record 4391: City is Richfield")
	void CityOfRecord4391() {
		assertEquals("Richfield", customers.get(4390).getCity());
	}

	@Test
	@DisplayName("Record 4391: County is Summit")
	void CountyOfRecord4391() {
		assertEquals("Summit", customers.get(4390).getCounty());
	}

	@Test
	@DisplayName("Record 4391: State is OH")
	void StateOfRecord4391() {
		assertEquals("OH", customers.get(4390).getState());
	}

	@Test
	@DisplayName("Record 4391: ZIP is 44286")
	void ZIPOfRecord4391() {
		assertEquals("44286", customers.get(4390).getZIP());
	}

	@Test
	@DisplayName("Record 4391: Phone is 330-659-7508")
	void PhoneOfRecord4391() {
		assertEquals("330-659-7508", customers.get(4390).getPhone());
	}

	@Test
	@DisplayName("Record 4391: Fax is 330-659-9286")
	void FaxOfRecord4391() {
		assertEquals("330-659-9286", customers.get(4390).getFax());
	}

	@Test
	@DisplayName("Record 4391: Email is bruno@hisle.com")
	void EmailOfRecord4391() {
		assertEquals("bruno@hisle.com", customers.get(4390).getEmail());
	}

	@Test
	@DisplayName("Record 4391: Web is http://www.brunohisle.com")
	void WebOfRecord4391() {
		assertEquals("http://www.brunohisle.com", customers.get(4390).getWeb());
	}
}
