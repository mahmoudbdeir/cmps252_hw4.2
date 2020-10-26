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

@Tag("43")
class Record_3977 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3977: FirstName is Hector")
	void FirstNameOfRecord3977() {
		assertEquals("Hector", customers.get(3976).getFirstName());
	}

	@Test
	@DisplayName("Record 3977: LastName is Paffrath")
	void LastNameOfRecord3977() {
		assertEquals("Paffrath", customers.get(3976).getLastName());
	}

	@Test
	@DisplayName("Record 3977: Company is International Luth Laymens Lea")
	void CompanyOfRecord3977() {
		assertEquals("International Luth Laymens Lea", customers.get(3976).getCompany());
	}

	@Test
	@DisplayName("Record 3977: Address is 2109 Martin St")
	void AddressOfRecord3977() {
		assertEquals("2109 Martin St", customers.get(3976).getAddress());
	}

	@Test
	@DisplayName("Record 3977: City is Jacksonville")
	void CityOfRecord3977() {
		assertEquals("Jacksonville", customers.get(3976).getCity());
	}

	@Test
	@DisplayName("Record 3977: County is Duval")
	void CountyOfRecord3977() {
		assertEquals("Duval", customers.get(3976).getCounty());
	}

	@Test
	@DisplayName("Record 3977: State is FL")
	void StateOfRecord3977() {
		assertEquals("FL", customers.get(3976).getState());
	}

	@Test
	@DisplayName("Record 3977: ZIP is 32207")
	void ZIPOfRecord3977() {
		assertEquals("32207", customers.get(3976).getZIP());
	}

	@Test
	@DisplayName("Record 3977: Phone is 904-346-4583")
	void PhoneOfRecord3977() {
		assertEquals("904-346-4583", customers.get(3976).getPhone());
	}

	@Test
	@DisplayName("Record 3977: Fax is 904-346-4665")
	void FaxOfRecord3977() {
		assertEquals("904-346-4665", customers.get(3976).getFax());
	}

	@Test
	@DisplayName("Record 3977: Email is hector@paffrath.com")
	void EmailOfRecord3977() {
		assertEquals("hector@paffrath.com", customers.get(3976).getEmail());
	}

	@Test
	@DisplayName("Record 3977: Web is http://www.hectorpaffrath.com")
	void WebOfRecord3977() {
		assertEquals("http://www.hectorpaffrath.com", customers.get(3976).getWeb());
	}
}
