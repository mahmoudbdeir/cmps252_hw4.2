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

@Tag("31")
class Record_2720 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2720: FirstName is Natalie")
	void FirstNameOfRecord2720() {
		assertEquals("Natalie", customers.get(2719).getFirstName());
	}

	@Test
	@DisplayName("Record 2720: LastName is Gilchrest")
	void LastNameOfRecord2720() {
		assertEquals("Gilchrest", customers.get(2719).getLastName());
	}

	@Test
	@DisplayName("Record 2720: Company is Decamp, Clifford L Esq")
	void CompanyOfRecord2720() {
		assertEquals("Decamp, Clifford L Esq", customers.get(2719).getCompany());
	}

	@Test
	@DisplayName("Record 2720: Address is 1230 W 23rd St")
	void AddressOfRecord2720() {
		assertEquals("1230 W 23rd St", customers.get(2719).getAddress());
	}

	@Test
	@DisplayName("Record 2720: City is Tempe")
	void CityOfRecord2720() {
		assertEquals("Tempe", customers.get(2719).getCity());
	}

	@Test
	@DisplayName("Record 2720: County is Maricopa")
	void CountyOfRecord2720() {
		assertEquals("Maricopa", customers.get(2719).getCounty());
	}

	@Test
	@DisplayName("Record 2720: State is AZ")
	void StateOfRecord2720() {
		assertEquals("AZ", customers.get(2719).getState());
	}

	@Test
	@DisplayName("Record 2720: ZIP is 85282")
	void ZIPOfRecord2720() {
		assertEquals("85282", customers.get(2719).getZIP());
	}

	@Test
	@DisplayName("Record 2720: Phone is 480-967-3594")
	void PhoneOfRecord2720() {
		assertEquals("480-967-3594", customers.get(2719).getPhone());
	}

	@Test
	@DisplayName("Record 2720: Fax is 480-967-9259")
	void FaxOfRecord2720() {
		assertEquals("480-967-9259", customers.get(2719).getFax());
	}

	@Test
	@DisplayName("Record 2720: Email is natalie@gilchrest.com")
	void EmailOfRecord2720() {
		assertEquals("natalie@gilchrest.com", customers.get(2719).getEmail());
	}

	@Test
	@DisplayName("Record 2720: Web is http://www.nataliegilchrest.com")
	void WebOfRecord2720() {
		assertEquals("http://www.nataliegilchrest.com", customers.get(2719).getWeb());
	}
}
