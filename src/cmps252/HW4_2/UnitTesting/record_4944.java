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
class Record_4944 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4944: FirstName is Elba")
	void FirstNameOfRecord4944() {
		assertEquals("Elba", customers.get(4943).getFirstName());
	}

	@Test
	@DisplayName("Record 4944: LastName is Skipper")
	void LastNameOfRecord4944() {
		assertEquals("Skipper", customers.get(4943).getLastName());
	}

	@Test
	@DisplayName("Record 4944: Company is Otterbine Floating Aerators")
	void CompanyOfRecord4944() {
		assertEquals("Otterbine Floating Aerators", customers.get(4943).getCompany());
	}

	@Test
	@DisplayName("Record 4944: Address is 2 State St  #-910")
	void AddressOfRecord4944() {
		assertEquals("2 State St  #-910", customers.get(4943).getAddress());
	}

	@Test
	@DisplayName("Record 4944: City is Rochester")
	void CityOfRecord4944() {
		assertEquals("Rochester", customers.get(4943).getCity());
	}

	@Test
	@DisplayName("Record 4944: County is Monroe")
	void CountyOfRecord4944() {
		assertEquals("Monroe", customers.get(4943).getCounty());
	}

	@Test
	@DisplayName("Record 4944: State is NY")
	void StateOfRecord4944() {
		assertEquals("NY", customers.get(4943).getState());
	}

	@Test
	@DisplayName("Record 4944: ZIP is 14614")
	void ZIPOfRecord4944() {
		assertEquals("14614", customers.get(4943).getZIP());
	}

	@Test
	@DisplayName("Record 4944: Phone is 585-232-6726")
	void PhoneOfRecord4944() {
		assertEquals("585-232-6726", customers.get(4943).getPhone());
	}

	@Test
	@DisplayName("Record 4944: Fax is 585-232-9943")
	void FaxOfRecord4944() {
		assertEquals("585-232-9943", customers.get(4943).getFax());
	}

	@Test
	@DisplayName("Record 4944: Email is elba@skipper.com")
	void EmailOfRecord4944() {
		assertEquals("elba@skipper.com", customers.get(4943).getEmail());
	}

	@Test
	@DisplayName("Record 4944: Web is http://www.elbaskipper.com")
	void WebOfRecord4944() {
		assertEquals("http://www.elbaskipper.com", customers.get(4943).getWeb());
	}
}
