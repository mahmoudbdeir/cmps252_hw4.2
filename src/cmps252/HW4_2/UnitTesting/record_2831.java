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

@Tag("5")
class Record_2831 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2831: FirstName is Donn")
	void FirstNameOfRecord2831() {
		assertEquals("Donn", customers.get(2830).getFirstName());
	}

	@Test
	@DisplayName("Record 2831: LastName is Dalby")
	void LastNameOfRecord2831() {
		assertEquals("Dalby", customers.get(2830).getLastName());
	}

	@Test
	@DisplayName("Record 2831: Company is Phoenix Cable Vision")
	void CompanyOfRecord2831() {
		assertEquals("Phoenix Cable Vision", customers.get(2830).getCompany());
	}

	@Test
	@DisplayName("Record 2831: Address is 820 State Road 434 E  #-150")
	void AddressOfRecord2831() {
		assertEquals("820 State Road 434 E  #-150", customers.get(2830).getAddress());
	}

	@Test
	@DisplayName("Record 2831: City is Longwood")
	void CityOfRecord2831() {
		assertEquals("Longwood", customers.get(2830).getCity());
	}

	@Test
	@DisplayName("Record 2831: County is Seminole")
	void CountyOfRecord2831() {
		assertEquals("Seminole", customers.get(2830).getCounty());
	}

	@Test
	@DisplayName("Record 2831: State is FL")
	void StateOfRecord2831() {
		assertEquals("FL", customers.get(2830).getState());
	}

	@Test
	@DisplayName("Record 2831: ZIP is 32750")
	void ZIPOfRecord2831() {
		assertEquals("32750", customers.get(2830).getZIP());
	}

	@Test
	@DisplayName("Record 2831: Phone is 407-767-1083")
	void PhoneOfRecord2831() {
		assertEquals("407-767-1083", customers.get(2830).getPhone());
	}

	@Test
	@DisplayName("Record 2831: Fax is 407-767-0996")
	void FaxOfRecord2831() {
		assertEquals("407-767-0996", customers.get(2830).getFax());
	}

	@Test
	@DisplayName("Record 2831: Email is donn@dalby.com")
	void EmailOfRecord2831() {
		assertEquals("donn@dalby.com", customers.get(2830).getEmail());
	}

	@Test
	@DisplayName("Record 2831: Web is http://www.donndalby.com")
	void WebOfRecord2831() {
		assertEquals("http://www.donndalby.com", customers.get(2830).getWeb());
	}
}
