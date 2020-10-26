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

@Tag("18")
class Record_2996 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2996: FirstName is Rosita")
	void FirstNameOfRecord2996() {
		assertEquals("Rosita", customers.get(2995).getFirstName());
	}

	@Test
	@DisplayName("Record 2996: LastName is Chapa")
	void LastNameOfRecord2996() {
		assertEquals("Chapa", customers.get(2995).getLastName());
	}

	@Test
	@DisplayName("Record 2996: Company is Noah Design")
	void CompanyOfRecord2996() {
		assertEquals("Noah Design", customers.get(2995).getCompany());
	}

	@Test
	@DisplayName("Record 2996: Address is 700 N Market St")
	void AddressOfRecord2996() {
		assertEquals("700 N Market St", customers.get(2995).getAddress());
	}

	@Test
	@DisplayName("Record 2996: City is Wichita")
	void CityOfRecord2996() {
		assertEquals("Wichita", customers.get(2995).getCity());
	}

	@Test
	@DisplayName("Record 2996: County is Sedgwick")
	void CountyOfRecord2996() {
		assertEquals("Sedgwick", customers.get(2995).getCounty());
	}

	@Test
	@DisplayName("Record 2996: State is KS")
	void StateOfRecord2996() {
		assertEquals("KS", customers.get(2995).getState());
	}

	@Test
	@DisplayName("Record 2996: ZIP is 67214")
	void ZIPOfRecord2996() {
		assertEquals("67214", customers.get(2995).getZIP());
	}

	@Test
	@DisplayName("Record 2996: Phone is 316-262-4092")
	void PhoneOfRecord2996() {
		assertEquals("316-262-4092", customers.get(2995).getPhone());
	}

	@Test
	@DisplayName("Record 2996: Fax is 316-262-1703")
	void FaxOfRecord2996() {
		assertEquals("316-262-1703", customers.get(2995).getFax());
	}

	@Test
	@DisplayName("Record 2996: Email is rosita@chapa.com")
	void EmailOfRecord2996() {
		assertEquals("rosita@chapa.com", customers.get(2995).getEmail());
	}

	@Test
	@DisplayName("Record 2996: Web is http://www.rositachapa.com")
	void WebOfRecord2996() {
		assertEquals("http://www.rositachapa.com", customers.get(2995).getWeb());
	}
}
