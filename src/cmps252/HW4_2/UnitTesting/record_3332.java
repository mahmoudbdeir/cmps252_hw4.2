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

@Tag("34")
class Record_3332 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3332: FirstName is Roger")
	void FirstNameOfRecord3332() {
		assertEquals("Roger", customers.get(3331).getFirstName());
	}

	@Test
	@DisplayName("Record 3332: LastName is Voorhys")
	void LastNameOfRecord3332() {
		assertEquals("Voorhys", customers.get(3331).getLastName());
	}

	@Test
	@DisplayName("Record 3332: Company is Park View Guest House")
	void CompanyOfRecord3332() {
		assertEquals("Park View Guest House", customers.get(3331).getCompany());
	}

	@Test
	@DisplayName("Record 3332: Address is 204 N Guadalupe St")
	void AddressOfRecord3332() {
		assertEquals("204 N Guadalupe St", customers.get(3331).getAddress());
	}

	@Test
	@DisplayName("Record 3332: City is Santa Fe")
	void CityOfRecord3332() {
		assertEquals("Santa Fe", customers.get(3331).getCity());
	}

	@Test
	@DisplayName("Record 3332: County is Santa Fe")
	void CountyOfRecord3332() {
		assertEquals("Santa Fe", customers.get(3331).getCounty());
	}

	@Test
	@DisplayName("Record 3332: State is NM")
	void StateOfRecord3332() {
		assertEquals("NM", customers.get(3331).getState());
	}

	@Test
	@DisplayName("Record 3332: ZIP is 87501")
	void ZIPOfRecord3332() {
		assertEquals("87501", customers.get(3331).getZIP());
	}

	@Test
	@DisplayName("Record 3332: Phone is 505-988-6972")
	void PhoneOfRecord3332() {
		assertEquals("505-988-6972", customers.get(3331).getPhone());
	}

	@Test
	@DisplayName("Record 3332: Fax is 505-988-8036")
	void FaxOfRecord3332() {
		assertEquals("505-988-8036", customers.get(3331).getFax());
	}

	@Test
	@DisplayName("Record 3332: Email is roger@voorhys.com")
	void EmailOfRecord3332() {
		assertEquals("roger@voorhys.com", customers.get(3331).getEmail());
	}

	@Test
	@DisplayName("Record 3332: Web is http://www.rogervoorhys.com")
	void WebOfRecord3332() {
		assertEquals("http://www.rogervoorhys.com", customers.get(3331).getWeb());
	}
}
