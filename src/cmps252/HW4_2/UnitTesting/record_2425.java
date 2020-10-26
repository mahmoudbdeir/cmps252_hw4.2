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

@Tag("35")
class Record_2425 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2425: FirstName is Sybil")
	void FirstNameOfRecord2425() {
		assertEquals("Sybil", customers.get(2424).getFirstName());
	}

	@Test
	@DisplayName("Record 2425: LastName is Niwa")
	void LastNameOfRecord2425() {
		assertEquals("Niwa", customers.get(2424).getLastName());
	}

	@Test
	@DisplayName("Record 2425: Company is Emulation Technology")
	void CompanyOfRecord2425() {
		assertEquals("Emulation Technology", customers.get(2424).getCompany());
	}

	@Test
	@DisplayName("Record 2425: Address is 3000 France Ave S")
	void AddressOfRecord2425() {
		assertEquals("3000 France Ave S", customers.get(2424).getAddress());
	}

	@Test
	@DisplayName("Record 2425: City is Minneapolis")
	void CityOfRecord2425() {
		assertEquals("Minneapolis", customers.get(2424).getCity());
	}

	@Test
	@DisplayName("Record 2425: County is Hennepin")
	void CountyOfRecord2425() {
		assertEquals("Hennepin", customers.get(2424).getCounty());
	}

	@Test
	@DisplayName("Record 2425: State is MN")
	void StateOfRecord2425() {
		assertEquals("MN", customers.get(2424).getState());
	}

	@Test
	@DisplayName("Record 2425: ZIP is 55416")
	void ZIPOfRecord2425() {
		assertEquals("55416", customers.get(2424).getZIP());
	}

	@Test
	@DisplayName("Record 2425: Phone is 952-926-4415")
	void PhoneOfRecord2425() {
		assertEquals("952-926-4415", customers.get(2424).getPhone());
	}

	@Test
	@DisplayName("Record 2425: Fax is 952-926-3581")
	void FaxOfRecord2425() {
		assertEquals("952-926-3581", customers.get(2424).getFax());
	}

	@Test
	@DisplayName("Record 2425: Email is sybil@niwa.com")
	void EmailOfRecord2425() {
		assertEquals("sybil@niwa.com", customers.get(2424).getEmail());
	}

	@Test
	@DisplayName("Record 2425: Web is http://www.sybilniwa.com")
	void WebOfRecord2425() {
		assertEquals("http://www.sybilniwa.com", customers.get(2424).getWeb());
	}
}
