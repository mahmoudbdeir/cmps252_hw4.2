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

@Tag("47")
class Record_4178 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4178: FirstName is Dominic")
	void FirstNameOfRecord4178() {
		assertEquals("Dominic", customers.get(4177).getFirstName());
	}

	@Test
	@DisplayName("Record 4178: LastName is Comley")
	void LastNameOfRecord4178() {
		assertEquals("Comley", customers.get(4177).getLastName());
	}

	@Test
	@DisplayName("Record 4178: Company is Andrews Art Glass")
	void CompanyOfRecord4178() {
		assertEquals("Andrews Art Glass", customers.get(4177).getCompany());
	}

	@Test
	@DisplayName("Record 4178: Address is 5 Hanover Sq")
	void AddressOfRecord4178() {
		assertEquals("5 Hanover Sq", customers.get(4177).getAddress());
	}

	@Test
	@DisplayName("Record 4178: City is New York")
	void CityOfRecord4178() {
		assertEquals("New York", customers.get(4177).getCity());
	}

	@Test
	@DisplayName("Record 4178: County is New York")
	void CountyOfRecord4178() {
		assertEquals("New York", customers.get(4177).getCounty());
	}

	@Test
	@DisplayName("Record 4178: State is NY")
	void StateOfRecord4178() {
		assertEquals("NY", customers.get(4177).getState());
	}

	@Test
	@DisplayName("Record 4178: ZIP is 10004")
	void ZIPOfRecord4178() {
		assertEquals("10004", customers.get(4177).getZIP());
	}

	@Test
	@DisplayName("Record 4178: Phone is 212-344-0325")
	void PhoneOfRecord4178() {
		assertEquals("212-344-0325", customers.get(4177).getPhone());
	}

	@Test
	@DisplayName("Record 4178: Fax is 212-344-1887")
	void FaxOfRecord4178() {
		assertEquals("212-344-1887", customers.get(4177).getFax());
	}

	@Test
	@DisplayName("Record 4178: Email is dominic@comley.com")
	void EmailOfRecord4178() {
		assertEquals("dominic@comley.com", customers.get(4177).getEmail());
	}

	@Test
	@DisplayName("Record 4178: Web is http://www.dominiccomley.com")
	void WebOfRecord4178() {
		assertEquals("http://www.dominiccomley.com", customers.get(4177).getWeb());
	}
}
