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

@Tag("29")
class Record_1046 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1046: FirstName is Raquel")
	void FirstNameOfRecord1046() {
		assertEquals("Raquel", customers.get(1045).getFirstName());
	}

	@Test
	@DisplayName("Record 1046: LastName is Makepeace")
	void LastNameOfRecord1046() {
		assertEquals("Makepeace", customers.get(1045).getLastName());
	}

	@Test
	@DisplayName("Record 1046: Company is Closet & Bath Matl Supl Co")
	void CompanyOfRecord1046() {
		assertEquals("Closet & Bath Matl Supl Co", customers.get(1045).getCompany());
	}

	@Test
	@DisplayName("Record 1046: Address is 5109 Commercial Dr")
	void AddressOfRecord1046() {
		assertEquals("5109 Commercial Dr", customers.get(1045).getAddress());
	}

	@Test
	@DisplayName("Record 1046: City is North Richland Hills")
	void CityOfRecord1046() {
		assertEquals("North Richland Hills", customers.get(1045).getCity());
	}

	@Test
	@DisplayName("Record 1046: County is Tarrant")
	void CountyOfRecord1046() {
		assertEquals("Tarrant", customers.get(1045).getCounty());
	}

	@Test
	@DisplayName("Record 1046: State is TX")
	void StateOfRecord1046() {
		assertEquals("TX", customers.get(1045).getState());
	}

	@Test
	@DisplayName("Record 1046: ZIP is 76180")
	void ZIPOfRecord1046() {
		assertEquals("76180", customers.get(1045).getZIP());
	}

	@Test
	@DisplayName("Record 1046: Phone is 817-577-6795")
	void PhoneOfRecord1046() {
		assertEquals("817-577-6795", customers.get(1045).getPhone());
	}

	@Test
	@DisplayName("Record 1046: Fax is 817-577-3246")
	void FaxOfRecord1046() {
		assertEquals("817-577-3246", customers.get(1045).getFax());
	}

	@Test
	@DisplayName("Record 1046: Email is raquel@makepeace.com")
	void EmailOfRecord1046() {
		assertEquals("raquel@makepeace.com", customers.get(1045).getEmail());
	}

	@Test
	@DisplayName("Record 1046: Web is http://www.raquelmakepeace.com")
	void WebOfRecord1046() {
		assertEquals("http://www.raquelmakepeace.com", customers.get(1045).getWeb());
	}
}
