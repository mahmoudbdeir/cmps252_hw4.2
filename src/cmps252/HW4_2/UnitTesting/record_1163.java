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

@Tag("22")
class Record_1163 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1163: FirstName is Colton")
	void FirstNameOfRecord1163() {
		assertEquals("Colton", customers.get(1162).getFirstName());
	}

	@Test
	@DisplayName("Record 1163: LastName is Venturella")
	void LastNameOfRecord1163() {
		assertEquals("Venturella", customers.get(1162).getLastName());
	}

	@Test
	@DisplayName("Record 1163: Company is Hill & Sanders Ford")
	void CompanyOfRecord1163() {
		assertEquals("Hill & Sanders Ford", customers.get(1162).getCompany());
	}

	@Test
	@DisplayName("Record 1163: Address is 1430 Girard Blvd Ne")
	void AddressOfRecord1163() {
		assertEquals("1430 Girard Blvd Ne", customers.get(1162).getAddress());
	}

	@Test
	@DisplayName("Record 1163: City is Albuquerque")
	void CityOfRecord1163() {
		assertEquals("Albuquerque", customers.get(1162).getCity());
	}

	@Test
	@DisplayName("Record 1163: County is Bernalillo")
	void CountyOfRecord1163() {
		assertEquals("Bernalillo", customers.get(1162).getCounty());
	}

	@Test
	@DisplayName("Record 1163: State is NM")
	void StateOfRecord1163() {
		assertEquals("NM", customers.get(1162).getState());
	}

	@Test
	@DisplayName("Record 1163: ZIP is 87106")
	void ZIPOfRecord1163() {
		assertEquals("87106", customers.get(1162).getZIP());
	}

	@Test
	@DisplayName("Record 1163: Phone is 505-265-3833")
	void PhoneOfRecord1163() {
		assertEquals("505-265-3833", customers.get(1162).getPhone());
	}

	@Test
	@DisplayName("Record 1163: Fax is 505-265-0815")
	void FaxOfRecord1163() {
		assertEquals("505-265-0815", customers.get(1162).getFax());
	}

	@Test
	@DisplayName("Record 1163: Email is colton@venturella.com")
	void EmailOfRecord1163() {
		assertEquals("colton@venturella.com", customers.get(1162).getEmail());
	}

	@Test
	@DisplayName("Record 1163: Web is http://www.coltonventurella.com")
	void WebOfRecord1163() {
		assertEquals("http://www.coltonventurella.com", customers.get(1162).getWeb());
	}
}
