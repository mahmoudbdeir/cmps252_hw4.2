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

@Tag("0")
class Record_318 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 318: FirstName is Jenna")
	void FirstNameOfRecord318() {
		assertEquals("Jenna", customers.get(317).getFirstName());
	}

	@Test
	@DisplayName("Record 318: LastName is Rippee")
	void LastNameOfRecord318() {
		assertEquals("Rippee", customers.get(317).getLastName());
	}

	@Test
	@DisplayName("Record 318: Company is Bernard Haldane Associates")
	void CompanyOfRecord318() {
		assertEquals("Bernard Haldane Associates", customers.get(317).getCompany());
	}

	@Test
	@DisplayName("Record 318: Address is 9001 133rd Pl")
	void AddressOfRecord318() {
		assertEquals("9001 133rd Pl", customers.get(317).getAddress());
	}

	@Test
	@DisplayName("Record 318: City is Fishers")
	void CityOfRecord318() {
		assertEquals("Fishers", customers.get(317).getCity());
	}

	@Test
	@DisplayName("Record 318: County is Hamilton")
	void CountyOfRecord318() {
		assertEquals("Hamilton", customers.get(317).getCounty());
	}

	@Test
	@DisplayName("Record 318: State is IN")
	void StateOfRecord318() {
		assertEquals("IN", customers.get(317).getState());
	}

	@Test
	@DisplayName("Record 318: ZIP is 46038")
	void ZIPOfRecord318() {
		assertEquals("46038", customers.get(317).getZIP());
	}

	@Test
	@DisplayName("Record 318: Phone is 317-577-9145")
	void PhoneOfRecord318() {
		assertEquals("317-577-9145", customers.get(317).getPhone());
	}

	@Test
	@DisplayName("Record 318: Fax is 317-577-4907")
	void FaxOfRecord318() {
		assertEquals("317-577-4907", customers.get(317).getFax());
	}

	@Test
	@DisplayName("Record 318: Email is jenna@rippee.com")
	void EmailOfRecord318() {
		assertEquals("jenna@rippee.com", customers.get(317).getEmail());
	}

	@Test
	@DisplayName("Record 318: Web is http://www.jennarippee.com")
	void WebOfRecord318() {
		assertEquals("http://www.jennarippee.com", customers.get(317).getWeb());
	}
}
