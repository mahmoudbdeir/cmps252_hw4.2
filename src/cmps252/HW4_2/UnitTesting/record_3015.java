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

@Tag("38")
class Record_3015 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3015: FirstName is Charlie")
	void FirstNameOfRecord3015() {
		assertEquals("Charlie", customers.get(3014).getFirstName());
	}

	@Test
	@DisplayName("Record 3015: LastName is Barness")
	void LastNameOfRecord3015() {
		assertEquals("Barness", customers.get(3014).getLastName());
	}

	@Test
	@DisplayName("Record 3015: Company is Colner, James D Esq")
	void CompanyOfRecord3015() {
		assertEquals("Colner, James D Esq", customers.get(3014).getCompany());
	}

	@Test
	@DisplayName("Record 3015: Address is 221 Box Butte Ave")
	void AddressOfRecord3015() {
		assertEquals("221 Box Butte Ave", customers.get(3014).getAddress());
	}

	@Test
	@DisplayName("Record 3015: City is Alliance")
	void CityOfRecord3015() {
		assertEquals("Alliance", customers.get(3014).getCity());
	}

	@Test
	@DisplayName("Record 3015: County is Box Butte")
	void CountyOfRecord3015() {
		assertEquals("Box Butte", customers.get(3014).getCounty());
	}

	@Test
	@DisplayName("Record 3015: State is NE")
	void StateOfRecord3015() {
		assertEquals("NE", customers.get(3014).getState());
	}

	@Test
	@DisplayName("Record 3015: ZIP is 69301")
	void ZIPOfRecord3015() {
		assertEquals("69301", customers.get(3014).getZIP());
	}

	@Test
	@DisplayName("Record 3015: Phone is 308-762-5717")
	void PhoneOfRecord3015() {
		assertEquals("308-762-5717", customers.get(3014).getPhone());
	}

	@Test
	@DisplayName("Record 3015: Fax is 308-762-8267")
	void FaxOfRecord3015() {
		assertEquals("308-762-8267", customers.get(3014).getFax());
	}

	@Test
	@DisplayName("Record 3015: Email is charlie@barness.com")
	void EmailOfRecord3015() {
		assertEquals("charlie@barness.com", customers.get(3014).getEmail());
	}

	@Test
	@DisplayName("Record 3015: Web is http://www.charliebarness.com")
	void WebOfRecord3015() {
		assertEquals("http://www.charliebarness.com", customers.get(3014).getWeb());
	}
}
