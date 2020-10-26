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
class Record_3462 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3462: FirstName is Grover")
	void FirstNameOfRecord3462() {
		assertEquals("Grover", customers.get(3461).getFirstName());
	}

	@Test
	@DisplayName("Record 3462: LastName is Pavelski")
	void LastNameOfRecord3462() {
		assertEquals("Pavelski", customers.get(3461).getLastName());
	}

	@Test
	@DisplayName("Record 3462: Company is Sign Pro")
	void CompanyOfRecord3462() {
		assertEquals("Sign Pro", customers.get(3461).getCompany());
	}

	@Test
	@DisplayName("Record 3462: Address is 33 Center Dr")
	void AddressOfRecord3462() {
		assertEquals("33 Center Dr", customers.get(3461).getAddress());
	}

	@Test
	@DisplayName("Record 3462: City is Gilberts")
	void CityOfRecord3462() {
		assertEquals("Gilberts", customers.get(3461).getCity());
	}

	@Test
	@DisplayName("Record 3462: County is Kane")
	void CountyOfRecord3462() {
		assertEquals("Kane", customers.get(3461).getCounty());
	}

	@Test
	@DisplayName("Record 3462: State is IL")
	void StateOfRecord3462() {
		assertEquals("IL", customers.get(3461).getState());
	}

	@Test
	@DisplayName("Record 3462: ZIP is 60136")
	void ZIPOfRecord3462() {
		assertEquals("60136", customers.get(3461).getZIP());
	}

	@Test
	@DisplayName("Record 3462: Phone is 847-426-2188")
	void PhoneOfRecord3462() {
		assertEquals("847-426-2188", customers.get(3461).getPhone());
	}

	@Test
	@DisplayName("Record 3462: Fax is 847-426-9162")
	void FaxOfRecord3462() {
		assertEquals("847-426-9162", customers.get(3461).getFax());
	}

	@Test
	@DisplayName("Record 3462: Email is grover@pavelski.com")
	void EmailOfRecord3462() {
		assertEquals("grover@pavelski.com", customers.get(3461).getEmail());
	}

	@Test
	@DisplayName("Record 3462: Web is http://www.groverpavelski.com")
	void WebOfRecord3462() {
		assertEquals("http://www.groverpavelski.com", customers.get(3461).getWeb());
	}
}
