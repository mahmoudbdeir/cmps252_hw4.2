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

@Tag("45")
class Record_35 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 35: FirstName is Brooke")
	void FirstNameOfRecord35() {
		assertEquals("Brooke", customers.get(34).getFirstName());
	}

	@Test
	@DisplayName("Record 35: LastName is Mondelli")
	void LastNameOfRecord35() {
		assertEquals("Mondelli", customers.get(34).getLastName());
	}

	@Test
	@DisplayName("Record 35: Company is Sands Beach Club All Ste Resrt")
	void CompanyOfRecord35() {
		assertEquals("Sands Beach Club All Ste Resrt", customers.get(34).getCompany());
	}

	@Test
	@DisplayName("Record 35: Address is 2601 S Queen St")
	void AddressOfRecord35() {
		assertEquals("2601 S Queen St", customers.get(34).getAddress());
	}

	@Test
	@DisplayName("Record 35: City is York")
	void CityOfRecord35() {
		assertEquals("York", customers.get(34).getCity());
	}

	@Test
	@DisplayName("Record 35: County is York")
	void CountyOfRecord35() {
		assertEquals("York", customers.get(34).getCounty());
	}

	@Test
	@DisplayName("Record 35: State is PA")
	void StateOfRecord35() {
		assertEquals("PA", customers.get(34).getState());
	}

	@Test
	@DisplayName("Record 35: ZIP is 17402")
	void ZIPOfRecord35() {
		assertEquals("17402", customers.get(34).getZIP());
	}

	@Test
	@DisplayName("Record 35: Phone is 717-741-3987")
	void PhoneOfRecord35() {
		assertEquals("717-741-3987", customers.get(34).getPhone());
	}

	@Test
	@DisplayName("Record 35: Fax is 717-741-6528")
	void FaxOfRecord35() {
		assertEquals("717-741-6528", customers.get(34).getFax());
	}

	@Test
	@DisplayName("Record 35: Email is brooke@mondelli.com")
	void EmailOfRecord35() {
		assertEquals("brooke@mondelli.com", customers.get(34).getEmail());
	}

	@Test
	@DisplayName("Record 35: Web is http://www.brookemondelli.com")
	void WebOfRecord35() {
		assertEquals("http://www.brookemondelli.com", customers.get(34).getWeb());
	}
}
