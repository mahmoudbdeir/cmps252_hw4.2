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

@Tag("40")
class Record_3659 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3659: FirstName is Tonia")
	void FirstNameOfRecord3659() {
		assertEquals("Tonia", customers.get(3658).getFirstName());
	}

	@Test
	@DisplayName("Record 3659: LastName is Lystner")
	void LastNameOfRecord3659() {
		assertEquals("Lystner", customers.get(3658).getLastName());
	}

	@Test
	@DisplayName("Record 3659: Company is Building Inspector")
	void CompanyOfRecord3659() {
		assertEquals("Building Inspector", customers.get(3658).getCompany());
	}

	@Test
	@DisplayName("Record 3659: Address is 2019 Republican St")
	void AddressOfRecord3659() {
		assertEquals("2019 Republican St", customers.get(3658).getAddress());
	}

	@Test
	@DisplayName("Record 3659: City is Honolulu")
	void CityOfRecord3659() {
		assertEquals("Honolulu", customers.get(3658).getCity());
	}

	@Test
	@DisplayName("Record 3659: County is Honolulu")
	void CountyOfRecord3659() {
		assertEquals("Honolulu", customers.get(3658).getCounty());
	}

	@Test
	@DisplayName("Record 3659: State is HI")
	void StateOfRecord3659() {
		assertEquals("HI", customers.get(3658).getState());
	}

	@Test
	@DisplayName("Record 3659: ZIP is 96819")
	void ZIPOfRecord3659() {
		assertEquals("96819", customers.get(3658).getZIP());
	}

	@Test
	@DisplayName("Record 3659: Phone is 808-848-7525")
	void PhoneOfRecord3659() {
		assertEquals("808-848-7525", customers.get(3658).getPhone());
	}

	@Test
	@DisplayName("Record 3659: Fax is 808-848-7366")
	void FaxOfRecord3659() {
		assertEquals("808-848-7366", customers.get(3658).getFax());
	}

	@Test
	@DisplayName("Record 3659: Email is tonia@lystner.com")
	void EmailOfRecord3659() {
		assertEquals("tonia@lystner.com", customers.get(3658).getEmail());
	}

	@Test
	@DisplayName("Record 3659: Web is http://www.tonialystner.com")
	void WebOfRecord3659() {
		assertEquals("http://www.tonialystner.com", customers.get(3658).getWeb());
	}
}
