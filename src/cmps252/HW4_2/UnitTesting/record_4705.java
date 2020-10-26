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

@Tag("25")
class Record_4705 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4705: FirstName is Michaela")
	void FirstNameOfRecord4705() {
		assertEquals("Michaela", customers.get(4704).getFirstName());
	}

	@Test
	@DisplayName("Record 4705: LastName is Mcwethy")
	void LastNameOfRecord4705() {
		assertEquals("Mcwethy", customers.get(4704).getLastName());
	}

	@Test
	@DisplayName("Record 4705: Company is Clifton Gunderson & Co")
	void CompanyOfRecord4705() {
		assertEquals("Clifton Gunderson & Co", customers.get(4704).getCompany());
	}

	@Test
	@DisplayName("Record 4705: Address is 812 Old Spartanburg Rd")
	void AddressOfRecord4705() {
		assertEquals("812 Old Spartanburg Rd", customers.get(4704).getAddress());
	}

	@Test
	@DisplayName("Record 4705: City is Hendersonville")
	void CityOfRecord4705() {
		assertEquals("Hendersonville", customers.get(4704).getCity());
	}

	@Test
	@DisplayName("Record 4705: County is Henderson")
	void CountyOfRecord4705() {
		assertEquals("Henderson", customers.get(4704).getCounty());
	}

	@Test
	@DisplayName("Record 4705: State is NC")
	void StateOfRecord4705() {
		assertEquals("NC", customers.get(4704).getState());
	}

	@Test
	@DisplayName("Record 4705: ZIP is 28792")
	void ZIPOfRecord4705() {
		assertEquals("28792", customers.get(4704).getZIP());
	}

	@Test
	@DisplayName("Record 4705: Phone is 828-696-5484")
	void PhoneOfRecord4705() {
		assertEquals("828-696-5484", customers.get(4704).getPhone());
	}

	@Test
	@DisplayName("Record 4705: Fax is 828-696-3128")
	void FaxOfRecord4705() {
		assertEquals("828-696-3128", customers.get(4704).getFax());
	}

	@Test
	@DisplayName("Record 4705: Email is michaela@mcwethy.com")
	void EmailOfRecord4705() {
		assertEquals("michaela@mcwethy.com", customers.get(4704).getEmail());
	}

	@Test
	@DisplayName("Record 4705: Web is http://www.michaelamcwethy.com")
	void WebOfRecord4705() {
		assertEquals("http://www.michaelamcwethy.com", customers.get(4704).getWeb());
	}
}
