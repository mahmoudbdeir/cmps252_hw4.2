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

@Tag("33")
class Record_2460 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2460: FirstName is Moises")
	void FirstNameOfRecord2460() {
		assertEquals("Moises", customers.get(2459).getFirstName());
	}

	@Test
	@DisplayName("Record 2460: LastName is Hoofard")
	void LastNameOfRecord2460() {
		assertEquals("Hoofard", customers.get(2459).getLastName());
	}

	@Test
	@DisplayName("Record 2460: Company is Charleston Supply Co")
	void CompanyOfRecord2460() {
		assertEquals("Charleston Supply Co", customers.get(2459).getCompany());
	}

	@Test
	@DisplayName("Record 2460: Address is 8623 Louisville Plac")
	void AddressOfRecord2460() {
		assertEquals("8623 Louisville Plac", customers.get(2459).getAddress());
	}

	@Test
	@DisplayName("Record 2460: City is Merrillville")
	void CityOfRecord2460() {
		assertEquals("Merrillville", customers.get(2459).getCity());
	}

	@Test
	@DisplayName("Record 2460: County is Lake")
	void CountyOfRecord2460() {
		assertEquals("Lake", customers.get(2459).getCounty());
	}

	@Test
	@DisplayName("Record 2460: State is IN")
	void StateOfRecord2460() {
		assertEquals("IN", customers.get(2459).getState());
	}

	@Test
	@DisplayName("Record 2460: ZIP is 46410")
	void ZIPOfRecord2460() {
		assertEquals("46410", customers.get(2459).getZIP());
	}

	@Test
	@DisplayName("Record 2460: Phone is 219-769-4281")
	void PhoneOfRecord2460() {
		assertEquals("219-769-4281", customers.get(2459).getPhone());
	}

	@Test
	@DisplayName("Record 2460: Fax is 219-769-2331")
	void FaxOfRecord2460() {
		assertEquals("219-769-2331", customers.get(2459).getFax());
	}

	@Test
	@DisplayName("Record 2460: Email is moises@hoofard.com")
	void EmailOfRecord2460() {
		assertEquals("moises@hoofard.com", customers.get(2459).getEmail());
	}

	@Test
	@DisplayName("Record 2460: Web is http://www.moiseshoofard.com")
	void WebOfRecord2460() {
		assertEquals("http://www.moiseshoofard.com", customers.get(2459).getWeb());
	}
}
