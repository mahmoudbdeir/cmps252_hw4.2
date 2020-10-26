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

@Tag("14")
class Record_2583 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2583: FirstName is Gaston")
	void FirstNameOfRecord2583() {
		assertEquals("Gaston", customers.get(2582).getFirstName());
	}

	@Test
	@DisplayName("Record 2583: LastName is Maignan")
	void LastNameOfRecord2583() {
		assertEquals("Maignan", customers.get(2582).getLastName());
	}

	@Test
	@DisplayName("Record 2583: Company is Farley, Thomas F Esq")
	void CompanyOfRecord2583() {
		assertEquals("Farley, Thomas F Esq", customers.get(2582).getCompany());
	}

	@Test
	@DisplayName("Record 2583: Address is 94172 Leoole St")
	void AddressOfRecord2583() {
		assertEquals("94172 Leoole St", customers.get(2582).getAddress());
	}

	@Test
	@DisplayName("Record 2583: City is Waipahu")
	void CityOfRecord2583() {
		assertEquals("Waipahu", customers.get(2582).getCity());
	}

	@Test
	@DisplayName("Record 2583: County is Honolulu")
	void CountyOfRecord2583() {
		assertEquals("Honolulu", customers.get(2582).getCounty());
	}

	@Test
	@DisplayName("Record 2583: State is HI")
	void StateOfRecord2583() {
		assertEquals("HI", customers.get(2582).getState());
	}

	@Test
	@DisplayName("Record 2583: ZIP is 96797")
	void ZIPOfRecord2583() {
		assertEquals("96797", customers.get(2582).getZIP());
	}

	@Test
	@DisplayName("Record 2583: Phone is 808-247-0460")
	void PhoneOfRecord2583() {
		assertEquals("808-247-0460", customers.get(2582).getPhone());
	}

	@Test
	@DisplayName("Record 2583: Fax is 808-247-6989")
	void FaxOfRecord2583() {
		assertEquals("808-247-6989", customers.get(2582).getFax());
	}

	@Test
	@DisplayName("Record 2583: Email is gaston@maignan.com")
	void EmailOfRecord2583() {
		assertEquals("gaston@maignan.com", customers.get(2582).getEmail());
	}

	@Test
	@DisplayName("Record 2583: Web is http://www.gastonmaignan.com")
	void WebOfRecord2583() {
		assertEquals("http://www.gastonmaignan.com", customers.get(2582).getWeb());
	}
}
