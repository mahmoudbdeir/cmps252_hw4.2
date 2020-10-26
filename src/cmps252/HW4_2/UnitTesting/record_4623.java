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

@Tag("39")
class Record_4623 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4623: FirstName is Stephan")
	void FirstNameOfRecord4623() {
		assertEquals("Stephan", customers.get(4622).getFirstName());
	}

	@Test
	@DisplayName("Record 4623: LastName is Cration")
	void LastNameOfRecord4623() {
		assertEquals("Cration", customers.get(4622).getLastName());
	}

	@Test
	@DisplayName("Record 4623: Company is A & M Computer Consultants Ltd")
	void CompanyOfRecord4623() {
		assertEquals("A & M Computer Consultants Ltd", customers.get(4622).getCompany());
	}

	@Test
	@DisplayName("Record 4623: Address is 109 W Liberty St")
	void AddressOfRecord4623() {
		assertEquals("109 W Liberty St", customers.get(4622).getAddress());
	}

	@Test
	@DisplayName("Record 4623: City is Medina")
	void CityOfRecord4623() {
		assertEquals("Medina", customers.get(4622).getCity());
	}

	@Test
	@DisplayName("Record 4623: County is Medina")
	void CountyOfRecord4623() {
		assertEquals("Medina", customers.get(4622).getCounty());
	}

	@Test
	@DisplayName("Record 4623: State is OH")
	void StateOfRecord4623() {
		assertEquals("OH", customers.get(4622).getState());
	}

	@Test
	@DisplayName("Record 4623: ZIP is 44256")
	void ZIPOfRecord4623() {
		assertEquals("44256", customers.get(4622).getZIP());
	}

	@Test
	@DisplayName("Record 4623: Phone is 330-723-6332")
	void PhoneOfRecord4623() {
		assertEquals("330-723-6332", customers.get(4622).getPhone());
	}

	@Test
	@DisplayName("Record 4623: Fax is 330-723-1645")
	void FaxOfRecord4623() {
		assertEquals("330-723-1645", customers.get(4622).getFax());
	}

	@Test
	@DisplayName("Record 4623: Email is stephan@cration.com")
	void EmailOfRecord4623() {
		assertEquals("stephan@cration.com", customers.get(4622).getEmail());
	}

	@Test
	@DisplayName("Record 4623: Web is http://www.stephancration.com")
	void WebOfRecord4623() {
		assertEquals("http://www.stephancration.com", customers.get(4622).getWeb());
	}
}
