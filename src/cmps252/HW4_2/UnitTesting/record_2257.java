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

@Tag("16")
class Record_2257 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2257: FirstName is Alexandria")
	void FirstNameOfRecord2257() {
		assertEquals("Alexandria", customers.get(2256).getFirstName());
	}

	@Test
	@DisplayName("Record 2257: LastName is Kostohryz")
	void LastNameOfRecord2257() {
		assertEquals("Kostohryz", customers.get(2256).getLastName());
	}

	@Test
	@DisplayName("Record 2257: Company is Kjzz Tv Channel 14")
	void CompanyOfRecord2257() {
		assertEquals("Kjzz Tv Channel 14", customers.get(2256).getCompany());
	}

	@Test
	@DisplayName("Record 2257: Address is 2800 Story Rd W")
	void AddressOfRecord2257() {
		assertEquals("2800 Story Rd W", customers.get(2256).getAddress());
	}

	@Test
	@DisplayName("Record 2257: City is Irving")
	void CityOfRecord2257() {
		assertEquals("Irving", customers.get(2256).getCity());
	}

	@Test
	@DisplayName("Record 2257: County is Dallas")
	void CountyOfRecord2257() {
		assertEquals("Dallas", customers.get(2256).getCounty());
	}

	@Test
	@DisplayName("Record 2257: State is TX")
	void StateOfRecord2257() {
		assertEquals("TX", customers.get(2256).getState());
	}

	@Test
	@DisplayName("Record 2257: ZIP is 75038")
	void ZIPOfRecord2257() {
		assertEquals("75038", customers.get(2256).getZIP());
	}

	@Test
	@DisplayName("Record 2257: Phone is 972-252-7118")
	void PhoneOfRecord2257() {
		assertEquals("972-252-7118", customers.get(2256).getPhone());
	}

	@Test
	@DisplayName("Record 2257: Fax is 972-252-1958")
	void FaxOfRecord2257() {
		assertEquals("972-252-1958", customers.get(2256).getFax());
	}

	@Test
	@DisplayName("Record 2257: Email is alexandria@kostohryz.com")
	void EmailOfRecord2257() {
		assertEquals("alexandria@kostohryz.com", customers.get(2256).getEmail());
	}

	@Test
	@DisplayName("Record 2257: Web is http://www.alexandriakostohryz.com")
	void WebOfRecord2257() {
		assertEquals("http://www.alexandriakostohryz.com", customers.get(2256).getWeb());
	}
}
